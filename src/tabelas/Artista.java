package tabelas;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Artista {
    private Banco bd;

    public Artista() {
        Banco bd = new Banco();
        this.bd = bd;
    }
            
    public void addArtista(String nome) throws SQLException{
        this.bd.executeInsert("INSERT INTO artista (nome) values ('" + nome + "');");
    }
    
     public ResultSet selectAll() throws SQLException{
        return this.bd.executeSql("SELECT * FROM artista");
    }
}