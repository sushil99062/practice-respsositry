import javax.swing.*;
import java.awt.*;

class Imageadding
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
 // con.setLayout(null);
  ImageIcon icon=new ImageIcon("back.jpg");
  JLabel label=new JLabel(icon);
  //label.setBounds(500,100,icon.getIconWidth(),icon.getIconHeight());
  con.add(label);
  //label.setLayout(new FlowLayout());
  frame.setSize(399,399);
	frame.setSize(400,400);
  
}
}