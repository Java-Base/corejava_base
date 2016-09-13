package com.core.java.LoggingImageViewer;

import javax.swing.*;
import java.io.OutputStream;
import java.util.logging.LogRecord;
import java.util.logging.StreamHandler;

/**
 * A handler for displaying log records in a window.
 *
 * @auth Lian
 * @date 16/9/8
 */
class WindowHandler extends StreamHandler {

	private JFrame frame;

	public WindowHandler() {
		frame = new JFrame();
		final JTextArea output = new JTextArea();
		output.setEditable(false);
		frame.setSize(200, 200);
		frame.add(new JScrollPane(output));
		frame.setFocusableWindowState(false);
		frame.setVisible(true);
		setOutputStream(new OutputStream() {
			public void write(int b) {
			} // not called

			public void write(byte[] b, int off, int len) {
				output.append(new String(b, off, len));
			}
		});
	}

	public void publish(LogRecord record) {
		if (!frame.isVisible()) return;
		super.publish(record);
		flush();
	}

}
