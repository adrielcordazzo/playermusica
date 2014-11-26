package view;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import static java.lang.System.in;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

public class Tocador extends Thread{

        public void tocar (final String musica){
            try {
                //executa o som
                FileInputStream in;
                //Inicializa o FileInputStream com o endereço do arquivo para tocar
                in = new FileInputStream("src/musicas/" + musica);

                //Cria uma instancia da classe player passando para ele o InpuStream do arquivo
                Player p = new Player(in);
                p.play();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (JavaLayerException e) {
                e.printStackTrace();
            }
        }
}