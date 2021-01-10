package com.example.di;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    public EditText nameText , ageText , weightText , hairStyleText;
    public TextView textViewRes;
    public Button btnSubmit ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewRes = findViewById(R.id.textView);
        nameText = findViewById(R.id.nameText);
        ageText = findViewById(R.id.ageText);
        weightText = findViewById(R.id.weightText);
        hairStyleText = findViewById(R.id.hairStyletText);

        btnSubmit = findViewById(R.id.button);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                HairStyle hairStyle = new HairStyle(hairStyleText.getText().toString() , "Blond");
                Human human = new Human(nameText.getText().toString() , Integer.parseInt(ageText.getText().toString()) , Integer.parseInt(weightText.getText().toString()) , hairStyle);
                String humanGetName = human.name;
                int humanGetage = human.age;

                textViewRes.setText("Name : " + humanGetName + "\n");
                textViewRes.append("Age : " + String.valueOf(humanGetage));
            }
        });

    }
}