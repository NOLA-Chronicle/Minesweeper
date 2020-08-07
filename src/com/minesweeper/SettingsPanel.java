package com.minesweeper;

import java.awt.Dimension;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPanel;

public class SettingsPanel extends JPanel {

	public SettingsPanel(int w, int h) {
		setPreferredSize(new Dimension(w, h));
		
		JComboBox<String> difficulty = new JComboBox<String>();
		difficulty.addItem("Easy");
		difficulty.addItem("Medium");
		difficulty.addItem("Hard");
		
		JButton changeButton = new JButton("Change");
		
		GroupLayout layout = new GroupLayout(this);
		setLayout(layout);
		layout.setAutoCreateContainerGaps(true);
		layout.setAutoCreateGaps(true);
		
		layout.setHorizontalGroup(
				layout.createSequentialGroup()
					.addComponent(difficulty, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addComponent(changeButton, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
			);
		
		layout.setVerticalGroup(
				layout.createSequentialGroup().addGroup(layout.createParallelGroup()
					.addComponent(difficulty, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addComponent(changeButton, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
			);
	}
}
