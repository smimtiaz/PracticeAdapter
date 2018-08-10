package com.example.imtia.countrycustomadapter;

public class CountryData {

    private String countryName;
    private int flagID;

    public CountryData(String countryName, int flagID) {

        this.countryName = countryName;
        this.flagID = flagID;
    }

    public String getCountryName() {

        return countryName;
    }

    public int getFlagID() {

        return flagID;
    }
}
