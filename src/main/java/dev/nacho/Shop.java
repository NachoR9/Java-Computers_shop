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
