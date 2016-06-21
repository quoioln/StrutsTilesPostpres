package com.quoioln.user;

import com.opensymphony.xwork2.ActionSupport;
import com.quoioln.dao.AccountDAO;
import com.quoioln.model.Account;

/**
 * @author vpquoi
 *
 */
public class AddUser extends ActionSupport {
	private String userName;
	private String password;
	private String rePassword;
	private String fullName;
	private String phone;
	private String email;
//	private String error;
	public String execute() {
		AccountDAO accountDAO = new AccountDAO();
		Account accountCheck = accountDAO.getAccountByUserName(userName);
		if (accountCheck == null) {
			Account account = new Account(userName, password, fullName, phone, email);
			accountDAO.addAccount(account);
		} else {
			addFieldError("error", "Account already exists");
			return INPUT;
		}
		return SUCCESS;
	}

	@Override
	public void validate() {
		validateFullName(fullName);
		validateUserName(userName);
		validatePassword(password);
		validateRePassword(rePassword);
		validatePhone(phone);
		validateEmail(email);
		
	}
	public void validateFullName(String fullName) {
		if (fullName == null)
			addFieldError("fullName", "");
		else if (fullName.length() == 0)
			addFieldError("fullName", "Full name is required");
	}
	public void validateUserName(String userName) {
		if (userName == null)
			addFieldError("userName", "");
		else if (userName.length() == 0)
			addFieldError("userName", "User name is required");
	}
	public void validatePassword(String password) {
		if (password == null)
			addFieldError("password", "");
		else if (password.length() == 0)
			addFieldError("password", "Password is required");
	}
	public void validateRePassword(String rePassword) {
		if (rePassword == null) 
			addFieldError("rePassword", "");
		else if (rePassword.length() == 0)
			addFieldError("rePassword", "Re-password is required");
		else if (!rePassword.equals(password))
			addFieldError("rePassword", "Re-password invalid");
	}
	public void validateEmail(String email) {
		String regex = "^[\\w]+@+[\\w]+(\\.\\w+)+";
		if (email == null)
			addFieldError("email", "");
		else if (email.length() == 0)
			addFieldError("email", "Email is required");
		else if (!email.matches(regex))
			addFieldError("email", "Email is invalid");
	}
	public void validatePhone(String phoneNum) {
		String regex = "^[+\\d{3}|0]\\d{9,11}";
		if (phoneNum == null)
			addFieldError("phoneNum", "");
		else if (phoneNum.length() == 0)
			addFieldError("phoneNum", "Phone is required");
		else if (!phoneNum.matches(regex))
			addFieldError("phoneNum", "Phone number is invalid");
	}

	/**
	 * @return the userName
	 */
	public final String getUserName() {
		return userName;
	}

	/**
	 * @param userName the userName to set
	 */
	public final void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * @return the password
	 */
	public final String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public final void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the rePassword
	 */
	public final String getRePassword() {
		return rePassword;
	}

	/**
	 * @param rePassword the rePassword to set
	 */
	public final void setRePassword(String rePassword) {
		this.rePassword = rePassword;
	}

	/**
	 * @return the fullName
	 */
	public final String getFullName() {
		return fullName;
	}

	/**
	 * @param fullName the fullName to set
	 */
	public final void setFullName(String fullName) {
		this.fullName = fullName;
	}

	/**
	 * @return the phone
	 */
	public final String getPhone() {
		return phone;
	}

	/**
	 * @param phone the phone to set
	 */
	public final void setPhone(String phone) {
		this.phone = phone;
	}

	/**
	 * @return the email
	 */
	public final String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public final void setEmail(String email) {
		this.email = email;
	}
	
	
}
