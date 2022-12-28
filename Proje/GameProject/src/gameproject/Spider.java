/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gameproject;

/**
 *
 * @author Efe
 */
public class Spider extends Enemy{
    
    public Spider(int NUM) {
        super("Örümcek", 10, 5, 10, 10, NUM);
    }

    public Spider(String name, int hp, int dmg, int gold, int tp, int NUM) {
        super(name, hp, dmg, gold, tp, NUM);
    }
    
    
}
