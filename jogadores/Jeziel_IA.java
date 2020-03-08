package jogadores;

import java.util.Random;
import jogodavelha.Jogada;
import jogodavelha.Jogador;
import jogodavelha.JogoDaVelha;
import jogodavelha.Tabuleiro;

public class Jeziel_IA extends Jogador {

    private Random random = new Random();
    int i, j, h, z, k, l;

    public Jeziel_IA(int numeroJogador) {
        super(numeroJogador);
    }

    public int getMarcadorJogadorAtual() {
        if (numeroJogador == 1) {
            return -1;
        } else {
            return 1;
        }
    }

    public int VerificaColunaAtaqueTeste(Tabuleiro tabuleiro, int i, int j, int k, int l) {
        if (tabuleiro.getPosicao(new Jogada(i, j)) == this.getMarcadorJogadorAtual() && tabuleiro.getPosicao(new Jogada(i, j)) != 0
                && tabuleiro.getPosicao(new Jogada(k, l)) == this.getMarcadorJogadorAtual() && tabuleiro.getPosicao(new Jogada(k, l)) != 0) {
            if (i == 0 && j == 0 && k == 1 && l == 0) {
                return 1;
            } else if (i == 2 && j == 0 && k == 1 && l == 0) {
                return 1;
            } else if (i == 0 && j == 1 && k == 1 && l == 1) {
                return 1;
            } else if (i == 2 && j == 1 && k == 1 && l == 1) {
                return 1;
            } else if (i == 0 && j == 2 && k == 1 && l == 2) {
                return 1;
            } else if (i == 2 && j == 2 && k == 1 && l == 2) {
                return 1;
            } else if (i == 0 && j == 0 && k == 2 && l == 0) {
                return 1;
            } else if (i == 2 && j == 1 && k == 0 && l == 1) {
                return 1;
            } else if (i == 0 && j == 2 && k == 2 && l == 2) {
                return 1;
            }

        }

        return -1;
    }

    public boolean VerificaColunaAtaque(Tabuleiro tabuleiro) {
        if (VerificaColunaAtaqueTeste(tabuleiro, 0, 0, 1, 0) == 1) {
            if (checaTentativa(new Jogada(2, 0), tabuleiro)) {
                ultimaJogada.setLinha(2);
                ultimaJogada.setColuna(0);
                return true;
            }
        }
        if (VerificaColunaAtaqueTeste(tabuleiro, 2, 0, 1, 0) == 1) {
            if (checaTentativa(new Jogada(0, 0), tabuleiro)) {
                ultimaJogada.setLinha(0);
                ultimaJogada.setColuna(0);
                return true;
            }
        }
        if (VerificaColunaAtaqueTeste(tabuleiro, 0, 1, 1, 1) == 1) {
            if (checaTentativa(new Jogada(2, 1), tabuleiro)) {
                ultimaJogada.setLinha(2);
                ultimaJogada.setColuna(1);
                return true;
            }
        }
        if (VerificaColunaAtaqueTeste(tabuleiro, 2, 1, 1, 1) == 1) {
            if (checaTentativa(new Jogada(0, 1), tabuleiro)) {
                ultimaJogada.setLinha(0);
                ultimaJogada.setColuna(1);
                return true;
            }
        }
        if (VerificaColunaAtaqueTeste(tabuleiro, 0, 2, 1, 2) == 1) {
            if (checaTentativa(new Jogada(2, 2), tabuleiro)) {
                ultimaJogada.setLinha(2);
                ultimaJogada.setColuna(2);
                return true;
            }
        }
        if (VerificaColunaAtaqueTeste(tabuleiro, 2, 2, 1, 2) == 1) {
            if (checaTentativa(new Jogada(0, 2), tabuleiro)) {
                ultimaJogada.setLinha(0);
                ultimaJogada.setColuna(2);
                return true;
            }
        }
        if (VerificaColunaAtaqueTeste(tabuleiro, 0, 0, 2, 0) == 1) {
            if (checaTentativa(new Jogada(1, 0), tabuleiro)) {
                ultimaJogada.setLinha(1);
                ultimaJogada.setColuna(0);
                return true;
            }
        }
        if (VerificaColunaAtaqueTeste(tabuleiro, 2, 1, 0, 1) == 1) {
            if (checaTentativa(new Jogada(1, 1), tabuleiro)) {
                ultimaJogada.setLinha(1);
                ultimaJogada.setColuna(1);
                return true;
            }
        }
        if (VerificaColunaAtaqueTeste(tabuleiro, 0, 2, 2, 2) == 1) {
            if (checaTentativa(new Jogada(1, 2), tabuleiro)) {
                ultimaJogada.setLinha(1);
                ultimaJogada.setColuna(2);
                return true;
            }
        }
        return false;
    }

