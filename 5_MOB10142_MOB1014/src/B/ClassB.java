/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package B;

import A.ClassA;

/**
 *
 * @author DungnaPC
 */
public class ClassB {
   public void method1(){
    ClassA classA = new ClassA();
    //classA.a = 1; private
    classA.b = 2;
    //classA.c = 3; Default
    //classA.d = 4; Protected
  }
}
