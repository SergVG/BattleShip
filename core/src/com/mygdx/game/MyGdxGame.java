package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class MyGdxGame extends ApplicationAdapter {
	SpriteBatch batch;

	int MouseX,MouseY; //Y-Пересчитана: 0 - это внизу окна.

	private GameField MyField,EnemyField;
	@Override
	public void create () {
		batch = new SpriteBatch();

		MyField =    new HumanField(batch,50,50);
		EnemyField = new AIField(batch,50+30*10+50,50);


	}

	@Override
	public void render () {
		update();
		Gdx.gl.glClearColor(0, 0.5f, 0.5f, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
		//batch.draw(Square, 0, 0);

		/*if (MouseY>=StartFieldsY&&MouseY<StartFieldsY+300) {
			if (MouseX >= StartMyFieldX && MouseX <= StartMyFieldX + 300)
				batch.draw(Square, StartMyFieldX + getMyX(MouseX) * 30, StartFieldsY + getY(MouseY) * 30, 120, 0, 30, 30);
			if (MouseX >= StartEnemyFieldX && MouseX <= StartEnemyFieldX + 300)
				batch.draw(Square, StartEnemyFieldX + getEnemyX(MouseX) * 30, StartFieldsY + getY(MouseY) * 30, 120, 0, 30, 30);
		}*/
			MyField.Out();
			EnemyField.Out();
		batch.end();
	}
	public void update(){
		MouseX=Gdx.input.getX();
		MouseY=Gdx.graphics.getHeight()-Gdx.input.getY();
	}


}
