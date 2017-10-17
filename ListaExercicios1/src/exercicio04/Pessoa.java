
package exercicio04;

public class Pessoa {
    private String nome;
    private int idade;
    private float altura;

    public Pessoa(String nome, int idade, float altura){
        this.altura = altura;
        this.nome = nome;
        this.idade = idade;
    }
    
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Dilma", 90, 1.10f);
        Pessoa pessoa2 = new Pessoa("Temer", 120, 1.8f);
        
        /*pessoa.setNome("Dilma");
        pessoa.setIdade(90);
        pessoa.setAltura(1.10f);*/
        
        pessoa.imprimirDados();
        pessoa2.imprimirDados();
        
    }
    
    public void imprimirDados(){
        System.out.println("Nome: " + nome + " Idade: " + idade + " Altura: " + altura);
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
    
    
}
