package utils;

import org.newdawn.slick.*;
import org.newdawn.slick.state.*;

/**
 *
 * @author Al3xis
 */
public abstract class Resolution extends StateBasedGame {

    private float diagonal;
    private float reference;

    /**
     *
     * @param name
     */
    public Resolution(String name) {
        super(name);
    }

    /**
     *
     * @param gc
     * @return
     */
    public float Resolution(GameContainer gc) {

        int width = gc.getScreenWidth();
        int height = gc.getScreenHeight();
        float scale;

        diagonal = (float) Math.sqrt(width * width + height * height);
        reference = (float) Math.sqrt(1366 * 1366 + 768 * 768);
        scale = (float) ((diagonal * 0.77) / reference);

        return scale;
        
    }
}
