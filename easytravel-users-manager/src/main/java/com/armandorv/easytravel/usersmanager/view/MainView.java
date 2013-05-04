package com.armandorv.easytravel.usersmanager.view;

import java.awt.BorderLayout;
import java.awt.Component;

import javax.swing.JComponent;
import javax.swing.JScrollPane;

import org.jdesktop.application.Action;
import org.jdesktop.application.Application;
import org.jdesktop.application.ApplicationActionMap;
import org.jdesktop.application.ApplicationContext;
import org.jdesktop.swingx.JXDialog;
import org.jdesktop.swingx.JXPanel;
import org.jdesktop.swingx.JXTaskPane;
import org.jdesktop.swingx.JXTaskPaneContainer;

import com.armandorv.easytravel.usersmanager.presenter.ActionExecution;
import com.armandorv.easytravel.usersmanager.presenter.MainPresenter;

/**
 * View that show a task panel for users an another for project, and change the central content 
 * dependes on selected task.
 * 
 * @author armandorv
 *
 */
@org.springframework.stereotype.Component
public class MainView extends JXPanel implements MainPresenter.View
{
   private static final long serialVersionUID = -2194252038604033610L;

   private JXTaskPaneContainer taskPaneContainer;

   private JXTaskPane usersTaskPane;

   private ActionExecution listUsers;

   private ActionExecution newUser;

   public MainView()
   {
      super(new BorderLayout());
      taskPaneContainer = new JXTaskPaneContainer();

      usersTaskPane = new JXTaskPane();
      usersTaskPane.setTitle("Options");

      taskPaneContainer.add(usersTaskPane);

      this.bind();
      super.add(new JScrollPane(taskPaneContainer));
   }

   public Component add(Component componenet)
   {
      if (taskPaneContainer.getComponentCount() == 2)
      {
         if (!(componenet instanceof JXDialog))
            taskPaneContainer.remove(1);
      }
      taskPaneContainer.add(componenet);
      taskPaneContainer.updateUI();

      return this;
   }

   private void bind()
   {
      ApplicationContext context = Application.getInstance().getContext();
      context.getResourceMap(getClass()).injectComponents(this);

      ApplicationActionMap map = context.getActionMap(this);
      
      usersTaskPane.add(map.get("Users List"));
      usersTaskPane.add(map.get("New User"));
   }

   @Action(name="Users List")
   public void listUsers()
   {
      listUsers.execute();
   }

   @Action(name="New User")
   public void newUser()
   {
      newUser.execute();
   }

   @Override
   public JComponent asComponent()
   {
      return this;
   }

   @Override
   public void setListUsersActionExecution(ActionExecution listUsers)
   {
      this.listUsers = listUsers;
   }

   @Override
   public void setNewUserActionExecution(ActionExecution newUser)
   {
      this.newUser = newUser;
   }

}