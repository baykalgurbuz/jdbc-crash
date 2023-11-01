package org.model;

public class Konu {
    private long ID;
    private String NAME;
    public Konu() {
    }
    public Konu(long ID, String NAME) {
        this.ID = ID;
        this.NAME = NAME;
    }
    public Konu(String NAME) {
        this.NAME = NAME;
    }
    public long getID() {
        return ID;
    }
    public void setID(long ID) {
        this.ID = ID;
    }
    public String getNAME() {
        return NAME;
    }
    public void setNAME(String NAME) {
        this.NAME = NAME;
    }
    @Override
    public String toString() {
        return "Konu{" +
                "ID=" + ID +
                ", NAME='" + NAME + '\'' +
                '}';
    }
}
