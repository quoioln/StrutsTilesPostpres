/**
 * 
 */
package com.quoioln.user;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.quoioln.dao.AccountDAO;
import com.quoioln.model.Account;

/**
 * @author vpquoi
 *
 */
public class LoadUser extends ActionSupport {
	private List<Account> accountList;
	
	public String execute() {
		AccountDAO accountDAO = new AccountDAO();
		accountList = accountDAO.getAllAccount();
		return SUCCESS;
	}

	/**
	 * @return the accountList
	 */
	public final List<Account> getAccountList() {
		return accountList;
	}

	/**
	 * @param accountList the accountList to set
	 */
	public final void setAccountList(List<Account> accountList) {
		this.accountList = accountList;
	}
	
	
}
