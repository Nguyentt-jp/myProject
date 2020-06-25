package javaSwing;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ExJavaSwingBorderLayout extends JFrame {
	
	public ExJavaSwingBorderLayout(String tittle) {
		super(tittle);
		showBoderLayout();
	}
	public void showWindow() {
		this.setSize(400, 300);
		this.setDefaultCloseOperation(HIDE_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
	public void showBoderLayout() {
		Container container = getContentPane();
		JPanel jpanel = new JPanel();
		jpanel.setLayout(new BorderLayout());
		
		JButton button = new JButton();
		button.setSize(60,60);
		
		JPanel jpanelD = new JPanel();
		jpanelD.add(button);
		jpanelD.setBackground(Color.BLUE);
		jpanelD.setPreferredSize(new Dimension(60,0));
		JPanel jpanelT = new JPanel();
		jpanelT.setBackground(Color.BLACK);
		jpanelT.setPreferredSize(new Dimension(0,60));
		JPanel jpanelN = new JPanel();
		jpanelN.setBackground(Color.DARK_GRAY);
		jpanelN.setPreferredSize(new Dimension(60,0));
		JPanel jpanelB = new JPanel();
		jpanelB.setBackground(Color.GREEN);
		jpanelB.setPreferredSize(new Dimension(0,60));
		JPanel jpanelC = new JPanel();
		jpanelC.setBackground(Color.MAGENTA);
		
		jpanel.add(jpanelC,BorderLayout.CENTER);
		jpanel.add(jpanelD,BorderLayout.EAST);
		jpanel.add(jpanelN,BorderLayout.WEST);
		jpanel.add(jpanelT,BorderLayout.NORTH);
		jpanel.add(jpanelB,BorderLayout.SOUTH);
		
		container.add(jpanel);
		
	}

}
