import javax.swing.JOptionPane;

public class InputUtils {
    public static String inputString(String message) {
        while (true) {
            String input = JOptionPane.showInputDialog(message);
            if (input != null && !input.trim().isEmpty()) {
                return input;
            } else {
                JOptionPane.showMessageDialog(null, "Entrada no válida. Intente nuevamente.");
            }
        }
    }

    public static int inputInt(String message) {
        while (true) {
            try {
                return Integer.parseInt(JOptionPane.showInputDialog(message));
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Por favor ingrese un número entero válido.");
            }
        }
    }

    public static float inputFloat(String message) {
        while (true) {
            try {
                return Float.parseFloat(JOptionPane.showInputDialog(message));
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Por favor ingrese un número flotante válido.");
            }
        }
    }
}
