package poo.inheritanceAndEncapsulation;
import java.util.Date;

/**
 * classe que armazena informações pessoais da entidade Pessoa.
 * //ENCAPSULATION
 *
 * @author Leonardo Santos
 * @version 0.1
 * @since 14/01/2026
 */
public class Person {
    public int id; // pode ser visto por qualquer classe
    protected String name; // só subclasses e classes do mesmo pacote.
    private String email; // só esta classe pode acessar.
    private String password; // só esta classe pode acessar.
    public Date birthDate; // pode ser visto por qualquer classe

    public Person(int id, String name, String email, String password, Date birthDate) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.birthDate = birthDate;
    }

    /**
     * retorna o email da Pessoa.
     */
    public String getEmail() {
        return email;
    }

    /**
     * muda a senha atual.
     *
     * @param oldPass antiga senha.
     * @param newPass nova senha.
     */
    public void changePassword(String oldPass, String newPass) {
        if (!password.equals(oldPass))
            throw new RuntimeException("Senha incorreta.");
        this.password = newPass;
    }
}
