import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {

    public static void main(String[] args) {

        JFrame tela = new JFrame("Tela de Login");
        tela.setSize(350, 220);
        tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tela.setLocationRelativeTo(null);
        tela.setLayout(null);

        JLabel lEmail = new JLabel("E-mail:");
        lEmail.setBounds(30, 30, 80, 25);
        tela.add(lEmail);

        JTextField tEmail = new JTextField();
        tEmail.setBounds(100, 30, 200, 25);
        tela.add(tEmail);

        JLabel lblSenha = new JLabel("Senha:");
        lblSenha.setBounds(30, 70, 80, 25);
        tela.add(lblSenha);

        JPasswordField tSenha = new JPasswordField();
        tSenha.setBounds(100, 70, 200, 25);
        tela.add(tSenha);

        JButton bLogin = new JButton("Login");
        bLogin.setBounds(40, 120, 100, 30);
        tela.add(bLogin);

        JButton bLimpar = new JButton("Limpar");
        bLimpar.setBounds(180, 120, 100, 30);
        tela.add(bLimpar);

        bLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String email = tEmail.getText();
                String senha = new String(tSenha.getPassword());


                if (email.isEmpty() || senha.isEmpty()) {

                    JOptionPane.showMessageDialog(null,
                            "Preencha todos os campos!");

                } else {


                    if (email.equals("admin@senai.com")
                            && senha.equals("123456")) {

                        JOptionPane.showMessageDialog(null,
                                "Login realizado com sucesso!");

                    } else {

                        JOptionPane.showMessageDialog(null,
                                "E-mail ou senha incorretos!");
                    }
                }
            }
        });

        bLimpar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                tEmail.setText("");
                tSenha.setText("");

                JOptionPane.showMessageDialog(null,
                        "Campos limpos!");
            }
        });

        tela.setVisible(true);
    }
}