    public int VerificaLinhaAtaqueTeste(Tabuleiro tabuleiro, int i, int j, int k, int l) {
        if (tabuleiro.getPosicao(new Jogada(i, j)) == this.getMarcadorJogadorAtual() && tabuleiro.getPosicao(new Jogada(i, j)) != 0
                && tabuleiro.getPosicao(new Jogada(k, l)) == this.getMarcadorJogadorAtual() && tabuleiro.getPosicao(new Jogada(k, l)) != 0) {
            if (i == 0 && j == 0 && k == 0 && l == 1) {
                return 2;
            } else if (i == 0 && j == 1 && k == 0 && l == 2) {
                return 2;
            } else if (i == 0 && j == 0 && k == 0 && l == 2) {
                return 2;
            } else if (i == 1 && j == 0 && k == 1 && l == 1) {
                return 2;
            } else if (i == 1 && j == 1 && k == 1 && l == 2) {
                return 2;
            } else if (i == 1 && j == 0 && k == 1 && l == 2) {
                return 2;
            } else if (i == 2 && j == 0 && k == 2 && l == 1) {
                return 2;
            } else if (i == 2 && j == 1 && k == 2 && l == 2) {
                return 2;
            } else if (i == 2 && j == 0 && k == 2 && l == 2) {
                return 2;
            }

        }

        return -1;
    }

    public boolean VerificaLinhaAtaque(Tabuleiro tabuleiro) {
        if (VerificaLinhaAtaqueTeste(tabuleiro, 0, 0, 0, 1) == 2) {
            if (checaTentativa(new Jogada(0, 2), tabuleiro)) {
                ultimaJogada.setLinha(0);
                ultimaJogada.setColuna(2);
                return true;
            }
        }
        if (VerificaLinhaAtaqueTeste(tabuleiro, 0, 1, 0, 2) == 2) {
            if (checaTentativa(new Jogada(0, 0), tabuleiro)) {
                ultimaJogada.setLinha(0);
                ultimaJogada.setColuna(0);
                return true;
            }
        }
        if (VerificaLinhaAtaqueTeste(tabuleiro, 0, 0, 0, 2) == 2) {
            if (checaTentativa(new Jogada(0, 1), tabuleiro)) {
                ultimaJogada.setLinha(0);
                ultimaJogada.setColuna(1);
                return true;
            }
        }
        if (VerificaLinhaAtaqueTeste(tabuleiro, 1, 0, 1, 1) == 2) {
            if (checaTentativa(new Jogada(1, 2), tabuleiro)) {
                ultimaJogada.setLinha(1);
                ultimaJogada.setColuna(2);
                return true;
            }
        }
        if (VerificaLinhaAtaqueTeste(tabuleiro, 1, 1, 1, 2) == 2) {
            if (checaTentativa(new Jogada(1, 0), tabuleiro)) {
                ultimaJogada.setLinha(1);
                ultimaJogada.setColuna(0);
                return true;
            }
        }
        if (VerificaLinhaAtaqueTeste(tabuleiro, 1, 0, 1, 2) == 2) {
            if (checaTentativa(new Jogada(1, 1), tabuleiro)) {
                ultimaJogada.setLinha(1);
                ultimaJogada.setColuna(1);
                return true;
            }
        }
        if (VerificaLinhaAtaqueTeste(tabuleiro, 2, 0, 2, 1) == 2) {
            if (checaTentativa(new Jogada(2, 2), tabuleiro)) {
                ultimaJogada.setLinha(2);
                ultimaJogada.setColuna(2);
                return true;
            }
        }
        if (VerificaLinhaAtaqueTeste(tabuleiro, 2, 1, 2, 2) == 2) {
            if (checaTentativa(new Jogada(2, 0), tabuleiro)) {
                ultimaJogada.setLinha(2);
                ultimaJogada.setColuna(0);
                return true;
            }
        }
        if (VerificaLinhaAtaqueTeste(tabuleiro, 2, 0, 2, 2) == 2) {
            if (checaTentativa(new Jogada(2, 1), tabuleiro)) {
                ultimaJogada.setLinha(2);
                ultimaJogada.setColuna(1);
                return true;
            }
        }
        return false;
    }

    public int VerificaDiagonalAtaqueTeste(Tabuleiro tabuleiro, int i, int j, int k, int l) {
        if (tabuleiro.getPosicao(new Jogada(i, j)) == this.getMarcadorJogadorAtual() && tabuleiro.getPosicao(new Jogada(i, j)) != 0
                && tabuleiro.getPosicao(new Jogada(k, l)) == this.getMarcadorJogadorAtual() && tabuleiro.getPosicao(new Jogada(k, l)) != 0) {
            if (i == 0 && j == 0 && k == 1 && l == 1) {
                return 2;
            } else if (i == 1 && j == 1 && k == 2 && l == 2) {
                return 2;
            } else if (i == 0 && j == 0 && k == 2 && l == 2) {
                return 2;
            } else if (i == 0 && j == 2 && k == 1 && l == 1) {
                return 2;
            } else if (i == 2 && j == 0 && k == 1 && l == 1) {
                return 2;
            } else if (i == 2 && j == 0 && k == 0 && l == 2) {
                return 2;
            }
        }

        return -1;
    }

