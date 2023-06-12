package homework4;
//Реализуйте очередь с помощью LinkedList со следующими методами:
//enqueue() - помещает элемент в конец очереди, 
//dequeue() - возвращает первый элемент из очереди и удаляет его, 
//first() - возвращает первый элемент из очереди, не удаляя.


import java.util.LinkedList;

public class Queue<T> {  // параметр Т для работы с любым типом данных
    private LinkedList<T> queue = new LinkedList<>();

    public void enqueue(T item) {
        queue.addLast(item);
    }

    public T dequeue() {
        return queue.removeFirst();
    }

    public T first() {
        return queue.getFirst();
    }

    public static void main(String[] args) {
        Queue<String> queue = new Queue<>();
        queue.enqueue("hello");
        queue.enqueue("world");
        queue.enqueue("!");

        System.out.println(queue.dequeue());
        System.out.println(queue.first());
    }
}
