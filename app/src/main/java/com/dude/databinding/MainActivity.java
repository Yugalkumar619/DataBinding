package com.dude.databinding;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProvider;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.renderscript.ScriptGroup;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.dude.databinding.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

   //  private int score = 0;
    private ActivityMainBinding binding;
    private MainViewModel mainViewModel;

   // private Button btn;
    @SuppressLint("SuspiciousIndentation")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main);
       // setContentView(R.layout.activity_main);

       // TextView textView = findViewById(R.id.score);
      //  Button button = findViewById(R.id.contol_button);

       // mainViewModel = new MainViewModel();
        mainViewModel =new ViewModelProvider(this).get(MainViewModel.class);
                Log.i("MainActivity", "MainViewModel is Initialized");

                binding.score.setText(String.valueOf(mainViewModel.score));

        binding.contolButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mainViewModel.score++;
               // mainViewModel.score++;
                binding.score.setText(String.valueOf(mainViewModel.score));
            }
        });
    }
}