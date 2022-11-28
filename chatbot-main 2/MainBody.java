import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.TimeUnit;

import javax.swing.*;

class Chatbot extends JFrame {
    private JTextArea ca = new JTextArea();
    private JTextField cf = new JTextField();
    private JButton b = new JButton();
    private JLabel l = new JLabel();

    private JLabel n = new JLabel();

    Chatbot() {                                                // Layout and Properties defined in Constructer

        JFrame f = new JFrame();
        f.setDefaultCloseOperation(EXIT_ON_CLOSE);
        f.setVisible(true);
//        f.setResizable(false);
        f.setLayout(null);
        f.setSize(400, 400);
        f.getContentPane().setBackground(Color.black);
        f.setTitle("SpongeBot");
        f.add(ca);
        f.add(cf);
        ca.setSize(398, 310);
        ca.setLocation(1, 1);
        ca.setBackground(Color.BLACK);

        cf.setSize(300, 20);
        cf.setLocation(1, 320);
        f.add(b);
        l.setText("send");
        b.add(l);
        b.setSize(400, 20);
        b.setLocation(300, 320);
        greeting();
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int count = 0;
                if (e.getSource() == b) {                           // Message sents on Click button

                    String text = cf.getText().toLowerCase();
                    ca.setForeground(Color.WHITE);
                    ca.append("You-->" + text + "\n");
                    cf.setText("");
                    //starts :)


                    if(text.equals("1")){
                        while(text.equals("1")){
                            replyMeth("r");
                            count++;
                            break;
                        }
                    }else if(text.equals("2")){
                        while(text.equals("2")){
                            replyMeth("2");
                            break;
                        }
                    }else if(text.equals("3")){
                        while(text.equals("3")){
                            replyMeth("2");
                            break;
                        }
                    }else if(text.equals("4")){
                        while(text.equals("4")){
                            replyMeth("2");
                            break;
                        }
                    }else{
                        while(!(text.equals("1")||text.equals("2")||text.equals("3")||text.equals("4"))){
                            replyMeth(getRandomResponse());
                            break;
                        }
                    }





                }

            }

        });
    }
    public void replyMeth(String s) {                          // Reply Method
        ca.append("College Bot-->"+s+"\n");

    }
    public void greeting() {
        ca.setForeground(Color.WHITE);// Reply Method
        ca.append("Welcome to the College Bot interface!\n");
        ca.append("Hello"  + " ,welcome to CollegeBot, \nWhat is your question about?\n1. Graduation requirements\n2. Community College\n3. UC Requirements\n4. Grades and Transcripts");


    }
    public static String getRandomResponse()
    {

        String[] randomResponses = {"Sorry, could you repeat that?","Did you spell everything correctly?","Sorry, please try again.","Be more specific.","Make sure to spell everything correctly."};
        int choice = (int) (Math.random() * randomResponses.length);

        return randomResponses[choice];
    }
    public static void slowPrint(String output) {
        for (int i = 0; i<output.length(); i++) {
            char c = output.charAt(i);
            System.out.print(c);
            try {
                TimeUnit.MILLISECONDS.sleep(50);
            }
            catch (Exception e) {

            }
        }
    }
    public static void main(String[]args){
        Chatbot id = new Chatbot();
    }
}