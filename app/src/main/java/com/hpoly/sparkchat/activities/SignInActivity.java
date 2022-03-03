package com.hpoly.sparkchat.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.hpoly.sparkchat.R;
import com.hpoly.sparkchat.databinding.ActivitySignInBinding;

public class SignInActivity extends AppCompatActivity {

    // As we’ve enabled viewBinding for our project, the binding class for each XML layout will be generated automatically.
    // Here ‘ActivitySignInBinding’ class is automatically generated from our layout file: ‘activity_sign_in’
    private ActivitySignInBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySignInBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        setListeners();
    }

    private void setListeners() {
        // an instance of a binding class contains direct references to all views that have an ID in the corresponding layout
        binding.CreateNewAccount.setOnClickListener(v ->
                startActivity(new Intent(getApplicationContext(), SignUpActivity.class)));
    }
}