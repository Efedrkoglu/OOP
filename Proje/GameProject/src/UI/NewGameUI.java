package UI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author Efe
 */
public class NewGameUI extends JFrame implements ActionListener{
    private JButton btn1, btn2;
    
    public NewGameUI() {
        this.setTitle("New Game");
        this.setSize(300,300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        
        this.add(getBtn1());
        this.add(getBtn2());
        
        this.setVisible(true);
    }

    public JButton getBtn1() {
        if(btn1 == null){
            btn1 = new JButton("Yeni Oyun");
            btn1.setFocusable(false);
            btn1.setBounds(100, 90, 100, 40);
            btn1.addActionListener(this);
        }
        return btn1;
    }

    public JButton getBtn2() {
        if(btn2 == null){
            btn2 = new JButton("Kayıtlı Oyun");
            btn2.setFocusable(false);
            btn2.setBounds(100, 150, 100, 40);
            btn2.addActionListener(this);
        }
        return btn2;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == btn1) {
            new CreatePlayerUI();
            this.setVisible(false);
        }
        
        if(e.getSource() == btn2) {
            new LoadGameUI();
            this.setVisible(false);
        }
    }
    
    
}
