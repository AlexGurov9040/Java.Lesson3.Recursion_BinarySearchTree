package com.gurov.lesson3.task2;

import java.util.Stack;

public class CreateTree {

    private CreateNode rootNode;
    private CreateNode newNode;

    public CreateTree(){

        rootNode = null;
    }

    public CreateNode Insert(int key,String value){

        if (rootNode == null){ //if this root
            rootNode = new CreateNode(key,value);
            newNode = rootNode;
            return rootNode;
        }
        else{ //if this not root
                CreateNode node = newNode;
            if (key < newNode.getKey()){ //go to left
                newNode = newNode.getLeftChild();
                if (newNode == null) { //write new node
                    node.setLeftChild(new CreateNode(key,value));
                    newNode = rootNode;
                    return rootNode;
                }
                else //search node next
                    return Insert(key, value);
            }
            else if (key > newNode.getKey()){ //go to right
                newNode = newNode.getRightChild();
                if (newNode == null) { //write new node
                    node.setRightChild(new CreateNode(key,value));
                    newNode = rootNode;
                    return rootNode;
                }
                else //search node next
                    return Insert(key, value);
            }
            else { //if keys are equal then rewrite
                node.setValue(value);
                return rootNode;
            }
        }
    }

    public void Remove(int key){

    }

    public CreateNode Find(int key){

        CreateNode node = rootNode;
        while (node.getKey() != key){
            if (key < node.getKey())
                node = node.getLeftChild();
            else
                node = node.getRightChild();
            if (node == null)
                return null;
        }
        return node;
    }

    public void Display(){

        if (rootNode == null){ //if tree is empty
            System.out.println("The tree is empty");
        }
        else{ //tree is not empty
            Stack topLevel = new Stack();
            Stack lowerLevel = new Stack();
            String separator = "#########################################################################################";
            System.out.println(separator);
            topLevel.push(rootNode);
            int gap = 40;
            boolean notEmptyRow = true;
            while (notEmptyRow){
                notEmptyRow = false;
                for (int i=0;i<gap;i++)
                    System.out.print(" ");
                while (!topLevel.empty()){
                    CreateNode node = (CreateNode) topLevel.pop();
                    if (node != null){
                        lowerLevel.push(node.getLeftChild());
                        lowerLevel.push(node.getRightChild());
                        if (node.getLeftChild() != null || node.getRightChild() != null)
                            notEmptyRow = true;
                        System.out.print(node.getKey()+":"+node.getValue());
                    }
                    else
                        System.out.print("-----");
                    for (int i=0;i<gap;i++)
                        System.out.print(" ");
                }
                while (!lowerLevel.empty()){
                    topLevel.push(lowerLevel.pop());
                }
                System.out.println();
                gap /= 2;
            }
            System.out.println(separator);
        }
    }

}
