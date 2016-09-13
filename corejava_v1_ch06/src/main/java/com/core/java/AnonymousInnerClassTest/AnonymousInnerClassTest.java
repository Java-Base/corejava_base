package com.core.java.AnonymousInnerClassTest;

import javax.swing.*;

/**
 * This program demonstrates anonymous inner classes.
 *
 * @auth Lian
 * @date 16/9/7
 */
public class AnonymousInnerClassTest {

	public static void main(String[] args) {
		TalkingClock clock = new TalkingClock();
		clock.start(1000, true);

		// keep program running until user selects "Ok"
		JOptionPane.showMessageDialog(null, "Quit program?");
		System.exit(0);
	}
}
