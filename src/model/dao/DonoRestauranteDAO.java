package model.dao;

import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import model.bean.donodorestaurante.DonoRestaurante;

public class DonoRestauranteDAO {
    public void create(DonoRestaurante dono) {
    Connection con = ConnectionFactory.getConnection();
    PreparedStatement stmtUsuario = null;
    PreparedStatement stmtDono = null;
    ResultSet rs = null;

    try {
        // Inserindo na tabela `usuarios`
        stmtUsuario = con.prepareStatement("INSERT INTO usuarios (email, senha) VALUES (?, ?)", Statement.RETURN_GENERATED_KEYS);
        stmtUsuario.setString(1, dono.getEmail());
        stmtUsuario.setString(2, dono.getSenha());
        stmtUsuario.executeUpdate();

        // Obtendo o ID do usuário recém-criado
        rs = stmtUsuario.getGeneratedKeys();
        if (rs.next()) {
            int usuarioId = rs.getInt(1);
            int restauranteId = rs.getInt(2);

            // Inserindo na tabela `donosderestaurante`
            stmtDono = con.prepareStatement(
                "INSERT INTO donosderestaurante (usuario_id, restaurante_id) " +
                "VALUES (?, ?)"
            );
            stmtDono.setInt(1, usuarioId);
            stmtDono.setInt(2, restauranteId);

            stmtDono.executeUpdate();
            JOptionPane.showMessageDialog(null, "Dono de restaurante salvo com sucesso!");
        }
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Erro ao salvar dono de restaurante: " + ex.getMessage());
    } finally {
        ConnectionFactory.closeConnection(con, stmtUsuario, rs);
        ConnectionFactory.closeConnection(con, stmtDono);
    }
}
}
