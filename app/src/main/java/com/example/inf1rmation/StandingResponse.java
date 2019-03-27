package com.example.inf1rmation;

import android.graphics.Movie;

import com.google.gson.annotations.SerializedName;

import java.util.List;


public class StandingResponse {
    public int getStandingsTable() {
        return StandingsTable;
    }

    public void setStandingsTable(int standingsTable) {
        StandingsTable = standingsTable;
    }

    @SerializedName("StandingsTable")
    private int StandingsTable;

    public List<StandingResponse> getStandingsLists() {
        return StandingsLists;
    }

    public void setStandingsLists(List<StandingResponse> standingsLists) {
        StandingsLists = standingsLists;
    }

    @SerializedName("StandingsLists")
    private List<StandingResponse> StandingsLists;

    public int getSeason() {
        return season;
    }

    public void setSeason(int season) {
        this.season = season;
    }

    @SerializedName("season")
    private int season;



    }
