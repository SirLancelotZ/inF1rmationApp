package com.example.inf1rmation;

import com.google.gson.annotations.SerializedName;

import retrofit2.http.Url;
import java.util.ArrayList;
import java.util.List;

public class DriverStandings {



    @SerializedName("position")
    private Integer position;


    @SerializedName("wins")
    private Integer wins;


    @SerializedName("points")
    private Integer points;


    @SerializedName("name")
    private String name;

    @SerializedName("driver")
    private List<String> driver = new ArrayList<String>();


    @SerializedName("driverId")
    private String driverId;

    @SerializedName("permanentNumber")
    private Integer permanentNumber;


    @SerializedName("code")
    private String code;

    @SerializedName("url")
    private String url;

    @SerializedName("givenName")
    private String givenName;

    @SerializedName("familyName")
    private String familyName;

    @SerializedName("dateOfBirth")
    private String dateOfBirth;

    @SerializedName("nationality")
    private String nationality;

    @SerializedName("Constructors")
    private List<String> Constructors = new ArrayList<String>();

    @SerializedName("constructorId")
    private String constructorId;



    public DriverStandings(Integer position, Integer points, Integer wins, String driverId, Integer permanentNumber, String code, String url, String givenName, String familyName, String dateOfBirth,  String nationality, String constructorId)  {
        this.position = position;
        this.points = points;
        this.wins = wins;
        this.driverId = driverId;
        this.permanentNumber = permanentNumber;
        this.code = code;
        this.url = url;
        this.givenName = givenName;
        this.familyName = familyName;
        this.dateOfBirth = dateOfBirth;
        this.nationality = nationality;
        this.constructorId = constructorId;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    public Integer getWin() {
        return wins;
    }

    public void setWin(Integer win) {
        this.wins = win;
    }

    public Integer getPoint() {
        return points;
    }

    public void setPoint(Integer point) {
        this.points = points;
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