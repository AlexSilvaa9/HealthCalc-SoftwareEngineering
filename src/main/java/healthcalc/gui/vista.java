package healthcalc.gui;

import javax.swing.*;
import javax.swing.text.AbstractDocument;

import java.awt.*;
import java.awt.event.ActionEvent;
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
    private JLabel lresult;
    private JComboBox<String> cbmethod;
    private JButton bclear;
    public vista() {
        try {
            // Aplicar el tema Nimbus
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (Exception e) {
            e.printStackTrace();
        }
        JFrame frame = new JFrame("Health Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 300);
        
        JPanel panel = new JPanel(new GridBagLayout());
        panel.setBackground(new Color(227, 242, 253)); // Azul claro
        GridBagConstraints constraints = new GridBagConstraints();

        constraints.anchor = GridBagConstraints.WEST;
        constraints.insets = new Insets(5, 5, 5, 5);

        // Labels for inputs
        lheight = new JLabel("Height");
        lheight.setForeground(new Color(31, 74, 137)); // Azul oscuro
        constraints.gridx = 0;
        constraints.gridy = 0;
        panel.add(lheight, constraints);
        
        lweight = new JLabel("Weight");
        lweight.setForeground(new Color(31, 74, 137)); // Azul oscuro
        constraints.gridy = 1;
        panel.add(lweight, constraints);
        
        lage = new JLabel("Age");
        lage.setForeground(new Color(31, 74, 137)); // Azul oscuro
        constraints.gridy = 2;
        panel.add(lage, constraints);
        
        // Labels for options
        lgender = new JLabel("Gender");
        lgender.setForeground(new Color(31, 74, 137)); // Azul oscuro
        constraints.gridx = 2;
        constraints.gridy = 0;
        panel.add(lgender, constraints);
        
        lmethod = new JLabel("Method");
        lmethod.setForeground(new Color(31, 74, 137)); // Azul oscuro
        constraints.gridy = 1;
        panel.add(lmethod, constraints);

        // Result label
        lresult = new JLabel("Result");
        lresult.setForeground(new Color(31, 74, 137)); // Azul oscuro
        constraints.gridx = 0;
        constraints.gridy = 3;
        constraints.gridwidth = 4;
        panel.add(lresult, constraints);

        // Text fields for inputs
        theight = new JTextField(15);
        constraints.gridx = 1;
        constraints.gridy = 0;
        constraints.gridwidth = 1;
        panel.add(theight, constraints);
        
        tweight = new JTextField(15);
        constraints.gridy = 1;
        panel.add(tweight, constraints);
        
        tage = new JTextField(15);
        constraints.gridy = 2;
        panel.add(tage, constraints);
        
        // Radio buttons for gender
        ButtonGroup genderGroup = new ButtonGroup();
        rbmale = new JRadioButton("Male");
        rbfemale = new JRadioButton("Female");
        rbmale.setForeground(new Color(31, 74, 137)); // Azul oscuro
        rbfemale.setForeground(new Color(31, 74, 137)); // Azul oscuro
        genderGroup.add(rbmale);
        genderGroup.add(rbfemale);
        
        JPanel genderPanel = new JPanel();
        genderPanel.setBackground(new Color(227, 242, 253)); // Azul claro
        genderPanel.add(rbmale);
        genderPanel.add(rbfemale);
        
        constraints.gridx = 3;
        constraints.gridy = 0;
        panel.add(genderPanel, constraints);
        
        // List for method
        list_method = new JList<>();
        constraints.gridy = 1;
        panel.add(list_method, constraints);
        
        // Text field for result
        tresult = new JTextField(17);
        tresult.setEditable(false);
        tresult.setForeground(new Color(31, 74, 137)); // Azul oscuro
        constraints.gridx = 0;
        constraints.gridy = 4;
        constraints.gridwidth = 4;
        panel.add(tresult, constraints);
        
        // Button for calculation
        bcalculate = new JButton("Calculate");
        bcalculate.setBackground(new Color(31, 74, 137)); // Azul oscuro
        bcalculate.setForeground(Color.WHITE);
        constraints.gridx = 0;
        constraints.gridy = 5;
        constraints.gridwidth = 4;
        panel.add(bcalculate, constraints);
        
        // Combo box for method
        cbmethod = new JComboBox<>(new String[]{"Ideal Weight", "Basal Metabolic Rate"});
        cbmethod.setForeground(new Color(31, 74, 137)); // Azul oscuro
        constraints.gridx = 3;
        constraints.gridy = 1;
        panel.add(cbmethod, constraints);

        
        bclear = new JButton("Limpiar");
        String hex = "9CAFAA";
        int rgb = Integer.parseInt(hex, 16);
        
        // Extraer los componentes R, G, B
        int red = (rgb >> 16) & 0xFF;
        int green = (rgb >> 8) & 0xFF;
        int blue = rgb & 0xFF;
        
        // Crear un objeto Color
        Color color = new Color(red, green, blue);
        bclear.setBackground(color); // Azul oscuro
        bclear.setForeground(Color.WHITE);
        constraints.gridx = 2;
        constraints.gridy = 5;
        constraints.gridwidth = 4;
        panel.add(bclear, constraints);
        frame.add(panel);
        frame.setVisible(true);
        bclear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                limpiarCampos();
            }
        });

        ((AbstractDocument) tage.getDocument()).setDocumentFilter(new NumberOnlyFilter());
        ((AbstractDocument) tweight.getDocument()).setDocumentFilter(new DecimalFilter());
        ((AbstractDocument) theight.getDocument()).setDocumentFilter(new NumberOnlyFilter());
   

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

    public float getWeight() {
        try {
            return Float.parseFloat(tweight.getText());	
        } catch (NumberFormatException e) {
            return -1;
        }
    }

    public char getGender() {
        if (rbmale.isSelected()) {
            return 'm'; // Male
        } else if (rbfemale.isSelected()) {
            return 'f'; // Female
        } else {
            return 'x'; // Neither male nor female selected
        }
    }

    public String getMethod() {
        return (String) cbmethod.getSelectedItem();
    }
    public void setResultado(String resultado){
        tresult.setText(getMethod()+":"+resultado);
    }
    public void limpiarCampos() {
        theight.setText("");    // Limpiar campo de altura
        tweight.setText("");    // Limpiar campo de peso
        tage.setText(""); 
        tresult.setText("");     // Limpiar campo de edad
        rbmale.setSelected(false);   // Desseleccionar botón de género masculino
        rbfemale.setSelected(false); // Desseleccionar botón de género femenino
    }
}
