package view;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

public class Tocador extends Thread{
    private FileInputStream in;
    private Player p;
    private String musica;
    
     public Tocador(String musica){
        this.musica = musica;
    }
        
    public void run(){
        tocar();
    }
    
    public void tocar (){
        try {
            //executa o som

            //Inicializa o FileInputStream com o endereço do arquivo para tocar
            this.in = new FileInputStream("src/musicas/" + musica);

            //Cria uma instancia da classe player passando para ele o InpuStream do arquivo
            this.p = new Player(in);
            
            try {
                p.play();
            }catch (Exception e) {
                System.out.println(e);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (JavaLayerException e) {
            e.printStackTrace();
        }
    }
    
    public void parar() throws JavaLayerException{
        try {
            p.play();
        }catch (Exception e) {
            System.out.println(e);
        }
    }

}