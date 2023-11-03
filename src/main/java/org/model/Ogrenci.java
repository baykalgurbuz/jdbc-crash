package org.model;

public class Ogrenci {
    private long ID;
    private String NAME;
    private long OGRENCI_NUMBER;
    private long YEAR;

    public Ogrenci() {
    }
    public Ogrenci(long ID, String NAME, long OGRENCI_NUMBER, long YEAR) {
        this.ID = ID;
        this.NAME = NAME;
        this.OGRENCI_NUMBER = OGRENCI_NUMBER;
        this.YEAR = YEAR;
    }
    public Ogrenci(String NAME, long OGRENCI_NUMBER, long YEAR) {
        this.NAME = NAME;
        this.OGRENCI_NUMBER = OGRENCI_NUMBER;
        this.YEAR = YEAR;
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
    public long getOGRENCI_NUMBER() {
        return OGRENCI_NUMBER;
    }
    public void setOGRENCI_NUMBER(long OGRENCI_NUMBER) {
        this.OGRENCI_NUMBER = OGRENCI_NUMBER;
    }
    public long getYEAR() {
        return YEAR;
    }
    public void setYEAR(long YEAR) {
        this.YEAR = YEAR;
    }
    @Override
    public String toString() {
        return "Ogrenci{" +
                "ID=" + ID +
                ", NAME='" + NAME + '\'' +
                ", OGRENCI_NUMBER=" + OGRENCI_NUMBER +
                ", YEAR=" + YEAR +
                '}';
    }
}
