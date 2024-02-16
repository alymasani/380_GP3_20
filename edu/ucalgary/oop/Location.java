package edu.ucalgary.oop;
import java.util.ArrayList;
import java.util.List;
//
public class Location {
    private String name;
    private String address;
    private List<DisasterVictim> occupants;
    private List<Supply> supplies;

    public Location(String name, String address) {
        this.setName(name);
        this.setAddress(address);
        this.supplies = new ArrayList<>(); // Initialize supplies list
        this.occupants = new ArrayList<>();
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setOccupants(List<DisasterVictim> occupants) {
        this.occupants = occupants;
    }

    public void setSupplies(List<Supply> supplies) {
        this.supplies = supplies;
    }

    public void addSupply(Supply supply) {
        this.supplies.add(supply);
    }

    public void addOccupant(DisasterVictim occupant) {
        this.occupants.add(occupant);
    }

    public List<DisasterVictim> getOccupants() {
        return occupants;
    }

    public List<Supply> getSupplies() {
        return supplies;
    }

    public void removeOccupant(DisasterVictim occupant) {
        this.occupants.remove(occupant);
    }

    public void removeSupply(Supply supply) {
        this.supplies.remove(supply);
    }

    public String getName() {
        return this.name;
    }

    public String getAddress() {
        return this.address;
    }
}
