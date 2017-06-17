package com.github.davidmoten.geo;

public class GeoHashInfo extends LatLong {
    private final String geoHash;
    private final double latTopLeft;
    private final double lonTopLeft;
    private final double latBotRight;
    private final double lonBotRight;
    private final double sizeLat;
    private final double sizeLon;



    public GeoHashInfo(String geoHash, double centerLat, double centerLon, double latTopLeft, double lonTopLeft, double latBotRight, double lonBotRight) {
        super(centerLat, centerLon);
        this.geoHash = geoHash;
        this.latTopLeft = latTopLeft;
        this.lonTopLeft = lonTopLeft;
        this.latBotRight = latBotRight;
        this.lonBotRight = lonBotRight;
        this.sizeLat = Math.abs(latTopLeft-latBotRight);
        this.sizeLon = Math.abs(lonTopLeft-lonBotRight);
    }

    public double getCenterLat() {
        return getLat();
    }

    public double getCenterLon() {
        return getLon();
    }

    public double getLatTopLeft() {
        return latTopLeft;
    }

    public double getLonTopLeft() {
        return lonTopLeft;
    }

    public double getLatBotRight() {
        return latBotRight;
    }

    public double getLonBotRight() {
        return lonBotRight;
    }

    public double getSizeLat() {
        return sizeLat;
    }

    public double getSizeLon() {
        return sizeLon;
    }

    public String getGeoHash() {
        return geoHash;
    }
}