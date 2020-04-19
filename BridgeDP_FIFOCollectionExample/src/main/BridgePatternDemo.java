/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import abstraction.FIFOCollection;
import abstraction.impl.Queue;
import implementor.impl.SinglyLinkedList;

/**
 *
 * @author urosv
 */
public class BridgePatternDemo {
    
    public static void main(String[] args) {
        FIFOCollection<Integer> collection = new Queue<>(new SinglyLinkedList<>());
        collection.offer(10);
        collection.offer(20);
        collection.offer(30);
        
        System.out.println(collection.poll());
        System.out.println(collection.poll());
        System.out.println(collection.poll());
        System.out.println(collection.poll());
        
    }
    
}
