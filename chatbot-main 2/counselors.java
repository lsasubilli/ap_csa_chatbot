import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.net.URL;

public class counselors extends javax.swing.JFrame implements ActionListener {
    private JButton snZButton;
    private JButton aChButton;

    public int d = 0;
    private JButton omSmButton;
    private JButton lbOlButton;
    private JButton hbLaButton;
    private JButton cHaButton;
    public JPanel stay;
    private JButton homeButton;

    public counselors(){
        screenSetup();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(stay);
//        image.setIcon(new ImageIcon("unnamed.jpeg"));
//        add(image);
//        validate();


        snZButton.addActionListener(this);
        aChButton.addActionListener(this);
        omSmButton.addActionListener(this);
        lbOlButton.addActionListener(this);
        hbLaButton.addActionListener(this);
        cHaButton.addActionListener(this);
        homeButton.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Main obj = new Main();
        if(e.getSource()==snZButton){
            try{
                Desktop.getDesktop().browse(new URL("https://calendly.com/kimberly_tran").toURI());
            }catch(Exception f){

            }
        }
        if(e.getSource()==aChButton){
            try{
                Desktop.getDesktop().browse(new URL("https://calendly.com/ymcenteeponce/15min?back=1&month=2022-11").toURI());
            }catch(Exception d){

            }
        }
        if(e.getSource()==omSmButton){
            try{
                Desktop.getDesktop().browse(new URL("https://calendly.com/amanda_maloney").toURI());
            }catch(Exception g){

            }
        }
        if(e.getSource()==lbOlButton){
            try{
                Desktop.getDesktop().browse(new URL("https://calendly.com/jasmine_torres").toURI());
            }catch(Exception g){

            }
        }
        if(e.getSource()==hbLaButton){
            try{
                Desktop.getDesktop().browse(new URL("https://calendly.com/sheryl_pacheco").toURI());
            }catch(Exception g){

            }
        }
        if(e.getSource()==cHaButton){
            try{
                Desktop.getDesktop().browse(new URL("https://calendly.com/jennifer_yu").toURI());
            }catch(Exception g){
                    JOptionPane.showMessageDialog(null,"Not connected to the internet.");
            }
        }
        if(e.getSource()==cHaButton){

            setContentPane(obj.mainPanel);

        }
    }
    public void screenSetup(){
        this.setVisible(true);
        setTitle("Counselor List");
        //getting the screen size
        Dimension size = Toolkit.getDefaultToolkit().getScreenSize();

        // width will store the width of the screen
        int width = (int) size.getWidth();

        // height will store the height of the screen
        int height = (int) size.getHeight();
        setSize((int)(width /2.5) , (int) (height / 0.5));
    }
}
