package com.minesweeper;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

public class GameArea extends JPanel{
	private static final long serialVersionUID = 1054946573756805525L;
	private Dimension dim;
	private int cols;
	private int rows;
	private int cellSize;
	
	private Minefield field;
	
	public GameArea(Dimension size, int c, int r, int cellSize) {
		dim = size;
		setPreferredSize(dim);
		
		this.cols = c;
		this.rows = r;
		this.cellSize = cellSize;
		
	}
	
	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;
		
		g2.setColor(Color.LIGHT_GRAY);
		g2.fillRect(0, 0, dim.width, dim.height);
		
		g2.setColor(Color.BLACK);
		for(int r = 0; r < rows; r++) {
			g2.drawLine(0, r*cellSize, dim.width, r*cellSize);
		}
		for(int c = 0; c < cols; c++) {
			g2.drawLine(c*cellSize, 0, c*cellSize, dim.height);
		}
	}
}
