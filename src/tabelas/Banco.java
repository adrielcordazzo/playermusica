package tabelas;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Banco {
    private Connection conn;
    private java.sql.Statement sql;
    
    public Banco() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            
            Connection conexao = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/playermusica?zeroDateTimeBehavior=convertToNull", "root", "");
            java.sql.Statement st = conexao.createStatement();
            
            this.conn = conexao;
            this.sql = st;
        } catch (SQLException ex) {
            Logger.getLogger(Banco.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Banco.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public java.sql.Statement getSt() {
        return this.sql;
    }
    
    public ResultSet executeSql (String sql) throws SQLException {
         this.sql.executeQuery(sql);
         return this.sql.getResultSet();
    }
    
    public void executeInsert (String sql) throws SQLException{
         this.sql.executeUpdate(sql);
    }
}