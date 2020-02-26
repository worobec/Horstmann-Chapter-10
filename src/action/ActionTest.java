package action;

import java.awt.*;
import javax.swing.*;

public class ActionTest
{
   public static void main(String[] args)
   {
      EventQueue.invokeLater(() -> {
         JFrame frame = new ActionFrame();
         frame.setTitle("Bruce's Test");
         frame.setLocation(500,500);
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.setVisible(true);
      });
   }
}
