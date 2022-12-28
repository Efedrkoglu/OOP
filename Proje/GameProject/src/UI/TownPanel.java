/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UI;

import gameproject.*;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author Efe
 */
public class TownPanel extends JPanel implements ActionListener{
    
    private GameUI gui;
    private Game game;
    private JPanel potPanel, pot2Panel;
    private JPanel swordPanel, sword2Panel, sword3Panel, bombPanel;
    private JButton btnBomb;
    private JButton btnPot, btnPot2;
    private JButton btnSword, btnSword2, btnSword3;
    
    public TownPanel(GameUI gui, Game game) {
        this.gui = gui;
        this.game = game;
        this.setBackground(Color.white);
        this.setLayout(new GridLayout(2,3));
        
        this.add(getPotPanel());
        this.add(getPot2Panel());
        this.add(getBombPanel());
        this.add(getSwordPanel());
        this.add(getSword2Panel());
        this.add(getSword3Panel());
    }
    
    public JButton getBtnPot() {
        if(btnPot == null) {
            btnPot = new JButton("Satın al");
            btnPot.setFocusable(false);
            btnPot.addActionListener(this);
        }
        return btnPot;
    }
    
    public JButton getBtnPot2() {
        if(btnPot2 == null) {
            btnPot2 = new JButton("Satın al");
            btnPot2.setFocusable(false);
            btnPot2.addActionListener(this);
        }
        return btnPot2;
    }
    
    public JPanel getPotPanel() {
        if(potPanel == null) {
            potPanel = new JPanel();
            potPanel.setBackground(Color.white);
            potPanel.setLayout(new GridLayout(4,1));
            
            JLabel label1 = new JLabel("Can İksiri");
            JLabel label2 = new JLabel("15 can yeniler.");
            JLabel label3 = new JLabel("10 altın");
            
            potPanel.add(label1);
            potPanel.add(label2);
            potPanel.add(label3);
            potPanel.add(getBtnPot());
        }
        
        return potPanel;
    }
    
    public JPanel getPot2Panel() {
        if(pot2Panel == null) {
            pot2Panel = new JPanel();
            pot2Panel.setBackground(Color.white);
            pot2Panel.setLayout(new GridLayout(4,1));
            
            JLabel label1 = new JLabel("Büyük Can İksiri");
            JLabel label2 = new JLabel("25 can yeniler.");
            JLabel label3 = new JLabel("20 altın");
            
            pot2Panel.add(label1);
            pot2Panel.add(label2);
            pot2Panel.add(label3);
            pot2Panel.add(getBtnPot2());   
        }
        
        return pot2Panel;
    }
    
    public JPanel getBombPanel() {
        if(bombPanel == null) {
            bombPanel = new JPanel();
            bombPanel.setBackground(Color.white);
            bombPanel.setLayout(new GridLayout(4,1));
            
            JLabel label1 = new JLabel("Bomba");
            JLabel label2 = new JLabel("Hasar: 50");
            JLabel label3 = new JLabel("150 altın");
            
            bombPanel.add(label1);
            bombPanel.add(label2);
            bombPanel.add(label3);
            bombPanel.add(getBtnBomb());   
        }
        
        return bombPanel;
    }
    
    public JButton getBtnBomb() {
        if(btnBomb == null) {
            btnBomb = new JButton("Satın al");
            btnBomb.setFocusable(false);
            btnBomb.addActionListener(this);
        }
        return btnBomb;
    }
    
    public JPanel getSwordPanel() {
        if(swordPanel == null) {
            swordPanel = new JPanel();
            swordPanel.setBackground(Color.white);
            swordPanel.setLayout(new GridLayout(4,1));
            
            JLabel label1 = new JLabel("Bıçak");
            JLabel label2 = new JLabel("Hasar: 5");
            JLabel label3 = new JLabel("50 altın  (Gerekli seviye 3)");
            
            swordPanel.add(label1);
            swordPanel.add(label2);
            swordPanel.add(label3);
            swordPanel.add(getBtnSword());
        }
        return swordPanel;
    }
    
