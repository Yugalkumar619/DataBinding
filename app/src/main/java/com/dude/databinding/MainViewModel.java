package com.dude.databinding;

import android.util.Log;

import androidx.lifecycle.ViewModel;

public class MainViewModel extends ViewModel {

    public int score = 0;
    public MainViewModel() {
        Log.i("MainView", "ViewModel is created");
    }

    @Override
    protected void onCleared(){
        super.onCleared();
        Log.i("MainViewModel", "ViewModel is Destroyed!");
    }
}
