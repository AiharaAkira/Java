package com.fin.cal;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.fin.gui.WinEvent;

public class ButtonEx extends JFrame implements ActionListener {

	boolean state = false; // 화면에 표시된 number 핸들러
	double num1, num2; 
	double result;         // 연산 결과
	String func = "";     // 기능 연산자
	String nInput = "";   // 마지막에 누른 연산자 저장
	JLabel label; // 연산 결과창
	String[] btn = { " ", " ", "←", "CE", "C", "7", "8", "9", "/", "sqrt", "4", "5", "6", "*", "%", "3", "2", "1",
			"-", "1/x", "0", "+/-", ".", "+", "=" };

	public ButtonEx() {

		super("Calculator"); // title 지정
		super.setResizable(true); // 프레임의 크기를 사용자가 조절

		/*
		 * JFrame : 메인 프레임 JPanel : 보조 프레임 JLabel : 기능을 수행하는 컴포넌트
		 */

		// 결과 창 GUI
		label = new JLabel("0", JLabel.RIGHT); // ("첫화면 출력될 값", 위치)

		JPanel mainView = new JPanel();
		label.setFont(new Font("Serif", Font.BOLD, 50)); // Font 지정
		label.setBackground(Color.WHITE); // 결과창 배경색 지정
		label.setOpaque(true); // 배경색을 적용하기 위해 불투명 설정

		// 버튼 창 GUI
		JPanel btnView = new JPanel();

		btnView.setLayout(new GridLayout(5, 5, 2, 2)); // 행과 열로 구성된 레이아웃 설정 (row, cols, 간격, 간격)

		JButton button[] = new JButton[btn.length]; // 버튼 생성, 배열의 길이만큼 값을 가져옴

		for (int i = 0; i < btn.length; i++) {
			button[i] = new JButton(btn[i]);
			button[i].setFont(new Font("Serif", Font.BOLD, 25)); // Font 지정
			button[i].addActionListener(this); // 익명클래스로 버튼 이벤트 추가 ,이벤트 리스너의 객체이므로 this로 지정

			if (i == 2 || i == 3 || i == 4|| i == 8|| i == 9|| i == 13|| i == 14|| i == 18|| i == 19|| i == 21|| i == 22|| i == 23|| i == 24)
				button[i].setForeground(Color.RED); // 기능별 색 지정
			if (i == 5 || i == 6 || i == 7 || i == 10 || i == 11 || i == 12|| i == 15 || i == 16 || i == 17|| i == 20)
				button[i].setForeground(Color.BLUE);

			btnView.add(button[i]);

		}

		// 프레임 배치 및 설정
		mainView.setLayout(new BorderLayout()); // 동서남북 레이아웃 배치
		add(label, BorderLayout.CENTER); // 결과창 배치
		add(btnView, BorderLayout.SOUTH); // 버튼창 베치
		setBounds(100, 100, 500, 400); // 프레임의 크기 지정
		dispose();
		setVisible(true); // 프레임이 보이도록 설정

	}

	public static void main(String[] args) {

		new ButtonEx();

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		String input = e.getActionCommand(); // 이벤트를 발생시킨 객체의 문자열을 가져와서 input에 넣음

		if (input.equals("+")) {
			num1 = num2;
			func = "+";
			nInput = ""; // 마지막에 누른 연산자 저장

		} else if (input.equals("-")) {
			num1 = num2;
			func = "-";
			nInput = "";

		} else if (input.equals("×")) {
			num1 = num2;
			func = "×";
			nInput = "";

		} else if (input.equals("÷")) {
			num1 = num2;
			func = "÷";
			nInput = "";

		} else if (input.equals("%")) {
			num1 = num2;
			func = "%";
			nInput = "";
			result = num1 / 100;
			label.setText(String.valueOf(result)); // 결과값을 문자열로 반환하여 결과창에 출력
		}

		else if (input.equals("x²")) {
			num1 = num2;
			func = "x²";
			nInput = "";
			result = num1 * num1;
			label.setText(String.valueOf(result));
			state = true;

		} else if (input.equals("C")) { // Clear
			nInput = "";
			num2 = 0;
			num1 = 0;
			label.setText("0");

			// substring(start, end) - start부터 end 전까지 문자열 자르기
		} else if (input.equals("←")) { // 왼쪽부터 순차적으로 지워지도록 함
			setBackSpace(getBackSpace().substring(0, getBackSpace().length() - 1));

			if (getBackSpace().length() < 1) { // 더 이상 지울 숫자가 없으면, 0으로 clear
				nInput = "";
				num2 = 0;
				num1 = 0;
				label.setText("0");
			}

		} else if (input.equals("=")) {
			if (func.equals("+")) {
				result = num1 + num2;
				label.setText(String.valueOf(result)); // 결과값을 문자열로 반환하여 결과창에 출력
				state = true; // 결과 값이 나온 후 다음 입력이 들어왔을 때 화면에 표시된 결과 값을 지운다.

			} else if (func.equals("-")) {
				result = num1 - num2;
				label.setText(String.valueOf(result));
				state = true;

			} else if (func.equals("×")) {
				result = num1 * num2;
				label.setText(String.valueOf(result));
				state = true;

			} else if (func.equals("÷")) {
				result = num1 / num2;
				label.setText(String.valueOf(result));
				state = true;

			}

		} else {
			if (state) {
				label.setText("0");
				state = false;
				num1 = 0;
				num2 = 0;
				nInput = "";
			}

			nInput += e.getActionCommand();
			label.setText(nInput);
			num2 = Double.parseDouble(nInput); // 문자열에서 double형 변

		}

	}

	private void setBackSpace(String bs) {
		label.setText(bs);
	}

	private String getBackSpace() {
		return label.getText();
	}
}
