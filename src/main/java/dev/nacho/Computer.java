package dev.nacho;

public class Computer {
    private String brand;
    private int memory;
    private String processor;
    private String os;
    private double price;

    public Computer(String brand, int memory, String processor, String os, double price) {
        this.brand = brand;
        this.memory = memory;
        this.processor = processor;
        this.os = os;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Computer [brand=" + brand + ", memory=" + memory + ", processor=" + processor + ", os=" + os
                + ", price=" + price + "]";
    }

    

    

    
}
