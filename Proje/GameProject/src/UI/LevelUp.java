/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UI;

import gameproject.*;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


/**
 *
 * @author Efe
 */
public class LevelUp extends JFrame implements ActionListener{
    
    private GameUI gui;
    private Game game;
    private JButton incMaxHp, incStrength;
    
    public LevelUp(GameUI gui, Game game) {
        this.gui = gui;
        this.game = game;
        
        this.setTitle("Seviye atlandı!");
        this.setSize(300, 150);
        this.setLayout(new GridLayout(1,2));
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        
        this.add(getIncMaxHp());
        this.add(getIncStrength());
    }
    
    public JButton getIncMaxHp() {
        if(incMaxHp == null) {
            incMaxHp = new JButton("Maksimum can");
            incMaxHp.setFocusable(false);
            incMaxHp.addActionListener(this);
        }
        return incMaxHp;
    }
    
    public JButton getIncStrength() {
        if(incStrength == null) {
            incStrength = new JButton("Güç");
            incStrength.setFocusable(false);
            incStrength.addActionListener(this);
        }
        return incStrength;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == incMaxHp) {
            this.game.getPlayer().setMaxHp(25);
            this.gui.updateInfPanel();
            this.setVisible(false);
        }
        
        if(e.getSource() == incStrength) {
            if(this.game.getPlayer().getLvl() < 8) {
                this.game.getPlayer().setStrength(2);
                this.gui.updateInfPanel();
                this.setVisible(false);
            }
            else if(this.game.getPlayer().getLvl() < 12){
                this.game.getPlayer().setStrength(3);
                this.gui.updateInfPanel();
                this.setVisible(false);
            }
            else {
                this.game.getPlayer().setStrength(4);
                this.gui.updateInfPanel();
                this.setVisible(false);
            }
        }
    }
    
}
