package com.example.an;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import com.example.an.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private int count = 0;
    private ActivityMainBinding mainBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        EdgeToEdge.enable(this);

        mainBinding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(mainBinding.getRoot());
    }

    public void show_toast(View view) {
        Toast.makeText(
                this,
                "Hello Toast",
                Toast.LENGTH_SHORT
        ).show();
    }

//    public void increase_count(View view) {
//        count++;
//        mainBinding.textDisplayCount.setText(String.valueOf(count));
//    }
//}
}