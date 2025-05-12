# Interface vs Abstract Class in Java

In Java, **interfaces** and **abstract classes** are two ways to achieve abstraction—defining the structure without implementing every detail. However, they serve different purposes and have distinct rules.

---

## 🔑 Key Differences

| Feature                         | Interface                              | Abstract Class                          |
|----------------------------------|-----------------------------------------|------------------------------------------|
| **Purpose**                      | To define a contract                    | To provide partial implementation         |
| **Methods**                      | Only abstract methods (Java 7), default/static methods (Java 8+) | Can have both abstract and concrete methods |
| **Fields/Variables**             | Only public, static, and final (constants) | Can have instance variables                |
| **Access Modifiers**             | Methods are implicitly `public`         | Can use any access modifier               |
| **Inheritance**                  | A class can implement **multiple** interfaces | A class can **extend only one** abstract class |
| **Constructor**                  | No constructor                          | Can have a constructor                    |
| **Use Case**                     | Ideal for defining capabilities (e.g., `Flyable`, `Serializable`) | Ideal for defining a base class with shared code |

---

## ✅ When to Use What?

- Use an **interface** when:
  - You want to define a role or behavior (`Runnable`, `Comparable`)
  - You need multiple inheritance
  - You only need method signatures (no state)

- Use an **abstract class** when:
  - You want to share code between related classes
  - You need to define state (fields/constructors)
  - You want to define a common base with some implementation

---

## 🧪 Example

### Interface Example
```java
interface Animal {
    void makeSound(); // abstract method
}
