package jogodavelha;

import java.util.ArrayList;
import java.util.Scanner;
import jogadores.ComputadorAleatorio;
import jogadores.ComputadorSequencial;
import jogadores.Humano;
import jogadores.Jeziel_IA;

/**
 *
 * @author Jeziel
 */
public class JogoDaVelha {

    private Tabuleiro tabuleiro;
    private int vez = 1;
    private Jogador jogador1;
    private Jogador jogador2;
    public Scanner entrada = new Scanner(System.in);

    public JogoDaVelha() {
        tabuleiro = new Tabuleiro();
    }

    public void iniciarJogo() {
        this.iniciarJogadores();
        while (jogar());
    }

    private Jogador getJogadorEscolhido(int posicao) {
        int opcao = escolherJogador();
        Jogador jogador = null;

        if (opcao == 1) {
            jogador = new Humano(posicao);
        } else if (opcao == 2) {
            jogador = new ComputadorSequencial(posicao);
        } else if (opcao == 3){
            jogador = new ComputadorAleatorio(posicao);
        }else {
            jogador = new Jeziel_IA(posicao);
        }

        return jogador;
    }

    private void iniciarJogadores() {
        System.out.println("Quem vai ser o Jogador 1 ?");

        this.jogador1 = this.getJogadorEscolhido(1);

        System.out.println("----------------------");
        System.out.println("Quem vai ser o Jogador 2 ?");

        this.jogador2 = this.getJogadorEscolhido(2);
    }

    private int escolherJogador() {
        int opcao = 0;

        do {
            System.out.println("1. Humano");
            System.out.println("2. Computador Sequencial");
            System.out.println("3. Computador Aleatorio\n");
            System.out.println("4. Computador Jeziel\n");
            System.out.print("Opção: ");
            opcao = entrada.nextInt();

            if (opcao < 1 || opcao > 4) {
                System.out.println("Opção inválida! Tente novamente");
            }
        } while (opcao < 1 || opcao > 4);

        return opcao;
    }

    private boolean jogar() {
        if (ganhou() == 0) {
            System.out.println("----------------------");
            System.out.println("\nRodada " + this.tabuleiro.getRodada());
            System.out.println("É a vez do jogador " + vez());

            if (vez() == 1) {
                tabuleiro.executarRodada(jogador1);
            } else {
                tabuleiro.executarRodada(jogador2);
            }

             if (ganhou() == -1) {
                System.out.println("Jogador 1 ganhou!");
                return false;
            } else if (ganhou() == 1) {
                System.out.println("Jogador 2 ganhou!");
                return false;
            } else if (tabuleiro.tabuleiroCompleto()) {
                System.out.println("Tabuleiro Completo. Jogo empatado");
                return false;
            }
            vez++;

            return true;
        } else {
            if (ganhou() == -1) {
                System.out.println("Jogador 1 ganhou!");
            } else {
                System.out.println("Jogador 2 ganhou!");
            }

            return false;
        }

    }

    private int vez() {
        if (vez % 2 == 1) {
            return 1;
        } else {
            return 2;
        }
    }

    private int ganhou() {
        if (tabuleiro.checarLinhas() == 1) {
            return 1;
        }
        if (tabuleiro.checarColunas() == 1) {
            return 1;
        }
        if (tabuleiro.checarDiagonais() == 1) {
            return 1;
        }

        if (tabuleiro.checarLinhas() == -1) {
            return -1;
        }
        if (tabuleiro.checarColunas() == -1) {
            return -1;
        }
        if (tabuleiro.checarDiagonais() == -1) {
            return -1;
        }

        return 0;
    }

    public static void main(String[] args) {
        JogoDaVelha jogo = new JogoDaVelha();
        jogo.iniciarJogo();
    }

}
