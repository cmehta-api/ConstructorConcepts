/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructorsConcepts;

/**
 *
 * @author cmehta
 */
public class ConstructorWithThis {
    
    String name;
    int age;
    static float f;
    static double d;
    
    
    public ConstructorWithThis(){
        
        System.out.println("this is no parameter constructor");
        
        
    }
    
    public ConstructorWithThis(int i, int j){
        System.out.println("this is int and int parameter constructor   " +i +" and "+j);
        
        
    }
    
    public ConstructorWithThis(long i, int j){
        
        System.out.println("this is long and int parameter constructor   " +i +" and "+j);
        
        
    }
    
    public ConstructorWithThis(String name , int age){
        
        System.out.println("this is string and int parameter constructor   " +name +" and "+age); 
        
        this.name=name;
        this.age=age;
        
    }
    
    
    
    
    public static void main(String[]args){
        
        
        
        //System.out.println(ConstructorWithThis.name);
        System.out.println(ConstructorWithThis.f);
        System.out.println(ConstructorWithThis.d);
        
        ConstructorWithThis obj = new ConstructorWithThis();
        ConstructorWithThis obj1 = new ConstructorWithThis(1,10);
        ConstructorWithThis obj2 = new ConstructorWithThis(922337203,88);
        ConstructorWithThis obj3 = new ConstructorWithThis("tom",8);        
        
    }   
    
}
