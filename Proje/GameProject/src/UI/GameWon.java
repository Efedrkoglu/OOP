/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UI;

import java.awt.FlowLayout;
import javax.swing.*;

/**
 *
 * @author Efe
 */
public class GameWon extends JFrame{
    
    public GameWon() {
        this.setSize(300,150);
        this.setLocationRelativeTo(null);
        this.setLayout(new FlowLayout(FlowLayout.CENTER,10,50));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JLabel label1 = new JLabel("Tebrikler Kazandınız!");
        
        this.add(label1);
        this.setVisible(true);
    }
}
