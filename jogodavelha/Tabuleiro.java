package jogodavelha;

/**
 *
 * @author Jeziel
 */
public class Tabuleiro {
    private int rodada = 1;

    public int getRodada() {
        return rodada;
    }
    private int[][] tabuleiro = new int[3][3];

    public Tabuleiro() {
        zerarTabuleiro();
    }

   public void executarRodada(Jogador jogador) {
        Jogada jogada = null;
        while(true) {
             jogada = jogador.getJogada(this);
            if (jogador.checaTentativa(jogada, this)) {
                this.setPosicao(jogada, jogador);
                break;
            } else {
                System.out.println("Jogada Invalida!");
            }
        }
    }

    private void zerarTabuleiro() {
        for (int linha = 0; linha < 3; linha++) {
            for (int coluna = 0; coluna < 3; coluna++) {
                tabuleiro[linha][coluna] = 0;
            }
        }
    }

    public void exibirTabuleiro() {
        System.out.println();
        for (int linha = 0; linha < 3; linha++) {

            for (int coluna = 0; coluna < 3; coluna++) {

                if (tabuleiro[linha][coluna] == -1) {
                    System.out.print(" X ");
                }
                if (tabuleiro[linha][coluna] == 1) {
                    System.out.print(" O ");
                }
                if (tabuleiro[linha][coluna] == 0) {
                    System.out.print("   ");
                }

                if (coluna == 0 || coluna == 1) {
                    System.out.print("|");
                }
            }
            System.out.println();
        }

    }

    public int getPosicao(Jogada tentativa) {
        return tabuleiro[tentativa.getLinha()][tentativa.getColuna()];
    }

     public int getPosicao(int linha, int coluna) {
        return tabuleiro[linha][coluna];
    }

    private void setPosicao(Jogada tentativa, Jogador jogador) {
        if (jogador.getNumeroJogador() == 1) {
            tabuleiro[tentativa.getLinha()][tentativa.getColuna()] = -1;
        } else {
            tabuleiro[tentativa.getLinha()][tentativa.getColuna()] = 1;
        }

        exibirTabuleiro();
    }

    public int checarLinhas() {
        for (int linha = 0; linha < 3; linha++) {

            if ((tabuleiro[linha][0] + tabuleiro[linha][1] + tabuleiro[linha][2]) == -3) {
                return -1;
            }
            if ((tabuleiro[linha][0] + tabuleiro[linha][1] + tabuleiro[linha][2]) == 3) {
                return 1;
            }
        }

        return 0;

    }

    public int checarColunas() {
        for (int coluna = 0; coluna < 3; coluna++) {

            if ((tabuleiro[0][coluna] + tabuleiro[1][coluna] + tabuleiro[2][coluna]) == -3) {
                return -1;
            }
            if ((tabuleiro[0][coluna] + tabuleiro[1][coluna] + tabuleiro[2][coluna]) == 3) {
                return 1;
            }
        }

        return 0;

    }

    public int checarDiagonais() {
        if ((tabuleiro[0][0] + tabuleiro[1][1] + tabuleiro[2][2]) == -3) {
            return -1;
        }
        if ((tabuleiro[0][0] + tabuleiro[1][1] + tabuleiro[2][2]) == 3) {
            return 1;
        }
        if ((tabuleiro[0][2] + tabuleiro[1][1] + tabuleiro[2][0]) == -3) {
            return -1;
        }
        if ((tabuleiro[0][2] + tabuleiro[1][1] + tabuleiro[2][0]) == 3) {
            return 1;
        }

        return 0;
    }

    public boolean tabuleiroCompleto() {
        for (int linha = 0; linha < 3; linha++) {
            for (int coluna = 0; coluna < 3; coluna++) {
                if (tabuleiro[linha][coluna] == 0) {
                    return false;
                }
            }
        }
        return true;
    }
    public boolean tabuleiroVazio() {
        for (int linha = 0; linha < 3; linha++) {
            for (int coluna = 0; coluna < 3; coluna++) {
                if (tabuleiro[linha][coluna] != 0) {
                    return false;
                }
            }
        }
        return true;
    }

}
