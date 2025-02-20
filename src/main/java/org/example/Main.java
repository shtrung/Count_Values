package org.example;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {

    //Пример использования
    public static void main(String[] args) {
        Character[] charArray = new Character[]{'H', 'e', 'l', 'l', 'o', 'W', 'o', 'r', 'l', 'd'};
        for (Map.Entry<Character, Integer> entry : getMapCountValues(charArray).entrySet()) {
            System.out.printf("%s встречается %d раз%n", entry.getKey(), entry.getValue());
        }
    }

    public static <T> Map<T, Integer> getMapCountValues(T[] array) {
        return Arrays.stream(array)
                .collect(Collectors.groupingBy(t -> t, Collectors.summingInt(t -> 1)));
    }
}