    public boolean VerificaDiagonalAtaque(Tabuleiro tabuleiro) {
        if (VerificaDiagonalAtaqueTeste(tabuleiro, 0, 0, 1, 1) == 2) {
            if (checaTentativa(new Jogada(2, 2), tabuleiro)) {
                ultimaJogada.setLinha(2);
                ultimaJogada.setColuna(2);
                return true;
            }
        }
        if (VerificaDiagonalAtaqueTeste(tabuleiro, 1, 1, 2, 2) == 2) {
            if (checaTentativa(new Jogada(0, 0), tabuleiro)) {
                ultimaJogada.setLinha(0);
                ultimaJogada.setColuna(0);
                return true;
            }
        }
        if (VerificaDiagonalAtaqueTeste(tabuleiro, 0, 0, 2, 2) == 2) {
            if (checaTentativa(new Jogada(1, 1), tabuleiro)) {
                ultimaJogada.setLinha(1);
                ultimaJogada.setColuna(1);
                return true;
            }
        }
        if (VerificaDiagonalAtaqueTeste(tabuleiro, 0, 2, 1, 1) == 2) {
            if (checaTentativa(new Jogada(2, 0), tabuleiro)) {
                ultimaJogada.setLinha(2);
                ultimaJogada.setColuna(0);
                return true;
            }
        }
        if (VerificaDiagonalAtaqueTeste(tabuleiro, 2, 0, 1, 1) == 2) {
            if (checaTentativa(new Jogada(0, 2), tabuleiro)) {
                ultimaJogada.setLinha(0);
                ultimaJogada.setColuna(2);
                return true;
            }
        }
        if (VerificaDiagonalAtaqueTeste(tabuleiro, 2, 0, 0, 2) == 2) {
            if (checaTentativa(new Jogada(1, 1), tabuleiro)) {
                ultimaJogada.setLinha(1);
                ultimaJogada.setColuna(1);
                return true;
            }
        }
        return false;
    }

    //VERIFICA SE AS POSIÇÕES ESTÃO OCUPADAS PELO O ADVERSARIO, SE ESTIVEREM ELE VERIFICA CADA POSSIBLIDADE DO ADVERSARIO 
    //FORMAR UMA LINHA 
    public int VerificaColunaTeste(Tabuleiro tabuleiro, int i, int j, int k, int l) {
        if (tabuleiro.getPosicao(new Jogada(i, j)) != this.getMarcadorJogadorAtual() && tabuleiro.getPosicao(new Jogada(i, j)) != 0
                && tabuleiro.getPosicao(new Jogada(k, l)) != this.getMarcadorJogadorAtual() && tabuleiro.getPosicao(new Jogada(k, l)) != 0) {
            if (i == 0 && j == 0 && k == 1 && l == 0) {
                return 2;
            } else if (i == 2 && j == 0 && k == 1 && l == 0) {
                return 2;
            } else if (i == 0 && j == 1 && k == 1 && l == 1) {
                return 2;
            } else if (i == 2 && j == 1 && k == 1 && l == 1) {
                return 2;
            } else if (i == 0 && j == 2 && k == 1 && l == 2) {
                return 2;
            } else if (i == 2 && j == 2 && k == 1 && l == 2) {
                return 2;
            } else if (i == 0 && j == 0 && k == 2 && l == 0) {
                return 2;
            } else if (i == 2 && j == 1 && k == 0 && l == 1) {
                return 2;
            } else if (i == 0 && j == 2 && k == 2 && l == 2) {
                return 2;
            }

        }

        return -1;
    }

