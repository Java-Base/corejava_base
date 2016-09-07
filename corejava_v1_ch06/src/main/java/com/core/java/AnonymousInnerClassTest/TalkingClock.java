package com.core.java.AnonymousInnerClassTest;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

/**
 * A clock that prints the time in regular intervals
 *
 * @auth Lian
 * @date 16/9/7
 */
class TalkingClock {

	/**
	 * Start the clock
	 *
	 * @param interval	the interval between messages(in milliseconds)
	 * @param beep		true if the clock should beep
	 */
	public void start(int interval, final boolean beep) {

		ActionListener listener = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Date now = new Date();
				System.out.println("At the tone, the time is " + now);
				if (beep) {
					Toolkit.getDefaultToolkit().beep();
				}
			}
		};

		Timer t = new Timer(interval, listener);
		t.start();
	}
}
