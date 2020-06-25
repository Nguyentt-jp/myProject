package javaSwing;

import java.awt.Color;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ExJavaSwing extends JFrame {
	
	public ExJavaSwing(String tieude) {
		super(tieude);
		showControl();
	}
	public void showWindow() {
		this.setSize(300, 200);
		this.setVisible(true);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setDefaultCloseOperation(HIDE_ON_CLOSE);		
	}
	public void showControl() {
		Container container=getContentPane();
		JPanel jpanel = new JPanel();
		jpanel.setBackground(Color.DARK_GRAY);
		
		JButton jbuton = new JButton("Click!");
		jpanel.add(jbuton);
		
		container.add(jpanel);
	}

}
