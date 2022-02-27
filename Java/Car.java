package Java;

public class Car {
    Integer id;
    String license; // variable global
    Account driver;
    Integer passenger;

    // Metodo constructor 

    public Car(String license, Account driver){ // variables locales 
        this.license = license; // Colocar la palabra reservada this para diferenciar de variable Local a global ya que manejan el mismo nombre.
        this.driver = driver;
    }


    //  Metodo para traer los datos

    void printDataCar() {
        System.out.println("License: " + license + "Name Driver: " + driver.name);
    }
}
