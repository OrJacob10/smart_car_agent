package com.example.SmartCarAgent.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class FeedItem {

    private String itemId;
    private String manufacturer;
    private String model;
    private int year;
    private int hand;
    private int engineSize;
    private int price;
    private String link;

    public FeedItem(String itemId, String manufacturer,String model, int year, int hand, int engineSize, int price) {
        this.itemId = itemId;
        this.manufacturer = manufacturer;
        this.year = year;
        this.hand = hand;
        this.engineSize = engineSize;
        this.price = price;
        this.link = "https://www.yad2.co.il/item/" + this.itemId;
    }
}
