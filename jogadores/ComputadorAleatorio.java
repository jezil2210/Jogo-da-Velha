package jogadores;

import java.util.Random;
import jogodavelha.Jogada;
import jogodavelha.Jogador;
import jogodavelha.Tabuleiro;

/**
 *
 * @author Jeziel
 */
public class ComputadorAleatorio extends Jogador {
    private Random random = new Random();
    public ComputadorAleatorio(int jogador) {
        super(jogador);
        System.out.println("Jogador 'ComputadorAleatorio' criado!");
    }

    @Override
    public Jogada getJogada(Tabuleiro tabuleiro) {
        for (int i = 0; !this.checaTentativa(ultimaJogada, tabuleiro); i++) {
            ultimaJogada.setLinha(this.random.nextInt(3));
            ultimaJogada.setColuna(this.random.nextInt(3));
        }       

        return ultimaJogada;
    }
}