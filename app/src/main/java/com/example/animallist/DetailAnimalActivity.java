package com.example.animallist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DetailAnimalActivity extends AppCompatActivity {

    TextView name,color,desc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_animal);
        name = findViewById(R.id.txt_name);
        color = findViewById(R.id.txt_color);
        desc = findViewById(R.id.txt_description);
        Intent intent = getIntent();
        String message1 = intent.getStringExtra(AnimalAdapter.MESSAGE_ORDER);
        String message2 = intent.getStringExtra(AnimalAdapter.MESSAGE_ORDER2);
        String message3 = intent.getStringExtra(AnimalAdapter.MESSAGE_ORDER3);

        name.setText(message1);
        color.setText(message2);
        desc.setText(message3);

    }
}
