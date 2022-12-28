/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gameproject;

/**
 *
 * @author Efe
 */
public class Enemy {
    private String name;
    private int hp, dmg, gold, tp, NUM;
    private int maxHp;
    
    public Enemy(String name, int hp, int dmg, int gold, int tp,int NUM) {
        this.name = name;
        this.hp = hp;
        this.maxHp = hp;
        this.dmg = dmg;
        this.gold = gold;
        this.tp = tp;
        this.NUM = NUM;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int val) {
        this.hp += val;
    }
    
    public void setHp() {
        this.hp = maxHp;
    }

    public int getDmg() {
        return dmg;
    }

    public void setDmg(int dmg) {
        this.dmg = dmg;
    }

    public int getGold() {
        return gold;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }

    public int getTp() {
        return tp;
    }

    public void setTp(int tp) {
        this.tp = tp;
    }

    public int getNUM() {
        return NUM;
    }

    public void setNUM() {
        this.NUM--;
    }

    @Override
    public String toString() {
        return name + "," + hp + "," + dmg + "," + gold + "," + tp + "," + NUM + "," + maxHp + ",";
    }
    
    
    
}
