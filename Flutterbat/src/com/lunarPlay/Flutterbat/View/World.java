package com.lunarPlay.Flutterbat.View;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.math.Vector2;
import com.lunarPlay.Flutterbat.Flutterbat;
import com.lunarPlay.Flutterbat.Model.Player;

public class World {

	public Vector2 mapStretch = new Vector2(2f, 1f);
	
	protected Flutterbat game;
	protected Player player;
	
	public World(Flutterbat game) {
		this.game = game;
		player = new Player(this, new Vector2(Gdx.graphics.getWidth() / 2, Gdx.graphics.getHeight() / 2), 100f, 100f, 0f, 100f);
		Gdx.input.setInputProcessor(new InputHandler(this));
	}
	
	public Player getPlayer() {
		return player;
	}
	
	public void update() {
		player.update();
	}
	
	public void dispose() {
		
	}
}
