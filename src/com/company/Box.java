package com.company;

public class Box <I>{
    private I ID;

    public Box(I ID) {
        this.ID = ID;
    }

    public I getID() {
        return ID;
    }

    public void setID(I ID) {
        this.ID = ID;
    }

    @Override
    public String toString() {
        return "Box:" +
                " ID - " + ID;
    }

    public static <I> Box genMethod() {
        Box box = new Box(985467);
        return box;
    }
}




