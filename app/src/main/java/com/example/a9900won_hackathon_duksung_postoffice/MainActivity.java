package com.example.a9900won_hackathon_duksung_postoffice;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
<<<<<<< HEAD
import java.util.List;

public class MainActivity extends AppCompatActivity {

=======

public class MainActivity extends AppCompatActivity {

    ListView mListView = null;
    BaseAdapterEx mAdapter = null;
    ArrayList<List> mData = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
>>>>>>> a2aa071f8799d0470948e45877ec154540f0c2a1
}