package com.example.SmartCarAgent.model;

import lombok.*;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Data
@Entity
@Table(name = "search")
public class SearchRequest implements Serializable {
    @Id
    @Column(nullable = false, updatable = false)
    private String searchId;

    private String manufacturer;
    private int minPrice;
    private int maxPrice;
    private String location;
}
