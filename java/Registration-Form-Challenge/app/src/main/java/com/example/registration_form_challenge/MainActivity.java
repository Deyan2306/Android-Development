package com.example.registration_form_challenge;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void registerBtnHandler(View view) {
        TextView txtFirstName = findViewById(R.id.firstNameTextView);
        TextView txtLastName = findViewById(R.id.lastNameTextView);
        TextView txtEmail = findViewById(R.id.emailTextView);

        EditText editTextFirstName = findViewById(R.id.firstNameInputBox);
        EditText editTextLastName = findViewById(R.id.lastNameInputBox);
        EditText editTextEmail = findViewById(R.id.emailInputBox);

        txtFirstName.setText("First Name: " + editTextFirstName.getText().toString());
        txtLastName.setText("Last Name: " + editTextLastName.getText().toString());
        txtEmail.setText("Email: " + editTextEmail.getText().toString());

        editTextFirstName.setText("");
        editTextFirstName.setText("");
        editTextEmail.setText("");
    }
}