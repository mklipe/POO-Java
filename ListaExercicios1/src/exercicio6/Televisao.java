
package exercicio6;

import java.util.Scanner;

public class Televisao {
    
    private int quantidadeCanais;
    private int volumeMaximo;
    private int volume = 0;
    private int canal = 1;

    public Televisao(int quantidadeCanais, int volumeMaximo){
        this.quantidadeCanais = quantidadeCanais;
        this.volumeMaximo = volumeMaximo;
    }
    
    public void aumentarVolume(){
        
        if (volume == volumeMaximo){
            System.out.println("JÁ ESTÁ NO VOLUME MÁXIMO");
        } else {
            volume++;
        }
    }
    
    public void diminuirVolume(){
        
        if (volume == 0){
            System.out.println("JÁ ESTÁ NO VOLUME MÍNIMO");
        } else {
            volume--;
        }
    }
    
    
    public void aumentarCanal(){
        
        if (canal == quantidadeCanais){
           canal = 1;
        } else {
            canal++;
        }
    }
    
    public void diminuirCanal(){
        
        if (canal == 0 || canal == 1){
            canal = quantidadeCanais;
        } else {
            canal--;
        }
    }
    
    public void selecionarCanal(int canal){
        
        if (canal > quantidadeCanais){
            System.out.println("CANAL INVÁLIDO.");
        } else {
            this.canal = canal;
        }
        
    }
    
    
    
    public void imprimirStatus(){
        System.out.println("Canal: " + canal + " Volume: " + volume);
    }
    
    public static void main(String[] args) {
        Televisao televisao = new Televisao(20, 100);
        
        for (int i = 0; i<120; i++){
            televisao.aumentarVolume();
            televisao.imprimirStatus();

        }
        
        for (int i = 0; i<150; i++){
            televisao.diminuirVolume();
            televisao.imprimirStatus();

        }
        
        for (int i = 0; i < 25; i ++){
            televisao.aumentarCanal();
            televisao.imprimirStatus();
        }
        
        for (int i = 0; i < 30; i ++){
            televisao.diminuirCanal();
            televisao.imprimirStatus();
        }
        
        Scanner scanner = new Scanner(System.in);
        
        televisao.selecionarCanal(scanner.nextInt());
        televisao.selecionarCanal(scanner.nextInt());
        
        
        televisao.imprimirStatus();
        
        
        
    }
    
    
    
    public int getVolume() {
        return volume;
    }

    public int getCanal() {
        return canal;
    }
    
    
    
    
    
    
    
}
