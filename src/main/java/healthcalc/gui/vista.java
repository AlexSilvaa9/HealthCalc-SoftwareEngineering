package healthcalc.gui;
// * This code was generated with love by Window Builder VS Code extension. * //

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;


public class vista extends JFrame {
    private JButton bcalculate;
    private JTextField tresult;
    private JList<String> list_method;
    private JLabel lheight;
    private JLabel lweight;
    private JLabel lage;
    private JLabel lgender;
    private JLabel lmethod;
    private JTextField tage;
    private JTextField tweight;
    private JTextField theight;
    private JRadioButton rbmale;
    private JRadioButton rbfemale;

  public vista() {
    JFrame frame = new JFrame("Health Calculator");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(500, 300);
    
    JPanel panel = new JPanel(new GridBagLayout());
    GridBagConstraints constraints = new GridBagConstraints();

    // Fill the layout with placeholders
    for (int row = 0; row < 17; row++) {
        for (int col = 0; col < 1001; col++) {
            constraints.gridx = col;
            constraints.gridy = row;
            constraints.weightx = 1.0;
            constraints.weighty = 1.0;
            constraints.fill = GridBagConstraints.BOTH;

            Component filler = Box.createRigidArea(new Dimension(0, 0));
            panel.add(filler, constraints);
        }
    }

    constraints.weightx = 0;
    constraints.weighty = 0;
    constraints.fill = GridBagConstraints.NONE;
    constraints.anchor = GridBagConstraints.NORTHWEST;

    
    lheight = new JLabel("Height");
    constraints.gridx = -714;
    constraints.gridy = -1;
    constraints.gridwidth = 2;
    constraints.gridheight = 2;
    panel.add(lheight, constraints);
    
    lweight = new JLabel("Weight");
    constraints.gridx = -714;
    constraints.gridy = 4;
    constraints.gridwidth = 2;
    constraints.gridheight = 2;
    panel.add(lweight, constraints);
    
    lage = new JLabel("Age");
    constraints.gridx = -714;
    constraints.gridy = 9;
    constraints.gridwidth = 2;
    constraints.gridheight = 2;
    panel.add(lage, constraints);
    
    lgender = new JLabel("Gender");
    constraints.gridx = -9;
    constraints.gridy = 1;
    constraints.gridwidth = 2;
    constraints.gridheight = 2;
    panel.add(lgender, constraints);
    
    lmethod = new JLabel("Method");
    constraints.gridx = -9;
    constraints.gridy = 9;
    constraints.gridwidth = 2;
    constraints.gridheight = 2;
    panel.add(lmethod, constraints);
    
    tage = new JTextField(15);
    tage.setPreferredSize(new Dimension(162, 24));
    constraints.gridx = -714;
    constraints.gridy = 12;
    constraints.gridwidth = 6;
    constraints.gridheight = 6;
    panel.add(tage, constraints);
    
    tweight = new JTextField(15);
    tweight.setPreferredSize(new Dimension(162, 24));
    constraints.gridx = -714;
    constraints.gridy = 7;
    constraints.gridwidth = 6;
    constraints.gridheight = 6;
    panel.add(tweight, constraints);
    
    theight = new JTextField(15);
    theight.setPreferredSize(new Dimension(162, 24));
    constraints.gridx = -714;
    constraints.gridy = 1;
    constraints.gridwidth = 6;
    constraints.gridheight = 6;
    panel.add(theight, constraints);
    
    rbmale = new JRadioButton("Male");
    rbmale.setPreferredSize(new Dimension(103, 18));
    rbmale.setSelected(false);
    constraints.gridx = 91;
    constraints.gridy = 4;
    constraints.gridwidth = 4;
    constraints.gridheight = 4;
    panel.add(rbmale, constraints);
    
    rbfemale = new JRadioButton("Female");
    rbfemale.setPreferredSize(new Dimension(103, 18));
    rbfemale.setSelected(false);
    constraints.gridx = 91;
    constraints.gridy = 7;
    constraints.gridwidth = 4;
    constraints.gridheight = 4;
    panel.add(rbfemale, constraints);
    
    list_method = new JList<>();
    // you can assign the elements to the list by changing above line to JList<String> list_method = new JList<>(yourStringArray);
    constraints.gridx = 91;
    constraints.gridy = 12;
    panel.add(list_method, constraints);
    
    tresult = new JTextField(17);
    tresult.setPreferredSize(new Dimension(162, 24));
    constraints.gridx = -312;
    constraints.gridy = 17;
    constraints.gridwidth = 6;
    constraints.gridheight = 6;
    panel.add(tresult, constraints);
    
    bcalculate = new JButton("Calculate");
    bcalculate.setPreferredSize(new Dimension(177, 28));
    
    constraints.gridx = -312;
    constraints.gridy = 20;
    constraints.gridwidth = 7;
    constraints.gridheight = 7;
    panel.add(bcalculate, constraints);
    
    frame.add(panel);
    frame.setVisible(true);

    
  }
public void registrarControlador(ActionListener ctrl) {
    
    bcalculate.addActionListener(ctrl);
    bcalculate.setActionCommand("Calcular");
}
public void error(String msg) {
    
    tresult.setText(msg);
}
public int getage() {
    try {
        return Integer.parseInt(tage.getText());	
    } catch (NumberFormatException e) {
        return -1;
    }
}
public int getHeight() {
    try {
        return Integer.parseInt(tage.getText());	
    } catch (NumberFormatException e) {
        return -1;
    }
}
public int getWeigth() {
    try {
        return Integer.parseInt(tage.getText());	
    } catch (NumberFormatException e) {
        return -1;
    }
}
public int getGender() {
    try {
        return Integer.parseInt(tage.getText());	
    } catch (NumberFormatException e) {
        return -1;
    }
}
}
    