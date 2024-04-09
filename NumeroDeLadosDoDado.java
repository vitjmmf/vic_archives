import javax.swing.JOptionPane;

public class NumeroDeLadosDoDado {

    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog(null, "Digite o número de lados do dado:");
        
        // Convertendo o input para inteiro
        int numeroDeLados = Integer.parseInt(input);
        
        if (numeroDeLados <= 0) {
            JOptionPane.showMessageDialog(null, "Número de lados inválido. Por favor, insira um número positivo.");
        } else {
            JOptionPane.showMessageDialog(null, "O dado tem " + numeroDeLados + " lados.");
        }
    }
}
