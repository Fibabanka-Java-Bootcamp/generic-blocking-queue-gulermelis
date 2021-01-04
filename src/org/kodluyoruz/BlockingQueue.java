package org.kodluyoruz;

public class BlockingQueue<T> implements Queue<T> {
    //verileri tutmak ve eklenen veilerin birbirini point etmesi için Node sınıfını wrapper olarak kullandık

    private Node<T> head;
    private Node<T> tail;

    //constructor ım yok, default constructor kulanıyoruz. BlockingQueue objesi yarattığımız zaman,
    // head ve tail referans tipte oldugu için null değerlerine sahip olcak.


    @Override
    public void add(T value) {
        Node<T> node = new Node<T>(value);
        if(head == null){
            head = node;
            tail = node;
        }
        tail.setNext(node);
        tail=node;
    }

    @Override
    public T peek() {
        return head != null ? head.getValue() : null;
    }

    @Override
    public T poll() {
        T temp = null;
        if(head != null){
            temp = head.getValue();
            head = head.getNext();

        }

       return temp;
    }
}
