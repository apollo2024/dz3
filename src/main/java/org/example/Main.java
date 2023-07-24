package org.example;

import org.w3c.dom.Node;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Return_node list1 = new Return_node();
        LinkedList list = new LinkedList();

        list1.add(5);
        list1.add(8);
        list1.revert();
        list1.print();

    }
}