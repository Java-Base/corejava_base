package com.core.java.ExceptTest;

import javax.swing.*;

/**
 * A frame with a panel for testing various exceptions
 *
 * @author 	Lian
 * @date 	16/9/8
 * @since 	1.0
 */
class ExceptTestFrame extends JFrame {

	public ExceptTestFrame() {
		setTitle("ExceptTest");
		ExceptTestPanel panel = new ExceptTestPanel();
		add(panel);
		pack();
	}
}
