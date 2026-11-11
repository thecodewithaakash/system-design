package t03_encapsulation;

//  Encapsulation means hides and protects data.

class MenuItem {
    private final String name;
    private final double price; //instance variables 
    // static int price2; //static variables or class variables. 

    // constructor - it is a special method that is called when an object is created. It has the same name as the class and no return type.
    MenuItem(String name, double price) { // parameters
        if (price <= 0) {
            throw new IllegalArgumentException("Price must be positive");
        }

        // - this refers to the current object (instance).
        // - this.name → instance variable of the current object.
        // - name → constructor parameter (local variable).

        this.name = name; // "this.name" - pointing to the private variable "name" of the class. "name" - pointing to the parameter of the constructor.
        this.price = price; // "this.price" - pointing to the private variable "price" of the class. "price" - pointing to the parameter of the constructor.
    }

    // setter methods - they are used to set the private variables of the class. They are also called mutator methods.
    // void setName(String name) {
    //     this.name = name;
    // }

    // but due to "setName" method we can't achieve encapsulation because we are allowing the user to change the name of the menu item. So, we will remove the setter method for name and price. - so comment it to achieve encapsulation.
 
    // getter methods - they are used to access the private variables of the class. They are also called accessor methods.
    String getName() { // accessmodifier (public, private, protected) returnType (String, int, MenuItem(class)) NAME (parameters)
        return name;
    }

    double getPrice() {
        return price;
    }
}


