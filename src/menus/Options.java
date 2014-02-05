package menus;

import org.newdawn.slick.*;
import org.newdawn.slick.state.*;
import utils.ImageButton;

/**
 *
 * @author Al3xis
 */
public class Options extends BasicGameState {
    //Buttons
    ImageButton btn_back;
    
    /**
     *
     * @param state
     */
    public Options(int state) {
        
    }
    
    /**
     *
     * @param gc
     * @param sbg
     * @throws SlickException
     */
    public void init(GameContainer gc, StateBasedGame sbg) throws SlickException {
        btn_back = new ImageButton("back");
    }
    
    /**
     *
     * @param gc
     * @param sbg
     * @param g
     * @throws SlickException
     */
    public void render(GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException {
        //Draw Buttons
        btn_back.draw(50, 50);
    }
    
    /**
     *
     * @param gc
     * @param sbg
     * @param delta
     * @throws SlickException
     */
    public void update(GameContainer gc, StateBasedGame sbg, int delta) throws SlickException {
        //back Button
        btn_back.update(gc.getWidth(), gc.getHeight());
        if(btn_back.isClicked(gc.getWidth(), gc.getHeight())) {
            sbg.enterState(0);
        }
    }
    
    /**
     *
     * @return
     */
    public int getID() {
        return 4;
    }
}
