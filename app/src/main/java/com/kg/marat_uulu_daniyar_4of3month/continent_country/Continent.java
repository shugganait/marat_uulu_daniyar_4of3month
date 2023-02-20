package com.kg.marat_uulu_daniyar_4of3month.continent_country;

import java.io.Serializable;
import java.util.ArrayList;

public class Continent implements Serializable {
    private String name, map;
    private ArrayList<String> countries;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMap() {
        return map;
    }

    public void setMap(String map) {
        this.map = map;
    }

    public ArrayList<String> getCountries() {
        return countries;
    }

    public void setCountries(ArrayList<String> countries) {
        this.countries = countries;
    }

    public Continent(String name, String map, ArrayList<String> countries) {
        this.name = name;
        this.map = map;
        this.countries = countries;
    }
}
