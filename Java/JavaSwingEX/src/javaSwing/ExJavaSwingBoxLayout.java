package javaSwing;

import java.awt.Button;
import java.awt.Container;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ExJavaSwingBoxLayout extends JFrame{
	
	public ExJavaSwingBoxLayout(String tieude) {
		super(tieude);
		showBoxLayout();
	}
	public void showWindow() {
		this.setSize(400,300);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(HIDE_ON_CLOSE);
		this.setVisible(true);
	}
	public void showBoxLayout() {
		Container container = getContentPane();
		JPanel jpanel = new JPanel();
		jpanel.setLayout(new BoxLayout(jpanel, BoxLayout.Y_AXIS));
		Button jbutton1 = new Button("Click");
		Button jbutton2 = new Button("Click");
		Button jbutton3 = new Button("Click");
		Button jbutton4 = new Button("Click");
		
		jpanel.add(jbutton1);
		jpanel.add(jbutton2);
		jpanel.add(jbutton3);
		jpanel.add(jbutton4);
		
		container.add(jpanel);
	}
}
