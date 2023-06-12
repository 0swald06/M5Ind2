package com.example.m5ind2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;

import com.example.m5ind2.databinding.ActivityMainBinding;
import com.example.m5ind2.databinding.FragmentStartBinding;

public class MainActivity extends AppCompatActivity {
public ActivityMainBinding mBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding=ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(mBinding.getRoot());
        StartFragment startFragment= new StartFragment();


        getSupportFragmentManager().beginTransaction().add(R.id.contenedor, startFragment).commit();

    }
}