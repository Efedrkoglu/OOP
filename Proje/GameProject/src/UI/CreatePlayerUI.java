/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author Efe
 */
public class CreatePlayerUI extends JFrame implements ActionListener{
    
    private JTextField PlayerName;
    private JButton confirm;
    private JLabel nameLabel;
    
    public CreatePlayerUI() {
        this.setTitle("Create Player");
        this.setSize(300,300);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        this.add(getNameLabel());
        this.add(getPlayerName());
        this.add(getConfirm());
        
        this.setVisible(true);
    }

    public JTextField getPlayerName() {
        if(PlayerName == null) {
            PlayerName = new JTextField();
            PlayerName.setBounds(65,95,200,30);
        }
        return PlayerName;
    }

    public JButton getConfirm() {
        if(confirm == null) {
            confirm = new JButton("Onayla");
            confirm.setBounds(100, 140, 100, 35);
            confirm.setFocusable(false);
            confirm.addActionListener(this);
        }
        return confirm;
    }
    
    public JLabel getNameLabel() {
        if(nameLabel == null) {
            nameLabel = new JLabel("İsim: ");
            nameLabel.setBounds(25,90,40,40);
        }
        return nameLabel;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == confirm) {
            new GameUI(this.getPlayerName().getText());
            this.setVisible(false);
        }
    }
    
}
