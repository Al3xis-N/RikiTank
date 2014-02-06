/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tanks.turretTank;

import org.lwjgl.input.Mouse;
import org.newdawn.slick.SlickException;
import utils.ImageRikiTank;

/**
 *
 * @author Alexis
 */
public class TurretTank {
    
    private String name;
    private ImageRikiTank imgTurretTank;
    
    private float angle;
    private int centerX;
    private int centerY;
    
    private int damageBase;
    private int damage;
    
    private double cadenceBase;
    private double cadence;
    
    /**
     *
     * @throws SlickException
     */
    public TurretTank() throws SlickException {
        name = "null";
        imgTurretTank = new ImageRikiTank();
        angle = 0;
        centerX = 0;
        centerY = 0;
        damageBase = 0;
        damage = 0;
        cadenceBase = 0;
        cadence = 0;
    }
    
    public TurretTank(String name, String imgTurretTank, int damageBase, double cadenceBase) throws SlickException {
        this.name = name;
        this.imgTurretTank =  new ImageRikiTank(imgTurretTank);
        this.angle = 0;
        this.centerX = 45;
        this.centerY = 36;
        this.damageBase = damageBase;
        this.damage = damageBase;
        this.cadenceBase = cadenceBase;
        this.cadence = cadenceBase;
    }

    /**
     * @return the imgTurretTank
     */
    public ImageRikiTank getImgTurretTank() {
        return imgTurretTank;
    }

    /**
     * @param imgTurretTank the imgTurretTank to set
     */
    public void setImgTurretTank(ImageRikiTank imgTurretTank) {
        this.imgTurretTank = imgTurretTank;
    }

    /**
     * @return the damageBase
     */
    public int getDamageBase() {
        return damageBase;
    }

    /**
     * @param damageBase the damageBase to set
     */
    public void setDamageBase(int damageBase) {
        this.damageBase = damageBase;
    }

    /**
     * @return the damage
     */
    public int getDamage() {
        return damage;
    }

    /**
     * @param damage the damage to set
     */
    public void setDamage(int damage) {
        this.damage = damage;
    }

    /**
     * @return the cadenceBase
     */
    public double getCadenceBase() {
        return cadenceBase;
    }

    /**
     * @param cadenceBase the cadenceBase to set
     */
    public void setCadenceBase(double cadenceBase) {
        this.cadenceBase = cadenceBase;
    }

    /**
     * @return the cadence
     */
    public double getCadence() {
        return cadence;
    }

    /**
     * @param cadence the cadence to set
     */
    public void setCadence(double cadence) {
        this.cadence = cadence;
    }
    
    /**
     *
     * @param angle
     */
    public void rotate(float angle) {
        this.getImgTurretTank().setRotation(angle);
        this.angle = angle;
    }
    
    public void update() {
        
        float new_angle = 0;
        int mouseX = Mouse.getX();
        int mouseY = Mouse.getY();
        
        new_angle = (float) Math.atan2(mouseX - centerX, mouseY - centerY);
        new_angle = (float) Math.toDegrees(new_angle);
        
        rotate(new_angle);
    }
}