    public boolean VerificaColuna(Tabuleiro tabuleiro) {
        if (VerificaColunaTeste(tabuleiro, 0, 0, 1, 0) == 2) {
            if (checaTentativa(new Jogada(2, 0), tabuleiro)) {
                ultimaJogada.setLinha(2);
                ultimaJogada.setColuna(0);
                return true;
            }
            return true;
        }
        if (VerificaColunaTeste(tabuleiro, 2, 0, 1, 0) == 2) {
            if (checaTentativa(new Jogada(0, 0), tabuleiro)) {
                ultimaJogada.setLinha(0);
                ultimaJogada.setColuna(0);
                return true;
            }
            return true;
        }
        if (VerificaColunaTeste(tabuleiro, 0, 1, 1, 1) == 2) {
            if (checaTentativa(new Jogada(2, 1), tabuleiro)) {
                ultimaJogada.setLinha(2);
                ultimaJogada.setColuna(1);
                return true;
            }
            return true;
        }
        if (VerificaColunaTeste(tabuleiro, 2, 1, 1, 1) == 2) {
            if (checaTentativa(new Jogada(0, 1), tabuleiro)) {
                ultimaJogada.setLinha(0);
                ultimaJogada.setColuna(1);
                return true;
            }
        }
        if (VerificaColunaTeste(tabuleiro, 0, 2, 1, 2) == 2) {
            if (checaTentativa(new Jogada(2, 2), tabuleiro)) {
                ultimaJogada.setLinha(2);
                ultimaJogada.setColuna(2);
                return true;
            }
        }
        if (VerificaColunaTeste(tabuleiro, 2, 2, 1, 2) == 2) {
            if (checaTentativa(new Jogada(0, 2), tabuleiro)) {
                ultimaJogada.setLinha(0);
                ultimaJogada.setColuna(2);
                return true;
            }
        }
        if (VerificaColunaTeste(tabuleiro, 0, 0, 2, 0) == 2) {
            if (checaTentativa(new Jogada(1, 0), tabuleiro)) {
                ultimaJogada.setLinha(1);
                ultimaJogada.setColuna(0);
                return true;
            }
        }
        if (VerificaColunaTeste(tabuleiro, 2, 1, 0, 1) == 2) {
            if (checaTentativa(new Jogada(1, 1), tabuleiro)) {
                ultimaJogada.setLinha(1);
                ultimaJogada.setColuna(1);
                return true;
            }
        }
        if (VerificaColunaTeste(tabuleiro, 0, 2, 2, 2) == 2) {
            if (checaTentativa(new Jogada(1, 2), tabuleiro)) {
                ultimaJogada.setLinha(1);
                ultimaJogada.setColuna(2);
                return true;
            }
        }
        return false;
    }

    public int VerificaLinhaTeste(Tabuleiro tabuleiro, int i, int j, int k, int l) {
        if (tabuleiro.getPosicao(new Jogada(i, j)) != this.getMarcadorJogadorAtual() && tabuleiro.getPosicao(new Jogada(i, j)) != 0
                && tabuleiro.getPosicao(new Jogada(k, l)) != this.getMarcadorJogadorAtual() && tabuleiro.getPosicao(new Jogada(k, l)) != 0) {
            if (i == 0 && j == 0 && k == 0 && l == 1) {
                return 2;
            } else if (i == 0 && j == 1 && k == 0 && l == 2) {
                return 2;
            } else if (i == 0 && j == 0 && k == 0 && l == 2) {
                return 2;
            } else if (i == 1 && j == 0 && k == 1 && l == 1) {
                return 2;
            } else if (i == 1 && j == 1 && k == 1 && l == 2) {
                return 2;
            } else if (i == 1 && j == 0 && k == 1 && l == 2) {
                return 2;
            } else if (i == 2 && j == 0 && k == 2 && l == 1) {
                return 2;
            } else if (i == 2 && j == 1 && k == 2 && l == 2) {
                return 2;
            } else if (i == 2 && j == 0 && k == 2 && l == 2) {
                return 2;
            }

        }

        return -1;
    }

    public boolean VerificaLinha(Tabuleiro tabuleiro) {
        if (VerificaLinhaTeste(tabuleiro, 0, 0, 0, 1) == 2) {
            if (checaTentativa(new Jogada(0, 2), tabuleiro)) {
                ultimaJogada.setLinha(0);
                ultimaJogada.setColuna(2);
                return true;
            }
        }
        if (VerificaLinhaTeste(tabuleiro, 0, 1, 0, 2) == 2) {
            if (checaTentativa(new Jogada(0, 2), tabuleiro)) {
                ultimaJogada.setLinha(0);
                ultimaJogada.setColuna(0);
                return true;
            }
        }
        if (VerificaLinhaTeste(tabuleiro, 0, 0, 0, 2) == 2) {
            if (checaTentativa(new Jogada(0, 1), tabuleiro)) {
                ultimaJogada.setLinha(0);
                ultimaJogada.setColuna(1);
                return true;
            }
        }
        if (VerificaLinhaTeste(tabuleiro, 1, 0, 1, 1) == 2) {
            if (checaTentativa(new Jogada(1, 2), tabuleiro)) {
                ultimaJogada.setLinha(1);
                ultimaJogada.setColuna(2);
                return true;
            }
        }
        if (VerificaLinhaTeste(tabuleiro, 1, 1, 1, 2) == 2) {
            if (checaTentativa(new Jogada(1, 0), tabuleiro)) {
                ultimaJogada.setLinha(1);
                ultimaJogada.setColuna(0);
                return true;
            }
        }
        if (VerificaLinhaTeste(tabuleiro, 1, 0, 1, 2) == 2) {
            if (checaTentativa(new Jogada(1, 1), tabuleiro)) {
                ultimaJogada.setLinha(1);
                ultimaJogada.setColuna(1);
                return true;
            }
        }
        if (VerificaLinhaTeste(tabuleiro, 2, 0, 2, 1) == 2) {
            if (checaTentativa(new Jogada(2, 2), tabuleiro)) {
                ultimaJogada.setLinha(2);
                ultimaJogada.setColuna(2);
                return true;
            }
        }
        if (VerificaLinhaTeste(tabuleiro, 2, 1, 2, 2) == 2) {
            if (checaTentativa(new Jogada(2, 0), tabuleiro)) {
                ultimaJogada.setLinha(2);
                ultimaJogada.setColuna(0);
                return true;
            }
        }
        if (VerificaLinhaTeste(tabuleiro, 2, 0, 2, 2) == 2) {
            if (checaTentativa(new Jogada(2, 1), tabuleiro)) {
                ultimaJogada.setLinha(2);
                ultimaJogada.setColuna(1);
                return true;
            }
        }
        return false;
    }

