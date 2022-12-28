package UI;

import gameproject.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author Efe
 */
public class GameUI implements ActionListener{
    private Game game;
    
    private JFrame gameWindow;
    private JPanel info, act, loc;
    private JButton atk, town, castle;
    private JPanel infSubPanel, infSubPanel2;
    private JPanel actSubPanel, actSubPanel2;
    private JLabel name, hp, gold, strength, lvl, xp;
    private JLabel pot, pot2, bomb;
    private JButton selectPotBtn;
    private JButton useBombBtn;
    private JButton saveGameBtn;
    private JLayeredPane main;
    private TownPanel tp;
    private CastlePanel cp;
    private JFrame selectPot, levelUp;
    private JFrame gameOver;
    
    public GameUI(String name) {
        this.game = new Game(name);
        this.getGameWindow().add(this.getInfo(), BorderLayout.WEST);
        this.getGameWindow().add(this.getAct(), BorderLayout.SOUTH);
        this.getGameWindow().add(this.getLoc(), BorderLayout.NORTH);
        this.getGameWindow().add(this.getMain());
        this.getGameWindow().setVisible(true);
    }
    
    public GameUI(Game game) {
        this.game = game;
        this.getGameWindow().add(this.getInfo(), BorderLayout.WEST);
        this.getGameWindow().add(this.getAct(), BorderLayout.SOUTH);
        this.getGameWindow().add(this.getLoc(), BorderLayout.NORTH);
        this.getGameWindow().add(this.getMain());
        this.getGameWindow().setVisible(true);
    }
    
    public JFrame getGameWindow() {
        if(this.gameWindow == null) {
            this.gameWindow = new JFrame();
            this.gameWindow.setSize(800,550);
            this.gameWindow.setTitle("Game");
            this.gameWindow.setResizable(false);
            this.gameWindow.setLocationRelativeTo(null);
            this.gameWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.gameWindow.getRootPane().setBorder(BorderFactory.createMatteBorder(4, 4, 4, 4, Color.BLACK));
            this.gameWindow.setLayout(new BorderLayout(5,5));
        }
        return this.gameWindow;
    }

    public JPanel getInfo() {
        if(this.info == null) {
            this.info = new JPanel();
            this.info.setBackground(Color.white);
            this.info.setLayout(new FlowLayout(FlowLayout.CENTER,10,35));
            this.info.setPreferredSize(new Dimension(150,300));
            this.info.add(this.getInfSubPanel());
            this.info.add(this.getInfSubPanel2());
        }
        return info;
    }
    
    public JPanel getInfSubPanel() {
        if(this.infSubPanel == null) {
            this.infSubPanel = new JPanel();
            this.infSubPanel.setLayout(new GridLayout(6,1,10,10));
            this.infSubPanel.setBackground(Color.white);
            this.infSubPanel.add(this.getName());
            this.infSubPanel.add(this.getHp());
            this.infSubPanel.add(this.getStrength());
            this.infSubPanel.add(this.getLvl());
            this.infSubPanel.add(this.getGold());
            this.infSubPanel.add(this.getXp());
        }
        return infSubPanel;
    }
    
    public JLabel getName() {
        if(this.name == null) {
           this.name = new JLabel("İsim: "+game.getPlayer().getName());
        }
        return name;
    }

    public JLabel getLvl() {
        if(this.lvl == null) {
            this.lvl = new JLabel("Seviye: "+this.game.getPlayer().getLvl());
        }
        return lvl;
    }

    public void setLvl() {
        this.lvl.setText("Seviye: "+this.game.getPlayer().getLvl());
    }

    public JLabel getXp() {
        if(this.xp == null) {
            this.xp = new JLabel("TP: "+this.game.getPlayer().getXp()+"/100");
        }
        return xp;
    }

    public void setXp() {
        this.xp.setText("TP: "+this.game.getPlayer().getXp()+"/100");
    }
    
    public JLabel getStrength() {
        if(this.strength == null) {
            this.strength = new JLabel("Güç: "+this.game.getPlayer().getStrength());
        }
        return this.strength;
    }
    
    public void setStrength() {
        this.strength.setText("Güç: "+this.game.getPlayer().getStrength());
    }

    public JLabel getHp() {
        if(this.hp == null) {
            this.hp = new JLabel("Can: "+this.game.getPlayer().getHp()+"/"+game.getPlayer().getMaxHp());
        }
        return hp;
    }

    public void setHp() {
        this.hp.setText("Can: "+this.game.getPlayer().getHp()+"/"+game.getPlayer().getMaxHp());
    }

    public JLabel getGold() {
        if(this.gold == null) {
            this.gold = new JLabel("Altın: "+game.getPlayer().getGold());
        }
        return gold;
    }

    public void setGold() {
        this.gold.setText("Altın: "+this.game.getPlayer().getGold());
    }
    
    public JButton getSelectPotBtn() {
        if(this.selectPotBtn == null) {
            this.selectPotBtn = new JButton("Can İksiri");
            this.selectPotBtn.setPreferredSize(new Dimension(100,35));
            this.selectPotBtn.setFocusable(false);
            this.selectPotBtn.addActionListener(this);
            
            if(this.game.getPot() == 0 && this.game.getPot2() == 0){
                this.selectPotBtn.setEnabled(false);
            }
        }
        return this.selectPotBtn;
    }

