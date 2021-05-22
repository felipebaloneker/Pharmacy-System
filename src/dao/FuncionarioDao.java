package dao;

import connection.ConnectionFactory;
import java.sql.*;
import javax.swing.JOptionPane;

public class FuncionarioDao {
    public boolean check_login(String login, String senha)
    {
        //ABRINDO CONEXAO
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        // VARIAVEL GUARDANDO VALORES
        ResultSet rs = null;
        boolean check = false;
        try
        {
            stmt = con.prepareStatement("SELECT * FROM funcionario WHERE login = ? and senha = ?");
            stmt.setString(1, login);
            stmt.setString(2, senha);
            rs = stmt.executeQuery();
            
            while(rs.next())
            {
                check = true;
            }
        }
        catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null,"Erro ao Exibir:"+ex);
        }
        // FECHANDO CONEXAO
        finally
        {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return check;
    }
}