    public int VerificaDiagonalTeste(Tabuleiro tabuleiro, int i, int j, int k, int l) {
        if (tabuleiro.getPosicao(new Jogada(i, j)) != this.getMarcadorJogadorAtual() && tabuleiro.getPosicao(new Jogada(i, j)) != 0
                && tabuleiro.getPosicao(new Jogada(k, l)) != this.getMarcadorJogadorAtual() && tabuleiro.getPosicao(new Jogada(k, l)) != 0) {
            if (i == 0 && j == 0 && k == 1 && l == 1) {
                return 2;
            } else if (i == 1 && j == 1 && k == 2 && l == 2) {
                return 2;
            } else if (i == 0 && j == 0 && k == 2 && l == 2) {
                return 2;
            } else if (i == 0 && j == 2 && k == 1 && l == 1) {
                return 2;
            } else if (i == 2 && j == 0 && k == 1 && l == 1) {
                return 2;
            } else if (i == 2 && j == 0 && k == 0 && l == 2) {
                return 2;
            }
        }

        return -1;
    }

    public boolean VerificaDiagonal(Tabuleiro tabuleiro) {
        if (VerificaDiagonalTeste(tabuleiro, 0, 0, 1, 1) == 2) {
            if (checaTentativa(new Jogada(2, 2), tabuleiro)) {
                ultimaJogada.setLinha(2);
                ultimaJogada.setColuna(2);
                return true;
            }
        }
        if (VerificaDiagonalTeste(tabuleiro, 1, 1, 2, 2) == 2) {
            if (checaTentativa(new Jogada(0, 0), tabuleiro)) {
                ultimaJogada.setLinha(0);
                ultimaJogada.setColuna(0);
                return true;
            }
        }
        if (VerificaDiagonalTeste(tabuleiro, 0, 0, 2, 2) == 2) {
            if (checaTentativa(new Jogada(1, 1), tabuleiro)) {
                ultimaJogada.setLinha(1);
                ultimaJogada.setColuna(1);
                return true;
            }
        }
        if (VerificaDiagonalTeste(tabuleiro, 0, 2, 1, 1) == 2) {
            if (checaTentativa(new Jogada(2, 0), tabuleiro)) {
                ultimaJogada.setLinha(2);
                ultimaJogada.setColuna(0);
                return true;
            }
        }
        if (VerificaDiagonalTeste(tabuleiro, 2, 0, 1, 1) == 2) {
            if (checaTentativa(new Jogada(0, 2), tabuleiro)) {
                ultimaJogada.setLinha(0);
                ultimaJogada.setColuna(2);
                return true;
            }
        }
        if (VerificaDiagonalTeste(tabuleiro, 2, 0, 0, 2) == 2) {
            if (checaTentativa(new Jogada(1, 1), tabuleiro)) {
                ultimaJogada.setLinha(1);
                ultimaJogada.setColuna(1);
                return true;
            }
        }
        return false;
    }

