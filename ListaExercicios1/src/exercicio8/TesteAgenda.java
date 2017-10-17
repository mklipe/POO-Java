
package exercicio8;


public class TesteAgenda {
    public static void main(String[] args) {
        Agenda agenda = new Agenda();
        
        RegistroAgenda reg1 = new RegistroAgenda();
        reg1.setNome("Joao");
        reg1.setEmail("teste@teste.com");
        reg1.setTelefone("445557458");
        reg1.setEndereco("rua dasdasdsa");
        
        agenda.adicionar(reg1);
        
        agenda.listar();
        
        agenda.remover(reg1);
        
        agenda.listar();
        
        
    }
}
