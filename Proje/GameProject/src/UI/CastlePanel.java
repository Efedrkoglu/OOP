package UI;

import gameproject.*;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author Efe
 */
public class CastlePanel extends JPanel implements ActionListener{
    
    private Game game;
    private GameUI gui;
    
    private JPanel roomPanel, roomInfPanel;
    private JButton nextRoom;
    private JLabel enemyName, enemyDmg, enemyGold, enemyNum, enemyHp;
    private JLabel room, floor;
    private JFrame gameWon;
    
    public CastlePanel(GameUI gui, Game game) {
        this.gui = gui;
        this.game = game;
        this.setBackground(Color.white);
        this.setLayout(new GridLayout(2,1));
        
        this.add(getRoomPanel());
        this.add(getRoomInfPanel());
    }
    
    public JPanel getRoomInfPanel() {
        if(roomInfPanel == null) {
            roomInfPanel = new JPanel();
            roomInfPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 30, 30));
            roomInfPanel.setBackground(Color.white);
            
            roomInfPanel.add(getFloor());
            roomInfPanel.add(getRoom());
        }
        
        return roomInfPanel;
    }
    
    public JLabel getRoom() {
        if(room == null) {
            room = new JLabel("Oda: "+this.game.getCurrentRoom()+"/10");
        }
        return room;
    }
    
    public void setRoom() {
        if(this.game.getCurrentFloor() == 4) {
            room.setText("Oda: 1/1");
        }
        else {
            room.setText("Oda: "+this.game.getCurrentRoom()+"/10");
        }
    }
    
    public JLabel getFloor() {
        if(floor == null) {
            floor = new JLabel("Kat: "+this.game.getCurrentFloor()+"/4");
        }
        return floor;
    }
    
    public void setFloor() {
        floor.setText("Kat: "+this.game.getCurrentFloor()+"/4");
    }
    
    public JButton getNextRoom() {
        if(nextRoom == null) {
            nextRoom = new JButton("Sonraki oda");
            nextRoom.setFocusable(false);
            nextRoom.addActionListener(this);
            nextRoom.setEnabled(false);
        }
        return nextRoom;
    }
    
    public JLabel getEnemyNum() {
        if(enemyNum == null) {
            enemyNum = new JLabel("Sayı: "+this.game.getEnemy().getNUM());
        }
        return enemyNum;
    }
    
    public void setEnemyNum() {
        enemyNum.setText("Sayı: "+this.game.getEnemy().getNUM());
    }
    
    public JLabel getEnemyHp() {
        if(enemyHp == null) {
            enemyHp = new JLabel("Can: "+this.game.getEnemy().getHp());
        }
        return enemyHp;
    }
    
    public void setEnemyHp() {
        enemyHp.setText("Can: "+this.game.getEnemy().getHp());
    }
    
    public JLabel getEnemyName() {
        if(enemyName == null) {
            enemyName = new JLabel("Düşman: "+this.game.getEnemy().getName());
        }
        return enemyName;
    }
    
    public void setEnemyName() {
        enemyName.setText("Düşman: "+this.game.getEnemy().getName());
    }
    
    public JLabel getEnemyDmg() {
        if(enemyDmg == null) {
            enemyDmg = new JLabel("Hasar: "+this.game.getEnemy().getDmg());
        }
        return enemyDmg;
    }
    
    public void setEnemyDmg() {
        enemyDmg.setText("Hasar: "+this.game.getEnemy().getDmg());
    }
    
    public JLabel getEnemyGold() {
        if(enemyGold == null) {
            enemyGold = new JLabel("Altın: "+this.game.getEnemy().getGold());
        }
        return enemyGold;
    }
    
    public void setEnemyGold() {
        enemyGold.setText("Altın: "+this.game.getEnemy().getGold());
    }
    
    public JPanel getRoomPanel() {
        if(roomPanel == null) {
            roomPanel = new JPanel();
            roomPanel.setLayout(new GridLayout(6,1));
            roomPanel.setBackground(Color.white);
            roomPanel.add(getEnemyName());
            roomPanel.add(getEnemyHp());
            roomPanel.add(getEnemyDmg());
            roomPanel.add(getEnemyGold());
            roomPanel.add(getEnemyNum());
            roomPanel.add(getNextRoom());
        }
        return roomPanel;
    }
    
    public void updateRoomPanel() {
        setEnemyName();
        setEnemyHp();
        setEnemyDmg();
        setEnemyGold();
        setEnemyNum();
        if(this.game.getEnemy().getNUM() == 0) {
            getNextRoom().setEnabled(true);
        }
        else {
            getNextRoom().setEnabled(false);
        }
    }
    
    public void disableButtons() {
        this.getNextRoom().setEnabled(false);
        this.gui.getTown().setEnabled(false);
        this.gui.getCastle().setEnabled(false);
        this.gui.getAtk().setEnabled(false);
        this.gui.getUseBombBtn().setEnabled(false);
        this.gui.getSelectPotBtn().setEnabled(false);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == nextRoom) {
            if(this.game.getEnemy().getName().equals("Hayalet Kral")) {
                this.gameWon = new GameWon();
                this.disableButtons();
            }
            else {
                this.game.setCurrentRoom();
                this.setRoom();
                this.setFloor();
                if(this.game.getCurrentFloor() == 4){
                    this.game.GenerateBoss();
                    this.updateRoomPanel();
                }
                else {
                    this.game.GenerateEnemy();
                    this.updateRoomPanel();
                }
            } 
        }
    }
    
}
