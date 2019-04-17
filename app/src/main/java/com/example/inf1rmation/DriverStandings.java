//package com.example.inf1rmation;
//
//import com.google.gson.annotations.SerializedName;
//
//import retrofit2.http.Url;
//import java.util.ArrayList;
//import java.util.List;
//
//public class DriverStandings {
//
//    @SerializedName("DriverStandings")
//    private List<Driver> drivers;
//
//    @SerializedName("position")
//    private Integer position;
//
//
//    @SerializedName("wins")
//    private Integer wins;
//
//
//    @SerializedName("points")
//    private Integer points;
//
//
////    @SerializedName("name")
////    private String name;
////
////    public List<String> getDriver() {
////        return driver;
////    }
////
////    public void setDriver(List<String> driver) {
////        this.driver = driver;
////    }
////
////    @SerializedName("driver")
////    private List<String> driver = new ArrayList<String>();
//
//
//    public String getDriverId() {
//        return driverId;
//    }
//
//    public void setDriverId(String driverId) {
//        this.driverId = driverId;
//    }
//
//    @SerializedName("driverId")
//    private String driverId;
//
//    public Integer getPermanentNumber() {
//        return permanentNumber;
//    }
//
//    public void setPermanentNumber(Integer permanentNumber) {
//        this.permanentNumber = permanentNumber;
//    }
//
//    @SerializedName("permanentNumber")
//    private Integer permanentNumber;
//
//
//    @SerializedName("code")
//    private String code;
//
//    @SerializedName("url")
//    private String url;
//
//    public String getGivenName() {
//        return givenName;
//    }
//
//    public void setGivenName(String givenName) {
//        this.givenName = givenName;
//    }
//
//    @SerializedName("givenName")
//    private String givenName;
//
//    public String getFamilyName() {
//        return familyName;
//    }
//
//    public void setFamilyName(String familyName) {
//        this.familyName = familyName;
//    }
//
//    @SerializedName("familyName")
//    private String familyName;
//
//    public String getDateOfBirth() {
//        return dateOfBirth;
//    }
//
//    public void setDateOfBirth(String dateOfBirth) {
//        this.dateOfBirth = dateOfBirth;
//    }
//
//    @SerializedName("dateOfBirth")
//    private String dateOfBirth;
//
//    @SerializedName("nationality")
//    private String nationality;
//
//    public List<String> getConstructors() {
//        return Constructors;
//    }
//
//    public void setConstructors(List<String> constructors) {
//        Constructors = constructors;
//    }
//
//    @SerializedName("Constructors")
//    private List<String> Constructors = new ArrayList<String>();
//
//    public String getConstructorId() {
//        return constructorId;
//    }
//
//    public void setConstructorId(String constructorId) {
//        this.constructorId = constructorId;
//    }
//
//    @SerializedName("constructorId")
//    private String constructorId;
//
//
//    public Integer getWins() {
//        return wins;
//    }
//
//    public void setWins(Integer wins) {
//        this.wins = wins;
//    }
//
//    public Integer getPoints() {
//        return points;
//    }
//
//    public void setPoints(Integer points) {
//        this.points = points;
//    }
//
//
//
//    public Integer getPosition() {
//        return position;
//    }
//
//    public void setPosition(Integer position) {
//        this.position = position;
//    }
//
//    public Integer getWin() {
//        return wins;
//    }
//
//    public void setWin(Integer win) {
//        this.wins = win;
//    }
//
//    public Integer getPoint() {
//        return points;
//    }
//
//    public void setPoint(Integer point) {
//        this.points = points;
//    }
//
////    public String getName() {
////        return name;
////    }
//
////    public void setName(String name) {
////        this.name = name;
////    }
//    public String getUrl() {
//        return url;
//    }
//
//    public void setUrl(String url) {
//        this.url = url;
//    }
//
//    public String getCode() {
//        return code;
//    }
//
//    public void setCode(String code) {
//        this.code = code;
//    }
//    public String getNationality() {
//        return nationality;
//    }
//
//    public void setNationality(String nationality) {
//        this.nationality = nationality;
//    }
//
//    //@SerializedName("StandingsLists")
//
//
//    public DriverStandings(Integer position, Integer points, Integer wins, String driverId, Integer permanentNumber, String code, String url, String givenName, String familyName, String dateOfBirth, String nationality, String constructorId)  {
//        this.position = position;
//        this.points = points;
//        this.wins = wins;
//        this.driverId = driverId;
//        this.permanentNumber = permanentNumber;
//        this.code = code;
//        this.url = url;
//        this.givenName = givenName;
//        this.familyName = familyName;
//        this.dateOfBirth = dateOfBirth;
//        this.nationality = nationality;
//        this.constructorId = constructorId;
//    }
//}