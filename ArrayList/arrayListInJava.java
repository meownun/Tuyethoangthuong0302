package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class arrayListInJava {
    public static void main(String[] args){
        ArrayList<Integer> al = new ArrayList<Integer>();

        //Add items to ArrayList
        al.add(10);
        //al.add("RCV");
        al.add(25);
        //System.out.println(al.size());
        //System.out.println(al);

        int i = al.get(0);

        //Remove
        al.remove(0);
       // System.out.println(al);

        al.add(34);
        al.add(56);
        al.add(78);
        al.add(56);
        //System.out.println(al);

        //Fetch
        //System.out.println(al.get(0));

        /*for (int i = 0; i < al.size(); i++){
            System.out.println(al.get(i));

        }*/
        /*for(Object obj:al){
            System.out.println(obj);
        }*/
        Iterator itr = al.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());

        }




    }
}
