package sistema;

import java.util.ArrayList;
import java.util.List;
import pessoas.Pessoa;

/**
 *
 * @author Raimundo
 */
public class Sistema {
    
    private String nomeDoSistema;
    private String cnpj;
    private List<Pessoa> pessoas;
    
    public Sistema(String nomeDoSistema, String cnpj){
        this.pessoas = new ArrayList<>();
        this.nomeDoSistema = nomeDoSistema;
        this.cnpj = cnpj;
    }

    public String getNomeDoSistema() {
        return nomeDoSistema;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setPessoas(Pessoa umaPessoa) {
        this.pessoas.add(umaPessoa);
    }
    
    public void imprimirPessoas(){
        for (Pessoa p : this.pessoas){
            System.out.println(p);
        }
    }
    
}
