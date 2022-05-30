package com.example.gasolinavsalcool;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.example.gasolinavsalcool.databinding.ActivityAlcoolBinding;


public class AlcoolActivity extends AppCompatActivity {
    private ActivityAlcoolBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityAlcoolBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);


    }
}