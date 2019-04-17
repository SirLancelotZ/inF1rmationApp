package com.example.inf1rmation;

import java.util.List;

class StandingsTable {
    private String season;

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public List<StandingsLists> getStandingsLists() {
        return StandingsLists;
    }

    public void setStandingsLists(List<StandingsLists> standingsLists) {
        StandingsLists = standingsLists;
    }

    private List<StandingsLists> StandingsLists;
}
