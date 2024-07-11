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

public class AdminLoginFragment extends Fragment {

    private EditText etAdminUsername, etAdminPassword;
    private Button btnAdminLogin;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_admin_login, container, false);

        etAdminUsername = view.findViewById(R.id.et_admin_username);
        etAdminPassword = view.findViewById(R.id.et_admin_password);
        btnAdminLogin = view.findViewById(R.id.btn_admin_login_submit);

        btnAdminLogin.setOnClickListener(v -> {
            String username = etAdminUsername.getText().toString().trim();
            String password = etAdminPassword.getText().toString().trim();

            if (username.isEmpty() || password.isEmpty()) {
                Toast.makeText(getActivity(), "Please enter both username and password", Toast.LENGTH_SHORT).show();
            } else {
                // Handle admin login logic here
                Toast.makeText(getActivity(), "Admin login successful", Toast.LENGTH_SHORT).show();
            }
        });

        return view;
    }
}

