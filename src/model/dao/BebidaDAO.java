package model.dao;

import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import model.bean.donodorestaurante.Bebida;
import model.interfaces.DAO;

public class BebidaDAO implements DAO<Bebida> {
    
    @Override
    public void create(Bebida bebida) {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmtProduto = null;
        PreparedStatement stmtBebida = null;
        ResultSet rs = null;

        try {
            // Inserindo na tabela `produtos`
            stmtProduto = con.prepareStatement("INSERT INTO produtos (nome, descrição, preço, tempo_de_preparo) VALUES (?, ?, ?, ?)", Statement.RETURN_GENERATED_KEYS);
            stmtProduto.setString(1, bebida.getNome());
            stmtProduto.setString(2, bebida.getDescricao());
            stmtProduto.setDouble(3, bebida.getPreco());
            stmtProduto.setInt(4, bebida.getTempoPreparo());
            stmtProduto.executeUpdate();

            // Obtendo o ID do usuário recém-criado
            rs = stmtProduto.getGeneratedKeys();
            if (rs.next()) {
                int produtoId = rs.getInt(1);

                // Inserindo na tabela `bebidas`
                stmtBebida = con.prepareStatement(
                "INSERT INTO bebidas (produto_id, tamanho_ml, alcoólica) VALUES (?, ?, ?)"
                );
                stmtBebida.setInt(1, produtoId);
                stmtBebida.setInt(2, bebida.getTamanhoMl());
                stmtBebida.setBoolean(3, bebida.isAlcoolica());
                stmtBebida.executeUpdate();

                JOptionPane.showMessageDialog(null, "Bebida salva com sucesso!");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar bebida: " + ex.getMessage());
        } finally {
            ConnectionFactory.closeConnection(null, stmtProduto, rs);
            ConnectionFactory.closeConnection(con, stmtBebida);
        }
    }
}
