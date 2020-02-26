package button;

import java.awt.*;
import javax.swing.*;

public class ButtonTest
{
   public static void main(String[] args)
   {
      EventQueue.invokeLater(() -> {
         JFrame frame = new ButtonFrame();
         frame.setTitle("Bruce's Test");
         frame.setLocation(400,100);
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.setVisible(true);
      });
   }
}
