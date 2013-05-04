package com.armandorv.easytravel.usersmanager.presenter;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.swing.JComponent;
import javax.swing.JOptionPane;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.armandorv.easytravel.usersmanager.view.UserDetailsView;
import com.armandorv.easytravel.userswsclient.UsersService;
import com.armandorv.easytravel.userswsclient.exception.UsersException;
import com.armandorv.easytravel.userswsclient.model.UserDetails;

/*
 * Presenter for the ListUsersView, get all users and set it into the view.
 */
@Component
public class ListUsersPresenter implements Presenter {

	public interface View {
		JComponent asComponent();

		void setUsers(List<UserDetails> users);

		void setDeleteUser(ActionListener deleteUser);

		void setUserDetails(ActionListener showDetails);

		UserDetails getSelected();
	}

	@Autowired
	private View view;

	@Autowired
	private UsersService usersService;

	@PostConstruct
	public void postConstruct() {
		view.setUserDetails(details());
		view.setDeleteUser(delete());
	}

	@Override
	public void present(Container container) {
		try {
			view.setUsers(usersService.getUsers(10));
		} catch (UsersException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		container.add(view.asComponent());
	}

	private ActionListener delete() {
		return new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent event) {

				if (JOptionPane.showConfirmDialog(view.asComponent(),
						"are you sure") == JOptionPane.YES_OPTION) {
					try {

						usersService.deleteUser(view.getSelected().getId());

						JOptionPane.showMessageDialog(view.asComponent(),
								"User " + view.getSelected().getName()
										+ " deleted.", "Success",
								JOptionPane.INFORMATION_MESSAGE);

						view.setUsers(usersService.getUsers(10));

					} catch (Exception e) {
						new ErrorPresenter(e, "Error deleting user.", "Error")
								.present(view.asComponent());
					}
				}
			}
		};
	}

	private ActionListener details() {
		return new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				UserDetailsView details = new UserDetailsView();
				details.setUser(view.getSelected());
				details.setVisible(true);
			}
		};
	}
}
