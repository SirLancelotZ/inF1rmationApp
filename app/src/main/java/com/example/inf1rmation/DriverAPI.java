package com.example.inf1rmation;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface DriverAPI {


    String BASE_URL = "http://ergast.com/api/f1/";

    @GET("{year}/driverStandings.json")
    Call<DriverResponse> getStandings(@Path("year") int year);
}
