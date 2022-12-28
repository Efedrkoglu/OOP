/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gameproject;

/**
 *
 * @author Efe
 */
public class Boss extends Enemy{
    
    public Boss() {
        super("Hayalet Kral", 350, 60, 0, 0, 1);
    }

    public Boss(String name, int hp, int dmg, int gold, int tp, int NUM) {
        super(name, hp, dmg, gold, tp, NUM);
    }
    
    
}
