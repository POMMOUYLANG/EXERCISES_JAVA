package Review.Inner;

public class Computer2 {
    private String model;
    private int cpuCore;
    private String cpuType;
    private int ramSize;

    
    
    public Computer2(String model, int cpuCore, String cpuType, int ramSize) {
        this.model = model;
        this.cpuCore = cpuCore;
        this.cpuType = cpuType;
        this.ramSize = ramSize;
    }

    @Override
    public String toString() {
        return "Computer2 [model=" + model + ", cpuCore=" + cpuCore + ", cpuType=" + cpuType + ", ramSize=" + ramSize
                + "]";
    }

    
}
