package com.minesweeper;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

public class GameArea extends JPanel{
	private static final long serialVersionUID = 1054946573756805525L;
	
	public GameArea(Dimension size) {
		setPreferredSize(size);
		
		
	}
	
	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;
		
		g2.setColor(Color.LIGHT_GRAY);
		g2.fillRect(0, 0, this.getWidth(), this.getHeight());
		
		g2.setColor(Color.BLACK);
		for(int r = 0; r < 25; r++) {
			g2.drawLine(0, r*20, this.getWidth(), r*20);
		}
		for(int c = 0; c < 50; c++) {
			g2.drawLine(c*20, 0, c*20, this.getHeight());
		}
	}
}
