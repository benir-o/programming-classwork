# SOLID Principles in Object-Oriented Design

The **SOLID** principles are five core design guidelines that help developers write cleaner, more maintainable, and scalable object-oriented code.

---

## 🧱 What is SOLID?

**SOLID** is an acronym for:

1. **S** – Single Responsibility Principle (SRP)
2. **O** – Open/Closed Principle (OCP)
3. **L** – Liskov Substitution Principle (LSP)
4. **I** – Interface Segregation Principle (ISP)
5. **D** – Dependency Inversion Principle (DIP)

---

## 1. Single Responsibility Principle (SRP)

> A class should have only one reason to change.

**✔️ Meaning:** Each class should handle only one responsibility or functionality.

```java
// Bad Example: One class does too much
class ReportManager {
    void generateReport() { /* logic */ }
    void printReport() { /* logic */ }
    void saveToFile() { /* logic */ }
}
```
## 2. Open-Closed Principle (OCP)

> A class should be open for expansion but closed for modification

**✔️ Meaning:** Add new features by extending classes, not modifying them.

```java
abstract class Shape {
    abstract double area();
}

class Circle extends Shape {
    double radius;
    double area() { return Math.PI * radius * radius; }
}

class Square extends Shape {
    double side;
    double area() { return side * side; }
}
```
## 3. Liskov Substitution principle (LSP)
> Subtypes must be substitutable for their base types.

**✔️ Meaning:** A subclass should behave like its parent without causing issues.

```java
class Bird {
    void fly() { System.out.println("Flying"); }
}

class Ostrich extends Bird {
    @Override
    void fly() {
        throw new UnsupportedOperationException("Can't fly");
    }
}
// ❌ Violates LSP

```
## 4. Interface Segregation Principle (ISP)
> Clients should not be forced to depend on methods they do not use.

**✔️ Meaning:** Use multiple specific interfaces instead of one general-purpose interface.

```java
interface Workable { void work(); }
interface Eatable { void eat(); }

class Robot implements Workable {
    public void work() { /* logic */ }
}

class Human implements Workable, Eatable {
    public void work() { /* logic */ }
    public void eat() { /* logic */ }
}
```

## 5. Dependency Inversion Principle
> High-level modules should not depend on low-level modules. Both should depend on abstractions.

**✔️ Meaning:** Depend on interfaces, not concrete implementations.

```java
interface SwitchableDevice {
    void turnOn();
    void turnOff();
}

class LightBulb implements SwitchableDevice {
    public void turnOn() { System.out.println("Light On"); }
    public void turnOff() { System.out.println("Light Off"); }
}

class Switch {
    private SwitchableDevice device;
    public Switch(SwitchableDevice device) {
        this.device = device;
    }
    void operate(String command) {
        if (command.equals("ON")) device.turnOn();
        else device.turnOff();
    }
}

```
