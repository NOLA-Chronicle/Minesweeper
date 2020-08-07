package com.minesweeper;

import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GameWindow extends JFrame{
	private static final long serialVersionUID = 6009903486855646095L;
	private int rows;
	private int cols;
	private int cellSize;
	private int WIDTH;
	private int HEIGHT;
	
	public GameWindow(int w, int h, int cellSize) {
		cols = w;
		rows = h;
		this.cellSize = cellSize;
		WIDTH = cellSize * cols;
		HEIGHT = cellSize * rows;
		
		setTitle("Minesweeper");
		
		//width x height
		Dimension canvas = new Dimension(WIDTH, HEIGHT);
		
		addComponents(canvas);
		
		pack();
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		validate();
	}
	
	private void addComponents(Dimension canvas) {
		//make panel
		//set panel size
		GroupLayout layout = new GroupLayout(this.getContentPane());
		setLayout(layout);
		layout.setAutoCreateContainerGaps(true);
		layout.setAutoCreateGaps(true);
		
		/*
		 * settings panel
		 * 		Difficulty
		 * 		restart
		 * 		timer
		 * 		
		 * game panel
		 */
		
		GameArea gamePanel = new GameArea(canvas, cols, rows, cellSize);
		gamePanel.setBorder(BorderFactory.createRaisedBevelBorder());
		
		layout.setHorizontalGroup(
			layout.createSequentialGroup().addGroup(layout.createParallelGroup()
				
				.addComponent(gamePanel))
		);
		
		layout.setVerticalGroup(
			layout.createSequentialGroup()
				.addComponent(gamePanel)
		);
		
	}
}
