package healthcalc.gui;

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

        // Initialize constraints
        constraints.insets = new Insets(5, 5, 5, 5);
        constraints.anchor = GridBagConstraints.WEST;

        lheight = new JLabel("Height");
        constraints.gridx = 0;
        constraints.gridy = 0;
        panel.add(lheight, constraints);
        
        lweight = new JLabel("Weight");
        constraints.gridy = 1;
        panel.add(lweight, constraints);
        
        lage = new JLabel("Age");
        constraints.gridy = 2;
        panel.add(lage, constraints);
        
        lgender = new JLabel("Gender");
        constraints.gridy = 3;
        panel.add(lgender, constraints);
        
        lmethod = new JLabel("Method");
        constraints.gridy = 4;
        panel.add(lmethod, constraints);
        
        tage = new JTextField(15);
        constraints.gridx = 1;
        constraints.gridy = 2;
        panel.add(tage, constraints);
        
        tweight = new JTextField(15);
        constraints.gridy = 1;
        panel.add(tweight, constraints);
        
        theight = new JTextField(15);
        constraints.gridy = 0;
        panel.add(theight, constraints);
        
        rbmale = new JRadioButton("Male");
        constraints.gridx = 1;
        constraints.gridy = 3;
        panel.add(rbmale, constraints);
        
        rbfemale = new JRadioButton("Female");
        constraints.gridy = 4;
        panel.add(rbfemale, constraints);
        
        list_method = new JList<>();
        // you can assign the elements to the list by changing above line to JList<String> list_method = new JList<>(yourStringArray);
        constraints.gridx = 1;
        constraints.gridy = 4;
        panel.add(list_method, constraints);
        
        tresult = new JTextField(17);
        constraints.gridx = 0;
        constraints.gridy = 5;
        constraints.gridwidth = 2;
        panel.add(tresult, constraints);
        
        bcalculate = new JButton("Calculate");
        constraints.gridx = 0;
        constraints.gridy = 6;
        constraints.gridwidth = 2;
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

    public int getAge() {
        try {
            return Integer.parseInt(tage.getText());	
        } catch (NumberFormatException e) {
            return -1;
        }
    }

    public int getHeight() {
        try {
            return Integer.parseInt(theight.getText());	
        } catch (NumberFormatException e) {
            return -1;
        }
    }

    public int getWeight() {
        try {
            return Integer.parseInt(tweight.getText());	
        } catch (NumberFormatException e) {
            return -1;
        }
    }

    public int getGender() {
        if (rbmale.isSelected()) {
            return 0; // Male
        } else if (rbfemale.isSelected()) {
            return 1; // Female
        } else {
            return -1; // Neither male nor female selected
        }
    }
}
