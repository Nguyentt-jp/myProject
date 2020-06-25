package javaSwing;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ExJavaSwingFlowLayout extends JFrame {
	
	public ExJavaSwingFlowLayout(String title) {
		super(title);
		showFlowLayout();
	}
	
	public void showWindow() {
		this.setSize(400, 300);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setVisible(true);
	}
	public void showFlowLayout() {
		Container container = getContentPane();
		
		JPanel jpanelFlowLayout = new JPanel();
		jpanelFlowLayout.setLayout(new FlowLayout());
		
		jpanelFlowLayout.setSize(60,60);
		
		JButton jbutton1 = new JButton("Click!");		
		JButton jbutton2 = new JButton("Click!");
		JButton jbutton3 = new JButton("Click!");
		JButton jbutton4 = new JButton("Click!");
		JButton jbutton5 = new JButton("Click!");
		JButton jbutton6 = new JButton("Click!");		
		JButton jbutton7 = new JButton("Click!");
		JButton jbutton8 = new JButton("Click!");
		JButton jbutton9 = new JButton("Click!");
		JButton jbutton10 = new JButton("Click!");
		JButton jbutton11 = new JButton("Click!");		
		JButton jbutton12 = new JButton("Click!");
		JButton jbutton13 = new JButton("Click!");
		JButton jbutton14 = new JButton("Click!");
		JButton jbutton15 = new JButton("Click!");
		JButton jbutton16 = new JButton("Click!");		
		JButton jbutton17 = new JButton("Click!");
		JButton jbutton18 = new JButton("Click!");
		JButton jbutton19 = new JButton("Click!");
		JButton jbutton20 = new JButton("Click!");
		JButton jbutton21 = new JButton("Click!");		
		JButton jbutton22 = new JButton("Click!");
		JButton jbutton23 = new JButton("Click!");
		JButton jbutton24 = new JButton("Click!");
		JButton jbutton25 = new JButton("Click!");
		
		jpanelFlowLayout.add(jbutton1);
		jpanelFlowLayout.add(jbutton2);
		jpanelFlowLayout.add(jbutton3);
		jpanelFlowLayout.add(jbutton4);
		jpanelFlowLayout.add(jbutton5);
		jpanelFlowLayout.add(jbutton6);
		jpanelFlowLayout.add(jbutton7);
		jpanelFlowLayout.add(jbutton8);
		jpanelFlowLayout.add(jbutton9);
		jpanelFlowLayout.add(jbutton10);
		jpanelFlowLayout.add(jbutton11);
		jpanelFlowLayout.add(jbutton12);
		jpanelFlowLayout.add(jbutton13);
		jpanelFlowLayout.add(jbutton14);
		jpanelFlowLayout.add(jbutton15);
		jpanelFlowLayout.add(jbutton16);
		jpanelFlowLayout.add(jbutton17);
		jpanelFlowLayout.add(jbutton18);
		jpanelFlowLayout.add(jbutton19);
		jpanelFlowLayout.add(jbutton20);
		jpanelFlowLayout.add(jbutton21);
		jpanelFlowLayout.add(jbutton22);
		jpanelFlowLayout.add(jbutton23);
		jpanelFlowLayout.add(jbutton24);
		jpanelFlowLayout.add(jbutton25);
		
		container.add(jpanelFlowLayout);		
	}
}
