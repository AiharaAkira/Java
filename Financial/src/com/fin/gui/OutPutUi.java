package com.fin.gui;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class OutPutUi extends JFrame implements ActionListener {

	private JFrame frame = new JFrame();

	public void OutPutUi1() {
		JPanel panel = new JPanel();

		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

		CalDAO calDAO = new CalDAO();

		ArrayList<CalVO> lists = calDAO.getAllCal();
		panel.add(new JLabel("☆수입☆"));

		for (CalVO c : lists) {

			panel.add(new JLabel(c.getC_income_type().toString()));
			panel.add(new JLabel(c.getC_income_ammount().toString()));
			panel.add(new JLabel(c.getC_income_memo().toString()));

		}

		panel.add(new JLabel("☆지출☆"));

		for (CalVO c : lists) {

			panel.add(new JLabel(c.getC_expense_type().toString()));
			panel.add(new JLabel(c.getC_expense_ammount().toString()));
			panel.add(new JLabel(c.getC_expense_memo().toString()));

		}

		panel.add(new JLabel("☆현재 잔액☆"));
		panel.add(new JLabel(calDAO.getAddCal() + ""));
		panel.setBackground(Color.WHITE);
		frame.add(panel);
		frame.setBounds(100, 100, 500, 400); // 프레임의 크기 지정
		frame.dispose();
		frame.setVisible(true); // 프레임이 보이도록 설정

	}

	public  OutPutUi(String str) {
		int addR = 0;
		String result = str.substring(str.indexOf("지출")+1);
		String resultE = str.substring(str.indexOf("|")+1);
		
		JPanel panel = new JPanel();
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		
		panel.add(new JLabel("☆수입☆"));
		while(!result.isBlank()) {
			panel.add(new JLabel(result));
			result = str.substring(str.indexOf("지출")+1);
		}


		
		panel.add(new JLabel("☆지출☆"));
		while(!resultE.isBlank()) {
			panel.add(new JLabel(resultE));
			resultE = str.substring(str.indexOf("|")+1);
		}
		panel.add(new JLabel("☆현재 잔액☆"));
		panel.add(new JLabel(addR+""));
		
		panel.setBackground(Color.WHITE);
		frame.add(panel);
		frame.setBounds(100, 100, 500, 400); // 프레임의 크기 지정
		frame.dispose();
		frame.setVisible(true); // 프레임이 보이도록 설정

	}

	public static void main(String[] args) {
		//new OutPutUi1();
	}

	@Override
	public void actionPerformed(ActionEvent e) {

	}

}
