package tabelas;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Musica {
    private Banco bd;

    public Musica() {
        Banco bd = new Banco();
        this.bd = bd;
    }
            
    public void addMusica(String nome_artista, String nome_album, String nome, String diretorio, String avaliacao) throws SQLException{
        String sql = "INSERT INTO musica (id_artista, id_album, nome, diretorio, avaliacao) values ((SELECT id FROM artista WHERE nome = '" + nome_artista + "'), (SELECT id FROM album WHERE nome = '" + nome_album + "'), '" + nome + "', '" + diretorio + "', '" + avaliacao + "');";
        this.bd.executeInsert(sql);
    }
    
    public void editMusica(String nome_artista, String nome_album, String nome, String diretorio, String avaliacao) throws SQLException{
        String sql = "UPDATE musica SET id_artista = (SELECT id FROM artista WHERE nome = '" + nome_artista + "'), id_album = (SELECT id FROM album WHERE nome = '" + nome_album + "'), diretorio = '" + diretorio + "', avaliacao = '" + avaliacao + "' WHERE nome = '" + nome + "'";
        this.bd.executeInsert(sql);
    }
    
    public void excluirMusica(String nome) throws SQLException{
        String sql = "DELETE FROM musica WHERE nome = '" + nome + "'";
        this.bd.executeInsert(sql);
    }
    
    public void editAvaliacao(String nome, String avaliacao) throws SQLException{
        String sql = "UPDATE musica SET  avaliacao = '" + avaliacao + "' WHERE nome = '" + nome + "'";
        this.bd.executeInsert(sql);
    }
    
     public ResultSet selectAll(String busca) throws SQLException{
        String sql = "SELECT m.*, a.nome AS artista, ab.nome AS album FROM musica m LEFT JOIN artista a ON a.id = m.id_artista LEFT JOIN album ab ON ab.id = m.id_album ";
        if(!(busca.isEmpty())){
            sql += " WHERE m.nome LIKE '%" + busca + "%' OR a.nome LIKE '%" + busca + "%' OR ab.nome LIKE '%" + busca + "%' ";
        }
        sql += " ORDER BY m.avaliacao DESC";
        return this.bd.executeSql(sql);
    }
     
     public ResultSet selectByName(String musica) throws SQLException{
         String sql = "SELECT m.*, a.nome AS artistaNome, ab.nome AS albumNome FROM musica m LEFT JOIN artista a ON a.id = m.id_artista LEFT JOIN album ab ON ab.id = m.id_album WHERE m.nome LIKE '" + musica + "' ";
         return this.bd.executeSql(sql);
     }
}