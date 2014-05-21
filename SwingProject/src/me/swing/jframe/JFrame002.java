package me.swing.jframe;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class JFrame002 extends JFrame {
	private static final long serialVersionUID = 9070388493050767123L;
	public JFrame002() {
		super("JFrame 상속");
		setSize(500, 500);
		setLocation(100, 50);
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
					setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
				int choice = JOptionPane.showConfirmDialog(null, "정말 종료하시겠습니까?", "종료확인",
						JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
				if (choice == 0) {
					setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				}
			}
		});
		setResizable(false);
		setVisible(true);
	}
	public static void main(String[] args) {
		new JFrame002();
	}
}
