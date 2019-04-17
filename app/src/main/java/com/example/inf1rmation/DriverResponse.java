package com.example.inf1rmation;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;


public class DriverResponse {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    private String name;
    private String team;
    private Integer position;

    public void setResults(List<Driver> results) {
        this.results = results;
    }

    private List<Driver> results;


    public List<Driver> getResults() {
        return results;
    }

}
