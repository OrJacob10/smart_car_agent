package com.example.SmartCarAgent.enums;

import lombok.Getter;

@Getter
public enum Manufacturer {
    AUDI(1),
    OPEL(2),
    ORA(224),
    AIWAYS(288),
    IVECO(85),
    INFINITI(3),
    ISUZU(4),
    ALFA_ROMEO(5),
    MG(6),
    ASTON_MARTIN(54),
    BMW(7),
    BYD(141),
    BUICK(8),
    BENTLEY(55),
    GAC(99),
    GMC(9),
    GEELY(177),
    JEEP(10),
    GENESIS(93),
    GWM(11),
    DACIA(12),
    DODGE(13),
    DS(14),
    DAEWOO(60),
    DAIHATSU(15),
    HAMMER(16),
    HONGQI(301),
    HONDA(17),
    HINO(95),
    WEY(284),
    VOYAH(322),
    VOLVO(18),
    TOYOTA(19),
    TESLA(62),
    JAGUAR(20),
    HYUNDAI(21),
    LINCOLN(23),
    LEAPMOTOR(320),
    LAMBORGHINI(63),
    LAND_ROVER(24),
    LANCIA(25),
    LEXUS(26),
    MAZDA(27),
    MAN(86),
    MASERATI(28),
    MINI(29),
    MITSUBISHI(30),
    MAXUS(89),
    MERCEDES(31),
    NISSAN(32),
    SAAB(33),
    SSANGYONG(34),
    SUNSHINE(56),
    SUBARU(35),
    SUZUKI(36),
    SEAT(37),
    CITROEN(38),
    SMART(39),
    SKODA(40),
    VOLKSWAGEN(41),
    FORD(43),
    PORCHE(44),
    FIAT(45),
    PEUGEOT(46),
    FERRARI(57),
    CADILLAC(47),
    CUPRA(92),
    KIA(48),
    ROVER(50),
    RENAULT(51),
    CHEVROLET(52);

    private int numValue;

    Manufacturer(int numValue){
        this.numValue = numValue;
    }



}