    public JPanel getInfSubPanel2() {
        if(this.infSubPanel2 == null) {
            this.infSubPanel2 = new JPanel();
            this.infSubPanel2.setLayout(new GridLayout(3,1,5,5));
            this.infSubPanel2.setBackground(Color.white);
            this.infSubPanel2.add(this.getPot());
            this.infSubPanel2.add(this.getPot2());
            this.infSubPanel2.add(this.getBomb());
        }
        return this.infSubPanel2;
    }
    
    public JLabel getPot() {
        if(this.pot == null) {
            this.pot = new JLabel("Can iksiri: "+this.game.getPot());
        }
        return this.pot;
    }
    
    public void setPot() {
        this.pot.setText("Can iksiri: "+this.game.getPot());
    }
    
    public JLabel getPot2() {
        if(this.pot2 == null) {
            this.pot2 = new JLabel("Büyük can iksiri: "+this.game.getPot2());
        }
        return this.pot2;
    }
    
    public void setPot2() {
        this.pot2.setText("Büyük can iksiri: "+this.game.getPot2());
    }
    
    public JLabel getBomb() {
        if(this.bomb == null) {
            this.bomb = new JLabel("Bomba: "+this.game.getBomb());
        }
        return this.bomb;
    }
    
    public void setBomb() {
        this.bomb.setText("Bomba: "+this.game.getBomb());
    }
    
    public void updateInfPanel() {
        this.setHp();
        this.setGold();
        this.setStrength();
        this.setLvl();
        this.setXp();
        this.setPot();
        this.setPot2();
        this.setBomb();
    }
    
    public TownPanel getTownPanel() {
        if(this.tp == null) {
            tp = new TownPanel(this,this.game);
        }
        return tp;
    }   
    
    public CastlePanel getCastlePanel() {
        if(this.cp == null) {
            cp = new CastlePanel(this, this.game);
        }
        return cp;
    }
    
    public JLayeredPane getMain() {
        if(this.main == null) {
            this.main = new JLayeredPane();
            this.main.setBackground(Color.white);
            this.main.setLayout(new CardLayout());
        }
        return main;
    }
    
    public void setMainLoc(JPanel panel) {
        this.getMain().removeAll();
        this.getMain().add(panel);
        this.getMain().repaint();
        this.getMain().revalidate();
    }

    public JPanel getAct() {
        if(this.act == null) {
            this.act = new JPanel();
            this.act.setBackground(Color.white);
            this.act.setLayout(new GridLayout(1,2));
            
            this.act.add(getActSubPanel());
            this.act.add(getActSubPanel2());
        }
        return act;
    }
    
    public JPanel getActSubPanel() {
        if(this.actSubPanel == null) {
            this.actSubPanel = new JPanel();
            this.actSubPanel.setBackground(Color.white);
            this.actSubPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));
            
