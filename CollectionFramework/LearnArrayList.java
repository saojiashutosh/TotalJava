package TotalJava.CollectionFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LearnArrayList{
    public static void main(String[] args){
//        List<Integer> list = new ArrayList<>();
//        list.add(1); // add element at the end of the arraylist
//        list.add(2);
//        list.add(3);
//        System.out.println(list);
//
//        list.add(4);
//        System.out.println(list);
//
//        list.add(2,50); // add element at the given index
//        System.out.println(list);
//
//        List<Integer> list1 = new ArrayList<>();
//        list1.add(150);
//        list1.add(250);
//        System.out.println(list1);
//
//        list.addAll(list1); // adds whole list in to the existing list at the end of the list
//        System.out.println(list);
        List<Integer> list2 = new ArrayList<>();
        for(int i = 1;i<101;i++){
            if(i%10==0){
                list2.add((i));
            }
        }

        System.out.println(list2);

        // All three are used to iterate over the list
        for (int i = 0; i < list2.size(); i++) {
            System.out.println(list2.get(i));
        }

        for (Integer integer : list2) {
            System.out.println(integer);
        }

        Iterator<Integer> it = list2.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
// iteration over

//        list2.set(1,100);//updates the element at the give index with the given values
//        System.out.println(list2);
//
//        System.out.println(list2.contains(50)); // checks that the entered element is in the list or not

//        System.out.println(list2.get(2));// gets the value of the element present at that index
//
//        list2.remove(1);//removes element present at that index
//        System.out.println(list2);
//
//        list2.remove(Integer.valueOf(30));//removes element if that element is present in the list
//        System.out.println(list2);
//
//        list2.clear();// removes all the elements from the list
//        System.out.println(list2);
    }
}
