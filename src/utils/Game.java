package utils;

import menus.*;
import org.newdawn.slick.*;
import org.newdawn.slick.state.*;

/**
 *
 * @author Al3xis
 */
public class Game extends StateBasedGame {

    public static final String gameName = "RikiTank";
    public static final int mainMenu = 0;
    public static final int choice = 1;
    public static final int play = 2;
    public static final int pause = 3;
    public static final int options = 4;
    public static final int credits = 5;
    
    /**
     *
     * @param gameName
     */
    public Game(String gameName) {
        super(gameName);
        this.addState(new Menu(mainMenu));
        this.addState(new Choice(choice));
        this.addState(new Play(play));
        this.addState(new Pause(pause));
        this.addState(new Options(options));
        this.addState(new Credits(credits));
    }
    
    /**
     *
     * @param gc
     * @throws SlickException
     */
    public void initStatesList(GameContainer gc) throws SlickException {
        this.getState(mainMenu).init(gc, this);
        this.getState(choice).init(gc, this);
        this.getState(play).init(gc, this);
        this.getState(pause).init(gc, this);
        this.getState(options).init(gc, this);
        this.getState(credits).init(gc, this);
        this.enterState(mainMenu);
    }
    
    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        
        AppGameContainer window;
        
        try {
            window = new AppGameContainer(new Game(gameName));
            window.setShowFPS(false);
            window.setDisplayMode(window.getScreenWidth(), window.getScreenHeight(), true);
            window.start();
        } catch(SlickException e) {
            e.printStackTrace();
        }
    }
    
}
