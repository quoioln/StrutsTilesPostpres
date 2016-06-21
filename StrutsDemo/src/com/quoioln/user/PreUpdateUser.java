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
public class PreUpdateUser extends ActionSupport {
//	private int accountId;
	private Account account;
	public String execute() {
		Map session = ActionContext.getContext().getSession();
		int accountId = (Integer) session.get("accountIdPreUpdate");
		
		AccountDAO accountDAO = new AccountDAO();
		account = accountDAO.getAccount(accountId);
		session.put("accountUpdate", account);
		if (account == null) {
			return ERROR;
		}
		return SUCCESS;
	}
	/**
	 * @return the account
	 */
	public final Account getAccount() {
		return account;
	}
	/**
	 * @param account the account to set
	 */
	public final void setAccount(Account account) {
		this.account = account;
	}	
	
	
}
