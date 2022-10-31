package com.event;

import java.awt.Button;
import java.awt.Frame;
import java.awt.TextField;

public class MyFrame extends Frame {
	TextField tf;

	MyFrame() {

		tf = new TextField();
		tf.setBounds(60, 50, 170, 20);

		Button b1 = new Button("submit");
		b1.setBounds(100, 100, 80, 30);

		// regester the listner
		Caller c1 = new Caller(this);

		b1.addActionListener(c1);
		add(b1);
		add(tf);

		setSize(500, 500);
		setLayout(null);
		setVisible(true);
	}

	public static void main(String[] args) {
		new MyFrame();
	}
}
