package com.mohancode.cart.Interviewprep;


import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class AllAbtCollection implements Collection {
    public static void main(String[] args) {

        Collection<String> collection = new ArrayList<>();
        collection.add("A");
        collection.add("B");
        collection.add("C");
       // collection.

        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
         //   list.add("C"); // Causes ConcurrentModificationException
        }

        Vector<String> vector = new Vector<>();
        vector.add("Apple");
        vector.add("Test");
        vector.add("Banana");

        Enumeration<String> enumeration = vector.elements();
        while (enumeration.hasMoreElements()) {
            System.out.println(enumeration.nextElement());

           if(enumeration.nextElement().equals("check")){
               break;
           }
            vector.add("check");
        }

//        Set<Object> set1= new HashSet<>();
//        Set<Object> set2= new HashSet<>();
//        set1.add(set2);
//        set2.add(set1);
//        System.out.println(set1);

        HashMap<String, String> map = new HashMap<>();

        AtomicInteger atomicInteger = new AtomicInteger(5);

        // Simulating CAS operation
        int expectedValue = 5;
        int newValue = 10;

        // Compare current value with expected value and update if they match
        boolean isUpdated = atomicInteger.compareAndSet(expectedValue, newValue);

        if (isUpdated) {
            System.out.println("CAS Success! Updated value: " + atomicInteger.get());
        } else {
            System.out.println("CAS Failed! Current value: " + atomicInteger.get());
        }


    }


    static List<Person> getPersons() {
        return StreamsDemo.getPersons();
    }


    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public boolean add(Object o) {
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean addAll(Collection c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public boolean retainAll(Collection c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection c) {
        return false;
    }

    @Override
    public boolean containsAll(Collection c) {
        return false;
    }

    @Override
    public Object[] toArray(Object[] a) {
        return new Object[0];
    }
}



