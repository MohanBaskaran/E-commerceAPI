package com.mohancode.cart.Interviewprep;

import java.util.*;

public class Linked_List {
    public static void main(String[] args) {
//        ListNode head = new ListNode(1);
//        head.next = new ListNode(1);
//        head.next.next = new ListNode(2);
//        System.out.println(head);

//        List<Student> students = new ArrayList<>();
//        students.add(new Student(2, "Alice"));
//        students.add(new Student(1, "Bob"));
//        Collections.sort(students);
//        System.out.println(students.toString());

        // Create the map
        Map<CustomKey, TransactionDetails> transactionMap = new HashMap<>();

        // Add entries to the map
        CustomKey key1 = new CustomKey("TXN12345", "MERCHANT001", "2025-01-01");
        CustomKey key2 = new CustomKey("TXN67890", "MERCHANT002", "2025-01-02");

        transactionMap.put(key1, new TransactionDetails(100.50, "SUCCESS"));
        transactionMap.put(key2, new TransactionDetails(200.75, "FAILED"));

        // Retrieve data using the custom key
        System.out.println("Transaction Details for Key1: " + transactionMap.get(key1));
        System.out.println("Transaction Details for Key2: " + transactionMap.get(key2));


    }

    public ListNode deleteDuplicates(ListNode A) {
//        LinkedHashSet<ListNode> set = new LinkedHashSet<>();
//      for (ListNode node = A; node != null; node = node.next) {
//          set.add(node);
//      }
//        return ;
        if (A == null) return null;
        ListNode ans =A;
        while(ans!=null && A.next != null) {
            if(A.val == A.next.val) {
                ans.next = A.next.next;
            }else {
                ans = ans.next;
            }
        }
        return ans;
    }
}

class ListNode {
      public int val;
      public ListNode next;
      ListNode(int x) { val = x; next = null; }
 }

class Student implements Comparable<Student> {
    int id;
    String name;

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public int compareTo(Student other) {
        return Integer.compare(this.id, other.id); // Compare by ID
    }
}

class TransactionDetails {
    private double amount;
    private String status;

    public TransactionDetails(double amount, String status) {
        this.amount = amount;
        this.status = status;
    }

    @Override
    public String toString() {
        return "TransactionDetails{" +
                "amount=" + amount +
                ", status='" + status + '\'' +
                '}';
    }
}

class CustomKeyMapExample {
    public static void main(String[] args) {
        // Create the map
        Map<CustomKey, TransactionDetails> transactionMap = new HashMap<>();

        // Add entries to the map
        CustomKey key1 = new CustomKey("TXN12345", "MERCHANT001", "2025-01-01");
        CustomKey key2 = new CustomKey("TXN67890", "MERCHANT002", "2025-01-02");

        transactionMap.put(key1, new TransactionDetails(100.50, "SUCCESS"));
        transactionMap.put(key2, new TransactionDetails(200.75, "FAILED"));

        // Retrieve data using the custom key
        System.out.println("Transaction Details for Key1: " + transactionMap.get(key1));
        System.out.println("Transaction Details for Key2: " + transactionMap.get(key2));
    }
}

class CustomKey {
    private String transactionId;
    private String merchantId;
    private String date;

    public CustomKey(String transactionId, String merchantId, String date) {
        this.transactionId = transactionId;
        this.merchantId = merchantId;
        this.date = date;
    }

    // Implement hashCode()
    @Override
    public int hashCode() {
        int hash = Objects.hash(transactionId, merchantId, date);
        System.out.println("hashCode() called for: " + this + ", hash: " + hash);
        return hash;
    }

    // Implement equals()
    @Override
    public boolean equals(Object obj) {
        System.out.println("equals() called for: " + this + " and " + obj);
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        CustomKey other = (CustomKey) obj;
        return Objects.equals(transactionId, other.transactionId) &&
                Objects.equals(merchantId, other.merchantId) &&
                Objects.equals(date, other.date);
    }

    @Override
    public String toString() {
        return "CustomKey{" +
                "transactionId='" + transactionId + '\'' +
                ", merchantId='" + merchantId + '\'' +
                ", date='" + date + '\'' +
                '}';
    }
}
