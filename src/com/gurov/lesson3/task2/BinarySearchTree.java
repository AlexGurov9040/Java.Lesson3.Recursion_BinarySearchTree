package com.gurov.lesson3.task2;

public class BinarySearchTree {

    public static void main(String[] args){

        BinarySearchTree app = new BinarySearchTree();
        app.Menu();
    }

    public static void Menu(){

        CreateTree tree = new CreateTree();
        tree.Insert(32,"Node_1");
        tree.Insert(16,"Node_2");
        tree.Insert(34,"Node_3");
        tree.Display(tree);
    }

}
