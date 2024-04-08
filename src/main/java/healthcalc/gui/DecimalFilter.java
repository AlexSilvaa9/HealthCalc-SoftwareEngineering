package healthcalc.gui;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DocumentFilter;

public class DecimalFilter extends DocumentFilter {

    @Override
    public void insertString(FilterBypass fb, int offset, String text, AttributeSet attr) throws BadLocationException {
        StringBuilder builder = new StringBuilder(fb.getDocument().getText(0, fb.getDocument().getLength()));
        builder.insert(offset, text);

        if (isValidFloat(builder.toString())) {
            // Eliminar el '0' inicial si el campo está vacío y se está escribiendo un número
            String currentText = fb.getDocument().getText(0, fb.getDocument().getLength());
            if (currentText.equals("0")) {
                fb.remove(0, 1);
                offset--;
            }
            super.insertString(fb, offset, text, attr);
        }
    }

    @Override
    public void replace(FilterBypass fb, int offset, int length, String text, AttributeSet attrs) throws BadLocationException {
        StringBuilder builder = new StringBuilder(fb.getDocument().getText(0, fb.getDocument().getLength()));
        builder.replace(offset, offset + length, text);

        if (isValidFloat(builder.toString())) {
            // Eliminar el '0' inicial si el campo está vacío y se está escribiendo un número
            String currentText = fb.getDocument().getText(0, fb.getDocument().getLength());
            if (currentText.equals("0")) {
                fb.remove(0, 1);
                offset--;
            }
            super.replace(fb, offset, length, text, attrs);
        }
    }

    private boolean isValidFloat(String str) {
        // Permitir cadena vacía (borrado)
        if (str.isEmpty()) {
            return true;
        }

        // Validar números decimales con punto como separador decimal
        return str.matches("^[-+]?\\d*(\\.\\d*)?$");
    }
}
