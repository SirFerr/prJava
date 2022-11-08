package _13_14pr._5ex;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();
        Date date;
        long tmp;

        System.out.println("insert");
        date=new Date(System.currentTimeMillis());
        for(int i=0; i<10;i++){
            arrayList.add(0,i);
        }
        tmp=new Date(System.currentTimeMillis()).getTime()-date.getTime();
        date=new Date(System.currentTimeMillis());
        for(int i=0; i<10;i++){
            linkedList.add(0,i);
        }
        System.out.println(tmp>new Date(System.currentTimeMillis()).getTime()-date.getTime());

        System.out.println("remove");
        date=new Date(System.currentTimeMillis());
        arrayList.remove(0);
        tmp=new Date(System.currentTimeMillis()).getTime()-date.getTime();
        date=new Date(System.currentTimeMillis());
        linkedList.remove(0);
        System.out.println(tmp>new Date(System.currentTimeMillis()).getTime()-date.getTime());

        System.out.println("add");
        date=new Date(System.currentTimeMillis());
        arrayList.add(14);
        tmp=new Date(System.currentTimeMillis()).getTime()-date.getTime();
        date=new Date(System.currentTimeMillis());
        linkedList.add(14);
        System.out.println(tmp>new Date(System.currentTimeMillis()).getTime()-date.getTime());

        System.out.println("search");
        date=new Date(System.currentTimeMillis());
        arrayList.contains(2);
        tmp=new Date(System.currentTimeMillis()).getTime()-date.getTime();
        date=new Date(System.currentTimeMillis());
        linkedList.contains(2);
        System.out.println(tmp>new Date(System.currentTimeMillis()).getTime()-date.getTime());



    }
}
