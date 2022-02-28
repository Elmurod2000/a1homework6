package com.example.a1homework6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.a1homework6.databinding.ActivityMain2Binding;

public class MainActivity2 extends AppCompatActivity implements OnItemClick{

    private ActivityMain2Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMain2Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.tvSecond.setText(getIntent().getStringExtra("key"));

    }

    @Override
    public void onlick(Model model) {

    }
}