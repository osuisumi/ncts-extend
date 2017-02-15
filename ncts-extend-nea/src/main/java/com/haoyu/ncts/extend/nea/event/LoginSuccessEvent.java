package com.haoyu.ncts.extend.nea.event;

import org.springframework.context.ApplicationEvent;

public class LoginSuccessEvent extends ApplicationEvent{

	private static final long serialVersionUID = 6847923295648899317L;

	public LoginSuccessEvent(Object source) {
		super(source);
	}

}
