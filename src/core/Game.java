package core;

/**
 * ゲームを定義するクラス
 */
public class Game {
    private Display display;

    public Game(int width, int height) {
        this.display = new Display(width, height);
    }

    /**
     * 更新処理
     */
    public void update() {
    }

    /**
     * 描画処理
     */
    public void render() {
        display.render(this);
    }
}
