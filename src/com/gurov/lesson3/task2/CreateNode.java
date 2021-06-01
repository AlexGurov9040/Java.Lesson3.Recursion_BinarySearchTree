package com.gurov.lesson3.task2;

public class CreateNode {

    private final int key;
    private final String value;
    private CreateNode leftChild;
    private CreateNode rightChild;

    public CreateNode(int key,String value){

        this.key = key;
        this.value = value;
    }

    public int getKey(){return key;}

    //public void setKey(int key){this.key = key;}

    public String getValue(){return value;}

    //public void setValue(String value) {this.value = value;}

    public CreateNode getLeftChild(){return leftChild;}

    public void setLeftChild(CreateNode leftChild){this.leftChild = leftChild;}

    public CreateNode getRightChild(){return rightChild;}

    public void setRightChild(CreateNode rightChild){this.rightChild = rightChild;}
}
