// Student: Griffin Gowdey.
// Instructor: Daniel Goodman.
// Class Number: ITSE1479-86039.
// Class Name: Java Programming.
// Semester: Fall 2020.
// Lesson 20: Part 1.

/*
Assignment:
Write an application with three buttons labeled “Red”, “Green”, 
and “Blue” that changes the background color of a panel in the 
center of the frame to red, green, or blue. 
*/

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Lesson20Part1
{
   public class ThreeColorsFrame extends JFrame
   {
      private static final long serialVersionUID = 1L;
      private JPanel colorPanel;
      private static final int FRAME_WIDTH = 300;
      private static final int FRAME_HEIGHT = 300;

      public ThreeColorsFrame()
      {
         setSize(FRAME_WIDTH, FRAME_HEIGHT);
         colorPanel = new JPanel();
         add(colorPanel, BorderLayout.CENTER);

         createControlPanel();
      }

      /* Creates the control panel with buttons at the bottom 
      of the frame.*/
      private void createControlPanel()
      {
         JPanel southPanel = new JPanel();
         southPanel.add(makeButton("Red", Color.RED));
         southPanel.add(makeButton("Green", Color.GREEN));
         southPanel.add(makeButton("Blue", Color.BLUE));

         add(southPanel, BorderLayout.SOUTH);
      }

      /*
         Makes a button to change the color of the panel.
         @param label the button label.
         @param color the color to set.
         @return the button to change the color of the panel.
      */
      public JButton makeButton(String label, final Color color)
      {
         JButton button = new JButton(label);

         class ButtonListener implements ActionListener
         {
            public void actionPerformed(ActionEvent event)
            {
               colorPanel.setBackground(color);
            }
         }

         ButtonListener listener = new ButtonListener();
         button.addActionListener(listener);
         return button;
      }
   }
}