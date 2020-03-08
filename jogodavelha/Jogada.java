package jogodavelha;

public class Jogada {
    private int linha, coluna;

    
    public Jogada() {
    }
    public Jogada(int linha, int coluna) {
        this.linha = linha;
        this.coluna = coluna;
    }

    public int getLinha() {
        return linha;
    }

    public void setLinha(int linha) {
        this.linha = linha;
    }

    public int getColuna() {
        return coluna;
    }

    public void setColuna(int coluna) {
        this.coluna = coluna;
    }

    public void decrementarLinha() {
        this.linha--;
    }

    public void decrementarColuna() {
        this.coluna--;
    }
    
}
