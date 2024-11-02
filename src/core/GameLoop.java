package core;

/**
 * ゲームループを定義するクラス
 */
public class GameLoop implements Runnable {
    private boolean running;
    private final double updateRate = 1.0D / 60.0D;
    private long nextStatTime;
    private int fps;
    private int ups;

    @Override
    public void run() {
        running = true;
        double accumulator = 0;
        long currentTime = System.currentTimeMillis();
        long lastUpdate = System.currentTimeMillis();
        nextStatTime = System.currentTimeMillis() + 1000;
        while (running) {
            currentTime = System.currentTimeMillis();
            double lastRenderTimeInSeconds = (currentTime - lastUpdate) / 1000D;
            accumulator += lastRenderTimeInSeconds;
            lastUpdate = currentTime;
            while (accumulator > updateRate) {
                update();
                accumulator -= updateRate;
            }
            render();
            printStats();
        }
    }

    private void printStats() {
        if (System.currentTimeMillis() > nextStatTime) {
            System.out.println(String.format("FPS: %d, UPS: %d", fps, ups));
            fps = ups = 0;
            nextStatTime = System.currentTimeMillis() + 1000;
        }
    }

    private void render() {
        fps++;
    }

    private void update() {
        ups++;
    }
}
