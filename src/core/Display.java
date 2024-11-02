package core;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;

import javax.swing.JFrame;

/**
 * 画面を定義するクラス
 */
public class Display extends JFrame {
    private Canvas canvas;

    public Display(int width, int height) {
        super("My Awesome 2D Game");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        canvas = new Canvas();
        canvas.setPreferredSize(new Dimension(width, height));
        canvas.setFocusable(false);
        add(canvas);
        pack();
        canvas.createBufferStrategy(3);
        setLocationRelativeTo(null);
        setVisible(true);
        canvas.setBackground(Color.BLACK);
    }

    /**
     * 描画処理
     */
    public void render(Game game) {
        BufferStrategy bufferStrategy = canvas.getBufferStrategy();
        Graphics graphics = bufferStrategy.getDrawGraphics();
        graphics.clearRect(0, 0, canvas.getWidth(), canvas.getHeight());
        game.getGameObjects().stream().forEach(gameObject -> graphics.drawImage(
                gameObject.getSprite(),
                gameObject.getPosition().getX(),
                gameObject.getPosition().getY(),
                null));
        graphics.dispose();
        bufferStrategy.show();
    }
}
