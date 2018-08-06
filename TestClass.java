package com.ems.test;

import java.io.IOException;

import com.ems.userInterface.UserInterface;

public class TestClass {

	public static void main(String[] args) {
		
		
		try {
			new UserInterface();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
