package Technology;

public class Computer {
    private String brand;
    public int GBMemory;
    private boolean forWork = true;

    public Computer(String brand, int GBMemory, boolean forWork) {
        this.brand = brand;
        this.GBMemory = GBMemory;
        this.forWork = forWork;
    }

    public String getBrand() {
        return brand;
    }

    public int getGBMemory() {
        return GBMemory;
    }




    public boolean isForWork() {
        return forWork;
    }

    public int addSoftware(int programSize){
        GBMemory = this.GBMemory - programSize;
        return this.GBMemory;

    }
}

