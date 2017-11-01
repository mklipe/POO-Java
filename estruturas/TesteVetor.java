package estruturas;

public class TesteVetor {

    public static void main(String[] args) {
        Vetor v = new Vetor();

        String a = "A";
        String b = "B";
        String c = "C";
        String d = "D";
        String e = "E";
        String f = "F";
        String g = "G";
        String h = "H";
        String i = "I";
        
        v.adicionar(a);
        v.adicionar(b);
        v.adicionar(c);
        v.adicionar(d);
        v.adicionar(e);
        v.adicionar(f);
        v.adicionar(g, 10);
        v.adicionar(h, 2);
        v.adicionar(i, 2);
        
        System.out.println(v);
        
        v.removerElemento(4);
        
        
       // System.out.println("S: " + v.contem("S"));
        //System.out.println("C: " + v.contem("C"));
        
        System.out.println(v);

        
        
        
    }
}
