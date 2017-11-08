
package listaencadeada;

public class Node {
    private Object obj;
    private Node proximo;
    
    public Node(Object obj, Node proximo){
        this.obj = obj;
        this.proximo = proximo;
    }
    
    public Node(Object obj){
        this.obj = obj;
    }

    public Object getObj() {
        return obj;
    }

    public void setObj(Object obj) {
        this.obj = obj;
    }

    public Node getProximo() {
        return proximo;
    }

    public void setProximo(Node proximo) {
        this.proximo = proximo;
    } 
    
}