    public void Defesa(Tabuleiro tabuleiro) {

        if (tabuleiro.getPosicao(new Jogada(0, 0)) != this.getMarcadorJogadorAtual()) {
            if (VerificaColuna(tabuleiro) == false && VerificaLinha(tabuleiro) == false && VerificaDiagonal(tabuleiro) == false) {
                if (checaTentativa(new Jogada(0, 0), tabuleiro)) {
                    ultimaJogada.setLinha(0);
                    ultimaJogada.setColuna(0);
                    return;
                }
            }

        }
        if (tabuleiro.getPosicao(new Jogada(0, 2)) != this.getMarcadorJogadorAtual()) {
            if (VerificaColuna(tabuleiro) == false && VerificaLinha(tabuleiro) == false && VerificaDiagonal(tabuleiro) == false) {
                if (checaTentativa(new Jogada(0, 2), tabuleiro)) {
                    ultimaJogada.setLinha(0);
                    ultimaJogada.setColuna(2);
                    return;
                }
            }
        }
        if (tabuleiro.getPosicao(new Jogada(2, 0)) != this.getMarcadorJogadorAtual()) {
            if (VerificaColuna(tabuleiro) == false && VerificaLinha(tabuleiro) == false && VerificaDiagonal(tabuleiro) == false) {
                if (checaTentativa(new Jogada(2, 0), tabuleiro)) {
                    ultimaJogada.setLinha(2);
                    ultimaJogada.setColuna(0);
                    return;
                }
            }

        }
        if (tabuleiro.getPosicao(new Jogada(1, 0)) != this.getMarcadorJogadorAtual()) {
            if (VerificaColuna(tabuleiro) == false && VerificaLinha(tabuleiro) == false && VerificaDiagonal(tabuleiro) == false) {
                if (checaTentativa(new Jogada(1, 0), tabuleiro)) {
                    ultimaJogada.setLinha(1);
                    ultimaJogada.setColuna(0);
                    return;
                }
            }
        }
        if (tabuleiro.getPosicao(new Jogada(0, 1)) != this.getMarcadorJogadorAtual()) {
            if (VerificaColuna(tabuleiro) == false && VerificaLinha(tabuleiro) == false && VerificaDiagonal(tabuleiro) == false) {
                if (checaTentativa(new Jogada(0, 1), tabuleiro)) {
                    ultimaJogada.setLinha(0);
                    ultimaJogada.setColuna(1);
                    return;
                }
            }
        }
        if (tabuleiro.getPosicao(new Jogada(2, 2)) != this.getMarcadorJogadorAtual()) {
            if (VerificaColuna(tabuleiro) == false && VerificaLinha(tabuleiro) == false && VerificaDiagonal(tabuleiro) == false) {
                if (checaTentativa(new Jogada(2, 2), tabuleiro)) {
                    ultimaJogada.setLinha(2);
                    ultimaJogada.setColuna(2);
                    return;
                }
            }
        }
    }
    public void Defesa2(Tabuleiro tabuleiro) {

        if (tabuleiro.getPosicao(new Jogada(1, 1)) != this.getMarcadorJogadorAtual()) {
            if (VerificaColuna(tabuleiro) == false && VerificaLinha(tabuleiro) == false && VerificaDiagonal(tabuleiro) == false) {
                if (checaTentativa(new Jogada(1,1), tabuleiro)) {
                    ultimaJogada.setLinha(1);
                    ultimaJogada.setColuna(1);
                    return;
                }
            }

        }
        if (tabuleiro.getPosicao(new Jogada(2,2 )) != this.getMarcadorJogadorAtual()) {
            if (VerificaColuna(tabuleiro) == false && VerificaLinha(tabuleiro) == false && VerificaDiagonal(tabuleiro) == false) {
                if (checaTentativa(new Jogada(2, 2), tabuleiro)) {
                    ultimaJogada.setLinha(2);
                    ultimaJogada.setColuna(2);
                    return;
                }
            }
        }
        if (tabuleiro.getPosicao(new Jogada(2, 1)) != this.getMarcadorJogadorAtual()) {
            if (VerificaColuna(tabuleiro) == false && VerificaLinha(tabuleiro) == false && VerificaDiagonal(tabuleiro) == false) {
                if (checaTentativa(new Jogada(2, 1), tabuleiro)) {
                    ultimaJogada.setLinha(2);
                    ultimaJogada.setColuna(1);
                    return;
                }
            }

        }
        if (tabuleiro.getPosicao(new Jogada(0, 2)) != this.getMarcadorJogadorAtual()) {
            if (VerificaColuna(tabuleiro) == false && VerificaLinha(tabuleiro) == false && VerificaDiagonal(tabuleiro) == false) {
                if (checaTentativa(new Jogada(0, 2), tabuleiro)) {
                    ultimaJogada.setLinha(0);
                    ultimaJogada.setColuna(2);
                    return;
                }
            }
        }
        if (tabuleiro.getPosicao(new Jogada(2, 0)) != this.getMarcadorJogadorAtual()) {
            if (VerificaColuna(tabuleiro) == false && VerificaLinha(tabuleiro) == false && VerificaDiagonal(tabuleiro) == false) {
                if (checaTentativa(new Jogada(2, 0), tabuleiro)) {
                    ultimaJogada.setLinha(2);
                    ultimaJogada.setColuna(0);
                    return;
                }
            }
        }
        if (tabuleiro.getPosicao(new Jogada(1, 2)) != this.getMarcadorJogadorAtual()) {
            if (VerificaColuna(tabuleiro) == false && VerificaLinha(tabuleiro) == false && VerificaDiagonal(tabuleiro) == false) {
                if (checaTentativa(new Jogada(1, 2), tabuleiro)) {
                    ultimaJogada.setLinha(1);
                    ultimaJogada.setColuna(2);
                    return;
                }
            }
        }
        if (tabuleiro.getPosicao(new Jogada(1, 0)) != this.getMarcadorJogadorAtual()) {
            if (VerificaColuna(tabuleiro) == false && VerificaLinha(tabuleiro) == false && VerificaDiagonal(tabuleiro) == false) {
                if (checaTentativa(new Jogada(1, 0), tabuleiro)) {
                    ultimaJogada.setLinha(1);
                    ultimaJogada.setColuna(0);
                    return;
                }
            }
        }
    }

