package model;

public class Computer {
    private int pcId;
    private String brand;
    private String ram;
    private String cpu;
    private String schermo;
    private String gpu;
    private int prezzo;


    public Computer(int pcId, String brand, String ram, String cpu, String schermo, String gpu, int prezzo) {
        this.pcId = pcId;
        this.brand = brand;
        this.ram = ram;
        this.cpu = cpu;
        this.schermo = schermo;
        this.gpu = gpu;
        this.prezzo = prezzo;
    }


    public int getPcId() {
        return this.pcId;
    }

    public void setPcId(int pcId) {
        this.pcId = pcId;
    }

    public String getBrand() {
        return this.brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getRam() {
        return this.ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getCpu() {
        return this.cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getSchermo() {
        return this.schermo;
    }

    public void setSchermo(String schermo) {
        this.schermo = schermo;
    }

    public String getGpu() {
        return this.gpu;
    }

    public void setGpu(String gpu) {
        this.gpu = gpu;
    }

    public int getPrezzo() {
        return this.prezzo;
    }

    public void setPrezzo(int prezzo) {
        this.prezzo = prezzo;
    }

}