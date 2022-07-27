package com.fin.gui;

import java.awt.BorderLayout;
import java.awt.Choice;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.FileReader;
import java.io.PrintStream;
import java.io.StringWriter;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.fin.cal.ButtonEx;

public class MainUi extends JFrame implements ActionListener, MouseListener {

	private Dimension dim = new Dimension(200, 250);

	private JFrame frame = new JFrame("계산기");

	private Label income = new Label("수입");
	private Label expense = new Label("지출");
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
	JTextField BigText1 = new JTextField();
	JTextField BigText2 = new JTextField();
	private JPanel leftPanel = new JPanel();
	private JPanel bigTextPanel1 = new JPanel();
	private JPanel resultPanel = new JPanel();
	File f;
	public MainUi() {
		JTextField text1 = new JTextField(10);
		JTextField text2 = new JTextField(21);
		JTextField text3 = new JTextField(10);
		JTextField text4 = new JTextField(21);
		leftPanel.setLayout(new BoxLayout(leftPanel, BoxLayout.Y_AXIS));
		imgPanel.setLayout(new BoxLayout(imgPanel, BoxLayout.X_AXIS));
		//incomePanel.setLayout(new BoxLayout(incomePanel, BoxLayout.X_AXIS));
		//memoPanel.setLayout(new BoxLayout(memoPanel, BoxLayout.X_AXIS));
		//expensePanel.setLayout(new BoxLayout(expensePanel, BoxLayout.X_AXIS));
		//memoPanel2.setLayout(new BoxLayout(memoPanel2, BoxLayout.X_AXIS));
		btnPanel.setLayout(new BoxLayout(btnPanel, BoxLayout.X_AXIS));
		rightPanel.setLayout(new BoxLayout(rightPanel, BoxLayout.Y_AXIS));
		bigTextPanel1.setLayout(new BoxLayout(bigTextPanel1, BoxLayout.X_AXIS));
		resultPanel.setLayout(new BoxLayout(resultPanel, BoxLayout.X_AXIS));
		
		JMenuBar mb = new JMenuBar();
		JMenu FuncMenu = new JMenu("기능(F)");
		JMenu CalcMenu = new JMenu("계산기(C)");
		JMenu HelpMenu = new JMenu("도움말(H)");
			
		mb.add(FuncMenu);
		JMenuItem saveItem = new JMenuItem("저장하기(S)");
		saveItem.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {

				CalDAO calDAO = new CalDAO();
				calDAO.insertCal(co.getSelectedItem(),text1.getText(),text2.getText(),co2.getSelectedItem(),text3.getText(),text4.getText());
				
				JFileChooser fc = new JFileChooser();
				if(fc.showSaveDialog(MainUi.this)==JFileChooser.CANCEL_OPTION) {
					return;
				}
				f = fc.getSelectedFile();
				fileSave(f);
				setTitle(f.getName());
			
				
			}
		});
		FuncMenu.add(saveItem);
		JMenuItem getAllData = new JMenuItem("불러오기(L)");
		getAllData.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				new OutPutUi();
				
				JFileChooser fc = new JFileChooser();
				if(fc.showOpenDialog(MainUi.this)==JFileChooser.CANCEL_OPTION) {
				
					return;
					
				}
				
				f=fc.getSelectedFile();
				setTitle(f.getName());
				fileRead(f);
			}
		});
		FuncMenu.add(getAllData);

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
		Image updateImg = img.getScaledInstance(300, 300, Image.SCALE_SMOOTH);
		ImageIcon updateIcon = new ImageIcon(updateImg);

		imgLabel.setIcon(updateIcon);

		imgLabel.setBounds(10, 10, 400, 500);
		imgLabel.setHorizontalAlignment(JLabel.CENTER);


		imgPanel.add(imgLabel);
		leftPanel.add(imgPanel);

		// --------------------------


		incomePanel.add(income);
		
		co.add("월급");
		co.add("용돈");
		co.add("부수입");

		incomePanel.add(co);

		incomePanel.add(amount);

		/*
		 * JTextField text1 = new JTextField(10); JTextField text2 = new JTextField(21);
		 */
		//text1.setPreferredSize(new Dimension(1,1));
		//text2.setSize(100,10);
		incomePanel.add(text1);
		incomePanel.add(text2);
		leftPanel.add(incomePanel);
		
		memoPanel.add(Memo);
		memoPanel.add(text2);
		leftPanel.add(memoPanel);
		expensePanel.add(expense);

		co2.add("생활비");
		co2.add("교통비");
		co2.add("식비");

		expensePanel.add(co2);

		expensePanel.add(amount2);

		/*
		 * JTextField text3 = new JTextField(10); JTextField text4 = new JTextField(21);
		 */

		expensePanel.add(text3);
		leftPanel.add(expensePanel);
		memoPanel2.add(Memo2);
		memoPanel2.add(text4);
		leftPanel.add(memoPanel2);
		
	

		// -------------------------------
		JButton bt1 = new JButton("INCOME");
		JButton bt2 = new JButton("EXPENSE");

		bt1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            BigText1.setText("수입 "+co.getSelectedItem()+" 금액 "+text1.getText()+"원 \n"+text2.getText());
            System.out.println(co.getSelectedItem());
            }
        });
		
		bt2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            BigText2.setText("지출 "+co2.getSelectedItem()+" 금액 "+text3.getText()+"원 \n"+text4.getText());
            
            }
        });
		
		btnPanel.add(bt1);
		btnPanel.add(bt2);
		leftPanel.add(btnPanel);

		
		
		
		bigTextPanel1.add(BigText1);
		bigTextPanel1.add(BigText2);
		rightPanel.add(bigTextPanel1);
		CalDAO calDAO = new CalDAO();
		JLabel balance = new JLabel("현재 잔액: " + calDAO.getAddCal() + " 원");
		resultPanel.add(balance);
		rightPanel.add(resultPanel);
		
		frame.add(leftPanel,BorderLayout.WEST);
		frame.add(rightPanel, BorderLayout.CENTER);
		frame.setSize(new Dimension(600,620));
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

	//파일 저장 메소드
	
	private void fileSave(File f) {
		try {
			PrintStream ps = new PrintStream(f);
			ps.println(BigText1.getText());
			ps.println(BigText2.getText());
			ps.close();
		} catch (Exception e) {

			e.printStackTrace();
		}
	}
	
	//파일 읽기 메소드 
	private void fileRead(File f) {
		
		try {
		
			FileReader fr = new FileReader(f);
			StringWriter sw = new StringWriter();
			
			while(true) {
				
				int ch = fr.read();
				if(ch==-1) {
					break;
				}
				sw.write(ch);
			}
			
			BigText1.setText(sw.toString());
			sw.close();
			fr.close();
		} catch (Exception e) {

			e.printStackTrace();
		
		}
		
	}


	public static void main(String[] args) {
		new MainUi();
	}

	@Override
	public void mouseClicked(MouseEvent e) {
	}

	@Override
	public void mousePressed(MouseEvent e) {

	}

	@Override
	public void mouseReleased(MouseEvent e) {
	}

	@Override
	public void mouseEntered(MouseEvent e) {

	}

	@Override
	public void mouseExited(MouseEvent e) {

	}

	@Override
	public void actionPerformed(ActionEvent e) {

	}

}
