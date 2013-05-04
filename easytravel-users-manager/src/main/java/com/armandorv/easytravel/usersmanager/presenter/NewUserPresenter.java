package com.armandorv.easytravel.usersmanager.presenter;

import java.awt.Container;
import java.awt.event.ActionListener;

import javax.annotation.PostConstruct;
import javax.swing.JComponent;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.armandorv.easytravel.usersmanager.presenter.listener.CreateUserActionListener;

/**
 * Presenter for the new user creation view.
 * 
 * @author armandorv
 *
 */
@Component
public class NewUserPresenter implements Presenter
{
   public interface View
   {
      JComponent asComponent();

      void setNewUser(ActionListener newUser);

      String getUsername();

      String getPassword();

      String getName();

      String getLastname1();

      String getMail();

      void clear();
   }

   @Autowired
   private View view;

   @Autowired
   private CreateUserActionListener createUserActionListener;

   @PostConstruct
   public void postConstruct()
   {
      view.setNewUser(createUserActionListener);
   }

   @Override
   public void present(Container container)
   {
      view.clear();
      container.add(view.asComponent());
   }

}