package src;

public class StackOperations {

    public static boolean search(Stack s, int val){
        Stack temp=new Stack(s.size());
        boolean found=false;
        while(!s.isEmpty()){
            int topElement=s.pop();
            temp.push(topElement);
            if(topElement==val) {
                found = true;
                break;
            }
        }
        while(!temp.isEmpty()){
            s.push(temp.pop());
        }
        return found;

    }
//write a  method that will remove an element from a stack.
//if there are more than one of that element, it should remove all

//write a method that will find the maximum number in the stack

//think about how would you implement a generic version of
//Stack and StackOperations classes.
}
