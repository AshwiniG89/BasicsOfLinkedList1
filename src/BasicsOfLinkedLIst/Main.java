package BasicsOfLinkedLIst;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void  main(String[] args){
        Scanner sc=new Scanner(System.in);
        LinkedList list=new LinkedList();
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int data=sc.nextInt();// can be any type of variable
            list.addLast(data);//1
        }
        list.printll();
        //int I=sc.nextInt();
        //list.addFirst(I);//2
        //list.printll();
        //int findI=sc.nextInt();
        //list.indexOf(findI);
        //System.out.println(list.indexOf(findI));//3
        //int find=sc.nextInt();
        //System.out.println(list.contains(find));//4
        //list.removeFirst();//5
        //list.printll();
        //list.removeLast();//6
        //list.printll();
        //System.out.println(list.size());//7
        //convert to Array//8
        //list.reverse();//9
        //list.printll();
        //int middle=list.middleNode();//10
        //System.out.print(middle);
        //var array=list.array();//11
        //System.out.print(Arrays.toString(array));
        //int k=sc.nextInt();
        //System.out.print(list.getKthFromEnd(k));//12
        list.mergeSort();
        list.printll();


    }
}
