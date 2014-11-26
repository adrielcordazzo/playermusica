package tabelas;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Album {
    private Banco bd;

    public Album() {
        Banco bd = new Banco();
        this.bd = bd;
    }
            
    public void addAlbum(String nome) throws SQLException{
        this.bd.executeInsert("INSERT INTO album (nome) values ('" + nome + "');");
    }
    
     public ResultSet selectAll() throws SQLException{
        return this.bd.executeSql("SELECT * FROM album");
    }
}