package com.armandorv.easytravel.usersmanager.presenter.listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.armandorv.easytravel.usersmanager.presenter.ErrorPresenter;
import com.armandorv.easytravel.usersmanager.presenter.NewUserPresenter;
import com.armandorv.easytravel.userswsclient.UsersService;
import com.armandorv.easytravel.userswsclient.model.UserDetails;

/**
 * Create a user getting info from a pre set view.
 * 
 * @author armandorv
 * 
 */
@Component
public class CreateUserActionListener implements ActionListener {

	@Autowired
	private NewUserPresenter.View view;

	@Autowired
	private UsersService usersService;

	public void actionPerformed(ActionEvent event) {
		if (validate()) {

			UserDetails user = null;

			try {
				usersService.newUser(user);

				view.clear();

				JOptionPane.showMessageDialog(view.asComponent(),
						"User  created.", "Success",
						JOptionPane.INFORMATION_MESSAGE);

			} catch (Exception e) {
				new ErrorPresenter(e, "Error creating user", "ERROR",
						"May be user is already into the system.").present(view
						.asComponent());
			}

		} else {
			JOptionPane.showMessageDialog(view.asComponent(),
					"All fields are required.", "Error",
					JOptionPane.ERROR_MESSAGE);
		}
	}

	private boolean validate() {

		if ("".equals(view.getUsername())) {
			return false;
		}

		if ("".equals(view.getPassword())) {
			return false;
		}

		if ("".equals(view.getLastname1())) {
			return false;
		}
		if ("".equals(view.getName())) {
			return true;
		}

		if ("".equals(view.getMail())) {
			return false;
		}

		return true;
	}

}