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
public class Class2 extends Class1 implements Face1{
    
    int size =0;
    int x;
    public Class2(String name)
    {
        super(name);
    }
    public void foo()
    {
        System.out.println("Class2.foo()");
    }
    public void bar()
    {
        System.out.println("Class1.bar()");
    }
    
}
