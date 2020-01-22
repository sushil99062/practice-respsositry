import javax.swing.*;
import java.awt.*;

class MyFrame1
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
  con.setBackground(Color.RED);
}
}