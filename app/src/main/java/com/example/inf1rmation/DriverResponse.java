package com.example.inf1rmation;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;


public class DriverResponse {

    private List<MRData> MRData;

    public void setMRData(List<com.example.inf1rmation.MRData> MRData) {
        this.MRData = MRData;
    }

    public List<MRData> getMRData() {
        return MRData;
    }

}
