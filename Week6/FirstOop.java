package Week6;

public class FirstOop {
    public static void main(String[] args) {
        person p1 = new person();
        p1.name ="Ram";
        p1.age = 10;
        p1.address = "ktm";
        p1.gender = 'M';

        p1.greet();

        person p2 = new person();
        p2.name ="Sita";
        p2.age = 20;
        p2.address = "ktm"; 
        p2.gender = 'F';

        p2.greet();

        Square s2 = new Square();
        s2.side = 10;
        double s1Area = s2.area();
        System.out.println(s1Area);
        System.out.println(s2.area());

        Rectangle p3 = new Rectangle();
        p3.length = 10;
        p3.breath = 20;
        p3.info();
        p3.area();
        p3.perimeter();
        p3.allinfo();

        car c1 = new car();
        c1.color = "red";
        c1.brand = "bm";
        c1.name = "bmw";
        c1.year = 2000;
        car c2 = new car();
        c1.color = "blue";
        c1.brand = "audi";
        c1.name = "audii";
        c1.year = 2010;
        car c3 = new car();
        c3.color = "black";
        c3.brand = "benz";
        c3.name = "beenz";
        c3.year = 2015;
        c1.start();
        c1.details();
        c1.details();
        c1.modify("beenz");
        c3.modify("ev");
        c2.stop();
        c3.stop();

    }
   
}
//task create a class Rectangle
//add attribute length and breath
//make a function that returns area
//make a function that returns perimeter
//make a function info, that prints length and breathe of rectangle
//make an object of Rectangle and print area,perimeter and info




    class person{
        String name;
        int age;
        String address;
        char gender;
        void greet(){
            System.out.println("Name"+name +"Age"+ age);
        }
        void sleep(){
            System.out.println("person is sleeping");

    }
    
}

class Square{
    double side;
    double area(){
        return side*side;
    }
}

class Rectangle{
    int length;
    int breath;
    void info(){
        System.out.println("length " + length + "breath" + breath);
    }
    void area(){
        System.out.println("area is" + length*breath );
    }
    void perimeter(){
        System.out.println("perimeter is" + 2*(length+breath));
    }
    void allinfo(){
        System.out.println("length"+length +"breath" + breath +" "+"area is"+length*breath+" "+"perimeter is"+2*(length+breath));
    }

}
/*add attribute name,brand,color,year
 * make a function expiry,that add 100 to year and return the date 
 * make a function start() ->print (name is string)
 * make a function stop() ->print(name year is stoping)
 * make a function details() ->print(name,brand,color,year)
 * make 3 objects of car
 * fill all attribute of 3
 * print expiry of all car objects
 * start the first object car
 * modify 1st and 3rd object
 * stop the 2nd and 3rd object car
 * run detail in all object
 * 
 * all about class car
 */
class car{
    String name;
    String brand;
    String color;
    int year;
    int expiry(){
        return year + 100; 
    }
    void modify(String c){
        color = c;
    }

    void start(){
        System.out.println(name+"is starting");
    }
    void stop(){
        System.out.println(year+"is stoping");
    }
    void details(){
        System.out.println(name+" ,"+brand+", "+color+" ,"+year);
    }
    



}




