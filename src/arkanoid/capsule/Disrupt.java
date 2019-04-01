package arkanoid.capsule;

import arkanoid.board.Paddle;
import javafx.util.Pair;

import java.awt.Graphics;
import java.awt.*;


public class Disrupt extends Capsule {

    public Disrupt(int x, int y, int life , Image image) {
        super(x, y, life , image);
    }

    @Override
    public void effect(Paddle p) {

        p.splitBall();
    }
}
