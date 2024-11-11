package arraylist;
import java.util.ArrayList;
import java.util.Collections;

public class BasicArrayList {
    static void reverseArraylist(ArrayList<Integer> l2){
        int i = 0,j = l2.size()-1;

        while(i < j){
            Integer temp = Integer.valueOf(l2.get(i));
            l2.set(i, l2.get(j));
            l2.set(j,temp);
            i++;
            j--;
        }
    }
    public static void main(String[] args) {
        // ArrayList<Integer> list = new ArrayList<>();
        // list.add(20);
        // list.add(21);
        // list.add(22);
        // index starts from 0
        // System.out.println(list.get(1)); 
        // System.out.println(list.size()); // size of arraylist - 3

        // for(int i = 0; i < list.size(); i++){
        //     System.out.print(list.get(i) + " ");
        // }

        // System.out.println(list); // print list directly

        //? // list.set(1, 10); // change the value of 1st index to 10
        // list.add(1,11); // add element (10)  at index 1

        // list.remove(1); // remove element of 1st index
        // list.remove(Integer.valueOf(21)); // remove element
        // System.out.println(list);

        // boolean ans = list.contains(Integer.valueOf(23));
        // System.out.println(ans);

        // ArrayList l1 = new ArrayList();
        // l1.add("Welcome");
        // l1.add(2);
        // l1.add(true);

        // System.out.println(l1);

        //! Reverse an arraylist

        ArrayList<Integer> l2 = new ArrayList<Integer>();
        l2.add(0);
        l2.add(10);
        l2.add(3);
        l2.add(5);
        l2.add(22);

        reverseArraylist(l2);
        Collections.reverse(l2);
        Collections.sort(l2);
        Collections.sort(l2,Collections.reverseOrder());
        // System.out.print(l2);

        //? Sort an arraylist of strings in descending order

        ArrayList<String> l3 = new ArrayList<>();
        l3.add("Welcome");
        l3.add("to");
        l3.add("Galaxy");
        
        Collections.sort(l3);
        Collections.sort(l3,Collections.reverseOrder()); // (list,comparator)
        System.out.print(l3);



    }
    
}