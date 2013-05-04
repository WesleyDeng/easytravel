package com.armandorv.easytravel.usersmanager.view;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JPasswordField;

import org.jdesktop.swingx.JXLabel;
import org.jdesktop.swingx.JXTaskPaneContainer;
import org.jdesktop.swingx.JXTextField;

/**
 * View class with fields related with a user.
 * 
 * @author armandorv
 * 
 */
public class UserFieldsView extends JXTaskPaneContainer {
	private static final long serialVersionUID = -8681369064718984430L;

	protected Box usernameRow = new Box(BoxLayout.X_AXIS);

	protected Box passwordRow = new Box(BoxLayout.X_AXIS);

	protected Box nameRow = new Box(BoxLayout.X_AXIS);

	protected Box lastNameRow = new Box(BoxLayout.X_AXIS);

	protected Box mailRow = new Box(BoxLayout.X_AXIS);

	/* ******************* Form fields *************** */

	private JXLabel username = new JXLabel(get("Username :", 14));

	private JXTextField usernameField = new JXTextField();

	private JXLabel password = new JXLabel(get("Password :", 14));

	private JPasswordField passwordField = new JPasswordField();

	private JXLabel name = new JXLabel(get("Name :", 14));

	private JXTextField nameField = new JXTextField();

	private JXLabel lastname = new JXLabel(get("Lastname :", 14));

	private JXTextField lastnameField = new JXTextField();

	private JXLabel mail = new JXLabel(get("Mail :", 16));

	private JXTextField mailField = new JXTextField();

	public UserFieldsView() {
		super.add(usernameRow);
		super.add(passwordRow);
		super.add(nameRow);
		super.add(lastNameRow);
		super.add(mailRow);

		usernameRow.add(username);
		usernameRow.add(usernameField);

		passwordRow.add(password);
		passwordRow.add(passwordField);

		nameRow.add(name);
		nameRow.add(nameField);

		lastNameRow.add(lastname);
		lastNameRow.add(lastnameField);

		mailRow.add(mail);
		mailRow.add(mailField);
	}

	private String get(String string, int length) {
		String ret = string;
		for (int i = string.length(); i < length; i++) {
			ret += "  ";
		}
		return "  " + ret;
	}

	public void setUName(String name) {
		this.nameField.setText(name);
	}

	public String getUName() {
		return this.nameField.getText();
	}

	public void setLastname(String lastname) {
		this.lastnameField.setText(lastname);
	}

	public String getLastname() {
		return this.lastnameField.getText();
	}

	public void setMail(String mail) {
		this.mailField.setText(mail);
	}

	public String getMail() {
		return this.mailField.getText();
	}

	public String getUsername() {
		return usernameField.getText();
	}

	@SuppressWarnings("deprecation")
	public String getPassword() {
		return passwordField.getText();
	}

	public void setUsernmae(String string) {
		this.usernameField.setText("");
	}

	public void setPassword(String string) {
		this.passwordField.setText("");
	}

}