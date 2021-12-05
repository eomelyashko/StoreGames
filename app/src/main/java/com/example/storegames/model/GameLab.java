package com.example.storegames.model;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class GameLab {

    private static GameLab sGameLab;
    private List<Game> mGames;

    public static GameLab get(Context context) {
        if (sGameLab == null) {
            sGameLab = new GameLab(context);
        }
        return sGameLab;
    }

    private GameLab(Context context) {
        mGames = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            Game game = new Game();
            game.setTitle("Game #" + i);
            game.setBuyed(i % 2 == 0); // Для каждого второго объекта
            mGames.add(game);
        }
    }

    public List<Game> getGames() {
        return mGames;
    }

    public Game getGame(UUID id) {
        for (Game game : mGames) {
            if (game.getId().equals(id)) {
                return game;
            }
        }
        return null;
    }
}
