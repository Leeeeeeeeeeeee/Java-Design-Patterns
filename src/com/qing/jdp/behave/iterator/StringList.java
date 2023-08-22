package com.qing.jdp.behave.iterator;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

//自定义集合类
class StringList implements Iterable<String> {
 private List<String> data = new ArrayList<>();

 public void add(String item) {
     data.add(item);
 }

 @Override
 public Iterator<String> iterator() {
     return new StringListIterator();
 }

 // 内部迭代器实现
 private class StringListIterator implements Iterator<String> {
     private int currentIndex = 0;

     @Override
     public boolean hasNext() {
         return currentIndex < data.size();
     }

     @Override
     public String next() {
         String item = data.get(currentIndex);
         currentIndex++;
         return item;
     }
 }
}
