
package listaencadeada;

public class TesteListaEncadeada {
    public static void main(String[] args) {
        
        ListaEncadeada lista = new ListaEncadeada();
        
        String a = "A";
        String b = "B";
        String c = "C";
        String d = "D";
        String e = "E";
        String f = "F";
        
        lista.adicionarNoInicio(a);
        lista.adicionarNoInicio(b);
        lista.adicionarNoInicio(c);
               
        lista.adicionarNoFinal(d);
        lista.adicionarNoFinal(e);
        lista.adicionarNoFinal(f);
        
       

        
    }
}
