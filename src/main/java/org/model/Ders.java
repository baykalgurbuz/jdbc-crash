package org.model;

public class Ders {
    private long ID;
    private long OGRETMEN_ID;
    private long KONU_ID;

    public Ders() {
    }

    public Ders(long ID) {
        this.ID = ID;
    }

    public Ders(long ID, long OGRETMEN_ID, long KONU_ID) {
        this.ID = ID;
        this.OGRETMEN_ID = OGRETMEN_ID;
        this.KONU_ID = KONU_ID;
    }
    public Ders(long OGRETMEN_ID, long KONU_ID) {
        this.OGRETMEN_ID = OGRETMEN_ID;
        this.KONU_ID = KONU_ID;
    }
    public long getID() {
        return ID;
    }
    public void setID(long ID) {
        this.ID = ID;
    }
    public long getOGRETMEN_ID() {
        return OGRETMEN_ID;
    }
    public void setOGRETMEN_ID(long OGRETMEN_ID) {
        this.OGRETMEN_ID = OGRETMEN_ID;
    }
    public long getKONU_ID() {
        return KONU_ID;
    }
    public void setKONU_ID(long KONU_ID) {
        this.KONU_ID = KONU_ID;
    }

    @Override
    public String toString() {
        return "Ders{" +"ID=" + ID +", OGRETMEN_ID="+ OGRETMEN_ID +",KONU_ID="+ KONU_ID + '}';
    }
}
