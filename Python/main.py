from car import Car  #importamos el elemento de la clase 

if __name__ == "__main__":
    print("Hola mundo")
    car = Car()
    car.license = "AMS234"
    car.driver = "Andres Herrera "
    print(vars(car))

    car2 = Car()
    car2.license = "QWE567"
    car2.driver = "Martha "
    print(vars(car2))