    public void Ataque(Tabuleiro tabuleiro) {

        boolean achouJogadaValida = false;

        if (tabuleiro.getPosicao(new Jogada(0, 0)) == this.getMarcadorJogadorAtual() && tabuleiro.getPosicao(new Jogada(0, 0)) != 0) {
            achouJogadaValida = VerificaColunaAtaque(tabuleiro);
            if (!achouJogadaValida) {
                achouJogadaValida = VerificaLinhaAtaque(tabuleiro);
            }
            if (!achouJogadaValida) {
                achouJogadaValida = VerificaDiagonalAtaque(tabuleiro);
            }
        }
        if (tabuleiro.getPosicao(new Jogada(0, 2)) == this.getMarcadorJogadorAtual() && tabuleiro.getPosicao(new Jogada(0, 2)) != 0) {
            if (!achouJogadaValida) {
                VerificaColunaAtaque(tabuleiro);
            }
            if (!achouJogadaValida) {
                VerificaLinhaAtaque(tabuleiro);
            }
            if (!achouJogadaValida) {
                VerificaDiagonalAtaque(tabuleiro);
            }
        }
        if (tabuleiro.getPosicao(new Jogada(2, 0)) == this.getMarcadorJogadorAtual() && tabuleiro.getPosicao(new Jogada(2, 0)) != 0) {
            if (!achouJogadaValida) {
                VerificaColunaAtaque(tabuleiro);
            }
            if (!achouJogadaValida) {
                VerificaLinhaAtaque(tabuleiro);
            }
            if (!achouJogadaValida) {
                VerificaDiagonalAtaque(tabuleiro);
            }
        }
        if (tabuleiro.getPosicao(new Jogada(1, 0)) == this.getMarcadorJogadorAtual() && tabuleiro.getPosicao(new Jogada(1, 0)) != 0) {
            if (!achouJogadaValida) {
                VerificaColunaAtaque(tabuleiro);
            }
            if (!achouJogadaValida) {
                VerificaLinhaAtaque(tabuleiro);
            }
            if (!achouJogadaValida) {
                VerificaDiagonalAtaque(tabuleiro);
            }
        }
        if (tabuleiro.getPosicao(new Jogada(0, 1)) == this.getMarcadorJogadorAtual() && tabuleiro.getPosicao(new Jogada(0, 1)) != 0) {
            if (!achouJogadaValida) {
                VerificaColunaAtaque(tabuleiro);
            }
            if (!achouJogadaValida) {
                VerificaLinhaAtaque(tabuleiro);
            }
            if (!achouJogadaValida) {
                VerificaDiagonalAtaque(tabuleiro);
            }
            if (tabuleiro.getPosicao(new Jogada(2, 2)) == this.getMarcadorJogadorAtual() && tabuleiro.getPosicao(new Jogada(2, 2)) != 0) {
                if (!achouJogadaValida) {
                    VerificaColunaAtaque(tabuleiro);
                }
                if (!achouJogadaValida) {
                    VerificaLinhaAtaque(tabuleiro);
                }
                if (!achouJogadaValida) {
                    VerificaDiagonalAtaque(tabuleiro);
                }
            }
            if (tabuleiro.getPosicao(new Jogada(2, 1)) == this.getMarcadorJogadorAtual() && tabuleiro.getPosicao(new Jogada(2, 1)) != 0) {
                if (!achouJogadaValida) {
                    VerificaColunaAtaque(tabuleiro);
                }
                if (!achouJogadaValida) {
                    VerificaLinhaAtaque(tabuleiro);
                }
                if (!achouJogadaValida) {
                    VerificaDiagonalAtaque(tabuleiro);
                }
            }
        }
    }
    
