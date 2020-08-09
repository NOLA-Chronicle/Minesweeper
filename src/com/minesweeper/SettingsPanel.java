package com.minesweeper;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class SettingsPanel extends JPanel implements ActionListener{
	
	private static final long serialVersionUID = 6009903486855646095L;
	JButton changeButton = new JButton("Change");
	JComboBox<String> difficulty = new JComboBox<String>();

	public SettingsPanel(int w, int h) {
		setPreferredSize(new Dimension(w, h));
		
		difficulty.addItem("Easy");
		difficulty.addItem("Medium");
		difficulty.addItem("Hard");
		
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
		
		changeButton.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent event) {
		getDifficulty();
		JOptionPane.showMessageDialog(null, String.format(Float.toString(getDifficulty()), event.getActionCommand()));
	}
	
	public float getDifficulty() {
		float difficultyNum = 0.50f;
		
		if (difficulty.getSelectedItem().toString() == "Easy") {
			difficultyNum = 0.50f;
		} else if(difficulty.getSelectedItem().toString() == "Medium") {
			difficultyNum = 0.25f;
		} else {
			difficultyNum = 0.125f;
		}
		
		return difficultyNum;
	}
}