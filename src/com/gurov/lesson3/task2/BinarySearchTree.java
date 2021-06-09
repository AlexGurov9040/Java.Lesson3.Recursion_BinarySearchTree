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
        tree.Insert(44,"Node_3");
        tree.Insert(21,"Node_4");
        tree.Insert(21,"Node_5");
        tree.Insert(36,"Node_6");
        tree.Insert(19,"Node_7");
        tree.Insert(33,"Node_8");
        tree.Insert(38,"Node_9");
        tree.Insert(37,"Новая информация");
        tree.Display();
        CreateNode findValue = tree.Find(21);
        if (findValue != null)
            System.out.printf("Node found: %d:%s\n",findValue.getKey(),findValue.getValue());
        else
            System.out.println("Node not found");
        findValue = tree.Find(20);
        if (findValue != null)
            System.out.printf("Node found: %d:%s\n",findValue.getKey(),findValue.getValue());
        else
            System.out.println("Node not found");
        tree.Remove(21);
        tree.Display();
    }

}
