package Java;

class Main {
    public static void main (String[] args){
        System.out.println("Hola mundo");

        Car car = new Car(); // Aqui el objeto ya tiene vida.
        car.license = "AMQ123"; // Los atributos mediante la sintaxis punto ( . )
        car.driver = "Andres Herrera";
        car.passenger = 4;
        //System.out.println("Car license: " + car.license);
        car.printDataCar(); // Se crea un metodo en el archivo Car.java que contenga los datos que queremos/ocupamos para poder llamarlo aqui. 

        Car car2 = new Car();
        car2.license = "QWE567";
        car2.driver = "Andrea Herrera";
        car2.passenger = 3;
        //System.out.println("Car license: " + car2.license);
        car2.printDataCar();
    }
}