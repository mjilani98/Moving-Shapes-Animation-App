package com.example.hw4q4;

import android.app.GameManager;

import java.util.TimerTask;

public class GameTimerTask extends TimerTask
{
    //make Game and GameView
    private Game game ;
    private GameView gameView;

    //public constructor
    public GameTimerTask(Game game , GameView gameView)
    {
        //set game and gameView
        this.game = game;
        this.gameView = gameView;
    }


    //method runs the view
    public void run()
    {
        //move all 20 shapes
        for(int x =0 ; x<game.getShapes().length ; x++)
        {
            game.move();
        }

        gameView.postInvalidate();
    }

}
