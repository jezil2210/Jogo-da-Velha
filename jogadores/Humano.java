package jogadores;

/**
 *
 * @author Jeziel
 */
import java.util.Scanner;
import jogodavelha.Jogada;
import jogodavelha.Jogador;
import jogodavelha.Tabuleiro;

public class Humano extends Jogador{
    public Scanner entrada = new Scanner(System.in);
    
    public Humano(int posicao){
        super(posicao);        
        System.out.println("Jogador 'Humano' criado!");
    }
       
    @Override
    public Jogada getJogada(Tabuleiro tabuleiro){ 
        do{
            do{
                System.out.print("Linha: ");
                ultimaJogada.setLinha(entrada.nextInt());
                
                if( ultimaJogada.getLinha() > 3 ||ultimaJogada.getLinha() < 1)
                    System.out.println("Linha inválida. É 1, 2 ou 3");
                
            }while( ultimaJogada.getLinha() > 3 ||ultimaJogada.getLinha() < 1);
            
            do{
                System.out.print("Coluna: ");
                ultimaJogada.setColuna(entrada.nextInt());
                
                if(ultimaJogada.getColuna() > 3 ||ultimaJogada.getColuna() < 1)
                    System.out.println("Coluna inválida. É 1, 2 ou 3");
                
            }while(ultimaJogada.getColuna() > 3 ||ultimaJogada.getColuna() < 1);
            
            ultimaJogada.decrementarLinha(); 
            ultimaJogada.decrementarColuna();
            
            if(!checaTentativa(ultimaJogada, tabuleiro))
                System.out.println("Esse local já foi marcado. Tente outro.");
        }while( !checaTentativa(ultimaJogada, tabuleiro) );
        
        return ultimaJogada;
    }

}

