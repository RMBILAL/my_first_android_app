package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.util.Log;
import android.view.View;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.myapplication.databinding.ActivityMainBinding;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    // this is beta version
    // declare UI components
    private Button showDiaglogButton;
    private EditText userEditText;
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
        userEditText = findViewById(R.id.user_edit_text);
        userTextView = findViewById(R.id.user_text_view);
        // add button listener
        showDiaglogButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //  build toast message
                String message = toastMessage + userEditText.getText();
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