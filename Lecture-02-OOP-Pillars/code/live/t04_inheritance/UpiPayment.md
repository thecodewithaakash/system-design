```java
package t04_inheritance;

class UpiPayment extends Payment {
    private final String upiId;

    UpiPayment(double amount, String upiId) { // constructor method

        // calling the constructor of the parent class --> "Payment" to initialize the amount field. It is necessary to call the parent class constructor because the amount field is private in the parent class and cannot be accessed directly from the child class. So, we use super() to call the parent class constructor and initialize the amount field.

        super(amount);
        // System.out.println(this.amount);
        // this.amount = 500; // error: cannot assign a value to final variable amount

        // super class means parent class. In this case, the parent class is "Payment". The super keyword is used to refer to the parent class. It can be used to call the parent class constructor, access parent class methods, and access parent class fields. In this case, we are using super() to call the constructor of the parent class "Payment" to initialize the amount field. We are also using super.pay() to call the pay() method of the parent class "Payment". This is necessary because we want to use the implementation of the pay() method in the parent class and then add our own implementation in the child class. If we don't call super.pay(), then the pay() method in the child class will override the pay() method in the parent class and we will lose the implementation of the pay() method in the parent class.


        // super.pay(); // calling parent class method from child class.
        this.upiId = upiId;
    }

    // @Override indicates that a child class method is overriding
    // a method from its parent class.

    // Method overriding allows a child class to provide its own
    // implementation while keeping the same method signature
    // (same name, parameters, and compatible return type).

    // @Override enables compile-time checking and helps catch
    // mistakes if the method does not correctly override
    // a parent class method.

    // @Override   // just annotation
    // void pay() {                                                        // new
    //     System.out.println("Paid Rs " + amount + " using UPI " + upiId); // new
    // }

    // - without @Override, the code will still work, but we lose the benefits of compile-time checking and clarity. The @Override annotation is a good practice to use when overriding methods, as it helps ensure that the method is correctly overriding a parent class method and improves code readability.

    // -  without overriding, the child class would inherit the pay() method from the parent class.


    // # Extra Notes on @Override and Method Overriding:
    // ### without @override
    // void pays() {                                                        // new
    //     System.out.println("Paid Rs " + amount + " using UPI " + upiId); // new
    // }

    // - this above method is not overriding the parent class method because the method name is different. The parent class method is pay() and the child class method is pays(). So, the child class is not overriding the parent class method. If we want to override the parent class method, we need to use the same method name and signature. In this case, we can change the method name to pay() in the child class to override the parent class method.

    // ### with @override

    //  @Override
    // void pays() {                                                        // new
    //     System.out.println("Paid Rs " + amount + " using UPI " + upiId); // new
    // }

    // - above code will throw an error - "method does not override or implement a method from a supertype" because the method name is different. The parent class method is pay() and the child class method is pays(). So, the child class is not overriding the parent class method. If we want to override the parent class method, we need to use the same method name and signature. In this case, we can change the method name to pay() in the child class to override the parent class method.

    // ### Method overloading
    // - Same method name, different parameter list

   void pay(int x){
     System.out.println("Paid Rs " + amount + " using UPI " + upiId + "value of x " + x);
   }

   void pay(int x, int y){
   System.out.println("Paid Rs " + amount + " using UPI " + upiId + ", value of x = " + x + ", value of y = " + y);
   }
}

// ### understanding need of super() ?
    // super refers to the parent (super) class.
    // In this example, the parent class is "Payment".

    // The super keyword can be used to:
    // 1. Call the parent class constructor.
    // 2. Access parent class methods.
    // 3. Access parent class fields.

    // Here, the Payment constructor requires an amount parameter.
    // Therefore, we call super(amount) to execute the parent class constructor
    // and initialize the amount field defined in Payment.

    // If we do not call super(amount),
    // the parent class state will not be initialized correctly.

    // When a parent class has a parameterized constructor,
    // the child class must explicitly call it using super(...).


// ### understanding the use of super() in child class constructor
    // If the parent class has a no-argument constructor,
    // the child class can call it explicitly using super()
    // or Java will call it implicitly.

    // But if the parent class has a parameterized constructor,
    // the child class must explicitly call it using super(...)
    // and pass the required arguments.

    // Here, the parent class constructor requires one parameter: amount.
    // Therefore, the child class must call super(amount)
    // to initialize the amount field defined in the parent class.



```
