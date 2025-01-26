package com.example.oop;

// class is a keyword used to declare a class
// class is followed by the class name
// class name should start with an uppercase letter
// class body is enclosed in curly braces
// class body contains fields and methods
// class body contains constructors and blocks
// class body contains inner classes and interfaces
// class body contains access modifiers and annotations
// class body contains static and non-static members
// class body contains final and abstract classes
// class body contains final and abstract methods
// class body contains static and non-static nested classes
// class body contains static and non-static nested interfaces
public class Car {

    // data hiding or encapsulation
    // private access level modifier: class only
    // public access level modifier: everywhere
    // private fields are only accessible within the class
    // private fields are not accessible outside the class
    // private fields are only accessible through public methods
    // private fields are only accessible through public setters and getters
    // encapsulation: wrapping the data (fields) and code (methods) together as a single unit
    // encapsulation: data hiding + abstraction
    // encapsulation: data (fields) + methods (behaviors)
    // encapsulation: fields are private + methods are public
    // encapsulation: fields are hidden + methods are exposed
    // encapsulation: fields are encapsulated + methods are encapsulated
    // example of encapsulation: class, object, setter, getter, constructor, private, public
    // it can be implemented by using private access level modifier:
    // private fields + public methods => encapsulation
    // singleton pattern
    private static Car instance = null;

    public static Car getInstance() {
        if (instance == null) {
            instance = new Car("Toyota", "Corolla", 2020, "Red", 20000.00);
        }
        return instance;
    }

    // fields
    // access level modifier: public, private, protected, default
    // default access level modifier: package-private (no modifier) => just viewed in the scope of the package package com.example.oop;
    // private access level modifier: class only
    // protected access level modifier: package and subclass
    // public access level modifier: everywhere
    private String make;
    private String model;
    private int year;

    private String color;

    private double price;

    // constructor
    // must have no explicit return type
    // constructor name should be the same as the class name
    // constructor can have parameters
    // constructor is called automatically when a new object is created
    // constructor is used to initialize the object's fields
    // constructor can have multiple constructors with different parameters
    // constructor cannot be abstract, static, final and synchronized
    // the constructor options : will be initialized as the parameter passed to constructor
    // overloading behaviour
    // constructor overloading allows us to create multiple constructors with different parameter lists
    // option one constructor
    public Car(String make, String model, int year, String color, double price) {
        this(make, model, year, color);
        this.price = price;
    }

    // option two constructor
    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    // required parameters and optional in constructor
    // named parameters
    // named parameters are used when we want to provide meaningful names to the parameters instead of using the default names
    public Car(String make, String model, int year, String color) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
    }

    // Copy constructor
    // copy constructor is used to create a new object by copying the values of existing object
    // copy constructor is used when we want to create a new object from an existing object with some modifications
    public Car(Car car) {
        this(car.make, car.model, car.year, car.color, car.price);
        /*    this.make = car.make;
        this.model = car.model;
        this.year = car.year;
        this.color = car.color;
        this.price = car.price;*/
    }

    // finalizer function
    // finalizer is called automatically when the object is garbage collected
    // in Java when we create a new object it occupies some space in the memory heap.
    // If we dont delete the objects it remains in the memory heap and occupies unnecessary space that is not upright from the aspect of programming
    /*
        Java provides the garbage collector that works the same as the destructor.
        The garbage collector is a program (thread) that runs on the JVM. It
        automatically deletes the unused objects (objects that are no longer used) and
        free-up the memory. The programmer has no need to manage memory,
        manually. It can be error-prone, vulnerable, and may lead to a memory leak
    
        Destructor -> It is also known as finalizers
     */
    //<================================================================================================================>
    // setters and getters
    // setter: set the value of a field
    // getter: get the value of a field
    // setter and getter are also known as mutator and accessor
    // setter and getter are also known as write and read
    // setters can apply some logic on the data before setting the value such as validation
    public void setMake(String make) {
        this.make = make;
    }

    public String getMake() {
        return make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((make == null) ? 0 : make.hashCode());
        result = prime * result + ((model == null) ? 0 : model.hashCode());
        result = prime * result + year;
        result = prime * result + ((color == null) ? 0 : color.hashCode());
        long temp;
        temp = Double.doubleToLongBits(price);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Car other = (Car) obj;
        if (make == null) {
            if (other.make != null) {
                return false;
            }
        } else if (!make.equals(other.make)) {
            return false;
        }
        if (model == null) {
            if (other.model != null) {
                return false;
            }
        } else if (!model.equals(other.model)) {
            return false;
        }
        if (year != other.year) {
            return false;
        }
        if (color == null) {
            if (other.color != null) {
                return false;
            }
        } else if (!color.equals(other.color)) {
            return false;
        }
        if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price)) {
            return false;
        }
        return true;
    }
}
