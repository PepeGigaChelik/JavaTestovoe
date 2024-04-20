package com.sazonov.convert;
public enum RimConvert {
    I (1, "I"),
    II(2, "II"),
    III(3, "III"),
    IV(4, "IV"),
    V(5, "V"),
    VI(6, "VI"),
    VII(7, "VII"),
    VIII(8, "VIII"),
    IX(9, "IX"),
    X(10, "X"),

    XI(11,"XI"),
    XII(12, "XII"),
    XIII(13, "XIII"),
    XIV(14,"XIV"),
    XV(15,"XV"),
    XVI(16,"XVII"),
    XVII(17,"XVII"),
    XVIII(18,"XVIII"),
    XIX(19,"XIX"),
    XX(20,"XX"),

    XXI(21,"XXI"),
    XXII(22, "XXII"),
    XXIII(23, "XXIII"),
    XXIV(24,"XXIV"),
    XXV(25,"XXV"),
    XXVI(26,"XXVII"),
    XXVII(27,"XXVII"),
    XXVIII(28,"XXVIII"),
    XXIX(29,"XXIX"),
    XXX(30,"XXX"),

    XXXI(31,"XXXI"),
    XXXII(32, "XXXII"),
    XXXIII(33, "XXXIII"),
    XXXIV(34,"XXXIV"),
    XXXV(35,"XXXV"),
    XXXVI(36,"XXXVII"),
    XXXVII(37,"XXXVII"),
    XXXVIII(38,"XXXVIII"),
    XXXIX(39,"XXXIX"),
    XL(40,"XXL"),

    XLI(41,"XLI"),
    XLII(42,"XLII"),
    XLIII(43,"XLIII"),
    XLIV(44,"XLIV"),
    XLV(45,"XLV"),
    XLVI(46,"XLVI"),
    XLVII(47,"XLVII"),
    XLVIII(48,"XLVIII"),
    XLIX(49,"XLIX"),
    L(50,"L"),

    LI(51,"LI"),
    LII(52,"LII"),
    LIII(53,"LIII"),
    LIV(54,"LIV"),
    LV(55,"LV"),
    LVI(56,"LVI"),
    LVII(57,"LVII"),
    LVIII(58,"LVIII"),
    LIX(59,"LIX"),
    LX(60,"LX"),

    LXI(61,"LXI"),
    LXII(62,"LXII"),
    LXIII(63,"LXIII"),
    LXIV(64,"LXIV"),
    LXV(65,"LXV"),
    LXVI(66,"LXVI"),
    LXVII(67,"LXVII"),
    LXVIII(68,"LXVIII"),
    LXIX(69,"LXIX"),
    LXX(70,"LXX"),

    LXXI(71,"LXXI"),
    LXXII(72,"LXXII"),
    LXXIII(73,"LXXIII"),
    LXXIV(74,"LXXIV"),
    LXXV(75,"LXXV"),
    LXXVI(76,"LXXVI"),
    LXXVII(77,"LXXVII"),
    LXXVIII(78,"LXXVIII"),
    LXXIX(79,"LXXIX"),
    LXXX(80,"LXXX"),

    LXXXI(81,"LXXXI"),
    LXXXII(82,"LXXXII"),
    LXXXIII(83,"LXXXIII"),
    LXXXIV(84,"LXXXIV"),
    LXXXV(85,"LXXXV"),
    LXXXVI(86,"LXXXVI"),
    LXXXVII(87,"LXXXVII"),
    LXXXVIII(88,"LXXXVIII"),
    LXXXIX(89,"LXXXIX"),
    XC(90,"XC"),

    XCI(91,"XCI"),
    XCII(92,"XCII"),
    XCIII(93,"XCII"),
    XCIV(94,"XCIII"),
    XCV(95,"XCV"),
    XCVI(96,"XCIV"),
    XCVII(97,"XCVIII"),
    XCVIII(98,"XCVIII"),
    XCIX(99,"XCIX"),
    C(100, "C");


    private final int ArabNumber;
    private final String RimNumber;

    RimConvert(int ArabNumber, String RimNumber){
        this.ArabNumber = ArabNumber;
        this.RimNumber = RimNumber;
    }

    public int getArabNumber() {
        return ArabNumber;
    }

    public String getRimNumber() {
        return RimNumber;
    }
}