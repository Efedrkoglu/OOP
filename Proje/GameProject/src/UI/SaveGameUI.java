/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UI;

import gameproject.*;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author Efe
 */
public class SaveGameUI extends JFrame implements ActionListener{
    
    private Game game;
    private JButton slot1, slot2, slot3;
    
    public SaveGameUI(Game game) {
        this.game = game;
        
        this.setTitle("Oyunu Kaydet");
        this.setSize(300,400);
        this.setLayout(null);
        this.setLocationRelativeTo(null);
        
        this.add(getSlot1());
        this.add(getSlot2());
        this.add(getSlot3());
        this.setVisible(true);
    }

    public JButton getSlot1() {
        if(slot1 == null) {
            slot1 = new JButton("1. Kayıt yuvası");
            slot1.setFocusable(false);
            slot1.setBounds(60,95,170,50);
            slot1.addActionListener(this);
        }
        return slot1;
    }

    public JButton getSlot2() {
        if(slot2 == null) {
            slot2 = new JButton("2. Kayıt yuvası");
            slot2.setFocusable(false);
            slot2.setBounds(60,175,170,50);
            slot2.addActionListener(this);
        }
        return slot2;
    }

    public JButton getSlot3() {
        if(slot3 == null) {
            slot3 = new JButton("3. Kayıt yuvası");
            slot3.setFocusable(false);
            slot3.setBounds(60,255,170,50);
            slot3.addActionListener(this);
        }
        return slot3;
    }
    
    

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == slot1) {
            SaveFileManager.SaveGame(1, this.game);
            JOptionPane.showMessageDialog(rootPane, "Oyun kaydedildi.");
        }
        
        if(e.getSource() == slot2) {
            SaveFileManager.SaveGame(2, this.game);
            JOptionPane.showMessageDialog(rootPane, "Oyun kaydedildi.");
        }
        
        if(e.getSource() == slot3) {
            SaveFileManager.SaveGame(3, this.game);
            JOptionPane.showMessageDialog(rootPane, "Oyun kaydedildi.");
        }
    }
    
}
