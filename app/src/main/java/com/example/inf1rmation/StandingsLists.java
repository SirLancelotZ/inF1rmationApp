package com.example.inf1rmation;

import java.util.List;

class StandingsLists {
    private String season;
    private String round;
    private List<DriverStandings> DriverStandings;

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public String getRound() {
        return round;
    }

    public void setRound(String round) {
        this.round = round;
    }

    public List<com.example.inf1rmation.DriverStandings> getDriverStandings() {
        return DriverStandings;
    }

    public void setDriverStandings(List<com.example.inf1rmation.DriverStandings> driverStandings) {
        DriverStandings = driverStandings;
    }
}
