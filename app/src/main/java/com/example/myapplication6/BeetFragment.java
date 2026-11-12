package com.example.myapplication6;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

public class BeetFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_beet, container, false);

        Button btnToTomato = view.findViewById(R.id.btn_to_tomato);
        Button btnToCucumber = view.findViewById(R.id.btn_to_cucumber);

        btnToTomato.setOnClickListener(v ->
                Navigation.findNavController(v).navigate(R.id.action_beet_to_tomato)
        );
        btnToCucumber.setOnClickListener(v ->
                Navigation.findNavController(v).navigate(R.id.action_beet_to_cucumber)
        );

        return view;
    }
}