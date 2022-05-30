package com.example.gasolinavsalcool;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.gasolinavsalcool.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);


        binding.button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               Float valor1 = Float.valueOf(binding.editTextGasolina.getText().toString());
               Float valor2 = Float.valueOf(binding.editTextTextAlcool.getText().toString());
               Float resultado = valor2/valor1;

               if (resultado < 0.7f){
                   Intent intent = new Intent(getApplicationContext(), AlcoolActivity.class);
                   startActivity(intent);

               } else {
                   Intent intent = new Intent(getApplicationContext(), GasolinaActivity.class);
                   startActivity(intent);
               }

            }
        });

    }

}
