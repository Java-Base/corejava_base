package com.core.java.ExceptTest;

import javax.swing.*;
import java.awt.*;

/**
 * @auth Lian
 * @date 16/9/8
 */
public class ExceptTest {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				ExceptTestFrame frame = new ExceptTestFrame();
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setVisible(true);
			}
		});
	}
}
