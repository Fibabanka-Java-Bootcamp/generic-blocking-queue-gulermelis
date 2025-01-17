package org.kodluyoruz;

public class Node<T> {
    //veriyi tutacagım sınıf
    //Queue ienterface im generşc olugu için queue ile ilişkili her şey generic olması gerekiyor
    private T value;
    private Node<T> next;

    //initialize
    public Node(T value){
        this.value=value;
    }

    public Node(T value, Node<T> next){
        this.value=value;
        this.next=next;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
