
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Efe
 */
public class MyFrame extends JFrame implements ActionListener{
    JLabel name;
    JLabel surName;
    JLabel age;
    JLabel job;
    
    JTextField tf1;
    JTextField tf2;
    JTextField tf3;
    JTextField tf4;
    
    JButton save;
    JButton list;
    
    FileManager mng = new FileManager(); 
    
    public MyFrame() {
        this.setSize(400,400);
        this.setTitle("Deneme");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.setResizable(false);
        
        name = new JLabel("İsim:");
        name.setBounds(120,80,40,40);
        
        tf1 = new JTextField();
        tf1.setBounds(150, 90, 120, 20);
        
        surName = new JLabel("Soy İsim:");
        surName.setBounds(95,120,60,40);
        
        tf2 = new JTextField();
        tf2.setBounds(150, 130, 120, 20);
        
        age = new JLabel("Yaş:");
        age.setBounds(120,160,40,40);
        
        tf3 = new JTextField();
        tf3.setBounds(150, 170, 120, 20);
        
        job = new JLabel("Meslek:");
        job.setBounds(100,200,60,40);
        
        tf4 = new JTextField();
        tf4.setBounds(150, 210, 120, 20);
        
        save = new JButton("Kaydet");
        save.setBounds(210, 250, 80, 25);
        save.addActionListener(this);
        save.setFocusable(false);
        
        list = new JButton("Listele");
        list.setBounds(210, 280, 80, 25);
        list.addActionListener(this);
        list.setFocusable(false);
        
        this.add(name);
        this.add(tf1);
        this.add(surName);
        this.add(tf2);
        this.add(age);
        this.add(tf3);
        this.add(job);
        this.add(tf4);
        this.add(save);
        this.add(list);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource() == save) {
            Person p1 = new Person();
            p1.setName(tf1.getText());
            p1.setSurName(tf2.getText());
            p1.setAge(Integer.parseInt(tf3.getText()));
            p1.setJob(tf4.getText());
            
            mng.Write(p1);
        }
        
        if(e.getSource() == list) {
            LogFrame frame1 = new LogFrame();
            frame1.List();
        }
    }
    
}
