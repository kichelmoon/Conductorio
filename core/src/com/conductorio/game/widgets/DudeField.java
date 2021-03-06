package com.conductorio.game.widgets;

import com.badlogic.gdx.graphics.Texture;
import com.conductorio.game.logic.Character;

public class DudeField extends Widget {
    private Character character;

    public DudeField(int x, int y, Character character) {
        super(x, y);
        this.character = character;
    }

    public Texture getFace() {
        return character.getFace();
    }

    public void setCharacter(Character character) {
        this.character = character;
    }
}
