package BasicsOfLinkedLIst;

public class LinkedList {
    private class Node {// Node creation
        private int value;
        private Node next;

        public Node(int value) {// constructor
            this.value = value;
        }
    }
            private Node first;
            private Node last;
            private int size;

    public void addLast(int value) {
        Node newNode = new Node(value);
        if (isEmpty())
            first = last = newNode;
        else {
            last.next=newNode;
            last = newNode;
        }
        size++;
    }
    public void addFirst(int value){
        Node newNode=new Node(value);
        if(isEmpty())
            first=last=newNode;
        else{
            newNode.next=first;
            first=newNode;
        }
        size++;
    }
    public int indexOf(int value) {
        if (isEmpty()) throw new IllegalArgumentException(" No elements");
        Node current = first;
        int count=0;
        while (current != null) {
            if (current.value == value) return count+1;
            else
                current=current.next;
                count++;
            }
        return -1;
    }
    public boolean contains(int value) {
        if (isEmpty()) throw new IllegalArgumentException(" No elements");
        Node current = first;
        while (current != null) {
            if (current.value == value) return true;
            current=current.next;
            }
        return false;
    }
    public void removeFirst(){
        if(isEmpty()) throw new IllegalArgumentException("No Elements");
        if(first==last)
            first=last=null;
        else{
            Node second=first.next;
            first.next=null;
            first=second;
        }
        size--;
    }
    public void removeLast(){
        Node previous=getPrevious(last);
        last=previous;
        last.next=null;
        size--;
    }
    public int size(){
        return  size;
    }
    public int[] array(){
        int [] array=new int[size];
        Node current=first;
        int index=0;
        while(current!=null){
            array[index++]=current.value;
            current=current.next;
        }
        return array;
    }
    public void printll(){
        Node current=first;
        while(current!=null){
            System.out.print(current.value+" ");
            current=current.next;
        }
        System.out.println();
    }
    public void reverse() {
        Node previous = first;
        Node current = first.next;
        Node temp = null;

        while (current != null) {
            temp = current.next;
            current.next = previous;
            previous=current;
            current=temp;
        }
        last=first;
        last.next=null;
        first=previous;
    }
    public int getKthFromEnd(int value){
        Node slow=first;
        Node fast=first;
        for(int i=0;i<value-1;i++){
            fast=fast.next;
        }
        while(fast!=null){
            if(fast==last) return slow.value;
            else{
                slow=slow.next;
                fast=fast.next;
            }
        }
        return -1;
      }
    public int middleNode(){
        Node slow=first;
        Node fast=first;

        while(fast.next!=last ){
            if(fast==last) return slow.value;
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow.value;
    }
    public void mergeSort(){
        Node prev=first;
        Node curr=first.next;
        Node temp=null;
    }

    private Node getPrevious(Node last){
        Node current=first;
        while(current!=null){
            if(current.next==last) return current;
            current=current.next;
        }
        return null;
    }
    private boolean isEmpty(){
       return first==null;
        }


}
