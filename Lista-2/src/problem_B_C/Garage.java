package problem_B_C;

public class Garage {
    private int space;
    private boolean isCovered;

    public int getSpace() {
        return space;
    }

    public void setSpace(int space) {
        this.space = space;
    }

    public boolean getIsCovered() {
        return isCovered;
    }

    public void setIsCovered(boolean covered) {
        isCovered = covered;
    }

    public Door getDoor() {
        return door;
    }

    public void setDoor(Door door) {
        this.door = door;
    }

    private Door door;

    public Garage() {}

    public Garage(int space, boolean isCovered, Door door) {
        this.space = space;
        this.isCovered = isCovered;
        this.door = door;
    }
}
