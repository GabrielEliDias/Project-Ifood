package model.dao;

import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import model.bean.donodorestaurante.Comida;
import model.interfaces.DAO;

public class ComidaDAO implements DAO<Comida> {
    
    @Override
    public void create(Comida comida) {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmtProduto = null;
        PreparedStatement stmtComida = null;
        ResultSet rs = null;

        try {
            // Inserindo na tabela `produtos`
            stmtProduto = con.prepareStatement("INSERT INTO produtos (nome, descrição, preço, tempo_de_preparo) VALUES (?, ?, ?, ?)", Statement.RETURN_GENERATED_KEYS);
            stmtProduto.setString(1, comida.getNome());
            stmtProduto.setString(2, comida.getDescricao());
            stmtProduto.setDouble(3, comida.getPreco());
            stmtProduto.setInt(4, comida.getTempoPreparo());
            stmtProduto.executeUpdate();

            // Obtendo o ID do produto recém-criado
            rs = stmtProduto.getGeneratedKeys();
            if (rs.next()) {
                int produtoId = rs.getInt(1);

                // Inserindo na tabela `comidas`
                stmtComida = con.prepareStatement(
                    "INSERT INTO comidas (produto_id, tipo_de_cozinha, vegetariano, vegano) " +
                    "VALUES (?, ?, ?, ?)"
                );
                stmtComida.setInt(1, produtoId);
                stmtComida.setString(2, comida.getTipoCozinha());
                stmtComida.setBoolean(3, comida.isVegetariano());
                stmtComida.setBoolean(4, comida.isVegano());

                stmtComida.executeUpdate();
                JOptionPane.showMessageDialog(null, "Comida salva com sucesso!");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar comida: " + ex.getMessage());
        } finally {
            ConnectionFactory.closeConnection(con, stmtProduto, rs);
            ConnectionFactory.closeConnection(con, stmtComida);
        }
    }
}
