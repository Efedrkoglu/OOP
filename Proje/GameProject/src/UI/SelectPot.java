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
public class SelectPot extends JFrame implements ActionListener{
    
    private Game game;
    private GameUI gui;
    private JButton potBtn, pot2Btn;
    
    public SelectPot(GameUI gui, Game game) {
        this.game = game;
        this.gui = gui;
        this.setTitle("İksir seç");
        this.setSize(300,150);
        this.setLayout(new GridLayout(1,2));
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        
        this.add(getPotBtn());
        this.add(getPot2Btn());
    }
    
    public JButton getPotBtn() {
        if(potBtn == null) {
            potBtn = new JButton("Can İksiri");
            potBtn.setFocusable(false);
            potBtn.addActionListener(this);
        }
        return potBtn;
    }
    
    public JButton getPot2Btn() {
        if(pot2Btn == null) {
            pot2Btn = new JButton("Büyük Can İksiri");
            pot2Btn.setFocusable(false);
            pot2Btn.addActionListener(this);
        }
        return pot2Btn;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == potBtn) {
            this.game.setPot(2);
            
            if(this.game.getPot() == 0 && this.game.getPot2() == 0) {
                this.gui.getSelectPotBtn().setEnabled(false);
            }
            
            this.gui.updateInfPanel();
            this.setVisible(false);
        }
        
        if(e.getSource() == pot2Btn) {
            this.game.setPot2(2);
            
            if(this.game.getPot() == 0 && this.game.getPot2() == 0) {
                this.gui.getSelectPotBtn().setEnabled(false);
            }
            
            this.gui.updateInfPanel();
            this.setVisible(false);
        }
    }
    
}
