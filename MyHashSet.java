package lab10.hashSetAssignment;

import java.util.*;

public class MyHashSet<E, T>{

    public List<E> removeDuplicates(List<E> list){
        List<E>    newList = new ArrayList<>();
        Set<E> set = new HashSet<>();
        for (int i = 0; i < list.size(); i++){
            set.add(list.get(i));
        }
        Iterator<E> iter = set.iterator();
        while (iter.hasNext()){
            newList.add(iter.next());
        }
        return newList;
    }

    public int countDistinctValues(List<E> list){
        List<E> myList = removeDuplicates(list);
        return myList.size();
    }

    public Map<E, T> combineLists(List<E> list1, List<T> list2){
        Map<E, T> map = new TreeMap<>();
        int size = (list1.size() < list2.size()) ? list1.size(): list2.size();
        for (int i = 0; i < size; i++){
            map.put(list1.get(i), list2.get(i));
        }
        return map;
    }

    public Map<E, T> mapOfCourses(List<Course> list){
        List<E> list1 = new ArrayList<>();
        for (int i = 0; i < list.size(); i++){
            list1.add((E)list.get(i).getcId());
        }
        Map<E, T>   map = combineLists(list1, (List<T>) list);
        return map;
    }

    public static void main(String[] args){
        MyHashSet<String, Integer> set = new MyHashSet<>();
        Map<String, Integer>    map = new HashMap<>();
        List<String>    list1 = new ArrayList<>();
        List<Integer>   list2 = new ArrayList<>();
        list1.add("abdelaziz");
        list1.add("aboukhame");
        list1.add("abdelaziz");
        list1.add("aboukhame");

        list2.add(30);
        list2.add(20);
        list2.add(30);
        list2.add(20);

        System.out.println("first list: " + list1);
        System.out.println("second list: " + list2);
        // check Question 1
        System.out.println("list1 without duplicates: " + set.removeDuplicates(list1));
        // check Question 2
        System.out.println("distinct values for list 1: " + set.countDistinctValues(list1));
        // check Question 3
        map = set.combineLists(list1, list2);
        System.out.println("combine two lists in one structure: " + map);

        //check Question 4
        List<Course>    courses = new ArrayList<>();
        Course  course1 = new Course("CS201", "procedural programming", 4);
        Course  course2 = new Course("CS203", "OOP", 4);
        Course  course3 = new Course("CS221", "data structure", 4);
        Course  course4 = new Course("CS105", "problem solving", 4);
        courses.add(course1);
        courses.add(course2);
        courses.add(course3);
        courses.add(course4);
        System.out.println("The map of courses: " + set.mapOfCourses(courses));
    }
}
