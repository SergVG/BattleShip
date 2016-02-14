package com.mygdx.game;

/**
 * Created by gsv on 04.02.16.
 */
public class Ship {
    //private Point[] Sh; //Массив с координатами точек корабля
    private int StartX,StartY,direction,length;
    public Ship(int StartX,int StartY, int direction, int length) {
        this.StartX=StartX;
        this.StartY=StartY;
        this.direction=direction;
        this.length=length;
    }
    public boolean checkShoot(int x, int y){
        return true; //проверяем, попали ли в наш корабль
    }
    public boolean checkLive(){
        //проверяем, есть ли хотя бы одна живая клетка
        return false;
    }
}
