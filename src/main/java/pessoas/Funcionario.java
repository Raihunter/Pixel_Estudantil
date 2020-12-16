package pessoas;

import interfaces.Autenticavel;
import java.util.List;

/**
 *
 * @author Raimundo
 */
public abstract class Funcionario extends Pessoa implements Autenticavel {

    public Funcionario(String nome, String email, String senha) {
        super(nome, email, senha);
    }

}
