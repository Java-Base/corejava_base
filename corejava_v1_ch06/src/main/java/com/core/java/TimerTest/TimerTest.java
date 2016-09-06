package com.core.java.TimerTest;

import javax.swing.*;
import java.awt.event.ActionListener;

/**
 * This program demonstrates interface and callback
 *
 * @auth Lian
 * @date 16/9/6
 */
public class TimerTest {

	public static void main(String[] args) {
		ActionListener listener = new TimePrinter();

		// construct a timer that calls the listener
		// once every 10 seconds
		Timer t = new Timer(10000, listener);
		t.start();

		JOptionPane.showMessageDialog(null, "Quit program?");
		System.exit(0);
	}
}
