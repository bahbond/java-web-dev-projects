package org.launchcode;

public abstract class BaseDisc {
    private String name;
    private int minSpeed;
    private int maxSpeed;
    private String dataType;

    public BaseDisc(String name, int minSpeed, int maxSpeed) {
        this.name = name;
        this.minSpeed = minSpeed;
        this.maxSpeed = maxSpeed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMinSpeed() {
        return minSpeed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public String getDataType() {
        return dataType;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }
}
