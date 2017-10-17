
package exercicio7;

public class Funcionario {
    private String nome;
    private String departamento;
    private float salario;
    private String rg;
    private Data dataEntrada;
    private boolean ativo;

    public void bonificar(float bonus){
        float salarioTotal = salario + bonus;
        
        System.out.println("Salário total: " + salarioTotal);
    }
    
    public void demitir(){
        System.out.println("Funcionário demitido.");
        ativo = false;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public Data getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(Data dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }
    
    
}
