import javax.swing.*;
import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class Main {
    public static void main(String[] args) {

        JFrame tela = new JFrame("Tela de cadastro");
        tela.setSize(500,400);
        tela.setLayout(null);

        JLabel labelNome = new JLabel("Nome");
        labelNome.setBounds(20,50,150,40);
        tela.add(labelNome);

        JTextField nome = new JTextField();
        nome.setBounds(20,80,250,40);
        tela.add(nome);

        JLabel labelEmail = new JLabel("Email");
        labelEmail.setBounds(20,120,150,40);
        tela.add(labelEmail);

        JTextField email = new JTextField();
        email.setBounds(20,150,250,40);
        tela.add(email);

        JButton enviar = new JButton("Enviar");
        enviar.setBounds(80,200,150,40);
        tela.add(enviar);

        enviar.addActionListener(e ->{
            String sql = "INSERT INTO usuario(nome, email) VALUES (?,?)";
            String nomeCompleto = nome.getText();
            String emailUsuario = email.getText();

            try {
                Connection conexao = Conexao.conectar();
                PreparedStatement ps = conexao.prepareStatement(sql);

                ps.setString(1, nomeCompleto);
                ps.setString(2, emailUsuario);
                ps.executeUpdate();

                JOptionPane.showMessageDialog(null, "Usuário calvo com sucesso!");
                ps.close();
                conexao.close();

            } catch (Exception ex) {
                throw new RuntimeException(ex);
            }
        });

        tela.setVisible(true);
    }
}