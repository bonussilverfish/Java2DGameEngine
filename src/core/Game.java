package core;

import java.util.ArrayList;
import java.util.List;

/**
 * ゲームを定義するクラス
 */
public class Game {
    private Display display;
    private List<GameObject> gameObjects;

    public Game(int width, int height) {
        this.display = new Display(width, height);
        this.gameObjects = new ArrayList<>();
        gameObjects.add(new Square());
    }

    /**
     * 更新処理
     */
    public void update() {
        gameObjects.stream().forEach(gameObject -> gameObject.update());
    }

    /**
     * 描画処理
     */
    public void render() {
        display.render(this);
    }

    /**
     * ゲームオブエジェクト達を返却します
     */
    public List<GameObject> getGameObjects() {
        return gameObjects;
    }
}
