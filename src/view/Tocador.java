package view;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

public class Tocador{
    private FileInputStream in;
    private Player p;
    
    public void tocar (final String musica){
        try {
            //executa o som

            //Inicializa o FileInputStream com o endereço do arquivo para tocar
            this.in = new FileInputStream("src/musicas/" + musica);

            //Cria uma instancia da classe player passando para ele o InpuStream do arquivo
            this.p = new Player(in);
            new Thread(){
                public void run(){
                  try {
                    p.play();
                  }catch (Exception e) {
                    System.out.println(e);
                  }
                }
            }.start();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (JavaLayerException e) {
            e.printStackTrace();
        }
    }
    
    public void parar() throws JavaLayerException{
        this.p.close();
    }

}