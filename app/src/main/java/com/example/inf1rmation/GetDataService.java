package com.example.inf1rmation;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface GetDataService {
    @GET("/driverStandings")
    Call<List<DriverStandings>> getStandings();
}
