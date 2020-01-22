import javax.swing.*;
import java.awt.*;

class Textfield
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
  
  JPasswordField p1=new JPasswordField();
  p1.setBounds(100,20,200,40);
  
  con.add(p1);
  Color c=new Color(123,100,200);
  p1.setBackground(c);
  p1.setForeground(Color.RED);
  
}
}