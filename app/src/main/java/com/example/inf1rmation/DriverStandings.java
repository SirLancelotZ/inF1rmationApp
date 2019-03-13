package com.example.inf1rmation;

import com.google.gson.annotations.SerializedName;

import retrofit2.http.Url;

public class DriverStandings {



    @SerializedName("position")
    private Integer position;


    @SerializedName("win")
    private Integer win;


    @SerializedName("point")
    private Integer point;


    @SerializedName("name")
    private String name;



    @SerializedName("code")
    private String code;

    @SerializedName("url")
    private String url;


    @SerializedName("nationality")
    private String nationality;

    public DriverStandings(Integer position, Integer win, Integer point, String url, String name, String code, String nationality)  {
        this.position = position;
        this.win = win;
        this.point = point;
        this.url = url;
        this.name = name;
        this.code = code;
        this.nationality = nationality;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    public Integer getWin() {
        return win;
    }

    public void setWin(Integer win) {
        this.win = win;
    }

    public Integer getPoint() {
        return point;
    }

    public void setPoint(Integer point) {
        this.point = point;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

}