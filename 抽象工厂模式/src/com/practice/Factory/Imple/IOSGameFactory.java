package com.practice.Factory.Imple;

import com.practice.Factory.GameFactory;
import com.practice.LoginGame.IOSLogin;
import com.practice.LoginGame.LoginGame;
import com.practice.PlayGame.IOSPlay;
import com.practice.PlayGame.PlayGame;

public class IOSGameFactory implements GameFactory {
	public LoginGame supportLoginGame() {
		return new IOSLogin();
	}

	public PlayGame supportPlayGame() {
		return new IOSPlay();
	}
}
