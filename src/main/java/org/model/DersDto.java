package org.model;

public class DersDto {
    private Ogretmen ogr;
    private Konu konu;
    public DersDto(Ogretmen ogr, Konu konu) {
        this.ogr = ogr;
        this.konu = konu;
    }
    public Ogretmen getOgr() {
        return ogr;
    }
    public void setOgr(Ogretmen ogr) {
        this.ogr = ogr;
    }
    public Konu getKonu() {
        return konu;
    }
    public void setKonu(Konu konu) {
        this.konu = konu;
    }
    @Override
    public String toString() {
        return "DersDto{" +
                "ogr=" + ogr +
                ", konu=" + konu +
                '}';
    }
}
