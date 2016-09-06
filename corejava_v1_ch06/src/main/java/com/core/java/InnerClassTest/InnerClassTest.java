package com.core.java.InnerClassTest;

import javax.swing.*;

/**
 * @auth Lian
 * @date 16/9/6
 */
public class InnerClassTest {

	public static void main(String[] args) {

		TalkingClock clock = new TalkingClock(1000, true);
		clock.start();

		// keep program running until user selects "OK"
		JOptionPane.showMessageDialog(null, "Quit program?");
		System.exit(0);
	}
}
