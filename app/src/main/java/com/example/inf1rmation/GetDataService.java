package com.example.inf1rmation;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface GetDataService {
    @GET("/{year}/driverStandings.json")
    Call<List<DriverStandings>> getStandings(@Path("year") int year);
}
