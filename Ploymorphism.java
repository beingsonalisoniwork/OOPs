class Student {
    String name;
    int age;

    // using same function for different purpose - polymorphism
    // by data types
    // by number of arguments
    // function overloading / method overloading

    public void printInformation(String name) {
        System.out.println(name);
    }

    public void printInformation(int age) {
        System.out.println(age);
    }

    public void printInformation(String name, int age) {
        System.out.println(name + " " + age);
    }
}

class Polymorphism {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Sonali";
        s1.age = 26;

        s1.printInformation(s1.name, s1.age);
    }
}