package com.cat.bluu;

public interface Mappable {

    abstract void render();

    static double[] stringToLatLon(String locationData) {

        var splits = locationData.split(",");
        double lat = Double.parseDouble(splits[0]);
        double lon = Double.parseDouble(splits[1]);

        return new double[]{lat, lon};
    }
}

