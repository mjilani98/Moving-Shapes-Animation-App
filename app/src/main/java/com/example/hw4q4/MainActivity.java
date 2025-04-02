package com.example.hw4q4;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Timer;

public class MainActivity extends AppCompatActivity
{
    private Game game ;
    private GameView gameView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //create game
        game = new Game();

        //create game view
        gameView = new GameView(this, game);

        //set content view
        setContentView(gameView);

        //create timer
        Timer timer = new Timer();

        //create gameTimerTask
        GameTimerTask task = new GameTimerTask(game,gameView);

        //schedule task every 20ms with 0ms delay
        timer.schedule(task, 0, 20);



    }
}