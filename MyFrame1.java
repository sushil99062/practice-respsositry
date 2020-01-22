import javax.swing.*;
import java.awt.*;

class Label
{
public static void  main(String args[])
{
 JFrame frame=new JFrame();
  frame.setVisible(true);
  frame.setSize(250,250);
  frame.setBounds(100,100,250,250);
  frame.setTitle("sushil");
  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  Container con=frame.getContentPane();
  con.setLayout(null);
  JLabel label=new JLabel("username");
  label.setBounds(100,50,100,30);
  label.setText("sushil");
  con.add(label);
  
}
}