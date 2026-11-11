<!-- - ref: C:\Aakash saha\system-design\System-Design-Live-Lectures\Lecture-02-OOP-Pillars\code\live\t03_encapsulation\MenuItem.java -->

# Method/Function Syntax

```java
 accessModifier returnType methodName(parameters) 
 ```

Example:

```java
public String getName(int id)
```


### Breakdown:
1. Access Modifier (public, private, protected)
    - Controls who can access the method.

2. Return Type (int, String, MenuItem, void)
    - Specifies what the method returns.
    - void → returns nothing.

3. Method Name
    - Describes the action performed.
    - Example: getName(), addItem().

4. Parameters
    - Input values passed to the method.
    - Example: (int id, String name).

5. Example Interpretation:
```java
public MenuItem getMenuItem(int itemId)
```

### Note:
 - public → accessible from anywhere
 - MenuItem → returns a MenuItem object
 - getMenuItem → method name
 - int itemId → input parameter