package javaSwing;

import javax.swing.*;
import java.awt.*;

public class ExJavaSwingJComboboxAndJList extends JFrame {
    public ExJavaSwingJComboboxAndJList(String tittle){
        super(tittle);
        addControl();
        addEvent();
    }
    public void addEvent(){

    }
    public void addControl(){
        Container container = getContentPane();
        JPanel pnMain = new JPanel();
        container.add(pnMain);
    }
    public void showWindow(){
        this.setSize(450,300);
        this.setDefaultCloseOperation(HIDE_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
    
}
