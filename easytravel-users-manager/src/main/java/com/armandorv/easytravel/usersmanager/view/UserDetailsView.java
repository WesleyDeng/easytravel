package com.armandorv.easytravel.usersmanager.view;

import javax.swing.JDialog;
import javax.swing.JScrollPane;

import com.armandorv.easytravel.userswsclient.model.UserDetails;

/**
 * View that hold details of any user.
 * 
 * @author armandorv
 * 
 */
public class UserDetailsView extends JDialog {

	private static final long serialVersionUID = -6388016265486842813L;

	private UserFieldsView fields = new UserFieldsView();

	public UserDetailsView() {
		super();
		super.add(new JScrollPane(fields));
		super.setModal(true);
		super.setSize(400, 300);
		super.setTitle("User Details");
	}

	public void setUser(UserDetails user) {
		fields.setUsernmae(user.getUsername());
		fields.setUName(user.getName());
		fields.setLastname(user.getLastname());
		fields.setMail(user.getMail());
		fields.setPassword(user.getPassword());
	}

}
