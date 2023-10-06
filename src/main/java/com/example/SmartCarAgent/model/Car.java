package com.example.SmartCarAgent.model;

import com.example.SmartCarAgent.enums.Location;
import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "car")
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String manufacturer;
    private int year;
    private Location location;
    private int price;
    private int km;
    private String transmissionType;
    private String color;
}
