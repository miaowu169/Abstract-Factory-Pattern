package com.practice.Factory.Imple;

import com.practice.Factory.GameFactory;
import com.practice.LoginGame.AndriodOSLogin;
import com.practice.LoginGame.LoginGame;
import com.practice.PlayGame.AndriodOSPlay;
import com.practice.PlayGame.PlayGame;
/*
 * 创建具体工厂类
 */
public class AndriodGameFactory implements GameFactory {
	public LoginGame supportLoginGame() {
		return new AndriodOSLogin();
	}

	public PlayGame supportPlayGame() {
		return new AndriodOSPlay();
	}

}
