package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    // this is beta version
    // declare UI components
    private Button showDiaglogButton;
    private EditText userET;
    private TextView userTextView;
    // declare toast text
    private String toastMessage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // get string from XML
        toastMessage = getString(R.string.string_toast_hello);

        // define UI Component
        showDiaglogButton = findViewById(R.id.show_dialog_button);
        userET = findViewById(R.id.user_edit_text);
        userTextView = findViewById(R.id.user_text_view);
        // add button listener
        showDiaglogButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //  build toast message
                String message = toastMessage + userET.getText();
               Toast.makeText(getApplicationContext(), message , Toast.LENGTH_SHORT).show();
               // set user text view with toast message
                userTextView.setText(message);
                Intent testActivity = new Intent(MainActivity.this, TestActivity.class);
                MainActivity.this.startActivity(testActivity);
            }
        });


        // add button listener
        /*
        showDiaglogButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                // this function is called when button clicked
                // show toast message
                Toast.makeText(MainActivity.this, toastMessage + userEditText.getText(),
                        Toast.LENGTH_SHORT).show();
                // update text view
                userTextView.setText(toastMessage + userEditText.getText());
            }
        });

         */
    }
}