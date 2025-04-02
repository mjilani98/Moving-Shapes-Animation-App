package com.example.hw4q4;

public class Game
{
    //array of shapes
    private Shape[] shapesArray;
    //number of arrays
    int numOfShapes;

    //public constructor
    public Game()
    {
        //number of shapes
        numOfShapes = 20;

        //create array of 20 shapes
        for(int x =0 ;  x < numOfShapes ; x++)
        {
            shapesArray[x] = new Shape();
        }
    }

    //method moves the shapes
    public void move()
    {
        for(int x = 0 ;  x< numOfShapes ; x++)
        {
            shapesArray[x].move();
        }
    }

    //method return the array of shapes
    public Shape[] getShapes()
    {
        return shapesArray;
    }
}
