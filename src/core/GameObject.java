package core;

import java.awt.Image;

/**
 * ゲームに登場するすべてのオブジェクトを表現するためのクラスです
 */
public abstract class GameObject {
    protected Position position;
    protected Size size;

    public GameObject() {
        this.position = new Position(50, 50);
        this.size = new Size(50, 50);
    }

    /**
     * 更新処理
     */
    public abstract void update();

    /**
     * ゲームオブジェクトのスプライトを返却します
     * @return {@link Image}クラス
     */
    public abstract Image getSprite();

    /**
     * ポジションを返却します
     */
    public Position getPosition() {
        return position;
    }

    /**
     * 大きさを返却します
     */
    public Size getSize() {
        return size;
    }
}
