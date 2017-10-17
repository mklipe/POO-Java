
package exercicio5;

public class Circulo {
    private static final float PI = 3.14159265f;
    
    private float raio;

    public void setRaio(float raio) {
        this.raio = raio;
    }
    
    public float calcularCircunferencia(){
        return  2 * PI * raio;
    }
    
    public float calcularArea(){
        return PI * (raio * raio); 
    }
    
    public void aumentarRaio(float porcentagem){
        raio = raio + (raio*porcentagem/100);
    }
    
    public void imprimirRaio(){
        System.out.println("Raio: " + raio);
    }
    
    public void imprimirArea(){
        System.out.println("Área: " + calcularArea());
    }
    
    
    public static void main(String[] args) {
        Circulo circulo = new Circulo();
        circulo.setRaio(120);
        circulo.imprimirRaio();
        
        circulo.aumentarRaio(50);
        circulo.imprimirRaio();
        
        circulo.imprimirArea();
        
        
                
    }
    
    
    
    
    
    
    
    
}
