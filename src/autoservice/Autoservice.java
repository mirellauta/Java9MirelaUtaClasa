/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autoservice;
/**
 *
 * @author Mirela
 */
public class Autoservice {
static Car m1,m2,m3;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
// 5.a Create 3 instances of cars having different names, colors, speed, renting price and sale price
 // FIRST CAR
    m1= new Car("FERARRI", (short)250, Car.Color.YELLOW);
    m1.setRentPrice(4300);
    m1.setSalePrice(125000);
 //  5.d Increase speed of first car with 10
    m1.increaseSpeed((short) (m1.getSpeed()+10));
  
  //SECOND CAR  
    m2= new Car("FIAT", (short)150, Car.Color.BLACK);
    m2.setRentPrice(250);
    m2.setSalePrice(25000);
    
 //5.e Decrease speed of second car with 10
    m2.increaseSpeed((short) (m2.getSpeed()-10));
 
    // THIRD CAR  
    m3= new Car("MASERATI", (short)130, Car.Color.RED);
    m3.setRentPrice(2500);
    m3.setSalePrice(150000);
  //  5.f Increase renting price of third car with 15 and decrease its sale price with 1200
    m3.increaseRentPrice((short) (m3.getRentPrice()+15));
    m3.decreaseSalePrice((short) (m3.getSalePrice()-1200));

//5.c Display all informations about all cars calling the method displayAutoservice()
   displayAutoservice();
 }  
    


/**
 * Method display all information Autoservice
 * 
 */
    //*5.b. Create a private method in Autoservice, methid named "void displayAutoservice()" that display all information about all cars in format:
   private static void displayAutoservice(){
    System.out.println("---------------------Autoservice--------------------------");
    System.out.println("First car");
    System.out.println("Car name: "  +m1.getName());
    System.out.println("Car color: " +m1.getColor());
    System.out.println("Car speed: " +m1.getSpeed()+" KM/H");
    System.out.println("Car rent price: " +m1.getRentPrice() +" USD");
    System.out.println("Car sale price: " +m1.getSalePrice()+" USD");
    System.out.println("-----------------------------------------------");
    System.out.println("Second car");
    System.out.println("Car name: "  +m2.getName());
    System.out.println("Car color: " +m2.getColor());
    System.out.println("Car speed: " +m2.getSpeed()+" KM/H");
    System.out.println("Car rent price: " +m2.getRentPrice() +" USD");
    System.out.println("Car sale price: " +m2.getSalePrice()+" USD");
    System.out.println("-----------------------------------------------");
    System.out.println("Third car");
    System.out.println("Car name: "  +m3.getName());
    System.out.println("Car color: " +m3.getColor());
    System.out.println("Car speed: " +m3.getSpeed()+" KM/H");
    System.out.println("Car rent price: " +m3.getRentPrice() +" USD");
    System.out.println("Car sale price: " +m3.getSalePrice() +" USD");
 }


       
  
    
}