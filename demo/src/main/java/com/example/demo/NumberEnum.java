package com.example.demo;

/**
 * 数字对应颜色
 */
public enum NumberEnum {
    LEVEL1( 0.0, "8#173#114" ),
    LEVEL2( 10.0, "245#154#35" ),
    LEVEL3( 20.0, "245#154#41" ),
    LEVEL4( 30.0, "250#202#139" ),
    LEVEL5( 50.0, "251#139#8" ),
    LEVEL6( 60.0, "217#0#27" ),
    LEVEL7( 70.0, "204#51#51" ),
    LEVEL8( 100.0, "217#0#27" );

    private Double level;
    private String colorCode;


    public Double getLevel() {
        return level;
    }

    public void setLevel(Double level) {
        this.level = level;
    }

    public String getColorCode() {
        return colorCode;
    }

    public void setColorCode(String colorCode) {
        this.colorCode = colorCode;
    }

    NumberEnum(Double level, String colorCode) {
        this.level = level;
        this.colorCode = colorCode;
    }

    public static String getColorCode(Double d) {
        if (Math.abs( d - LEVEL1.getLevel() ) < 0.00000001) {
            return LEVEL1.getColorCode();
        } else if (d > LEVEL1.getLevel() && d <= LEVEL2.getLevel()) {
            return LEVEL2.getColorCode();
        } else if (d > LEVEL2.getLevel() && d <= LEVEL3.getLevel()) {
            return LEVEL3.getColorCode();
        } else if (d > LEVEL3.getLevel() && d <= LEVEL4.getLevel()) {
            return LEVEL4.getColorCode();
        } else if (d > LEVEL4.getLevel() && d <= LEVEL5.getLevel()) {
            return LEVEL5.getColorCode();
        } else if (d > LEVEL5.getLevel() && d <= LEVEL6.getLevel()) {
            return LEVEL6.getColorCode();
        } else if (d > LEVEL6.getLevel() && d <= LEVEL7.getLevel()) {
            return LEVEL7.getColorCode();
        } else if (d > LEVEL7.getLevel() && d < LEVEL8.getLevel()) {
            return LEVEL8.getColorCode();
        } else if ((d - LEVEL8.getLevel()) >= 0) {
            return LEVEL8.getColorCode();
        }
        return null;
    }
}
