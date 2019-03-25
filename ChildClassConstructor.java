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
public class ChildClassConstructor extends BaseClassConstructor{
    
    public ChildClassConstructor(){
        
        super(10);
        
        System.out.println("Child class constructor called");
        
    }
    
    
    
    public ChildClassConstructor(int i,int j){
        
        super(10,20);
        
        System.out.println("Child class constructor called with two parameter");
        
    }
    
    
    public static void main(String []args){
        
        
        String x = "Hello";
        System.out.println(x.length());
        
        ChildClassConstructor obj = new ChildClassConstructor();
        ChildClassConstructor obj1 = new ChildClassConstructor(10,40);
        
    }
    
}
