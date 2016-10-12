package com.core.java.EventTracerTest;

import javax.swing.*;
import java.awt.*;

/**
 * @author 	Lian
 * @date 	16/9/8
 * @since 	1.0
 */
class EventTracerFrame extends JFrame {

	public static final int DEFAULT_WIDTH = 400;
	public static final int DEFAULT_HEIGHT = 400;

	public EventTracerFrame() {
		setTitle("EventTracerTest");
		setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);

		// add a slider and a button
		add(new JSlider(), BorderLayout.NORTH);
		add(new JButton("Test"), BorderLayout.SOUTH);

		// trap all events of components inside the frame
		EventTracer tracer = new EventTracer();
		tracer.add(this);
	}
}
