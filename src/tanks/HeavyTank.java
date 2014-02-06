/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tanks;

import org.newdawn.slick.SlickException;
import tanks.baseTank.BaseTank;
import tanks.turretTank.HeavyTurret;
import tanks.turretTank.TurretTank;

/**
 *
 * @author Alexis
 */
public class HeavyTank extends Tank {
    
    /**
     *
     * @throws SlickException
     */
    public HeavyTank() throws SlickException {
        this.setId(3);
        this.setName("HeavyTank");
        this.setPosX(0);
        this.setPosY(0);
        this.setLevel(1);
        this.setExp(0);
        this.setEnergyBase(0);
        this.setEnergy(0);
        
        this.setTurretTank(new TurretTank("HeavyTurret", "resources/images/tanks/TourelleTank2.png", 250, 1.02));
        this.setBaseTank(new BaseTank("HeavyBase", "resources/images/tanks/BaseTank2.png", 300, 0.5));
    }
    
    
}
