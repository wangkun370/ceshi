package com.example.demo;

import java.util.*;
import java.util.function.Consumer;

public class demo {


    public static void main(String[] args) {



    ArrayList arrayList = new ArrayList();
        List<String> list = Arrays.asList("aaaa","bbbb");

       /* for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        for (String str : list) {
            System.out.println(str);
        }

        //迭代器
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
            break;
        }*/

       /*list.forEach(new Consumer<String>() {
           @Override
           public void accept(String s) {
               System.out.println(s);
           }
       });*/

       Collections.sort(list, new Comparator<String>() {
           @Override
           public int compare(String o1, String o2) {
               return o1.compareTo(o2);
           }
       });


       list.forEach(e-> System.out.println(e));

    }

}



