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

public class TrigonometryFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_trigonometry, container, false);

        Button btnToPowers = view.findViewById(R.id.btn_to_powers);
        btnToPowers.setOnClickListener(v -> {
            Navigation.findNavController(view).navigate(R.id.PowersFragment);
        });

        return view;
    }
}