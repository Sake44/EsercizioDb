package model;

public class Computer {
    private int pcId;
    private String marca;
    private String ram;
    private String cpu;
    private double schermo;
    private String gpu;
    private double prezzo;


    public Computer(String marca, String ram, String cpu, double schermo, String gpu, double prezzo) {
        this.marca = marca;
        this.ram = ram;
        this.cpu = cpu;
        this.schermo = schermo;
        this.gpu = gpu;
        this.prezzo = prezzo;
    }


    //geters
    public String getMarca(){
        return this.marca;
    }
    public String getRam(){
        return this.ram;
    }
    public String getCpu(){
        return this.cpu;
    }
    public double getSchermo(){
        return this.schermo;
    }
    public String getGpu(){
        return this.gpu;
    }
    public double getPrezzo(){
        return this.prezzo;
    }

    //setters
    public void setMarca(String marca){
        this.marca = marca;
    }
    public void setRam(String ram){
        this.ram = ram;
    }
    public void setCpu(String cpu){
        this.cpu = cpu;
    }
    public void setSchermo(double schemo){
        this.schermo = schermo;
    }
    public void setGpu(String gpu){
        this.gpu = gpu;
    }
    public void setPrezzo(double prezzo){
        this.prezzo = prezzo;
    }
}