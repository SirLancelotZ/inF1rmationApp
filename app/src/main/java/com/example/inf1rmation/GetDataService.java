package com.example.inf1rmation;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface GetDataService {
    @GET("/standings")
    Call<List<DriverStandings>> getStandings();
}
