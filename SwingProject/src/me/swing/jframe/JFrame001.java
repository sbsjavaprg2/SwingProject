package me.swing.jframe;

import javax.swing.JFrame;

public class JFrame001 extends JFrame {
	public JFrame001() {
		super("JFrame 상속");
		setSize(500, 500);
		setLocation(100, 50);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	public static void main(String[] args) {
		new JFrame001();
	}
}
