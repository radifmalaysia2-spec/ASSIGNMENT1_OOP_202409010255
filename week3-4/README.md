# Weeks 3-4 - Inheritance and Polymorphism

`Student` and `Lecturer` inherit common information from `Person`. Each subclass overrides `introduce()`, so a `Person` reference produces a different introduction according to the object assigned to it.

```bash
javac Main.java Person.java Student.java Lecturer.java
java Main
```

