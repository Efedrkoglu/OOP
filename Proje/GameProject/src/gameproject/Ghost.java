/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gameproject;

/**
 *
 * @author Efe
 */
public class Ghost extends Enemy{
    
    public Ghost(int NUM) {
        super("Hayalet", 60, 30, 50, 50, NUM);
    }

    public Ghost(String name, int hp, int dmg, int gold, int tp, int NUM) {
        super(name, hp, dmg, gold, tp, NUM);
    }
    
    
}
