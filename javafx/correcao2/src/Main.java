import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {

        JFrame tela = new JFrame("Cadastro para Adoção");
        tela.setSize(600,400);
        tela.setLayout(null);

        JLabel labelNome = new JLabel("Nome");
        labelNome.setBounds(20,30,150,40);
        tela.add(labelNome);
        JTextField nome = new JTextField();
        nome.setBounds(20,60,250,40);
        tela.add(nome);

        JLabel labelIdade = new JLabel("Idade");
        labelIdade.setBounds(290,30,150,40);
        tela.add(labelIdade);
        JTextField idade = new JTextField();
        idade.setBounds(290,60,250,40);
        tela.add(idade);

        JLabel labelTipo = new JLabel("Tipo");
        labelTipo.setBounds(20,120,150,40);
        tela.add(labelTipo);
        JComboBox<Tipo> textTipo = new JComboBox(Tipo.values());
        textTipo.setBounds(20,150,250,40);
        tela.add(textTipo);

        JLabel labelRaca = new JLabel("Raça");
        labelRaca.setBounds(290,120,150,40);
        tela.add(labelRaca);
        JTextField raca = new JTextField();
        raca.setBounds(290,150,250,40);
        tela.add(raca);

        JLabel labelEndereco = new JLabel("Endereço");
        labelEndereco.setBounds(20,210,150,40);
        tela.add(labelEndereco);
        JTextField endereco = new JTextField();
        endereco.setBounds(20,240,250,40);
        tela.add(endereco);

        JLabel labelTelefone = new JLabel("Telefone");
        labelTelefone.setBounds(290, 210, 150, 40);
        tela.add(labelTelefone);
        JTextField telefone = new JTextField();
        telefone.setBounds(290,240,250,40);
        tela.add(telefone);

        JButton enviar = new JButton("Enviar");
        enviar.setBounds(20,310,150,40);
        tela.add(enviar);

        enviar.addActionListener(actionEvent -> {

            String nomeAnimal = nome.getText();
            String idadeAnimal = idade.getText();
            String tipoAnimal = textTipo.getSelectedItem().toString();
            String racaAnimal = raca.getText();
            String enderecoAnimal = endereco.getText();
            String telefoneAnimal = telefone.getText();

            String sql = "INSERT INTO pets(nome, idade, tipo, raca, endereco, telefone) VALUES (?,?,?,?,?,?)";

            try {
                Connection conexao = Conexao.conectar();
                PreparedStatement ps = conexao.prepareStatement(sql);

                ps.setString(1, nomeAnimal);
                ps.setString(2, idadeAnimal);
                ps.setString(3, tipoAnimal);
                ps.setString(4, racaAnimal);
                ps.setString(5, enderecoAnimal);
                ps.setString(6, telefoneAnimal);
                ps.executeUpdate();
                JOptionPane.showMessageDialog(null, "Animal salvo com sucesso!");
                ps.close();
                conexao.close();

            }catch (SQLException e) {
                throw new RuntimeException(e);
            }
        });







        tela.setVisible(true);
    }
}