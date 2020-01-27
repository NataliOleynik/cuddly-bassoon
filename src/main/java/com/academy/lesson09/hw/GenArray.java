package com.academy.lesson09.hw;

import java.util.Arrays;

// Generic - Task1

public class GenArray<T> {
    private T[] array;

    public GenArray(T[] array) throws WrongIndexException {
        this.array = array;
    }

    public T get(int index) throws WrongIndexException{
        return array[index];
    }

    public void set(int index, T element) throws WrongIndexException {
        if (index < array.length)
            array[index] = element;
        else
            throw new WrongIndexException("Некорректное значение индекса");
    }

    @Override
    public String toString() {
        return "GenArray{" +
                "array=" + Arrays.toString(array) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof GenArray)) return false;
        GenArray<?> genArray = (GenArray<?>) o;
        return Arrays.equals(array, genArray.array);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(array);
    }
}