            this.actSubPanel.add(getSaveGameBtn());
        }
        return this.actSubPanel;
    }
    
    public JPanel getActSubPanel2() {
        if(this.actSubPanel2 == null) {
            this.actSubPanel2 = new JPanel();
            this.actSubPanel2.setBackground(Color.white);
            this.actSubPanel2.setLayout(new FlowLayout(FlowLayout.RIGHT,5,5));
            
            this.actSubPanel2.add(this.getSelectPotBtn());
            this.actSubPanel2.add(this.getUseBombBtn());
            this.actSubPanel2.add(this.getAtk());
        }
        return this.actSubPanel2;
    }
    
    public JButton getSaveGameBtn() {
        if(this.saveGameBtn == null) {
            this.saveGameBtn = new JButton("Kaydet");
            this.saveGameBtn.setFocusable(false);
            this.saveGameBtn.addActionListener(this);
            this.saveGameBtn.setPreferredSize(new Dimension(90,35));
        }
        return this.saveGameBtn;
    }

    public JPanel getLoc() {
        if(this.loc == null) {
            this.loc = new JPanel();
            this.loc.setBackground(Color.white);
            this.loc.setLayout(new FlowLayout(FlowLayout.CENTER,5,5));
            this.loc.add(this.getTown());
            this.loc.add(this.getCastle());
        }
        return loc;
    }

    public JButton getAtk() {
        if(this.atk == null) {
            this.atk = new JButton("Saldır");
            this.atk.setFocusable(false);
            this.atk.setPreferredSize(new Dimension(80,35));
            this.atk.addActionListener(this);
            this.atk.setEnabled(false);
        }
        return this.atk;
    }
    
    public JButton getTown() {
        if(this.town == null) {
            this.town = new JButton("Şehir");
            this.town.setFocusable(false);
            this.town.setPreferredSize(new Dimension(80,35));
            this.town.addActionListener(this);
        }
        return this.town;
    }
    
    public JButton getCastle() {
        if(this.castle == null) {
            this.castle = new JButton("Kale");
            this.castle.setFocusable(false);
            this.castle.setPreferredSize(new Dimension(80,35));
            this.castle.addActionListener(this);
        }
        return this.castle;
    }
    
    public JFrame getSelectPot() {
        if(this.selectPot == null) {
            this.selectPot = new SelectPot(this, this.game);
        }
        return this.selectPot;
    }
    
    public JFrame getLevelUp() {
        if(this.levelUp == null) {
            this.levelUp = new LevelUp(this, this.game);
        }
        return this.levelUp;
    }
    
    public JButton getUseBombBtn() {
        if(this.useBombBtn == null) {
            this.useBombBtn = new JButton("Bomba at");
            this.useBombBtn.setFocusable(false);
            this.useBombBtn.setPreferredSize(new Dimension(100,35));
            this.useBombBtn.addActionListener(this);
            this.useBombBtn.setEnabled(false);
        }
        return this.useBombBtn;
    }
    
    public void disableButtons() {
        this.getTown().setEnabled(false);
        this.getCastle().setEnabled(false);
        this.getAtk().setEnabled(false);
        this.getUseBombBtn().setEnabled(false);
        this.getSelectPotBtn().setEnabled(false);
        this.getCastlePanel().getNextRoom().setEnabled(false);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == atk) {
            if(this.game.getEnemy().getNUM() != 0) {
                this.game.getEnemy().setHp(this.game.getPlayer().getStrength()*(-1));
                
                if(this.game.getEnemy().getHp() > 0) {
                    this.game.getPlayer().setHp(this.game.getEnemy().getDmg()*(-1));
                    if(this.game.getPlayer().getHp() <= 0) {
                        this.gameOver = new GameOver();
                        this.disableButtons();
                    }
                }
                else {
                    this.game.getPlayer().setGold(this.game.getEnemy().getGold());
                    this.game.getPlayer().setXp(this.game.getPlayer().getXp() + this.game.getEnemy().getTp());
                    this.game.getEnemy().setNUM();
                    this.game.getEnemy().setHp();
                    
                    if(this.game.getPlayer().getXp() >= 100) {
                        this.game.getPlayer().setXp(this.game.getPlayer().getXp() % 100);
                        this.game.getPlayer().setLvl(this.game.getPlayer().getLvl() + 1);
                        getLevelUp().setVisible(true);
                    }
                }
                
                this.updateInfPanel();
                this.cp.updateRoomPanel();
            }
        }
       
        if(e.getSource() == selectPotBtn) {
           getSelectPot().setVisible(true);
        }
       
        if(e.getSource() == useBombBtn) {
            if(this.game.getEnemy().getNUM() != 0) {
                this.game.getEnemy().setHp(-50);
               
                if(this.game.getEnemy().getHp() <= 0) {
                    this.game.getPlayer().setGold(this.game.getEnemy().getGold());
                    this.game.getPlayer().setXp(this.game.getPlayer().getXp() + this.game.getEnemy().getTp());
                    this.game.getEnemy().setNUM();
                    this.game.getEnemy().setHp();
                    
                    if(this.game.getPlayer().getXp() >= 100) {
                        this.game.getPlayer().setXp(this.game.getPlayer().getXp() % 100);
                        this.game.getPlayer().setLvl(this.game.getPlayer().getLvl() + 1);
                        getLevelUp().setVisible(true);
                    }
                }
                
                this.game.setBomb(2);
                if(this.game.getBomb() == 0) {
                    this.getUseBombBtn().setEnabled(false);
                }
                
                this.updateInfPanel();
                this.cp.updateRoomPanel();
            }
        }
       
        if(e.getSource() == town) {
            this.getAtk().setEnabled(false);
            this.getUseBombBtn().setEnabled(false);
            this.setMainLoc(this.getTownPanel());
            if(this.game.getPlayer().getLvl() < 3) {
                this.tp.getBtnSword().setEnabled(false);
            }
            else {
                if(this.game.getPlayer().getSword1()) {
                    this.tp.getBtnSword().setEnabled(false);
                }
                else {
                    this.tp.getBtnSword().setEnabled(true);
                }
            }
           
            if(this.game.getPlayer().getLvl() < 8) {
                this.tp.getBtnSword2().setEnabled(false);
            }    
            else {
                if(this.game.getPlayer().getSword2()) {
                    this.tp.getBtnSword2().setEnabled(false);
                }
                else {
                    this.tp.getBtnSword2().setEnabled(true);
                }
            }
           
            if(this.game.getPlayer().getLvl() < 13) {
                this.tp.getBtnSword3().setEnabled(false);
            }
            else {
                if(this.game.getPlayer().getSword3()) {
                    this.tp.getBtnSword3().setEnabled(false);
                }
                else {
                    this.tp.getBtnSword3().setEnabled(true);
                }
            }
        }
       
        if(e.getSource() == castle) {
            this.getAtk().setEnabled(true);
            if(this.game.getBomb() != 0) {
                this.getUseBombBtn().setEnabled(true);
            }
            this.setMainLoc(this.getCastlePanel());
        }
        
        if(e.getSource() == saveGameBtn) {
            new SaveGameUI(this.game);
        }
    }
}
