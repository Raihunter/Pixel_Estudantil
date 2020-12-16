package pessoas;
import interfaces.Autenticavel;
import endereco.Endereco;
import sistema.Sistema;
/**
 *
 * @author Raimundo
 */
public class AppTeste {
    //Classe teste temporaria, excluir depois
    public static void main(String[] args) {
        //Testando aluno
        //Pessoa aluno1 = new Aluno("Raimundo", "hilaryoncx@gmail.com", "Rai01:");
        //Pessoa aluno2 = new Aluno("Maria", "sungj315@gmail.com", "Rai01@");
        Pessoa diretora = new Diretoria("Carla", "carla@hotmail.com", "12Ca.@");
        
        Endereco endAluno1 = new Endereco();
        endAluno1.setRua("Rua dois");
        endAluno1.setNumero(800);
        
        Endereco endAluno2 = new Endereco();
        endAluno1.setRua("Rua três");
        endAluno1.setNumero(100);
        
        //aluno1.setEndereco(endAluno1);
        //aluno2.setEndereco(endAluno2);
        
        Sistema sistema = new Sistema("Pixel Estudantil", "123456");
        
        //sistema.setPessoas(aluno1);
        //sistema.setPessoas(aluno2);
        sistema.setPessoas(diretora);
        
        sistema.imprimirPessoas();
        //Exemplo de Casting
        //Diretoria d = (Diretoria)diretora;
        //System.out.println(d.getIdDiretoria());
        
        Autenticavel dir = (Autenticavel)diretora;
        System.out.println(dir.autentica("12Ca.!"));
        //dir.autentica("12Ca.@");

    }
}
