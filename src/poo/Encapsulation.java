package poo;

/**
 * classe que armazena informações de Pessoa.
 * 
 * @author Leonardo Santos
 * @version 0.1
 * @since 14/01/2026
 */
public class Encapsulation {
  public int id; // pode ser visto por qualquer classe
  protected String name; // só subclasses e classes do mesmo pacote.
  private String email; // só esta classe pode acessar.
  private String password; // só esta classe pode acessar.

  public Encapsulation(int id, String name, String email, String password) {
    this.id = id;
    this.name = name;
    this.email = email;
    this.password = password;
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
