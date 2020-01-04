package com.practice.Factory;

import com.practice.LoginGame.LoginGame;
import com.practice.PlayGame.PlayGame;

public interface GameFactory {
	public LoginGame supportLoginGame();
	public PlayGame supportPlayGame();
}
