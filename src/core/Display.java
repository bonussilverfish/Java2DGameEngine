package core;

import java.awt.Canvas;
import java.awt.Dimension;

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
        setLocationRelativeTo(null);
        setVisible(true);
    }
}
