package com.core.java.ConsoleWindowTest;

import javax.swing.*;
import java.awt.*;

/**
 * @auth Lian
 * @date 16/9/8
 */
public class ConsoleWindowTest {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				// this is the button test program from chapter 8
				ButtonFrame frame = new ButtonFrame();
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setVisible(true);

				// initialize the console window--System.out will show here
				ConsoleWindow.init();
			}
		});
	}
}
