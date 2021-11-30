package com.example.storegames.controller;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.storegames.R;
import com.example.storegames.model.Game;

public class GameFragment extends Fragment {
    private Game mGame;
    private CheckBox mBuyedCheckBox;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mGame = new Game();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_game, container, false);
        mBuyedCheckBox = (CheckBox) v.findViewById(R.id.game_buyed);
        mBuyedCheckBox.setOnCheckedChangeListener((buttonView, isChecked) -> mGame.setBuyed(isChecked));
        return v;
    }
}
