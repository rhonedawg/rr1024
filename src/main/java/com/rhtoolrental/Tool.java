package com.rhtoolrental;

public class Tool {
    private String code;
    private String toolType;
    private String brand;

    public Tool(String code, String type, String brand) {
        this.code = code;
        this.toolType = type;
        this.brand = brand;
    }

    public String getCode() {
        return code;
    }
    public String getToolType() {
        return toolType;
    }
    public String getBrand() {
        return brand;
    }
    public String toString() {
        return code + " " + toolType + " " + brand + " ";
    }
}
