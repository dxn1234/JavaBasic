/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genericstype;

/**
 *
 * @author Administrator
 */
public class MyGeneric<T> {
    T obj;
 
    void add(T obj) {
        this.obj = obj;
    }
 
    T get() {
        return obj;
    }
}

