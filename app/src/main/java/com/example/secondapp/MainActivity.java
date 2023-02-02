package com.example.secondapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       CardView cardView = findViewById(R.id.card_view);
       cardView.setBackgroundResource(R.drawable.bg_card);

        Button buttonOne = findViewById(R.id.button_one);

        buttonOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Обработка клика

                if (cardView.getAlpha() == 1){
                    cardView.animate().alpha(0);
                } else {
                    cardView.animate().alpha(1);
                }

            }
        });

        Button bigButton = findViewById(R.id.big_button);
        LinearLayout container = findViewById(R.id.container);

        bigButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (container.getVisibility() == View.VISIBLE){
                    container.setVisibility(View.GONE);
                } else {
                    container.setVisibility(View.VISIBLE);
                }
            }
        });

        Button buttonOval = findViewById(R.id.btn_oval);
        EditText editText = findViewById(R.id.edit_text);
        buttonOval.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, editText.getText().toString(),
                        Toast.LENGTH_SHORT).show();
            }
        });
    }
}