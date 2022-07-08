package com.event;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.border.*;
import javax.swing.table.DefaultTableModel;



public class HorseMain extends JFrame implements Runnable {

	
	private Canvas can;
	private Image buffer;
	private Image[] horse;
	
	private boolean bRepeat = true;
	
	
	public HorseMain() {

		intiHorse();
		
		this.add(can = new Canvas() {
			
			public void paint(Graphics g) {
				g.drawImage(buffer, 0, 0 ,this);
			}
			
			
			
		});
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//pack();
		setBounds(300,100,400,400);
		setVisible(true);
		
	}
	
	public void makeThread() {
		
		new Thread(this).start();
		
	}
	
	public void bufferPaint(int n) {
		buffer = createImage(can.getWidth(), can.getHeight());
		Graphics buffer_g = buffer.getGraphics();
		buffer_g.drawImage(horse[n], 50, 50, this);
		can.repaint();
		
	}
	
	public void intiHorse() {
		horse = new Image[11];
		
		for(int i = 0; i < horse.length; i++) {
			
			horse[i] = Toolkit.getDefaultToolkit().getImage(String.format("../images/black%02d.png",i+1));
			
			
		}
		
	}
	
	
	@Override
	public void run() {
		
		while(true) {
			
			for(int i = 0; i < horse.length; i++) {
				
				if(!bRepeat) {
					return;
				}
				
				try {

					Thread.sleep(50);
					
				} catch (Exception e) {
					e.printStackTrace();
					
				}
				
				
			}
			
		}
		
	}
	
	public static void main(String[] args) {
		
		new HorseMain();
		
		
		
	}

}
