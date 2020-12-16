package pessoas;
/**
 *
 * @author Raimundo
 */
public class Secretaria extends Funcionario {
    
    private static int gerarCodigo;
    private int codigo;
    private String id = "SE";
    
    public Secretaria(String nome, String email, String senha){
        super(nome, email, senha);
        this.codigo = gerarCodigo++;//com isso o id aluno sera automatizado para todo secretaria criada.
        this.id += this.codigo;
    }
    
    public String getIdSecretaria(){
        return this.id;
    }
    
    @Override
    public String toString(){
        return  "Matricula = "+this.id+
                super.imprimirPessoa();
    }

    @Override
    public boolean autentica(String senha) {
        if (this.getPassword() != senha){
            return false;
        }
        return true;
    }

}