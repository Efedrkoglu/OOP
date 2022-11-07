import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;

/**
 *
 * @author Efe
 */
public class LogFrame extends JFrame{
    
    JTextArea ta;
    JScrollPane scroll;
    
    FileManager mng = new FileManager();
    
    public LogFrame() {
        this.setSize(600,550);
        this.setTitle("Log Window");
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setLayout(new FlowLayout());

        ta = new JTextArea();
        ta.setFont(new Font("Consolas",Font.PLAIN,22));
        ta.setLineWrap(true);
        ta.setWrapStyleWord(true);
        
        scroll = new JScrollPane(ta);
        scroll.setPreferredSize(new Dimension(500,500));
        scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        
        this.add(scroll);
        this.setVisible(true);
    }
    
    public void List() {
        ArrayList <String> lines = new ArrayList<>();
        lines = mng.Read();
        
        for(String i : lines) {
            ta.append(i+"\n");
        }
    }
}
