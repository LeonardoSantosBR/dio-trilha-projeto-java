package poo;

import java.util.Date;

/**
 * classe que armazena informações de Documentos da entidade Pessoa.
 * //INHERITANCE
 *
 * @author Leonardo Santos
 * @version 0.1
 * @since 15/01/2026
 */
public class Documents extends Person {
    private String cpfOrCnpj;
    private String typeDocument;
    private String rg;
    private String passport;

    public Documents(
            int _id,
            String _name,
            String _email,
            String _password,
            Date _birthDate,
            String cpfOrCnpj,
            String typeDocument,
            String rg,
            String passport
    ) {
        super(_id, _name, _email, _password, _birthDate);
        this.cpfOrCnpj = cpfOrCnpj;
        this.typeDocument = typeDocument;
        this.rg = rg;
        this.passport = passport;
    }
}
