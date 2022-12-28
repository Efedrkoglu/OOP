/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gameproject;

/**
 *
 * @author Efe
 */
public class Skeleton extends Enemy{
    
    public Skeleton(int NUM) {
        super("İskelet", 40, 20, 25, 25, NUM);
    }

    public Skeleton(String name, int hp, int dmg, int gold, int tp, int NUM) {
        super(name, hp, dmg, gold, tp, NUM);
    }
    
    
}
