package problem_B_C;

public class House {
    private Address adress;
    private String color;
    private Door door;
    private Garage garage;
    private boolean haveWall;
    private Owner owner;

    private double terrainArea;

    public House() {}

    public House(Address adress, String color, Door door, Garage garage, boolean haveWall, Owner owner, double terrainArea) {
        this.adress = adress;
        this.color = color;
        this.door = door;
        this.garage = garage;
        this.haveWall = haveWall;
        this.owner = owner;
        this.terrainArea = terrainArea;
    }

    public Address getAdress() {
        return adress;
    }

    public void setAdress(Address adress) {
        this.adress = adress;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Door getDoor() {
        return door;
    }

    public void setDoor(Door door) {
        this.door = door;
    }

    public Garage getGarage() {
        return garage;
    }

    public void setGarage(Garage garage) {
        this.garage = garage;
    }

    public boolean getHaveWall() {
        return haveWall;
    }

    public void setHaveWall(boolean haveWall) {
        this.haveWall = haveWall;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public double getTerrainArea() {
        return terrainArea;
    }

    public void setTerrainArea(double terrainArea) {
        this.terrainArea = terrainArea;
    }

    public double calculateIPTU() {
        String houseNeighborhood = this.getAdress()
                                            .getNeighborhood()
                                            .toLowerCase();

        double meterValue = switch (houseNeighborhood) {
            case "boa viagem" -> 1500.00;
            case "pina" -> 1200.00;
            case "boa vista" -> 1000.00;
            default -> 850.00;
        };

        double venalValue = this.getTerrainArea() * meterValue;
        double aliquot = 0.02;
        double taxCost = (venalValue * aliquot);

        double wallAdditional = this.getHaveWall() ? (taxCost * 0.10) : 0;

        return taxCost + wallAdditional;
    }
}
