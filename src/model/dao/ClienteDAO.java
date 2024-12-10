package model.dao;

import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import model.bean.cliente.Cliente;
import model.interfaces.DAO;

public class ClienteDAO implements DAO<Cliente> {
    
    @Override
    public void create(Cliente cliente) {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmtUsuario = null;
        PreparedStatement stmtCliente = null;
        ResultSet rs = null;

        try {
            // Inserindo na tabela `usuarios`
            stmtUsuario = con.prepareStatement("INSERT INTO usuarios (email, senha) VALUES (?, ?)", Statement.RETURN_GENERATED_KEYS);
            stmtUsuario.setString(1, cliente.getEmail());
            stmtUsuario.setString(2, cliente.getSenha());
            stmtUsuario.executeUpdate();

            // Obtendo o ID do usuário recém-criado
            rs = stmtUsuario.getGeneratedKeys();
            if (rs.next()) {
                int usuarioId = rs.getInt(1);

                // Inserindo na tabela `clientes`
                stmtCliente = con.prepareStatement(
                "INSERT INTO clientes (usuario_id, nome, cpf, sexo, endereço, telefone) VALUES (?, ?, ?, ?, ?, ?)"
                );
                stmtCliente.setInt(1, usuarioId);
                stmtCliente.setString(2, cliente.getNome());
                stmtCliente.setString(3, cliente.getCpf());
                stmtCliente.setString(4, cliente.getSexo());
                stmtCliente.setString(5, cliente.getEndereco());
                stmtCliente.setString(6, cliente.getTelefone());
                stmtCliente.executeUpdate();

                JOptionPane.showMessageDialog(null, "Cliente salvo com sucesso!");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar cliente: " + ex.getMessage());
        } finally {
            ConnectionFactory.closeConnection(null, stmtUsuario, rs);
            ConnectionFactory.closeConnection(con, stmtCliente);
        }
    }
//    @Override
//    public void create(Cliente cliente) {
//        Connection con = ConnectionFactory.getConnection();
//        PreparedStatement stmtUsuario = null;
//        PreparedStatement stmtCliente = null;
//        ResultSet rs = null;
//        int usuarioId = -1;
//
//        try {
//            con.setAutoCommit(false);
//
//            // Insere um novo usuário
//            stmtUsuario = con.prepareStatement("INSERT INTO usuarios (email, senha) VALUES (?, ?)", Statement.RETURN_GENERATED_KEYS);
//            stmtUsuario.setString(1, cliente.getEmail());
//            stmtUsuario.setString(2, cliente.getSenha());
//            stmtUsuario.executeUpdate();
//            rs = stmtUsuario.getGeneratedKeys();
//            if (rs.next()) {
//                usuarioId = rs.getInt(1);
//            }
//
//            // Insere na tabela `clientes`
//            stmtCliente = con.prepareStatement(
//                "INSERT INTO clientes (usuario_id, nome, cpf, sexo, endereço, telefone) VALUES (?, ?, ?, ?, ?, ?)"
//            );
//            stmtCliente.setInt(1, usuarioId);
//            stmtCliente.setString(2, cliente.getNome());
//            stmtCliente.setString(3, cliente.getCpf());
//            stmtCliente.setString(4, cliente.getSexo());
//            stmtCliente.setString(5, cliente.getEndereco());
//            stmtCliente.setString(6, cliente.getTelefone());
//            stmtCliente.executeUpdate();
//
//            con.commit();
//            JOptionPane.showMessageDialog(null, "Cliente salvo com sucesso!");
//        } catch (SQLException ex) {
//            try {
//                con.rollback();
//            } catch (SQLException rollbackEx) {
//                System.err.println("Erro ao reverter transação: " + rollbackEx.getMessage());
//            }
//
//            // Verifica se o erro foi causado por email duplicado
//            if (ex.getMessage().contains("Duplicate entry") && ex.getMessage().contains("for key 'usuarios.email'")) {
//                JOptionPane.showMessageDialog(null, "O email já está cadastrado!");
//            } else {
//                JOptionPane.showMessageDialog(null, "Erro ao salvar cliente: " + ex.getMessage());
//            }
//        } finally {
//            ConnectionFactory.closeConnection(null, stmtUsuario, rs);
//            ConnectionFactory.closeConnection(con, stmtCliente);
//        }
//    }
}
