
```java
// Error:
// constructor Payment in class Payment cannot be applied to given types

// This error occurs when Java tries to call a constructor of the
// parent class (Payment), but the arguments provided do not match
// any constructor defined in Payment.

// For example:

class Payment {

    Payment(double amount) {
        this.amount = amount;
    }
}

class UpiPayment extends Payment {

    UpiPayment() {
        // Java implicitly tries to call super()
        // But Payment does not have a no-argument constructor
    }
}

// Since Payment only has Payment(double amount),
// Java cannot find Payment() and throws this error.

// To fix it, explicitly call the matching parent constructor:

class UpiPayment extends Payment {

    UpiPayment(double amount) {

        // Calls Payment(double amount)
        super(amount);
    }
}
```

```java
// If the parent class has a no-argument constructor,
// Java automatically calls super() behind the scenes.

// Therefore, calling super() is optional because
// the parent constructor will be invoked automatically.

class Payment {

    Payment() {
        System.out.println("Payment constructor");
    }
}

class UpiPayment extends Payment {

    UpiPayment() {

        // super(); // Optional
        System.out.println("UPI constructor");
    }
}
```

```java
// Key Points: super()

// 1. If the parent class has a no-argument constructor,
//    Java automatically calls super() behind the scenes.

// 2. Therefore, explicitly writing super() is optional
//    when the parent has a no-arg constructor.

// 3. If the parent class has a parameterized constructor,
//    Java cannot call it automatically.

// 4. In that case, the child class must explicitly call
//    the parent constructor using super(...).

// 5. The required arguments must be passed to super(...).

// 6. Here, Payment has a constructor that requires amount,
//    so we must call super(amount).

// 7. super(amount) initializes the amount field
//    defined in the parent class.

// 8. If super(amount) is not called,
//    the code will fail to compile because Java
//    cannot find a matching no-argument constructor.

// 9. super(...) or super() must be the first statement
// inside a child class constructor; otherwise, the code
// will fail to compile.
```