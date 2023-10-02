package com.example.SmartCarAgent.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class FeedItem {

    private String itemId;
    private String model;
    private int year;
    private int hand;
    private int engineSize;
    private int price;
    private String link;


}
