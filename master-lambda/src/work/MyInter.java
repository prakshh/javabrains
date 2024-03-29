package work;

@FunctionalInterface // annotation to not allow more than one (abstract) method
public interface MyInter {
    void sayHello();
/*
    public abstract void sayHello();     public and abstract is redundant for interface methods
    public abstract void sayHi();       not allowed more than one method

    how to use this interface?
    1. create separate class and implement this interface
    2. anonymous class for implementing interface
    3.Lambda expression
        - Lambda can be only used for functional interface, that is, for only one-method-interface
        - if two or more methods, then anonymous classes will be required

     git config --global user.email <your email id>

    */




}
