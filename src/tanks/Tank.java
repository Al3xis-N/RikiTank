package tanks;

import abilities.Ability;
import org.newdawn.slick.SlickException;
import tanks.baseTank.BaseTank;
import tanks.turretTank.TurretTank;

/**
 *
 * @author Alexis
 */
public class Tank {

    private int id;
    private String name;
    
    private int posX;
    private int posY;
    
    private BaseTank baseTank;
    private TurretTank turretTank;
    
    private int level;
    private int exp;
    
    private int energyBase;
    private int energy;
    
    private Ability ability;
    
    /**
     *
     * @throws SlickException
     */
    public Tank() throws SlickException {
        id = 0;
        name = "null";
        posX = 0;
        posY = 0;
        level = 0;
        exp = 0;
        energyBase = 0;
        energy = 0;
        
        baseTank = new BaseTank();
        turretTank = new TurretTank();
    }

    /**
     *
     * @param x
     * @param y
     */
    public void move(int x, int y) {
        
        this.setPosX(x);
        this.setPosY(y);
        
        this.getBaseTank().getImgBaseTank().move(x, y);
        this.getTurretTank().getImgTurretTank().move(x, y);
    }
    
    /**
     *
     */
    public void draw() {
        this.getBaseTank().getImgBaseTank().draw();
        this.getTurretTank().getImgTurretTank().draw();
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the posX
     */
    public int getPosX() {
        return posX;
    }

    /**
     * @param posX the posX to set
     */
    public void setPosX(int posX) {
        this.posX = posX;
    }

    /**
     * @return the posY
     */
    public int getPosY() {
        return posY;
    }

    /**
     * @param posY the posY to set
     */
    public void setPosY(int posY) {
        this.posY = posY;
    }

    /**
     * @return the baseTank
     */
    public BaseTank getBaseTank() {
        return baseTank;
    }

    /**
     * @param baseTank the baseTank to set
     */
    public void setBaseTank(BaseTank baseTank) {
        this.baseTank = baseTank;
    }

    /**
     * @return the turretTank
     */
    public TurretTank getTurretTank() {
        return turretTank;
    }

    /**
     * @param turretTank the turretTank to set
     */
    public void setTurretTank(TurretTank turretTank) {
        this.turretTank = turretTank;
    }

    /**
     * @return the level
     */
    public int getLevel() {
        return level;
    }

    /**
     * @param level the level to set
     */
    public void setLevel(int level) {
        this.level = level;
    }

    /**
     * @return the exp
     */
    public int getExp() {
        return exp;
    }

    /**
     * @param exp the exp to set
     */
    public void setExp(int exp) {
        this.exp = exp;
    }

    /**
     * @return the energyBase
     */
    public int getEnergyBase() {
        return energyBase;
    }

    /**
     * @param energyBase the energyBase to set
     */
    public void setEnergyBase(int energyBase) {
        this.energyBase = energyBase;
    }

    /**
     * @return the energy
     */
    public int getEnergy() {
        return energy;
    }

    /**
     * @param energy the energy to set
     */
    public void setEnergy(int energy) {
        this.energy = energy;
    }

    /**
     * @return the ability
     */
    public Ability getAbility() {
        return ability;
    }

    /**
     * @param ability the ability to set
     */
    public void setAbility(Ability ability) {
        this.ability = ability;
    }
}
