package com.example.gasolinavsalcool;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.example.gasolinavsalcool.databinding.ActivityGasolinaBinding;

public class GasolinaActivity extends AppCompatActivity {
    private ActivityGasolinaBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityGasolinaBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);


    }
}