package org.model;

public class Ogretmen {
    private long ID;
    private String NAME;
    private boolean IS_GICIK;
    public Ogretmen() {
    }
    public Ogretmen(long ID, String NAME, boolean IS_GICIK) {
        this.ID = ID;
        this.NAME = NAME;
        this.IS_GICIK = IS_GICIK;
    }
    public Ogretmen(String NAME, boolean IS_GICIK) {
        this.NAME = NAME;
        this.IS_GICIK = IS_GICIK;
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
    public boolean isIS_GICIK() {
        return IS_GICIK;
    }
    public void setIS_GICIK(boolean IS_GICIK) {
        this.IS_GICIK = IS_GICIK;
    }
    @Override
    public String toString() {
        return "Ogretmen{" +
                "ID=" + ID +
                ", NAME='" + NAME + '\'' +
                ", IS_GICIK=" + IS_GICIK +
                '}';
    }
}
