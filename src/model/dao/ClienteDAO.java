/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.dao;

import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import model.bean.cliente.Cliente;

/**
 *
 * @author Hugo
 */
public class ClienteDAO {
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
                "INSERT INTO clientes (usuario_id, nome, cpf, sexo, cep, endereço, complemento, telefone, data_nascimento) " +
                "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)"
            );
            stmtCliente.setInt(1, usuarioId);
            stmtCliente.setString(2, cliente.getNome());
            stmtCliente.setString(3, cliente.getCpf());
            stmtCliente.setString(4, cliente.getSexo());
            stmtCliente.setString(5, cliente.getCep());
            stmtCliente.setString(6, cliente.getEndereco());
            stmtCliente.setString(7, cliente.getComplemento());
            stmtCliente.setString(8, cliente.getTelefone());
            stmtCliente.setDate(9, java.sql.Date.valueOf(cliente.getDataNascimento()));

            stmtCliente.executeUpdate();
            JOptionPane.showMessageDialog(null, "Cliente salvo com sucesso!");
        }
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Erro ao salvar cliente: " + ex.getMessage());
    } finally {
        ConnectionFactory.closeConnection(con, stmtUsuario, rs);
        ConnectionFactory.closeConnection(con, stmtCliente);
    }
}
}
