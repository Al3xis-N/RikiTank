package utils;

import org.lwjgl.input.Mouse;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

/**
 *
 * @author Al3xis
 */
public class ImageRikiTank extends Image {
    
    private int x = 0;
    private int y = 0;
    private boolean stateClick = false;
    private boolean isHidden = false;
    
    /**
     *
     * @throws SlickException
     */
    public ImageRikiTank() throws SlickException {
        super("resources/images/null.png");
    }
    
    /**
     *
     * @param name
     * @throws SlickException
     */
    public ImageRikiTank(String name) throws SlickException {
        super(name);
    }
    
    /**
     *
     * @return
     */
    public int getX() {
        return this.x;
    }
    
    /**
     *
     * @return
     */
    public int getY() {
        return this.y;
    }
    
    /**
     *
     * @param x
     */
    public void setX(int x) {
        this.x = x;
    }
    
    /**
     *
     * @param y
     */
    public void setY(int y) {
        this.y = y;
    }
    
    /**
     *
     * @param x
     * @param y
     */
    public void move(int x, int y) {
        this.setX(x);
        this.setY(y);
    }
    
    /**
     *
     */
    public void hide() {
        this.isHidden = true;
    }
    
    /**
     *
     */
    public void unhide() {
        this.isHidden = false;
    }
    
    /**
     *
     * @param windowWidth
     * @param windowHeight
     * @return
     */
    public boolean isMouseOver(int windowWidth, int windowHeight) {
        int userX = Mouse.getX();
        int userY = windowHeight - Mouse.getY();
        
        if(userX > x && userX < x + this.getWidth()) {
           if(userY > y && userY < y + this.getHeight()) {
               return true;
           }
        }
        return false;
    }
    
    /**
     *
     * @param windowWidth
     * @param windowHeight
     * @return
     */
    public boolean isClicked(int windowWidth, int windowHeight) {
        if(Mouse.isButtonDown(0)) {
            if(this.isMouseOver(windowWidth, windowHeight) && stateClick == false) {
                stateClick = true;
                return true;
            }
        } else {
            stateClick = false;
        }
        return false;
    }
   
    /**
     *
     */
    @Override
    public void draw() {
        if(isHidden == false) {
            super.draw(x, y);
        }
    }
    
    /**
     *
     * @param x
     * @param y
     */
    public void draw(int x, int y) {
        if(isHidden == false) {
            super.draw(x, y);
            this.x = x;
            this.y = y;
        }
    }
}
