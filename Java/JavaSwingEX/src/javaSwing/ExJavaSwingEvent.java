package javaSwing;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class ExJavaSwingEvent extends JFrame {
	
	private JTextField txtA, txtB, txtKQ;
	private JButton btGiai, btExit;
	
	private ActionListener actionEvent = new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			xuLiPT();
		}
	};
	
	public ExJavaSwingEvent(String tittle) {
		super(tittle);
		addControll();
		addEvent();
	}
	protected void xuLiPT() {
		String aStr = txtA.getText();
		String bStr = txtB.getText();
		double a = Integer.parseInt(aStr);
		double b = Integer.parseInt(bStr);
		double x;
		if (a == 0) {
			JOptionPane.showMessageDialog(null, "Phuong Trinh Vo So Nghiem!");			
		}
		else if(b == 0) {
			JOptionPane.showMessageDialog(null, "Phuong Trinh Vo Nghiem!");
		}
		else {
			x=-b/a;
			JOptionPane.showMessageDialog(null, "Ket Qua x: "+x);
		}
	}
	private void addEvent() {
		
		btExit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btGiai.addActionListener(actionEvent);
	}
	public void showWindow() {
		this.setSize(500, 350);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(HIDE_ON_CLOSE);
		this.setVisible(true);
	}
	public void addControll() {
		Container container = getContentPane();
		JPanel pnMain = new JPanel();
		pnMain.setLayout(new BoxLayout(pnMain, BoxLayout.Y_AXIS));
		container.add(pnMain);
		
		JPanel pnTittle = new JPanel();
		pnTittle.setLayout(new FlowLayout());
		JLabel lblTittle = new JLabel("Giai Phuong Trinh Bac I");
		pnTittle.add(lblTittle);
//		container.add(pnTittle)
		pnMain.add(pnTittle);
		lblTittle.setForeground(Color.RED);
		Font font = new Font("arial", Font.BOLD, 20);
		lblTittle.setFont(font);
		
		JPanel pnA = new JPanel();
		pnA.setLayout(new FlowLayout());
		JLabel lblA = new JLabel("He So A: ");
		txtA = new JTextField(15);
		pnA.add(lblA);
		pnA.add(txtA);
		pnMain.add(pnA);
		
		JPanel pnB = new JPanel();
		pnB.setLayout(new FlowLayout());
		JLabel lblB = new JLabel("He So B: ");
		txtB = new JTextField(15);
		pnB.add(lblB);
		pnB.add(txtB);
		pnMain.add(pnB);
		
		JPanel pnButton = new JPanel();
		pnButton.setLayout(new FlowLayout());
		btGiai = new JButton("Giai!");
		btExit = new JButton("Exit!");
		pnButton.add(btGiai);
		pnButton.add(btExit);
		pnMain.add(pnButton);
	}

}
