package Java;

public class Account {
    Integer id;
    String name; // Variable global
    String document;
    String email;
    String password;

    // Hay que declarar un metodo constructot

    public Account (String name, String document){  // Variables locales
        this.name = name;// Colocar la palabra reservada this para diferenciar de variable Local a global ya que manejan el mismo nombre.
        this.document = document;
    }

}
