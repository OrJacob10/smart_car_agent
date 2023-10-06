package com.example.SmartCarAgent.enums;

import lombok.Getter;

@Getter
public enum Location {
    CENTRAL(5),
    NORTH(25),
    SOUTH(43),
    PLAIN(41),
    HASHARON(19),
    JERUSALEM(100),
    JudeaANDSamaria(75),
    HEDERA(101);

    private final int numValue;

    Location(int numValue){
        this.numValue = numValue;
    }

}
