package dao;
import connection.ConnectionFactory;
import model.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class MedicamentoDao {
    // INSERINDO VALORES NO BANCO
    public void create(Medicamento m)
    {
        // INICIANDO CONEXAO
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt= con.prepareStatement("INSERT INTO medicamento (descricao,qtd,preco) VALUES (?,?,?)");
            stmt.setString(1,m.getDescricao());
            stmt.setInt(2, m.getQtd());
            stmt.setDouble(3, m.getPreco());
            
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null,"Salvo com Sucesso!!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao Salvar!"+ex);
        }
        // FECHANDO CONEXAO
        finally
        {
            ConnectionFactory.closeConnection(con,stmt);
        }
        
    }
    
    //LISTANDO DADOS
    public List<Medicamento> read()
    {
        // INICIANDO CONEXAO
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        // VARIAVEIS GUARDANDO VALORES
        ResultSet rs = null;
        List<Medicamento> medicamentos = new ArrayList<>(); // valores de todas as linhas
        
        try {
            stmt = con.prepareStatement("SELECT * FROM medicamento");
            rs = stmt.executeQuery();
            
            while(rs.next())
            {
                //  ADICIONANDO COLUNAS AO OBJETO
                Medicamento medicamento = new Medicamento();
                medicamento.setId(rs.getInt("id"));
                medicamento.setDescricao(rs.getString("descricao"));
                medicamento.setQtd(rs.getInt("qtd"));
                medicamento.setPreco(rs.getDouble("preco"));
                
               medicamentos.add(medicamento);
                
            }
            
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null,"Erro ao Exibir:"+ex);
        }
        // FECHANDO CONEXAO
        finally
        {
            ConnectionFactory.closeConnection(con,stmt,rs);
        }
        return medicamentos;
    }
}
