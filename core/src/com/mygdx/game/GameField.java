package com.mygdx.game;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

/**
 * Created by gsv on 04.02.16.
 */
//пока это заготовка, ещё до конца не определился, будет это абстрактный класс, либо нет.
public abstract class GameField {
    protected Ship[] Ships; //Объявляем 10 кораблей
    protected int StartX,StartY;
    protected static SpriteBatch batch;

    static Texture Square = new Texture("Squares.png");
    public GameField(SpriteBatch batch, int StartX, int StartY) {
        this.StartX=StartX;
        this.StartY=StartY;
        this.batch=batch;
    }

    public void Out(){
        //Рендерим поле с кораблями, с учётом подбитых, неподбитых и промазанных клеток
        //а также учтём чьё поле рисуем (своё или противника).

        for (int i=0;i<10;i++)
            for(int j=0;j<10;j++){
                batch.draw(Square, StartX+j*30,   StartY+i*30,0,0,30,30);
            }

    }

    public boolean checkShoot(int x, int y){  //Выстрел. Результат: попал или нет
        for (int i=0;i<10;i++){
            if (Ships[i].checkShoot(x,y))
                return true;
        }
        return false;
    }
    public boolean checkGameOver(){
        //Все ли корабли полностью подбиты
        return false;
    }
    public int getX(int _MouseX){
        return (_MouseX-StartX)/30;
    }
    public int getY(int _MouseY){
        return (_MouseY-StartY)/30;
    }
}
