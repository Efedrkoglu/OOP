package gameproject;

/**
 *
 * @author Efe
 */
public class Player {
    private String name;
    private int hp, maxHp;
    private int gold;
    private int strength;
    private int lvl, xp;
    private boolean sword1, sword2, sword3;
    
    public Player(String name) {
        this.name = name;
        this.hp = 100;
        this.maxHp = 100;
        this.gold = 0;
        this.strength = 5;
        this.lvl = 1;
        this.xp = 0;
        this.sword1 = false;
        this.sword2 = false;
        this.sword3 = false;
    }

    public Player(String name, int hp, int maxHp, int gold, int strength, int lvl, int xp, boolean sword1, boolean sword2, boolean sword3) {
        this.name = name;
        this.hp = hp;
        this.maxHp = maxHp;
        this.gold = gold;
        this.strength = strength;
        this.lvl = lvl;
        this.xp = xp;
        this.sword1 = sword1;
        this.sword2 = sword2;
        this.sword3 = sword3;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int val) {
        this.hp += val;
        if(this.hp < 0)
            this.hp = 0;
        else if(this.hp > maxHp)
            this.hp = maxHp;
    }
    
    public int getMaxHp() {
        return this.maxHp;
    }
    
    public void setMaxHp(int val) {
        this.maxHp += val;
    }

    public int getGold() {
        return gold;
    }

    public void setGold(int val) {
        this.gold += val;
        if(this.gold < 0) 
            this.gold = 0;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength += strength;
    }
    
    public int getXp() {
        return this.xp;
    }
    
    public void setXp(int xp) {
        this.xp = xp;
    }

    public int getLvl() {
        return lvl;
    }

    public void setLvl(int lvl) {
        this.lvl = lvl;
    }
    
    public void setSword1() {
        this.sword1 = true;
    } 
    
    public void setSword2() {
        this.sword2 = true;
    }
    
    public void setSword3() {
        this.sword3 = true;
    }
    
    public boolean getSword1() {
        return this.sword1;
    }
    
    public boolean getSword2() {
        return this.sword2;
    }
    
    public boolean getSword3() {
        return this.sword3;
    }
    
    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return name + "," + hp + "," + maxHp + "," + gold + "," + strength + "," + lvl + "," + xp + "," + sword1 + "," + sword2 + "," + sword3 + ",";
    }
    
    
}
