package com.core.java.InnerClassTest;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

/**
 * A clock that prints the time in regular intervals
 *
 * @auth Lian
 * @date 16/9/6
 */
class TalkingClock {

	private int interval;
	private boolean beep;

	/**
	 * Constructs a talking clock
	 *
	 * @param interval	the interval between messages (in milliseconds)
	 * @param beep		true if the clock should beep
	 */
	public TalkingClock(int interval, boolean beep) {
		this.interval = interval;
		this.beep = beep;
	}

	/**
	 * start the clock.
	 */
	public void start() {
		ActionListener listener = new TimerPrinter();
		Timer t = new Timer(interval, listener);
		t.start();
	}

	public class TimerPrinter implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent event) {
			Date now = new Date();
			System.out.println("At the tone, the time is " + now);
			if (beep) {
				Toolkit.getDefaultToolkit().beep();
			}

		}
	}
}
