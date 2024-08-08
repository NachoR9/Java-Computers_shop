package dev.nacho;

import java.util.ArrayList;
import java.util.List;

public class Shop {
    private String name;
    private String owner;
    private String tin;
    private List<Computer> computers;


    public Shop(String name, String owner, String tin) {
        this.name = name;
        this.owner = owner;
        this.tin = tin;
        this.computers = new ArrayList<>();
    }

    
    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public String getOwner() {
        return owner;
    }


    public void setOwner(String owner) {
        this.owner = owner;
    }


    public String getTin() {
        return tin;
    }


    public void setTin(String tin) {
        this.tin = tin;
    }


    public void addComputer(Computer computer) {
        computers.add(computer);
    }

    public void deleteByBrand(String brand) {
        computers.removeIf(c ->brand.equals(c.getBrand()));
    }

    public List<Computer> searchByBrand(String brand) {
       return computers.stream().filter(c -> brand.equals(c.getBrand())).toList();
          
    }

    public List<String> listAllComputers() {
        return computers.stream().map(c -> c.toString()).toList();
    }

    
}
