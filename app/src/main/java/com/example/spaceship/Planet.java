package com.example.spaceship;

import java.util.Random;

public class Planet {

    int x,y;
    int planetSpeed=15;
    Planet(int x, int y){

        this.x = x; this.y = y;

    }

    public void move(){
        y+=planetSpeed;
    }

}




