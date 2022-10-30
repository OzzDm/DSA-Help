/* Program to remove duplicate items from an unsorted linkedlist usind HashMap*/
import java.util.*;

public class removeDuplicates {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<Integer> l=new LinkedList<>();
        List<Integer> rem=new LinkedList<>();
        System.out.println("Enter the number of elements to be added in the List");
        int n=sc.nextInt();
        System.out.println("Enter the elements of the List");
        for(int i=0;i<n;i++){
            l.add(sc.nextInt());
        }
        Map<Integer, Integer> m=new HashMap<>();//key=> item in the list, value=> frequency of occurence

        Iterator<Integer> iter = l.iterator();
        while(iter.hasNext()){           
            int item=iter.next();//here item=Key
             // System.out.println(item);
            if(!m.containsKey(item)){
                m.put(item, 1);
            }
            else{
                rem.add(item);
            }
        }

        //----------Printing the lists and hashmap for checking------------//
        // m.forEach((k,v)->System.out.println(k+" "+v));
        // rem.forEach(element-> System.out.println(element));
        // l.forEach(element-> System.out.println(element));
        
        for(int i: rem){
            l.remove(Integer.valueOf(i));  
            }

        Iterator<Integer> iter2 = l.iterator();
        System.out.println("List after removing duplicate elements");
        while(iter2.hasNext()){
            System.out.println(iter2.next());
        } 
        sc.close();
    }
}
