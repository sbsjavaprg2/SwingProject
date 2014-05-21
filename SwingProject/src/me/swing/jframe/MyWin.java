package me.swing.jframe;

import javax.swing.JFrame;
import javax.swing.JLabel;

class MyWin extends JFrame{
	private static final long serialVersionUID = 3275379834255669095L;
	static int count;
	public MyWin() {
		super("새창");
		setSize(300, 300);
		JLabel lbl = new JLabel(++count + "");
		add(lbl);
		// setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE); // 아무것도하지 않는다.
		// setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE); // 숨긴다. setVisible(false)와 같다.
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // 현재 창만 닫는다.
		// setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 모두 닫고 종료한다.
	}
}