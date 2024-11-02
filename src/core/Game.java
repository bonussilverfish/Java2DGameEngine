package core;

import java.awt.Rectangle;

/**
 * ゲームを定義するクラス
 */
public class Game {
    private Display display;
    private Rectangle rectangle;

    public Game(int width, int height) {
        this.display = new Display(width, height);
        this.rectangle = new Rectangle(0, 0, 50, 50);
    }

    /**
     * 更新処理
     */
    public void update() {
        rectangle.setLocation(rectangle.x + 1, rectangle.y);
    }

    /**
     * 描画処理
     */
    public void render() {
        display.render(this);
    }

    public Rectangle getRectangle() {
        return rectangle;
    }
}
