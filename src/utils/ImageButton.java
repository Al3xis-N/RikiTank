package utils;

import org.newdawn.slick.SlickException;

/**
 *
 * @author Al3xis
 */
public class ImageButton {
    
    private boolean activated = false;
    private final ImageRikiTank btn_off, btn_on;

    /**
     *
     * @param off
     * @param on
     * @throws SlickException
     */
    public ImageButton(String off, String on) throws SlickException {
        btn_off = new ImageRikiTank(off);
        btn_on = new ImageRikiTank(on);
        btn_on.hide();
    }
    
    /**
     *
     * @param button
     * @throws SlickException
     */
    public ImageButton(String button) throws SlickException {
        btn_off = new ImageRikiTank("resources/images/menus/btn_" + button + "_off.png");
        btn_on = new ImageRikiTank("resources/images/menus/btn_" + button + "_on.png");
        btn_on.hide();
    }
    
    /**
     *
     */
    public void draw() {
        btn_off.draw();
        btn_on.draw();
    }
    
    /**
     *
     * @param x
     * @param y
     */
    public void draw(int x, int y) {
        btn_off.draw(x, y);
        btn_on.draw(x, y);
    }
    
    /**
     *
     * @param windowWidth
     * @param windowHeight
     * @return
     */
    public boolean isMouseOver(int windowWidth, int windowHeight) {
        if(activated == false) {
            return btn_off.isMouseOver(windowWidth, windowHeight);
        } else {
            return btn_on.isMouseOver(windowWidth, windowHeight);
        }
    }
    
    public boolean isClicked(int windowWidth, int windowHeight) {
        if(activated == false) {
            return btn_off.isClicked(windowWidth, windowHeight);
        } else {
            return btn_on.isClicked(windowWidth, windowHeight);
        }
    }
    
    /**
     *
     */
    public void switchState() {
        if(activated == false) {
            activate();
        } else {
            deactivate();
        }
    }
    
    /**
     *
     */
    public void activate() {
        activated = true;
        btn_off.hide();
        btn_on.unhide();
    }
    
    /**
     *
     */
    public void deactivate() {
        activated = false;
        btn_off.unhide();
        btn_on.hide();
    }
    
    /**
     *
     * @param windowWidth
     * @param windowHeight
     */
    public void update(int windowWidth, int windowHeight) {
        if(this.isMouseOver(windowWidth, windowHeight)) {
            this.activate();
        } else {
            this.deactivate();
        }
    }
}
