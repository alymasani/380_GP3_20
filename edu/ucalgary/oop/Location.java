/**
 * @author  Elias Poitras-Whitecalf <a href="mailto:elias.poitraswhiteca@ucalgary.ca">
 *          elias.poitraswhiteca@ucalgary.ca</a>
 * @version 1.0
 * @since   1.0
 */
package edu.ucalgary.oop;
import java.util.ArrayList;
import java.util.List;
/**
 * Location class shows the location and address of the shelter. as well as who is there
 * as well as supplies they have
 */
public class Location {
    private String name;
    private String address;
    private List<DisasterVictim> occupants;
    private List<Supply> supplies;
//constructor
    public Location(String name, String address) {
        this.setName(name);
        this.setAddress(address);
        this.supplies = new ArrayList<>();
        this.occupants = new ArrayList<>();
    }
//setters and getters as well as add and remove methods
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
