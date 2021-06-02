package com.gurov.lesson3.task2;

import java.util.ArrayDeque;
import java.util.Stack;

public class CreateTree {

    private CreateNode rootNode;
    private static int gap = 32;

    public CreateTree(){

        rootNode = null;
    }

    public CreateNode Insert(int key,String value){

        CreateNode newNode = new CreateNode(key,value);
        if (rootNode == null){ //if this root
            rootNode = newNode;
            return newNode;
        }
        else{ //if this not root
            if (key < newNode.getKey()){ //go to left
                newNode = newNode.getLeftChild();
            }
            else if (key > newNode.getKey()){ //go to right
                newNode = newNode.getRightChild();
            }
            else { //if keys are equal then rewrite
                newNode.setKey(key);
                newNode.setValue(value);
                return newNode;
            }
            if (newNode == null) { //write new node
                newNode.setKey(key);
                newNode.setValue(value);
                return newNode;
            }
            else //search node next
                return Insert(key, value);
        }
    }

    public void Remove(int key){

    }

    public int Find(int key){

        return key;
    }

    public CreateTree Display(CreateTree tree){

        if (rootNode == null){ //if tree is empty
            System.out.println("The tree is empty");
            return tree;
        }
        else{
            for (int i=0;i<gap;i++)
                System.out.print(" ");
            Stack masNodes = new Stack();
            masNodes.push(rootNode);

        }
        return tree;
    }
}
