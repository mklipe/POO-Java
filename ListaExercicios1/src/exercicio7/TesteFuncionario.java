
package exercicio7;

public class TesteFuncionario {
    public static void main(String[] args) {
        
        Data dataDeHoje = new Data(16, 10, 2017);
        
        
        Funcionario funcionario = new Funcionario();
        funcionario.setAtivo(true);
        funcionario.setNome("João");
        funcionario.setSalario(1000);
        
        funcionario.setDataEntrada(dataDeHoje);
        
        funcionario.bonificar(178.5f);
        
        funcionario.demitir();
        
        System.out.println("Ano de entrada: " + funcionario.getDataEntrada().getAno());
        
        System.out.println("Data de entrada: " + funcionario.getDataEntrada());
        
    }
}
