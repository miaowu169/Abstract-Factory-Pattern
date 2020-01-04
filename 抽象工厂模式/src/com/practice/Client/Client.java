package com.practice.Client;

import com.practice.Factory.GameFactory;
import com.practice.LoginGame.LoginGame;
import com.practice.PlayGame.PlayGame;

public class Client {
	public static void main(String [] args) {
		GameFactory factory;
		LoginGame lg;
		PlayGame pg;
		factory = (GameFactory) XMLUtilGame.getGameFactory();
		lg = factory.supportLoginGame();
		lg.Login();
		pg = factory.supportPlayGame();
		pg.Play();
	}
}
