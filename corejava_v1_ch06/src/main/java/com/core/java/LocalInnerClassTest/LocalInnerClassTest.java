package com.core.java.LocalInnerClassTest;

import javax.swing.*;

/**
 * This program demonstrates the use of local inner classes
 *
 * @author 	Lian
 * @date 	16/9/7
 * @since 	1.0
 */
public class LocalInnerClassTest {

	public static void main(String[] args) {
		TalkingClock clock = new TalkingClock();
		clock.start(1000, true);

		// keep program running until user select "Ok"
		JOptionPane.showMessageDialog(null, "Quit program?");
		System.exit(0);
	}
}
