package com.core.java.LocalInnerClassTest;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

/**
 * A clock that prints the time in regular intervals
 *
 * @author 	Lian
 * @date 	16/9/7
 * @since 	1.0
 */
public class TalkingClock {

	/**
	 * Start the clock
	 *
	 * @param interval
	 * @param beep
	 */
	public void start(int interval, final boolean beep) {

		class TimePrinter implements ActionListener {

			@Override
			public void actionPerformed(ActionEvent event) {
				Date now = new Date();
				System.out.println("At the tone, the time is " + now);
				if (beep) {
					Toolkit.getDefaultToolkit().beep();
				}
			}
		}

		ActionListener listener = new TimePrinter();
		Timer t = new Timer(interval, listener);

		t.start();
	}
}
