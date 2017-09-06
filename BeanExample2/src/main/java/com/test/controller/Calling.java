package com.test.controller;

public class Calling {

	private String caller;
	private String receiver;

	public void setCaller(String name) {
		this.caller = name;
	}

	public void setReceiver(String name) {
		this.receiver = name;
	}

	public void telephone() {

		System.out.println("The name of the caller is  " + caller);
		System.out.println("The name of the receiver is " + receiver);

	}

}
