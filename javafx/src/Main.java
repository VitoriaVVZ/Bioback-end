import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        JFrame janela = new JFrame("Exemplo Swing");
        janela.setSize(300,200);
        janela.setLayout(null);

        JButton button = new JButton("Clique aqui");
        button.setBounds(20,20,150,40);

        JLabel label = new JLabel("Texto");
        label.setBounds(20,50,150,40);

        JTextField input = new JTextField();
        input.setBounds(20,80,150,40);

        button.addActionListener( e -> {
            String texto = input.getText();

            JOptionPane.showMessageDialog(null
                    , "Você digitou " + texto);
        });

        janela.add(label);
        janela.add(input);
        janela.add(button);

        janela.setVisible(true);

    }
}