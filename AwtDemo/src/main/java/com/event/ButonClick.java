package com.event;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButonClick {
	public static void main(String[] args) {

		Frame f1 = new Frame("Button Example");

		TextField tx = new TextField();
		tx.setBounds(60, 50, 170, 20);
		Button b1 = new Button("Submit");
		b1.setBounds(100, 100, 80, 30);
		b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				tx.setText("Welcome to Java");
				f1.setBackground(Color.DARK_GRAY);

			}
		});

		f1.add(tx);
		f1.add(b1);

		f1.setSize(500, 500);
		f1.setLayout(null);
		f1.setVisible(true);
	}
}
