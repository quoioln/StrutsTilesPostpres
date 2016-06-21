package com.quoioln.user;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.quoioln.dao.AccountDAO;
import com.quoioln.model.Account;

/**
 * @author vpquoi
 *
 */
public class UpdateUser extends ActionSupport {
	private int accountId;
	private String userName;
	private String fullName;
	private String phone;
	private String email;
	public String execute() {
		Map session = ActionContext.getContext().getSession();
		Account account = (Account) session.get("accountUpdate");
		AccountDAO accountDAO = new AccountDAO();
		if (account == null) {
			return ERROR;
		}
		account.setFullName(fullName);
		account.setPhone(phone);
		account.setEmail(email);
		accountDAO.updateAccount(account);
		System.out.println("update success");;
		return SUCCESS;
	}

	@Override
	public void validate() {
		System.out.println(userName);
		System.out.println(fullName);
		System.out.println(phone);
		System.out.println(email);
		
		validateFullName(fullName);
//		validateUserName(userName);
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
