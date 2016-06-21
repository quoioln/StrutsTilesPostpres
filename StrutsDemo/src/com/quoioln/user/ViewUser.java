package com.quoioln.user;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

/**
 * @author vpquoi
 *
 */
public class ViewUser extends ActionSupport{
	private int action;
	private int accountId;
	public String execute() {
		System.out.println("action = " + action);;
		System.out.println("account id = " + accountId);
		Map<String, Object> seesion = ActionContext.getContext().getSession();
		switch (action) {
			case 0:
				return "view";
			case 1:
				return "add";
			case 2:
				seesion.put("accountIdPreUpdate", accountId);
				return "preUpdate";
			case 3:
				seesion.put("accountId", accountId);
				return "delete";
			default:
				return "input";
		}
		
	}
	/**
	 * @return the action
	 */
	public final int getAction() {
		return action;
	}
	/**
	 * @param action the action to set
	 */
	public final void setAction(int action) {
		this.action = action;
	}
	/**
	 * @return the accountId
	 */
	public final int getAccountId() {
		return accountId;
	}
	/**
	 * @param accountId the accountId to set
	 */
	public final void setAccountId(int accountId) {
		this.accountId = accountId;
	}
	
	
}
