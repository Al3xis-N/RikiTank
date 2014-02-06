package menus;

import org.newdawn.slick.*;
import org.newdawn.slick.state.*;
import utils.ImageButton;

/**
 *
 * @author Alexis
 */
public class Menu extends BasicGameState {
    //Colors
    Color background = new Color(62, 73, 78);
    Color frame = new Color(38, 47, 54);
    //Buttons
    ImageButton btn_newGame;
    ImageButton btn_options;
    ImageButton btn_credits;
    ImageButton btn_exitGame;
    
    /**
     *
     * @param state
     */
    public Menu(int state) {
        
    }
    
    /**
     *
     * @param gc
     * @param sbg
     * @throws SlickException
     */
    @Override
    public void init(GameContainer gc, StateBasedGame sbg) throws SlickException {
        btn_newGame = new ImageButton("newGame");
        btn_options = new ImageButton("options");
        btn_credits = new ImageButton("credits");
        btn_exitGame = new ImageButton("quit");
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
        //X Positions
        int posX_btn = 170;
        //Y Positions
        int posY_btn_newGame = (gc.getScreenHeight() / 2) - 185;
        int posY_btn_options = (gc.getScreenHeight() / 2) - 110;
        int posY_btn_credits = (gc.getScreenHeight() / 2) - 35;
        int posY_btn_exitGame = (gc.getScreenHeight() / 2) + 40;
        //Draw Background
        g.setBackground(background);
        g.setColor(frame);
        g.fillRoundRect(150, (gc.getScreenHeight() / 2) - 225, 470, 450, 10);   
        //Draw Buttons
        btn_newGame.draw(posX_btn, posY_btn_newGame);
        btn_options.draw(posX_btn, posY_btn_options);
        btn_credits.draw(posX_btn, posY_btn_credits);
        btn_exitGame.draw(posX_btn, posY_btn_exitGame);
        
    }
    
    /**
     * 
     * @param gc 
     * @param sbg 
     * @param delta 
     * @throws SlickException 
     *
     */
    @Override
    public void update(GameContainer gc, StateBasedGame sbg, int delta) throws SlickException {
        //newGame Button
        btn_newGame.update(gc.getWidth(), gc.getHeight());
        if(btn_newGame.isClicked(gc.getWidth(), gc.getHeight())) {
            sbg.enterState(2);
        }
        //Options Button
        btn_options.update(gc.getWidth(), gc.getHeight());
        if(btn_options.isClicked(gc.getWidth(), gc.getHeight())) {
            sbg.enterState(4);
        }
        //Credits Button
        btn_credits.update(gc.getWidth(), gc.getHeight());
        if(btn_credits.isClicked(gc.getWidth(), gc.getHeight())) {
            sbg.enterState(5);
        }
        //ExitGame
        btn_exitGame.update(gc.getWidth(), gc.getHeight());
        if(btn_exitGame.isClicked(gc.getWidth(), gc.getHeight())) {
            System.exit(0);
        }
    }
    
    /**
     *
     * @return
     */
    @Override
    public int getID() {
        return 0;
    }
}
