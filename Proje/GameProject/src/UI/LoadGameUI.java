package UI;

import gameproject.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author Efe
 */
public class LoadGameUI extends JFrame implements ActionListener{
    
    private JButton slot1, slot2, slot3;
    
    public LoadGameUI() {
        this.setTitle("Oyun Yükle");
        this.setSize(300,400);
        this.setLayout(null);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
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
            new GameUI(SaveFileManager.LoadGame(1));
            this.setVisible(false);
        }
        
        if(e.getSource() == slot2) {
            new GameUI(SaveFileManager.LoadGame(2));
            System.out.println(SaveFileManager.LoadGame(2).getPlayer().getSword1());
            this.setVisible(false);
        }
        
        if(e.getSource() == slot3) {
            new GameUI(SaveFileManager.LoadGame(3));
            this.setVisible(false);
        }
    }
    
}
