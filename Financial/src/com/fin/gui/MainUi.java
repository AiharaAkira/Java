package com.fin.gui;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Choice;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.fin.cal.ButtonEx;

public class MainUi extends JFrame implements ActionListener, MouseListener{

	
	private Dimension dim = new Dimension(200,250);
	
	private JFrame frame = new JFrame("계산기");
	
	
	private Label income = new Label("수입");
	private Label expense = new Label("수입");
	private Label amount = new Label("금액");
	private Label amount2 = new Label("금액");
	private Label Memo = new Label("메모");
	private Label Memo2 = new Label("메모");
	private Choice co = new Choice();
	private Choice co2 = new Choice();
	private JPanel rightPanel = new JPanel();
	private JPanel imgPanel = new JPanel();
	private JPanel incomePanel = new JPanel();
	private JPanel memoPanel = new JPanel();
	private JPanel expensePanel = new JPanel();
	private JPanel memoPanel2 = new JPanel();
	private JPanel btnPanel = new JPanel();
	
	private JPanel leftPanel = new JPanel();
	private JPanel bigTextPanel1 = new JPanel();
	private JPanel resultPanel = new JPanel();
	
	
	public MainUi() {
		
		leftPanel.setLayout(new BoxLayout(leftPanel, BoxLayout.Y_AXIS));
		imgPanel.setLayout(new BoxLayout(imgPanel, BoxLayout.X_AXIS));
		incomePanel.setLayout(new BoxLayout(incomePanel, BoxLayout.X_AXIS));
		memoPanel.setLayout(new BoxLayout(memoPanel, BoxLayout.X_AXIS));
		expensePanel.setLayout(new BoxLayout(expensePanel, BoxLayout.X_AXIS));
		memoPanel2.setLayout(new BoxLayout(memoPanel2, BoxLayout.X_AXIS));
		btnPanel.setLayout(new BoxLayout(btnPanel, BoxLayout.X_AXIS));
		
		rightPanel.setLayout(new BoxLayout(rightPanel, BoxLayout.Y_AXIS));
		bigTextPanel1.setLayout(new BoxLayout(bigTextPanel1, BoxLayout.X_AXIS));
		resultPanel.setLayout(new BoxLayout(resultPanel, BoxLayout.X_AXIS));
		
		JMenuBar mb = new JMenuBar();
		JMenu FuncMenu = new JMenu("기능(F)");
		JMenu CalcMenu = new JMenu("계산기(C)");
		JMenu HelpMenu = new JMenu("도움말(H)");

		mb.add(FuncMenu);

		FuncMenu.add(new JMenuItem("저장하기(S)"));
		FuncMenu.add(new JMenuItem("불러오기(L)"));

		mb.add(CalcMenu);

		JMenuItem calRun = new JMenuItem("실행하기(O)");
		calRun.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				new ButtonEx();
				
			}
		});
		CalcMenu.add(calRun);

		mb.add(HelpMenu);
		JMenuItem helps = new JMenuItem("정보(I)");
		helps.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				new HelpUi();
				
			}
		});
		HelpMenu.add(helps);

		frame.setJMenuBar(mb);

		// --------------------------
		
		
		JLabel imgLabel = new JLabel();

		ImageIcon icon = new ImageIcon(MainUi.class.getResource("img/1.jpg"));

		Image img = icon.getImage();
		Image updateImg = img.getScaledInstance(500, 300, Image.SCALE_SMOOTH);
		ImageIcon updateIcon = new ImageIcon(updateImg);

		imgLabel.setIcon(updateIcon);

		imgLabel.setBounds(210, 30, 165, 150);
		imgLabel.setHorizontalAlignment(JLabel.CENTER);


		imgPanel.add(imgLabel);
		leftPanel.add(imgPanel);

		// --------------------------


		incomePanel.add(income);
		
		co.add("월급");
		co.add("용돈");

		incomePanel.add(co);

		incomePanel.add(amount);

		JTextField text1 = new JTextField();
		JTextField text2 = new JTextField();

		incomePanel.add(text1);
		leftPanel.add(incomePanel);
		
		memoPanel.add(Memo);
		memoPanel.add(text2);
		leftPanel.add(memoPanel);
		expensePanel.add(expense);

		co2.add("문화생활");
		co2.add("교통비");
		co2.add("식비");

		expensePanel.add(co2);

		expensePanel.add(amount2);

		JTextField text3 = new JTextField();

		expensePanel.add(text3);
		leftPanel.add(expensePanel);
		JTextField text4 = new JTextField();
		memoPanel2.add(Memo2);
		memoPanel2.add(text4);
		leftPanel.add(memoPanel2);
		

		// -------------------------------
		Button bt1 = new Button("INCOME");
		Button bt2 = new Button("INCOME");

		btnPanel.add(bt1);
		btnPanel.add(bt2);
		leftPanel.add(btnPanel);

		JTextField BigText1 = new JTextField();
		JTextField BigText2 = new JTextField();
		bigTextPanel1.add(BigText1);
		bigTextPanel1.add(BigText2);
		rightPanel.add(bigTextPanel1);
		int balanceInt = 0;
		JLabel balance = new JLabel("현재 잔액: " + balanceInt + " 원");
		resultPanel.add(balance);
		rightPanel.add(resultPanel);
		
		
		frame.add(leftPanel,BorderLayout.WEST);
		frame.add(rightPanel, BorderLayout.EAST);
		frame.pack();
		frame.setBounds(10,10,1000,700);
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		new MainUi();
	}

	

	@Override
	public void mouseClicked(MouseEvent e) {
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
