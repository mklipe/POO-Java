
package listaencadeada;


public class ListaEncadeada {
    private Node primeiro;
    private Node ultimo;
    private int quantidadeElementos = 0;

    public Node getUltimo(){
        return ultimo;
    }
    
    public Node getPrimeiro(){
        return primeiro;
    }
    
    public int getQuantidadeElementos(){
        return quantidadeElementos;
    }
    
    
    public void adicionarNoInicio(Object obj) {
        Node node;
        
        if (quantidadeElementos == 0){
            node = new Node(obj);
            node.setProximo(null);
            
            this.primeiro = node;
            this.ultimo = node;
        } else {
            node = new Node(obj, primeiro);
            primeiro = node; 
        }
        
        quantidadeElementos ++;
        
        System.out.println(this);
    }

    public void adicionarNoFinal(Object obj) {
        Node node;
        
        if (quantidadeElementos == 0){
            node = new Node(obj);
            node.setProximo(null);
            
            this.primeiro = node;
            this.ultimo = node;
        } else {
            node = new Node(obj, null);
            ultimo.setProximo(node);
            ultimo = node; 
        }
        
        quantidadeElementos ++;
        
        System.out.println(this);
    }
    
    
    public String toString(){
        
        Node nodeAtual = primeiro;
        
        String texto = "";
        
        for (int i = 0; i < quantidadeElementos; i++){
            texto = texto + ", " + nodeAtual.getObj();
            
            nodeAtual = nodeAtual.getProximo();
        }
        
        
        return texto;
    }
    
    
    
    
    
    
}
