package menus;

import org.newdawn.slick.*;
import org.newdawn.slick.state.*;

/**
 *
 * @author Al3xis
 */
public class Pause extends BasicGameState {
    
    /**
     *
     * @param state
     */
    public Pause(int state) {
        
    }
    
    /**
     *
     * @param gc
     * @param sbg
     * @throws SlickException
     */
    public void init(GameContainer gc, StateBasedGame sbg) throws SlickException {
        
    }
    
    /**
     *
     * @param gc
     * @param sbg
     * @param g
     * @throws SlickException
     */
    public void render(GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException {
        g.drawString("Pause", 50, 50);
    }
    
    /**
     *
     * @param gc
     * @param sbg
     * @param delta
     * @throws SlickException
     */
    public void update(GameContainer gc, StateBasedGame sbg, int delta) throws SlickException {
        
    }
    
    /**
     *
     * @return
     */
    public int getID() {
        return 3;
    }
}
