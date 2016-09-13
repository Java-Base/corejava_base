package com.core.java.ConsoleWindowTest;

import javax.swing.*;
import java.io.OutputStream;
import java.io.PrintStream;

/**
 * A window that displays the bytes sent to System.out and System.err
 *
 * @auth Lian
 * @date 16/9/8
 */
public class ConsoleWindow {

	public static final int DEFAULT_WIDTH = 300;
	public static final int DEFAULT_HEIGHT = 200;
	public static final int DEFAULT_LEFT = 200;
	public static final int DEFAULT_TOP = 200;

	public static void init() {
		JFrame frame = new JFrame();
		frame.setTitle("ConsoleWindow");
		final JTextArea output = new JTextArea();
		output.setEditable(false);
		frame.add(new JScrollPane(output));
		frame.setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
		frame.setLocation(DEFAULT_LEFT, DEFAULT_TOP);
		frame.setFocusableWindowState(false);
		frame.setVisible(true);

		// define a PrintStream that sends its bytes to the output text area
		PrintStream consoleStream = new PrintStream(
			new OutputStream() {
				public void write(int b) {
				} // never called

				public void write(byte[] b, int off, int len) {
					output.append(new String(b, off, len));
				}
			});

		// set both System.out and System.err to that stream
		System.setOut(consoleStream);
		System.setErr(consoleStream);
	}


}
