import java.util.*;
public class Fourth {
    public static void reverse(Stack<Integer> st) {
        if(st.isEmpty())
            return;
        int temp = st.pop();
        reverse(st);
        insertAtLast(st, temp);
    }
    public static void insertAtLast(Stack<Integer> stack, int elem){
        if(stack.isEmpty()){
            stack.push(elem);
            return;
        }
        int topElem = stack.pop();
        insertAtLast(stack, elem);
        stack.push(topElem);
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.add(4);
        st.add(3);
        st.add(2);
        st.add(1);
        System.out.println(st);
        reverse(st);
        System.out.println(st);
    }
}
