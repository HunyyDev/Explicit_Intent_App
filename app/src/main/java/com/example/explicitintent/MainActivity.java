package com.example.explicitintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Initiate();
    }

    private void Initiate() {
        btn = findViewById(R.id.btnNavigate);
        btn.setOnClickListener(v -> {
            Intent i = new Intent(getApplicationContext(), MainActivity2.class);
            i.putExtra("id",113);
            startActivity(i);
        });
    }
}