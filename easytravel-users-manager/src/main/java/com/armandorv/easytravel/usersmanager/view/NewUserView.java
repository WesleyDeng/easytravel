package com.armandorv.easytravel.usersmanager.view;

import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JComponent;

import org.jdesktop.swingx.JXButton;
import org.jdesktop.swingx.JXTitledPanel;
import org.springframework.stereotype.Component;
import com.armandorv.easytravel.usersmanager.presenter.NewUserPresenter;

/**
 * View for new users creation.
 * 
 * @author armandorv
 *
 */
@Component
public class NewUserView extends JXTitledPanel implements NewUserPresenter.View
{
   private static final long serialVersionUID = -6556915990176239794L;
  
   private static final String TITLE = "New User";

   private UserFieldsView fields = new UserFieldsView();
   
   private JXButton createButton = new JXButton("Create");
   
   public NewUserView()
   {
      super(TITLE);
      super.add(fields);
      
      Box horizontal = new Box(BoxLayout.X_AXIS);
      horizontal.add(createButton);
      fields.add(horizontal);
   }

   @Override
   public JComponent asComponent()
   {
      return this;
   }

   @Override
   public void setNewUser(ActionListener newUser)
   {
      createButton.addActionListener(newUser);
   }
   
   @Override
   public String getName()
   {
      return fields.getUName();
   }

   @Override
   public String getLastname1()
   {
      return fields.getLastname();
   }


   @Override
   public String getMail()
   {
      return fields.getMail();
   }

   @Override
   public String getUsername()
   {
      return fields.getUsername();
   }

   @Override
   public String getPassword()
   {
      return fields.getPassword();
   }

   @Override
   public void clear()
   {
      fields.setUsernmae("");
      fields.setPassword("");
      fields.setUName("");
      fields.setLastname("");
      fields.setMail("");
   }

}
