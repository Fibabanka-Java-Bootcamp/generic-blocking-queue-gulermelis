package org.kodluyoruz;

public interface Queue<T> {
    // oluşturdugum generic interface, sundugu methodları her tipte implement etmemi sağlıyor

    void add (T value);

    T poll();

    T peek();
}

