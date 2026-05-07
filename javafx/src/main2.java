import javax.swing.*;

public class main2 {
    public static void main(String[] args) {

        JFrame janela = new JFrame("Formulário");
        janela.setSize(300,200);
        janela.setLayout(null);

        JButton button = new JButton("Entrar");
        button.setBounds(20,180,150,40);

        JLabel label = new JLabel("E-mail");
        label.setBounds(20,80,150,40);

        JTextField input = new JTextField();
        input.setBounds(20,110,150,40);

        JLabel label2 = new JLabel("Telefone");
        label2.setBounds(190,80,150,40);

        JTextField input2 = new JTextField();
        input2.setBounds(190,110,150,40);

        button.addActionListener( e -> {
            String texto = input.getText();

            JOptionPane.showMessageDialog(null
                    , "Dados salvos com sucesso!");
        });

        janela.add(label);
        janela.add(label2);

        janela.add(input);
        janela.add(input2);

        janela.add(button);

        janela.setVisible(true);

    }
}