package com.example.fragment_layout;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class SignUpFragment extends Fragment {

    private EditText etUsername, etEmail, etPassword, etConfirmPassword;
    private Button btnSignUp;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_signup, container, false);

        etUsername = view.findViewById(R.id.et_signin_username);
        etEmail = view.findViewById(R.id.et_signin_email);
        etPassword = view.findViewById(R.id.et_signin_password);
        etConfirmPassword = view.findViewById(R.id.et_signin_confirm_password);
        btnSignUp = view.findViewById(R.id.btn_signin_submit);

        btnSignUp.setOnClickListener(v -> {
            String username = etUsername.getText().toString().trim();
            String email = etEmail.getText().toString().trim();
            String password = etPassword.getText().toString().trim();
            String confirmPassword = etConfirmPassword.getText().toString().trim();

            if (username.isEmpty() || email.isEmpty() || password.isEmpty() || confirmPassword.isEmpty()) {
                Toast.makeText(getActivity(), "Please fill in all fields", Toast.LENGTH_SHORT).show();
            } else if (!password.equals(confirmPassword)) {
                Toast.makeText(getActivity(), "Passwords do not match", Toast.LENGTH_SHORT).show();
            } else {
                // Handle sign-up logic here
                Toast.makeText(getActivity(), "Sign-up successful", Toast.LENGTH_SHORT).show();
            }
        });

        return view;
    }
}

