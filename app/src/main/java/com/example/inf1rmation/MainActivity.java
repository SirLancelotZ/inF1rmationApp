package com.example.inf1rmation;

//import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

//    private TextView mTextMessage;
//    private CustomAdapter adapter;
//    private RecyclerView recyclerView;
//    private ListView listViewStandings;
//    //ProgressDialog progressDialog;
//
//    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
//            = new BottomNavigationView.OnNavigationItemSelectedListener() {
//
//        @Override
//        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
//            switch (item.getItemId()) {
//                case R.id.navigation_home:
//                    mTextMessage.setText(R.string.title_home);
//                    return true;
//                case R.id.navigation_dashboard:
//                    mTextMessage.setText(R.string.title_dashboard);
//                    return true;
//                case R.id.navigation_notifications:
//                    mTextMessage.setText(R.string.title_notifications);
//                    return true;
//            }
//            return false;
//        }
//    };
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//
//        wireWidgets();
//
//
//
//        mTextMessage = (TextView) findViewById(R.id.message);
//        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
//        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
////        progressDialog = new ProgressDialog(MainActivity.this);
////        progressDialog.setMessage("Loading....");
////        progressDialog.show();
//
//        /*Create handle for the RetrofitInstance interface*/
//        DriverAPI service = RetrofitClientInstance.getRetrofitInstance().create(DriverAPI.class);
//        Call<List<DriverStandings>> call = service.getStandings(2018);
//        call.enqueue(new Callback<List<DriverStandings>>() {
//            @Override
//            public void onResponse(Call<List<DriverStandings>> call, Response<List<DriverStandings>> StandingLists) {
//               // progressDialog.dismiss();
//                List<DriverResponse> standingResponses = StandingLists.body().getStandingsLists();
//            }
//
//            @Override
//            public void onFailure(Call<List<DriverStandings>> call, Throwable t) {
//                //progressDialog.dismiss();
//                Toast.makeText(MainActivity.this, "Something went wrong...Please try later!", Toast.LENGTH_SHORT).show();
//            }
//        });
//    }
//
//    private void wireWidgets() {
//        listViewStandings = findViewById(R.id.main_listview_standings);
//    }
//
//
//
//    /*Method to generate List of data using RecyclerView with custom adapter*/
////    private void generateDataList(List<DriverStandings> photoList) {
////        recyclerView = findViewById(R.id.customRecyclerView);
////        adapter = new CustomAdapter(this, photoList);
////        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);
////        recyclerView.setLayoutManager(layoutManager);
////        recyclerView.setAdapter(adapter);
////    }


    public static final String TAG = "MainActivity";
    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager layoutManger;
    private DriverAdapter adapter;
    private List<com.example.inf1rmation.Driver> drivers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        drivers = new ArrayList<>();

        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        layoutManger = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManger);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        RecyclerViewClickListener listener = new RecyclerViewClickListener() {
            @Override
            public void onClick(View view, int position) {
                if(view.getId() == R.id.name) {
                    Toast.makeText(MainActivity.this, "You clicked on the title!", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, drivers.get(position).toString(), Toast.LENGTH_SHORT).show();
                }
            }
        };
        adapter = new DriverAdapter(MainActivity.this, drivers, listener);
        recyclerView.setAdapter(adapter);


        //JSON request from server
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(DriverAPI.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        DriverAPI api = retrofit.create(DriverAPI.class);

        Call<DriverResponse> call = api.getStandings(2009);

        call.enqueue(new Callback<DriverResponse>() {
            @Override
            public void onResponse(Call<DriverResponse> call, Response<DriverResponse> response) {
                DriverResponse driverResponse = response.body();
                Log.d(TAG, "onResponse: " + response.body().getResults().toString());
                drivers = driverResponse.getResults();
                if(drivers.size() == 0) {
                    Toast.makeText(MainActivity.this, "No matches found!", Toast.LENGTH_SHORT).show();
                    //add in some fake recipes if it finds none for testing purposes
                    //drivers.add(new Driver());
//                    recipes.add(new Recipe("test2", "test description1", "https://i.imgur.com/62Pmk5i.png"));
//                    recipes.add(new Recipe("test3", "test description1", "https://i.imgur.com/62Pmk5i.png"));
                }

                for(Driver r : drivers) {
                    Log.d(TAG, r.toString());
                }

                adapter.setDrivers(drivers);
                adapter.notifyDataSetChanged();




                //ListView listView = (ListView) findViewById(R.id.listView);
                //listView.setAdapter(new ArrayAdapter<Recipe>(MainActivity.this,android.R.layout.simple_expandable_list_item_1,recipes));
            }

            @Override
            public void onFailure(Call<DriverResponse> call, Throwable t) {
                Toast.makeText(MainActivity.this, t.getMessage(), Toast.LENGTH_LONG).show();
                Log.d(TAG, "onFailure: " + t.getMessage());
            }
        });
    }



}