    public JButton getBtnSword() {
        if(btnSword == null) {
            btnSword = new JButton("Satın al");
            btnSword.setFocusable(false);
            btnSword.addActionListener(this);
            if(this.game.getPlayer().getSword1()) {
                btnSword.setEnabled(false);
            }
        }
        return btnSword;
    }
    
    public JPanel getSword2Panel() {
        if(sword2Panel == null) {
            sword2Panel = new JPanel();
            sword2Panel.setBackground(Color.white);
            sword2Panel.setLayout(new GridLayout(4,1));
            
            JLabel label1 = new JLabel("Hançer");
            JLabel label2 = new JLabel("Hasar: 10");
            JLabel label3 = new JLabel("200 altın  (Gerekli seviye 8)");
            
            sword2Panel.add(label1);
            sword2Panel.add(label2);
            sword2Panel.add(label3);
            sword2Panel.add(getBtnSword2());
        }
        return sword2Panel;
    }
    
    public JButton getBtnSword2() {
        if(btnSword2 == null) {
            btnSword2 = new JButton("Satın al");
            btnSword2.setFocusable(false);
            btnSword2.addActionListener(this);
            if(this.game.getPlayer().getSword2()) {
                btnSword2.setEnabled(false);
            }
        }
        return btnSword2;
    }
    
    public JPanel getSword3Panel() {
        if(sword3Panel == null) {
            sword3Panel = new JPanel();
            sword3Panel.setBackground(Color.white);
            sword3Panel.setLayout(new GridLayout(4,1));
            
            JLabel label1 = new JLabel("Kılıç");
            JLabel label2 = new JLabel("Hasar: 30");
            JLabel label3 = new JLabel("500 altın  (Gerekli seviye 13)");
            
            sword3Panel.add(label1);
            sword3Panel.add(label2);
            sword3Panel.add(label3);
            sword3Panel.add(getBtnSword3());
        }
        return sword3Panel;
    }
    
    public JButton getBtnSword3() {
        if(btnSword3 == null) {
            btnSword3 = new JButton("Satın al");
            btnSword3.setFocusable(false);
            btnSword3.addActionListener(this);
            if(this.game.getPlayer().getSword3()) {
                btnSword3.setEnabled(false);
            }
        }
        return btnSword3;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == btnPot) {
            if(this.game.getPlayer().getGold() >= 10) {
                this.game.setPot(1);
                this.gui.updateInfPanel();
                this.gui.getSelectPotBtn().setEnabled(true);
            }
        }
        if(e.getSource() == btnPot2) {
            if(this.game.getPlayer().getGold() >= 20) {
                this.game.setPot2(1);
                this.gui.updateInfPanel();
                this.gui.getSelectPotBtn().setEnabled(true);
            }
        }
        if(e.getSource() == btnSword) {
            if(this.game.getPlayer().getGold() >= 50) {
                this.game.getPlayer().setStrength(5);
                this.game.getPlayer().setSword1();
                this.game.getPlayer().setGold(-50);
                this.gui.updateInfPanel();
                this.btnSword.setEnabled(false);
            }
        }
        if(e.getSource() == btnSword2) {
            if(this.game.getPlayer().getGold() >= 200) {
                this.game.getPlayer().setStrength(10);
                this.game.getPlayer().setSword2();
                this.game.getPlayer().setGold(-200);
                this.gui.updateInfPanel();
                this.btnSword2.setEnabled(false);
            }
        }
        if(e.getSource() == btnSword3) {
            if(this.game.getPlayer().getGold() >= 500) {
                this.game.getPlayer().setStrength(30);
                this.game.getPlayer().setSword3();
                this.game.getPlayer().setGold(-500);
                this.gui.updateInfPanel();
                this.btnSword3.setEnabled(false);
            }
        }
        if(e.getSource() == btnBomb) {
            if(this.game.getPlayer().getGold() >= 150) {
                this.game.setBomb(1);
                this.gui.updateInfPanel();
            }
        }
    }
    
}
