package com.armandorv.easytravel.usersmanager.view.util;

import java.util.List;

import javax.swing.ListModel;
import javax.swing.event.ListDataListener;

import com.armandorv.easytravel.userswsclient.model.UserDetails;

/**
 * Swing list model for a list users.
 * 
 * @author armandorv
 *
 */
public class UsersListModel implements ListModel<UserDetails>
{
   private List<UserDetails> users;
   
   public UsersListModel(List<UserDetails> users)
   {
      super();
      this.users = users;
   }

   @Override
   public int getSize()
   {
      return users.size();
   }

   @Override
   public UserDetails getElementAt(int index)
   {
      return users.get(index);
   }

   @Override
   public void addListDataListener(ListDataListener l)
   {
     
   }

   @Override
   public void removeListDataListener(ListDataListener l)
   {
      
   }

}
