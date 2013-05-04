package com.armandorv.easytravel.usersmanager.view.util;

import com.armandorv.easytravel.userswsclient.model.UserDetails;

/**
 * String value for a cell of a users based list.
 * 
 * @author armandorv
 *
 */
public class UserStringValue extends GenericStringValue<UserDetails>
{
   private static final long serialVersionUID = -240248007345168771L;

   @Override
   public String getValue(UserDetails value)
   {
      return value.getName() + " " + value.getLastname();
   }

}
