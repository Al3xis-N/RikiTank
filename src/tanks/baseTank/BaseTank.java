/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tanks.baseTank;

import org.newdawn.slick.SlickException;
import utils.ImageRikiTank;

/**
 *
 * @author Alexis
 */
public class BaseTank {
    
    private String name;
    private ImageRikiTank imgBaseTank;
    private float angle;
    
    private double speedBase;
    private double speed;
    
    private int healthBase;
    private int health;
    //ajouter passif
    
    public BaseTank() throws SlickException {
        
        name = "null";
        imgBaseTank = new ImageRikiTank();
        angle = 0;
        healthBase = 0;
        health = 0;
        speedBase = 0;
        speed = 0;
    }
    
    public BaseTank(String name, String imgBaseTank, int healthBase, double speedBase) throws SlickException {
        
        this.name = name;
        this.imgBaseTank = new ImageRikiTank(imgBaseTank);
        this.angle = 0;
        this.healthBase = healthBase;
        this.health = healthBase;
        this.speedBase = speedBase;
        this.speed = speedBase;
    }

    /**
     * @return the imgBaseTank
     */
    public ImageRikiTank getImgBaseTank() {
        return imgBaseTank;
    }

    /**
     * @param imgBaseTank the imgBaseTank to set
     */
    public void setImgBaseTank(ImageRikiTank imgBaseTank) {
        this.imgBaseTank = imgBaseTank;
    }

    /**
     * @return the angle
     */
    public double getAngle() {
        return angle;
    }

    /**
     * @param angle the angle to set
     */
    public void setAngle(float angle) {
        this.angle = angle;
    }

    /**
     * @return the speedBase
     */
    public double getSpeedBase() {
        return speedBase;
    }

    /**
     * @param speedBase the speedBase to set
     */
    public void setSpeedBase(double speedBase) {
        this.speedBase = speedBase;
    }

    /**
     * @return the speed
     */
    public double getSpeed() {
        return speed;
    }

    /**
     * @param speed the speed to set
     */
    public void setSpeed(double speed) {
        this.speed = speed;
    }

    /**
     * @return the healthBase
     */
    public int getHealthBase() {
        return healthBase;
    }

    /**
     * @param healthBase the healthBase to set
     */
    public void setHealthBase(int healthBase) {
        this.healthBase = healthBase;
    }

    /**
     * @return the health
     */
    public int getHealth() {
        return health;
    }

    /**
     * @param health the health to set
     */
    public void setHealth(int health) {
        this.health = health;
    }
    
}
