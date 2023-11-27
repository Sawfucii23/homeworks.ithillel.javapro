package homeworks.hw11;

import java.util.concurrent.locks.ReentrantLock;

public class ThreadSafeList<T> {
    private Object[] array;

    private int size;

    private int capacity;

    private ReentrantLock lock;

    public ThreadSafeList(int capacity) {
        if (capacity < 1) {
            throw new IllegalArgumentException("Максимальний розмір списку повинен бути не менше 1");
        }
        this.capacity = capacity;
        this.size = 0;
        this.array = new Object[capacity];
        this.lock = new ReentrantLock();
    }

    public void add(T element) {
        lock.lock();
        try {
            if (size < capacity) {
                array[size] = element;
                size++;
            } else {
                throw new IllegalStateException("Список переповнений");
            }
        } finally {
            lock.unlock();
        }
    }


    public T get(int index) {
        lock.lock();
        try {
            if (index >= 0 && index < size) {
                return (T) array[index];
            } else {
                throw new IndexOutOfBoundsException("Індекс " + index + " поза межами списку");
            }
        } finally {
            lock.unlock();
        }
    }


    public void remove(T element) {
        lock.lock();
        try {
            int index = -1;
            for (int i = 0; i < size; i++) {
                if (array[i].equals(element)) {
                    index = i;
                    break;
                }
            }
            if (index != -1) {
                for (int i = index; i < size - 1; i++) {
                    array[i] = array[i + 1];
                }
                size--;
            } else {
                throw new IllegalArgumentException("Елемент " + element + " не знайдений в списку");
            }
        } finally {
            lock.unlock();
        }
    }


    public void remove(int index) {
        lock.lock();
        try {
            if (index >= 0 && index < size) {
                for (int i = index; i < size - 1; i++) {
                    array[i] = array[i + 1];
                }
                size--;
            } else {
                throw new IndexOutOfBoundsException("Індекс " + index + " поза межами списку");
            }
        } finally {
            lock.unlock();
        }
    }
}
