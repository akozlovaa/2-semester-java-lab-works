package com.company;

public class Juicer {

    private String color;
    private int maxJuicePerHour;
    private int energyConsumption;
    static String brand;

    private int speed;
    private int volumeOfJuice;

    protected int yearsOfWarranty;
    protected int serialNumber;

    public String getColor() {
        return color;
    }

    public int getMaxJuicePerHour() {
        return maxJuicePerHour;
    }

    public int getEnergyConsumption() {
        return energyConsumption;
    }

    public static String getBrand() {
        return brand;
    }

    public int getSpeed() {
        return speed;
    }

    public int getVolumeOfJuice() {
        return volumeOfJuice;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setMaxJuicePerHour(int maxJuicePerHour) {
        this.maxJuicePerHour = maxJuicePerHour;
    }

    public void setEnergyConsumption(int energyConsumption) {
        this.energyConsumption = energyConsumption;
    }

    public static void setBrand(String brand) {
        Juicer.brand = brand;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setVolumeOfJuice(int volumeOfJuice) {
        this.volumeOfJuice = volumeOfJuice;
    }

    public Juicer() {
        this(null, 0, 0, 0, 0, 0, 0);
    }

    public Juicer(String color, int maxJuicePerHour, int energyConsumption, int speed, int volumeOfJuice, int yearsOfWarranty, int serialNumber) {
        this.color = color;
        this.maxJuicePerHour = maxJuicePerHour;
        this.energyConsumption = energyConsumption;
        this.speed = speed;
        this.volumeOfJuice = volumeOfJuice;
        this.yearsOfWarranty = yearsOfWarranty;
        this.serialNumber = serialNumber;
    }

    public Juicer(String color, int maxJuicePerHour, int energyConsumption, int speed) {
        this.color = color;
        this.maxJuicePerHour = maxJuicePerHour;
        this.energyConsumption = energyConsumption;
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Juicer{" +
                "color='" + color + '\'' +
                ", maxJuicePerHour=" + maxJuicePerHour +
                ", energyConsumption=" + energyConsumption +
                ", speed=" + speed +
                ", volumeOfJuice=" + volumeOfJuice +
                ", yearsOfWarranty=" + yearsOfWarranty +
                ", serialNumber=" + serialNumber +
                '}';
    }

    public static String printStaticBrand() {
        System.out.println("Static: juicer's brand is " + brand);
        return null;
    }

    public String printBrand() {
        System.out.println("Regular: juicer's brand is " + brand);
        return null;
    }

    public void resetValues(String color, int maxJuicePerHour, int energyConsumption, int speed, int volumeOfJuice, int yearsOfWarranty, int serialNumber) {
        this.color = color;
        this.energyConsumption = energyConsumption;
        this.maxJuicePerHour = maxJuicePerHour;
        this.serialNumber = serialNumber;
        this.speed = speed;
        this.volumeOfJuice = volumeOfJuice;
        this.yearsOfWarranty = yearsOfWarranty;
    }

}
