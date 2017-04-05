package com.action;

import com.opensymphony.xwork2.ActionSupport;

public class UserAction extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public String execute() throws Exception{
		addActionError("the first error!");
		addActionError("the second error!");
		addActionMessage("the first error!");
		addActionMessage("the second error!");
		addFieldError("f1","the first error!");
		addFieldError("f2","the second error!");
		return SUCCESS;
	}
}
