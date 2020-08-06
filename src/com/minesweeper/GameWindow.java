package com.minesweeper;

import java.awt.Dimension;

import javax.swing.GroupLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GameWindow extends JFrame{
	private static final long serialVersionUID = 6009903486855646095L;
	private int rows;
	private int cols;
	private int cellSize;
	
	public GameWindow(int w, int h, int cellSize) {
		rows = h;
		cols = w;
		this.cellSize = cellSize;
		
		setTitle("Minesweeper");
		
		//width x height
		Dimension canvas = new Dimension(cellSize * cols, cellSize * rows);
		JPanel content = (JPanel) getContentPane();
		
		content.setPreferredSize(canvas);
		
		addComponents();
		
		pack();
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		validate();
	}
	
	private void addComponents() {
		GroupLayout layout = new GroupLayout(this.getContentPane());
		setLayout(layout);
		
		/*
		 * settings panel
		 * 		Difficulty
		 * 		restart
		 * 		timer
		 * 		yes
		 * game panel
		 */
		
		
	}
}
