package org.example;
import java.util.List;
import java.util.ArrayList;

public class ListZipper {

    <T> List<T> zip(List<T> list1, List<T> list2) {
        if (list1 == null || list2 == null) {
            throw new IllegalArgumentException("Input lists cannot be null");
        }

        int size = Math.min(list1.size(), list2.size());

        List<T> zippedList = new ArrayList<>(size * 2);
        for (int i = 0; i < size; i++) {
            zippedList.add(list1.get(i));
            zippedList.add(list2.get(i));
        }

        if (list1.size() > size) {
            zippedList.addAll(list1.subList(size, list1.size()));
        } else if (list2.size() > size) {
            zippedList.addAll(list2.subList(size, list2.size()));
        }

        if (zippedList.isEmpty()) {
            throw new IllegalArgumentException("Both lists are empty");
        }
        
        return zippedList;
    }

}
