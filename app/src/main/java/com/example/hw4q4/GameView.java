package com.example.hw4q4;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;

public class GameView extends View
{
    //create game
    private Game game;
    //create a paint brush
    private Paint paint;

    //public constructor
    public GameView(Context context , Game game)
    {
        super(context);

        //set game
        this.game = game;

        //create paint object with Fill style
        paint.setStyle(Paint.Style.FILL);
    }

    //method displays view of game
    public void onDraw(Canvas canvas)
    {
        //get array of shapes
        Shape[] shape = game.getShapes();

        //go through array of shapes
        for(int x = 0 ;  x<shape.length ; x++)
        {
            //set paint color
            paint.setColor(shape[x].color);

            //if the type is 1 ,draw circle using centerX, centerY, radius=size
            if(shape[x].type == 1)
                canvas.drawCircle(shape[x].centerX, shape[x].centerY , shape[x].size,paint);
            //if type is 2 draw square using centerx, centery, side=2*size
            else if (shape[x].type == 2)
                canvas.drawRect(shape[x].centerX , shape[x].centerY , shape[x].size*2 , shape[x].size*2 , paint);
        }


    }
}
