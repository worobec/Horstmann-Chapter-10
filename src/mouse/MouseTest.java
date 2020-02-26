package mouse;

import java.awt.*;
import javax.swing.*;

public class MouseTest
{
   public static void main(String[] args)
   {
      EventQueue.invokeLater(() -> {
         JFrame frame = new MouseFrame();
         frame.setTitle("Bruce's Test");
         frame.setLocation(400,200);
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.setVisible(true);
      });
   }
}
