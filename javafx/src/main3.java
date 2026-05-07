import javax.swing.*;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.List;

public class main3 {
    public static void main(String[] args) {

        List<Pessoa> listaPessoas = new ArrayList<>();

        JFrame janela = new JFrame("Cadastro de Pessoas");
        janela.setSize(400, 300);
        janela.setLayout(null);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel("E-mail:");
        label.setBounds(20, 20, 150, 30);
        JTextField inputEmail = new JTextField();
        inputEmail.setBounds(20, 50, 150, 30);

        JLabel label2 = new JLabel("Telefone:");
        label2.setBounds(190, 20, 150, 30);
        JTextField inputTelefone = new JTextField();
        inputTelefone.setBounds(190, 50, 150, 30);


        JButton btnAdicionar = new JButton("Adicionar");
        btnAdicionar.setBounds(20, 100, 150, 40);
        btnAdicionar.addActionListener(e -> {
            String email = inputEmail.getText();
            String tel = inputTelefone.getText();

            if (!email.isEmpty() && !tel.isEmpty()) {
                listaPessoas.add(new Pessoa(email, tel));
                JOptionPane.showMessageDialog(null, "Pessoa cadastrada!");
                inputEmail.setText("");
                inputTelefone.setText("");
            } else {
                JOptionPane.showMessageDialog(null, "Preencha todos os campos!");
            }
        });


        JButton btnListar = new JButton("Ver Lista");
        btnListar.setBounds(190, 100, 150, 40);
        btnListar.addActionListener(e -> {
            if (listaPessoas.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Ninguém cadastrado.");
            } else {
                StringBuilder sb = new StringBuilder("Pessoas Cadastradas:\n");
                for (Pessoa p : listaPessoas) {
                    sb.append(p.toString()).append("\n");
                }
                JOptionPane.showMessageDialog(null, sb.toString());
            }
        });


        janela.add(label);
        janela.add(inputEmail);
        janela.add(label2);
        janela.add(inputTelefone);
        janela.add(btnAdicionar);
        janela.add(btnListar);

        janela.setVisible(true);
    }
}




