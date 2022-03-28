package src;

public class Test {

    public static void main(String[] args){
        //LinkedList<Integer> myList=new LinkedList<>();
       // CircularLinkedList<Integer> myList=new CircularLinkedList<>();
        DoublyLinkedList<Integer> myList = new DoublyLinkedList<>();

        myList.addToFront(10);
        myList.addToFront(11);
        myList.addToFront(12);
        myList.addToFront(13);
        //myList.delete(13);
        myList.selectionSort();
        myList.display();


        //        Queue<Integer> q1=new Queue(Integer.class,5);
//        q1.enqueue(5);
//        q1.enqueue(15);
//        q1.enqueue(3);
//        q1.enqueue(4);
//        q1.dequeue();
//        q1.display();
//        GenericStackOps<Integer> sops=new GenericStackOps<>();
//        System.out.println(sops.isPalindrome("kapaks"));

//        GenericStack<Integer> gs=new GenericStack<>(Integer.class, 5);
//        //GenericStack<Student> gs2=new GenericStack<>(Student.class, 5);
//        gs.push(5);
//        gs.push(6);
//        gs.push(2);
//        gs.display();
//        GenericStackOps<Integer> sops=new GenericStackOps<>();
//        System.out.println(sops.findMax(gs));
        //        Stack s=new Stack(5);
//        s.push(5);
//        s.push(6);
//        s.push(2);
//        //s.pop();
//
//        s.display();
//        System.out.println(StackOperations.search(s,67));
//        s.display();


        //GenericStack<Integer> asd = new GenericStack<>(Integer.class,2);
       // asd.push(2);
        //asd.push(5);
        //System.out.println(asd.pop());
        //asd.display();
    }


}
