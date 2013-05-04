package com.armandorv.easytravel.usersmanager;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.armandorv.easytravel.usersmanager.presenter.ErrorPresenter;
import com.armandorv.easytravel.usersmanager.util.HttpUtils;

/**
 * Class with the main method, create a Spring container and launch this
 * application.
 * 
 * @author armandorv
 * 
 */
public class Launcher {

	private static final String USERS_MANAGER_CONTEXT = "easytravel-users-manager-context.xml";

	/**
	 * Create the application context.
	 */
	public void launch() {

		if (HttpUtils.checkConnection()) {

			@SuppressWarnings("resource")
			ApplicationContext context = new ClassPathXmlApplicationContext(
					USERS_MANAGER_CONTEXT);
			AppLoader loader = context.getBean(AppLoader.class);
			loader.load();

		} else {
			new ErrorPresenter(new Exception("The ws can't be reached !!"),
					"Connection error", "The ws can't be reached !!")
					.present(null);
		}

	}

	public static void main(String[] args) {
		new Launcher().launch();
	}

}