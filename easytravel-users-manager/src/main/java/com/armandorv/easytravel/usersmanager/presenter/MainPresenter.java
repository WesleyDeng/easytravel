package com.armandorv.easytravel.usersmanager.presenter;

import java.awt.Container;

import javax.annotation.PostConstruct;
import javax.swing.JComponent;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Presenter for global view of the application.
 * 
 * @author armandorv
 * 
 */
@Component
public class MainPresenter implements Presenter {

	public interface View {
		
		JComponent asComponent();

		void setListUsersActionExecution(ActionExecution execution);

		void setNewUserActionExecution(ActionExecution execution);
	}

	@Autowired
	private ListUsersPresenter listUsersPresenter;

	@Autowired
	private NewUserPresenter newUserPresenter;

	@Autowired
	private View view;

	@PostConstruct
	public void postConstruct() {
		view.setListUsersActionExecution(listUsers());
		view.setNewUserActionExecution(newUser());
	}

	@Override
	public void present(Container container) {
		container.add(view.asComponent());
		listUsersPresenter.present(view.asComponent());
		view.asComponent().updateUI();
	}

	public ActionExecution listUsers() {
		return new ActionExecution() {
			@Override
			public void execute() {
				listUsersPresenter.present(view.asComponent());
			}
		};
	}

	private ActionExecution newUser() {
		return new ActionExecution() {
			@Override
			public void execute() {
				newUserPresenter.present(view.asComponent());
			}
		};
	}

}