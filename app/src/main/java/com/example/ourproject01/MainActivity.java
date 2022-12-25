package com.example.ourproject01;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Spinner teamspinner;
    BeeTeamFragment beeteamfragment;
    AshbalFragment ashbalfragment;
    ZahratFragment zahratFragment;
    HomeFragment homefragment;
    Gawala_BoysFragment gawalaBoysFragment;
    Gawala_GirlsFragment gawalaGirlsFragment;
    Mor4edatFragment mor4edatFragment;
    Morsha7_BoysFragment morsha7BoysFragment;
    Morsha7_GirlsFragment morsha7GirlsFragment;
    KashafFragment kashafFragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //to hide the project name bar
        getSupportActionBar().hide();

                homefragment= new HomeFragment();
                beeteamfragment= new BeeTeamFragment();
                ashbalfragment= new AshbalFragment();
                zahratFragment=new ZahratFragment();
                mor4edatFragment=new Mor4edatFragment();
                morsha7BoysFragment=new Morsha7_BoysFragment();
                morsha7GirlsFragment=new Morsha7_GirlsFragment();
                gawalaBoysFragment=new Gawala_BoysFragment();
                gawalaGirlsFragment=new Gawala_GirlsFragment();
                kashafFragment=new KashafFragment();
                teamspinner=findViewById(R.id.spinner);

            String[] teams = new String[]{"اختار الفريق                                  ","Bee Team","أشبال","زهرات","كشاف","مرشدات","مرشح جوالة (و)","مرشح جوالة (ب)","جوالة (و)","جوالة (ب)"};
            ArrayAdapter<String> teamsadapter =new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, teams);
            teamsadapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            teamspinner.setAdapter(teamsadapter);
            teamspinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> adapterView, View view, int pos, long l) {
                    switch (pos) {
                        case 0:
                            selectFragment(homefragment);
                            break;
                        case 1:
                            selectFragment(beeteamfragment);
                            break;
                        case 2:
                            selectFragment(ashbalfragment);
                            break;
                        case 3:
                            selectFragment(zahratFragment);
                            break;
                        case 4:
                                selectFragment(kashafFragment);
                            break;
                        case 5:
                            selectFragment(mor4edatFragment);
                            break;
                        case 6:
                            selectFragment(morsha7BoysFragment);
                            break;
                        case 7:
                            selectFragment(morsha7GirlsFragment);
                            break;
                        case 8:
                            selectFragment(gawalaBoysFragment);
                            break;
                        case 9:
                            selectFragment(gawalaGirlsFragment);
                            break;
                    }
                }
                @Override
                public void onNothingSelected(AdapterView<?> adapterView) {
                }
            });


    }

    private void selectFragment(Fragment fragment) {
        FragmentTransaction fragmentrransaction;
        fragmentrransaction= getSupportFragmentManager().beginTransaction();
        fragmentrransaction.replace(R.id.fraglayout, fragment);
        fragmentrransaction.commit();
    }
}