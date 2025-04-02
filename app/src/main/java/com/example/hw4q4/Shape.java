package com.example.hw4q4;

import android.graphics.Color;

import java.util.Random;

public class Shape
{
    //data for each shape
    public int type;
    public int centerX , centerY;
    public int size;
    public int speed;
    public int direction;
    public int color;

    //public Constructor
    public Shape()
    {
        Random random = new Random();
        //Initialize type of shape , (circle  =1, square =2)
        type = (int) (Math.random()*2)+1 ; // random number between 1 , 2

        //Initialize centerX and centerY (location on board)
        centerX = (int) (Math.random() * 2001) + 70; // random number between 0 , 2000
        centerY = (int) (Math.random() * 1001) + 50;// random number between 0 , 1000

        //Initialize size of the shape
        size = (int) (Math.random() * 51) + 50; // random number between 50 , 100

        //Initialize speed of the shape
        speed = (int)(Math.random()*11)+10; // random number between 10 , 20

        //Initialize the direction of shape
        direction = (int) (Math.random()*4)+1; // random number between 1 , 4

        //Initialize random color for the shape
        color = Color.rgb((int) (Math.random() * 256) , (int) (Math.random() * 256) , (int) (Math.random() * 256));
    }

    //method moves the shape based on the direction
    public void move()
    {
        if(direction == 1)
        {
            centerX = (centerX + speed)%2000;
        }
        else if (direction == 2)
        {
            centerX = (centerX - speed +2000)%2000;
        }
        else if (direction == 3)
        {
            centerY = (centerY + speed)%2000;
        }
        else if (direction == 4)
        {
            centerY = (centerY - speed+2000)%2000;
        }
    }

}
