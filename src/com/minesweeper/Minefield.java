package com.minesweeper;

import java.util.Random;

public class Minefield {
	private Cell[][] field;
	
	public Minefield(GameArea panel, int cols, int rows) {
		Random r = new Random();
		field = new Cell[cols][rows];
		
		int mineCount = 20;
		
		for(Cell[] celery : field) {
			for(Cell cell : celery) {
				cell = new Cell();
			}
		}
		
		while(mineCount != 0) {
			Cell cell = field[r.nextInt(field.length)][r.nextInt(field[0].length)];
			
			if(!cell.checkIfMine()) {
				cell.setAsMine(true);
				mineCount--;
			}
		}
		
	}
}
