package com.example.myapplication6;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class TomatoFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_tomato, container, false);

        Button btnToBeet = view.findViewById(R.id.btn_to_beet);
        Button btnToCucumber = view.findViewById(R.id.btn_to_cucumber);

        // Переход к Свекле
        // Вместо navigate(R.id.beetFragment) используйте ID действия:
        btnToBeet.setOnClickListener(v ->
                Navigation.findNavController(v).navigate(R.id.action_tomato_to_beet)
        );

        btnToCucumber.setOnClickListener(v ->
                Navigation.findNavController(v).navigate(R.id.action_tomato_to_cucumber)
        );

        return view;
    }
}