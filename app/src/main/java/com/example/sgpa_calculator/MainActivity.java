package com.example.sgpa_calculator;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.sgpa_calculator.fragments.DisplayFragment;
import com.example.sgpa_calculator.fragments.HomeFragment;
import com.example.sgpa_calculator.helpers.FragmentHelper;

public class MainActivity extends AppCompatActivity {

    //fragments
    HomeFragment homeFragment;
    DisplayFragment displayFragment;


    //helper
    FragmentHelper fragmentHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
    }

    private void initViews(){
        initModel();
    }

    @Override
    protected void onPostCreate(@Nullable Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        gotoHomeFragment(FragmentHelper.REPLACE_FRAGMENT,false,null);
    }

    public void gotoHomeFragment(int action, boolean addToBackStack, String tag) {
        homeFragment = new HomeFragment();
        try {
            fragmentHelper.changeFragment(getSupportFragmentManager(), R.id.a_main_fl_container,
                    homeFragment, action, addToBackStack, tag);
        } catch (NullPointerException nullPointerException) {
            nullPointerException.printStackTrace();
        }
    }

    public void gotoDisplayFragment(int action, boolean addToBackStack, String tag) {
        displayFragment = new DisplayFragment();
        try {
            fragmentHelper.changeFragment(getSupportFragmentManager(), R.id.a_main_fl_container,
                    displayFragment, action, addToBackStack, tag);
        } catch (NullPointerException nullPointerException) {
            nullPointerException.printStackTrace();
        }
    }

    private void initModel(){
        fragmentHelper=new FragmentHelper();
    }
}