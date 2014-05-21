package me.swing.jframe;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class JFrame003 extends JFrame {
	private static final long serialVersionUID = 9070388493050767123L;
	public JFrame003() {
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
		// 해상도 구하기
		Toolkit toolKit = this.getToolkit();
		Dimension screenSize = toolKit.getScreenSize();
		// 윈도우 크기 구하기
		Dimension windowSize = getSize();
		// 화면 중앙에 배치하기 위하여 위치값 계산
		int x = (screenSize.width - windowSize.width) / 2;
		int y = (screenSize.height - windowSize.height) / 2;
		// 윈도우 표시 위치 지정
		setLocation(x, y);
		getContentPane().setBackground(Color.CYAN);

		setResizable(false);
		setVisible(true);
	}
	public static void main(String[] args) {
		new JFrame003();
	}
}
