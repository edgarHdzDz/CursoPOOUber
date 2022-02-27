//function Car(license, driver){  // colocamos los parametros que queremos poner. Tomo como si fuera un constructor y se lo pasa como parametro ya instancia directamente los datos.
class Car{
        constructor(license, driver){    
        this.id;
        this.license = license;
        this.driver = driver;
        this.password;
    }


    //Car.prototype.printDataCar = function(){
        printDataCar(){
        console.log(this.driver)
        console.log(this.driver.name)
        console.log(this.driver.document)
    }
}