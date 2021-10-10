/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author Programmer Imran
 */
public class Class1 {
    private int size=0;
    private String name;
    public Class1(String name)
    {
        this.name=name;
        
    }
    public String getName()
    {
        return name;
    }
    public void bar()
    {
        System.out.println("Class1.foo()");
    }
}
