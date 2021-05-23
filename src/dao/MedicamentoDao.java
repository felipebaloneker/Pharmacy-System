package dao;
import connection.ConnectionFactory;
import model.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
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
                medicamento.setQtd(rs.getInt("qtd"));
                medicamento.setDescricao(rs.getString("descricao"));
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
    
    // DELETANDO COLUNA NO BANCO
    public void delete(Medicamento m)
    {
        // INICIANDO CONEXAO
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try 
        {
            stmt= con.prepareStatement("DELETE FROM medicamento WHERE id = ?");
            stmt.setInt(1, m.getId());
            
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null,"Deletado com Sucesso!!");
        }
        catch (SQLException ex) 
        {
            JOptionPane.showMessageDialog(null,"Erro ao Deletar!"+ex);
        }
        // FECHANDO CONEXAO
        finally
        {
            ConnectionFactory.closeConnection(con,stmt);
        }
        
    }
    
    // ATUALIZANDO BANCO
    public void update(Medicamento m)
    {
        // INICIANDO CONEXAO
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt= con.prepareStatement("UPDATE medicamento SET descricao = ?, qtd = ?, preco = ? WHERE id = ?");
            stmt.setString(1,m.getDescricao());
            stmt.setInt(2, m.getQtd());
            stmt.setDouble(3, m.getPreco());
            stmt.setInt(4, m.getId());
            
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null,"Atualizado com Sucesso!!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao Atualizar!"+ex);
        }
        // FECHANDO CONEXAO
        finally
        {
            ConnectionFactory.closeConnection(con,stmt);
        }
    }
    
}
