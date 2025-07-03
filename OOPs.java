// user defined class Pen: blueprint: represents data type
class Pen {
    String color;
    String type;

    public void write() {
        System.out.println("writing...");
    }

    public void printProperties() {
        System.out.println(this.color + ", " + this.type);
        // 'this' keyword refers to current instance/object of class
    }
}


public class OOPs {
    public static void main(String[] agrs) {
        // object creation using 'new' keyword
        Pen pen1 = new Pen();

        // Pen: type/class name
        // pen1: variable name/object reference; holds memory reference to actual Pen object
        // new: used to create new instance of class Pen; JVM allocates memory in heap and returns a reference to that memory
        // Pen(): special function - constructor call; no arguments - default consrtuctor; object initialization logic happens (if any)

        pen1.color = "black";
        pen1.type = "ballpoint";

        pen1.write();

        Pen pen2 = new Pen();
        pen2.color = "blue";
        // pen2.type = "gel";

        pen1.printProperties();
        pen2.printProperties();
    } 
}