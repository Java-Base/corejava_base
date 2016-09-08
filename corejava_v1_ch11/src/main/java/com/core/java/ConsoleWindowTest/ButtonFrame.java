package com.core.java.ConsoleWindowTest;

import javax.swing.*;

/**
 * A frame with a button panel This code is identical to ButtonTest in chapter 8, except for the
 * logging in the actionPerformed method of the ColorAction class
 *
 * @auth Lian
 * @date 16/9/8
 */
class ButtonFrame extends JFrame {

	public static final int DEFAULT_WIDTH = 300;
	public static final int DEFAULT_HEIGHT = 200;

	public ButtonFrame() {
		setTitle("ButtonTest");
		setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);

		// add panel to frame

		ButtonPanel panel = new ButtonPanel();
		add(panel);
	}
}
