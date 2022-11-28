import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import static jdk.internal.org.jline.utils.Colors.s;

public class Main extends javax.swing.JFrame implements ActionListener {
    //instance variables
    public JPanel mainPanel;
    private JButton getStartedButton;

    private JButton coun;
    private JButton talkToACounselorButton;
    private JLabel time;
    private String fname;
    private String lname;


    public Main() {

        counselors o = new counselors();
        screenSetup();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        getStartedButton.addActionListener(this);
        talkToACounselorButton.addActionListener(this);
        coun.addActionListener(this);
        LocalDate date = LocalDate.now(); // Gets the current date

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        this.time.setText("Today is: "+date.format(formatter));
        JFrame frame = new JFrame();
        String[] options = new String[2];
        options[0] = "Got it.";
        options[1] = "Cancel";


    }

    public static void main(String[] args) {
        Main CB = new Main();
    }

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == getStartedButton) {
try{
    Desktop.getDesktop().browse(new URL("https://worthlessincompletebackslash.lalithsasubilli.repl.co/").toURI());

}catch(Exception y){
    JOptionPane.showMessageDialog(null,"Problem with your device.");
}

        }
        if (e.getSource() == coun) {
            try {
                Desktop.getDesktop().browse(new URL("https://sites.google.com/pleasantonusd.net/amadorhighschoolcounseling/home?pli=1&authuser=1").toURI());
            } catch (Exception n) {
                JOptionPane.showMessageDialog(null, "You are not connected to the internet or there is a problem with your device.");
            }

        }
        if(e.getSource()==talkToACounselorButton){
            counselors obj = new counselors();
            setContentPane(obj.stay);
            setVisible(true);

        }
    }


        public void screenSetup(){
            this.setVisible(true);
            setTitle("College Bot");
            //getting the screen size
            Dimension size = Toolkit.getDefaultToolkit().getScreenSize();

            // width will store the width of the screen
            int width = (int) size.getWidth();

            // height will store the height of the screen
            int height = (int) size.getHeight();
            setSize((int)(width /2.5) , (int) (height / 0.5));

        }
    }

