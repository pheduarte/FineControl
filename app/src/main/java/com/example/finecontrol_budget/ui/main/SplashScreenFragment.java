package com.example.finecontrol_budget.ui.main;

import androidx.lifecycle.ViewModelProvider;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.finecontrol_budget.Login;
import com.example.finecontrol_budget.R;
import com.example.finecontrol_budget.SplashScreen;

public class SplashScreenFragment extends Fragment {

    private splashView mViewModel;

    public static SplashScreenFragment newInstance() {
        return new SplashScreenFragment();
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(splashView.class);
        // TODO: Use the ViewModel
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_splash, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        Button buttonGo = view.findViewById(R.id.startButton);
        buttonGo.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                // Create an Intent to start SecondActivity
                Intent intent = new Intent(getActivity(), Login.class);
                startActivity(intent); // start the new screen
                getActivity().finish();
            }
        });
    }
}