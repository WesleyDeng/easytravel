package com.armandorv.easytravel.usersmanager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.armandorv.easytravel.usersmanager.presenter.MainPresenter;
import com.armandorv.easytravel.usersmanager.view.BaseFrame;

@Component
public class AppLoader {

	@Autowired
	private BaseFrame baseFrame;

	@Autowired
	private MainPresenter mainPresenter;

	public void load() {
		mainPresenter.present(baseFrame.getContentPane());
	}
}