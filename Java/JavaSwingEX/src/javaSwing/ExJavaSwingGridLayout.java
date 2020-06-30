package javaSwing;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ExJavaSwingGridLayout extends JFrame {

    private JCheckBox chkTravel, chkWatchMovie;
    private JRadioButton radMen, radWomen;
    private ButtonGroup groupGenden;
    private JTextArea textAreaAdd;
    private JTextField txtName;
    private JButton btOk;

    public ExJavaSwingGridLayout(String tille){
        super(tille);
        addControl();
        addEvent();
    }
    public void addEvent(){
        btOk.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                info();
            }
        });
    }

    private void info() {
        String s = txtName.getText() + "\n";
        s+=textAreaAdd.getText() + "\n";
        if (chkTravel.isSelected()){
            s+=chkTravel.getText()+"\n";
        }
        if (chkWatchMovie.isSelected()){
            s+=chkWatchMovie.getText()+"\n";
        }
        String gender = "";
        if(radWomen.isSelected()){
            gender+=radWomen.getText();
        }
        else{
            gender+=radMen.getText();
        }
        s+=gender;
        JOptionPane.showMessageDialog(null,s);

    }

    public void addControl(){
        Container container = getContentPane();
        JPanel pnMain = new JPanel();
        pnMain.setLayout(new BoxLayout(pnMain,BoxLayout.Y_AXIS));
        container.add(pnMain);

        JPanel pnInfo = new JPanel();
        pnMain.add(pnInfo);
        pnInfo.setLayout(new BoxLayout(pnInfo,BoxLayout.Y_AXIS));
        JPanel pnName = new JPanel();
        pnName.setLayout(new FlowLayout());
        JLabel lblName = new JLabel("Input Name: ");
        txtName =new JTextField(15);
        pnName.add(lblName);
        pnName.add(txtName);
        pnInfo.add(pnName);

        JPanel pnAdd = new JPanel();
        pnAdd.setLayout(new FlowLayout());
        JLabel lblAdd = new JLabel("Input Address: ");
        textAreaAdd = new JTextArea(5,15);
        JScrollPane scrollPane = new JScrollPane(textAreaAdd,
                JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
                JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        textAreaAdd.setWrapStyleWord(true);
        textAreaAdd.setLineWrap(true);
        pnAdd.add(lblAdd);
        pnAdd.add(scrollPane);
        pnInfo.add(pnAdd);

        Border borderInfo = BorderFactory.createLineBorder(Color.BLUE);
        TitledBorder titledBorder = new TitledBorder(borderInfo,"Information");
        titledBorder.setTitleColor(Color.RED);
        pnInfo.setBorder(titledBorder);

        JPanel pnHobbyGenden = new JPanel();
        pnHobbyGenden.setLayout(new GridLayout());
        pnMain.add(pnHobbyGenden);
        JPanel pnHobby = new JPanel();

        pnHobby.setLayout(new BoxLayout(pnHobby,BoxLayout.Y_AXIS));
        chkTravel = new JCheckBox("Travel");
        chkWatchMovie = new JCheckBox("Watch Movie");
        pnHobby.add(chkTravel);
        pnHobby.add(chkWatchMovie);
        pnHobbyGenden.add(pnHobby);

        Border borderHobby = BorderFactory.createLineBorder(Color.BLUE);
        TitledBorder titledBorderHobby = new TitledBorder(borderHobby,"Hobby");
        titledBorderHobby.setTitleColor(Color.RED);
        pnHobby.setBorder(titledBorderHobby);

        JPanel pnGenden = new JPanel();
        pnGenden.setLayout(new BoxLayout(pnGenden,BoxLayout.Y_AXIS));
        radMen = new JRadioButton("Men");
        radWomen = new JRadioButton("Women");
        groupGenden = new ButtonGroup();
        groupGenden.add(radMen);
        groupGenden.add(radWomen);
        pnGenden.add(radMen);
        pnGenden.add(radWomen);
        pnHobbyGenden.add(pnGenden);

        Border borderGenden = BorderFactory.createLineBorder(Color.BLUE);
        TitledBorder titledBorderGenden = new TitledBorder(borderGenden,"Genden");
        titledBorderGenden.setTitleColor(Color.RED);
        pnGenden.setBorder(titledBorderGenden);


        JPanel pnButton = new JPanel();
        pnButton.setLayout(new FlowLayout(FlowLayout.RIGHT));
        btOk = new JButton("OK!");
        pnButton.add(btOk);
        pnMain.add(pnButton);

    }
    public void showWindow(){
        this.setDefaultCloseOperation(HIDE_ON_CLOSE);
        this.setSize(400,350);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
}
