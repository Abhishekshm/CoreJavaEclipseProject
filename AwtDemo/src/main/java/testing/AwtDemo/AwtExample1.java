package testing.AwtDemo;

import java.awt.Button;
import java.awt.Frame;
import java.awt.HeadlessException;
import java.awt.Label;
import java.awt.TextField;

public class AwtExample1 extends Frame {

	// Deflaut Constructor
	public AwtExample1() throws HeadlessException {
		super();

		// create a fram
		Frame f = new Frame();

		// creat a button
		Button b1 = new Button("Click me");

		// creating a label
		Label l1 = new Label("Studnet Id");

		// creating a Text field
		TextField tf1 = new TextField();
		// setting the poisiton and size on Screem
		l1.setBounds(20, 80, 80, 30);
		tf1.setBounds(20, 80, 80, 30);
		b1.setBounds(30, 100, 80, 30);

		add(b1);
		setSize(300, 300);
		setLayout(null);
		setVisible(true);
	}

	public static void main(String[] args) {
		AwtExample1 f1 = new AwtExample1();
	}
}
