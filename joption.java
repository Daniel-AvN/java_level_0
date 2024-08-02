import javax.swing.JOptionPane;

class Joption {
    public static void main(String[] args) {
        String cadena= JOptionPane.showInputDialog("digite una cadena") ;
        int entero= Integer.parseInt(JOptionPane.showInputDialog("digite un int")) ;

        double decimal = Double.parseDouble(JOptionPane.showInputDialog("ingresa un double"));

        char caracter = JOptionPane.showInputDialog("ingresa un char:").charAt(0);
        
        JOptionPane.showMessageDialog(null, cadena+" "+entero+" "+decimal+" "+caracter);
    }

}