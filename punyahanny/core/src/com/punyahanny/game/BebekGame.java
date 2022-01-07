package com.punyahanny.game;

import com.badlogic.gdx.Game;

public class BebekGame extends Game {
    @Override
    public void create(){
        setScreen(new BebekMenu(this));
    }
}
