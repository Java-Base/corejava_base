package com.core.java.LoggingImageViewer;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * A modification of the image viewer program that logs various events.
 *
 * @author 	Lian
 * @date 	16/9/8
 * @since 	1.0
 */
public class LoggingImageViewer {

	public static void main(String[] args) {
		if (System.getProperty("java.util.logging.config.class") == null
				&& System.getProperty("java.util.logging.config.file") == null) {
			try {
				Logger.getLogger("com.horstmann.corejava").setLevel(Level.ALL);
				final int LOG_ROTATION_COUNT = 10;
				Handler handler = new FileHandler("%h/LoggingImageViewer.log", 0, LOG_ROTATION_COUNT);
				Logger.getLogger("com.horstmann.corejava").addHandler(handler);
			} catch (IOException e) {
				Logger.getLogger("com.horstmann.corejava").log(Level.SEVERE,
						"Can't create log file handler", e);
			}
		}

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				Handler windowHandler = new WindowHandler();
				windowHandler.setLevel(Level.ALL);
				Logger.getLogger("com.horstmann.corejava").addHandler(windowHandler);

				JFrame frame = new ImageViewerFrame();
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

				Logger.getLogger("com.horstmann.corejava").fine("Showing frame");
				frame.setVisible(true);
			}
		});
	}
}
