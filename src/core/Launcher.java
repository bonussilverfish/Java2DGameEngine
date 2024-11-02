package core;

/**
 * エントリーポイントを定義するクラス
 */
public class Launcher {
    public static void main(String[] args) {
        new Thread(new GameLoop()).start();
    }
}
