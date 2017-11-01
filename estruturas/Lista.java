
package estruturas;

public interface Lista {
    void adicionar(Object obj);
    
    void adicionar(Object obj, int posicao);
    
    Object getObjeto(int posicao);
    
    void removerElemento(int posicao);
    
    boolean contem(Object obj);
    
    int getTamanho();
    
    
}
