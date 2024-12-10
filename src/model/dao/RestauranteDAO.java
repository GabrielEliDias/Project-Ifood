package model.dao;

import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import model.bean.donodorestaurante.Restaurante;
import model.interfaces.DAO;

public class RestauranteDAO implements DAO<Restaurante> {
    
    @Override
    public void create(Restaurante restaurante) {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmtRestaurante = null;
        ResultSet rs = null;

        try {
            // Inserindo na tabela `restaurantes`
            stmtRestaurante = con.prepareStatement("INSERT INTO restaurantes (nome, endereço) VALUES (?, ?)", Statement.RETURN_GENERATED_KEYS);
            stmtRestaurante.setString(1, restaurante.getNome());
            stmtRestaurante.setString(2, restaurante.getEndereco());
            stmtRestaurante.executeUpdate();
            JOptionPane.showMessageDialog(null, "Restaurante salvo com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar restaurante: " + ex.getMessage());
        } finally {
            ConnectionFactory.closeConnection(con, stmtRestaurante, rs);
        }
    }
}
