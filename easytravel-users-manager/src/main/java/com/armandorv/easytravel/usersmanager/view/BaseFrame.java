package com.armandorv.easytravel.usersmanager.view;

import java.awt.Dimension;

import javax.swing.JFrame;

import org.jdesktop.swingx.JXFrame;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Frame of the application.
 * 
 * @author armandorv
 *
 */
@Component
public class BaseFrame extends JXFrame
{
   private static final long serialVersionUID = 1449805199962516234L;
   
   @Value("$app{app.baseframe.title}")
   private String title;
   
   public BaseFrame()
   {
      super();
      this.setTitle(title);
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      this.setPreferredSize(new Dimension(600, 440));
      this.pack();
      this.setLocationRelativeTo(null);
      this.setResizable(false);
      this.setVisible(true);
   }

}