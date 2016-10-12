package com.core.java.EventTracerTest;

import javax.swing.*;
import java.awt.*;

/**
 * @author 	Lian
 * @date 	16/9/8
 * @since 	1.0
 */
public class EventTracerTest {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				JFrame frame = new EventTracerFrame();
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setVisible(true);
			}
		});
	}
}
