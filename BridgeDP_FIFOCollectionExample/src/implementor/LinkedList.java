/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implementor;

/**
 *
 * @author urosv
 */
public interface LinkedList<T> {

    void addFirst(T element);

    void addLast(T element);

    T removeFirst();

    T removeLast();

    int getSize();

}
