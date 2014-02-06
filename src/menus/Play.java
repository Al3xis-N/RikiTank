package menus;

import org.newdawn.slick.*;
import org.newdawn.slick.state.*;
import tanks.*;
import utils.ImageButton;

/**
 *
 * @author Al3xis
 */
public class Play extends BasicGameState {
    
    ImageButton btn_exit;
    
    private HeavyTank heavyTank;
    
    /**
     *
     * @param state
     */
    public Play(int state) {
        
    }
    
    /**
     *
     * @param gc
     * @param sbg
     * @throws SlickException
     */
    @Override
    public void init(GameContainer gc, StateBasedGame sbg) throws SlickException {
        btn_exit = new ImageButton("exit");
        heavyTank = new HeavyTank();
    }
    
    /**
     *
     * @param gc
     * @param sbg
     * @param g
     * @throws SlickException
     */
    @Override
    public void render(GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException {
        btn_exit.draw(50, 50);
        
        heavyTank.move(500, 200);
        heavyTank.getTurretTank().getImgTurretTank().setCenterOfRotation(45, 36);
        
        heavyTank.draw();
        
        
    }
    
    /**
     *
     * @param gc
     * @param sbg
     * @param delta
     * @throws SlickException
     */
    @Override
    public void update(GameContainer gc, StateBasedGame sbg, int delta) throws SlickException {
        //Quit
        btn_exit.update(gc.getWidth(), gc.getHeight());
        if(btn_exit.isClicked(gc.getWidth(), gc.getHeight())) {
            System.exit(0);
        }
        
        heavyTank.getTurretTank().update();
    }
    
    /**
     *
     * @return the ID of the state
     */
    @Override
    public int getID() {
        return 2;
    }
}
