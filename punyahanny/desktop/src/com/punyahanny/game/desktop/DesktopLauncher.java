package com.punyahanny.game.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.punyahanny.game.BebekGame;

public class DesktopLauncher {
	public static void main (String[] arg) {
		BebekGame myProgram = new BebekGame();
		LwjglApplication launcher = new LwjglApplication(
				myProgram );
	}
}