    public void Ataque2(Tabuleiro tabuleiro) {

        boolean achouJogadaValida = false;

        if (tabuleiro.getPosicao(new Jogada(1,1)) == this.getMarcadorJogadorAtual() && tabuleiro.getPosicao(new Jogada(1, 1)) != 0) {
            achouJogadaValida = VerificaColunaAtaque(tabuleiro);
            if (!achouJogadaValida) {
                achouJogadaValida = VerificaLinhaAtaque(tabuleiro);
            }
            if (!achouJogadaValida) {
                achouJogadaValida = VerificaDiagonalAtaque(tabuleiro);
            }
        }
        if (tabuleiro.getPosicao(new Jogada(2, 2)) == this.getMarcadorJogadorAtual() && tabuleiro.getPosicao(new Jogada(2, 2)) != 0) {
            if (!achouJogadaValida) {
                VerificaColunaAtaque(tabuleiro);
            }
            if (!achouJogadaValida) {
                VerificaLinhaAtaque(tabuleiro);
            }
            if (!achouJogadaValida) {
                VerificaDiagonalAtaque(tabuleiro);
            }
        }
        if (tabuleiro.getPosicao(new Jogada(2, 1)) == this.getMarcadorJogadorAtual() && tabuleiro.getPosicao(new Jogada(2, 1)) != 0) {
            if (!achouJogadaValida) {
                VerificaColunaAtaque(tabuleiro);
            }
            if (!achouJogadaValida) {
                VerificaLinhaAtaque(tabuleiro);
            }
            if (!achouJogadaValida) {
                VerificaDiagonalAtaque(tabuleiro);
            }
        }
        if (tabuleiro.getPosicao(new Jogada(0, 2)) == this.getMarcadorJogadorAtual() && tabuleiro.getPosicao(new Jogada(0, 2)) != 0) {
            if (!achouJogadaValida) {
                VerificaColunaAtaque(tabuleiro);
            }
            if (!achouJogadaValida) {
                VerificaLinhaAtaque(tabuleiro);
            }
            if (!achouJogadaValida) {
                VerificaDiagonalAtaque(tabuleiro);
            }
        }
        if (tabuleiro.getPosicao(new Jogada(2, 0)) == this.getMarcadorJogadorAtual() && tabuleiro.getPosicao(new Jogada(2, 0)) != 0) {
            if (!achouJogadaValida) {
                VerificaColunaAtaque(tabuleiro);
            }
            if (!achouJogadaValida) {
                VerificaLinhaAtaque(tabuleiro);
            }
            if (!achouJogadaValida) {
                VerificaDiagonalAtaque(tabuleiro);
            }
            if (tabuleiro.getPosicao(new Jogada(1, 2)) == this.getMarcadorJogadorAtual() && tabuleiro.getPosicao(new Jogada(1, 2)) != 0) {
                if (!achouJogadaValida) {
                    VerificaColunaAtaque(tabuleiro);
                }
                if (!achouJogadaValida) {
                    VerificaLinhaAtaque(tabuleiro);
                }
                if (!achouJogadaValida) {
                    VerificaDiagonalAtaque(tabuleiro);
                }
            }
            if (tabuleiro.getPosicao(new Jogada(1, 0)) == this.getMarcadorJogadorAtual() && tabuleiro.getPosicao(new Jogada(1, 0)) != 0) {
                if (!achouJogadaValida) {
                    VerificaColunaAtaque(tabuleiro);
                }
                if (!achouJogadaValida) {
                    VerificaLinhaAtaque(tabuleiro);
                }
                if (!achouJogadaValida) {
                    VerificaDiagonalAtaque(tabuleiro);
                }
            }
        }
    }

    public Jogada getJogada(Tabuleiro tabuleiro) {

        //se o meu bot começar
        if (numeroJogador == 1) {
            do {
                Defesa(tabuleiro);
                Ataque(tabuleiro);

            } while (tabuleiro.tabuleiroCompleto() == true);

            if (!this.checaTentativa(ultimaJogada, tabuleiro)) {
                for (int i = 0; i < 3 && !this.checaTentativa(ultimaJogada, tabuleiro); i++) {
                    ultimaJogada.setLinha(i);
                    for (int j = 0; j < 3 && !this.checaTentativa(ultimaJogada, tabuleiro); j++) {
                        ultimaJogada.setColuna(j);
                    }
                }
            }

            // se o usuario começou        
        } else if (numeroJogador == 2) {
            do {
                Defesa2(tabuleiro);
                Ataque2(tabuleiro);

            } while (tabuleiro.tabuleiroCompleto() == true);

            if (!this.checaTentativa(ultimaJogada, tabuleiro)) {
                for (int i = 0; i < 3 && !this.checaTentativa(ultimaJogada, tabuleiro); i++) {
                    ultimaJogada.setLinha(i);
                    for (int j = 0; j < 3 && !this.checaTentativa(ultimaJogada, tabuleiro); j++) {
                        ultimaJogada.setColuna(j);
                    }
                }
            }
        }

        return ultimaJogada;
    }

}
