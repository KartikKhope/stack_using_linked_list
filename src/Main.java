import javax.sound.midi.Soundbank;
import java.util.Scanner;
class Node {
    int data;
    Node next;
    Node(int x)
    {
        data=x;
        next=null;
    }
}
class Stack
{
    Node H;
    int count;
    Stack()
    {
        H=null;
        count = 0;
    }

    public void push (int x)
    {
        if(H==null)
        {
            H = new Node(x);
        }
        else
        {
            Node y = new Node(x);
            y.next=H;
            H=y;
        }
        count++;
    }

    public int pop()
    {
        if(H==null)
        {
            return -1;
        }
        else
        {
            int el = H.data;
            H=H.next;
            count--;
            return el;
        }
    }

    public int peek()
    {
        return (H.data);
    }

    void size()
    {
        System.out.println("Size "+ count);
    }

    boolean IsEmpty()
    {
        return(H==null);
    }

    void displayStack() {
        Node current = H;
        System.out.print("Stack: ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}

public class Main{

    public static void main(String[] args) {
        Stack Vit = new Stack();
        Scanner scr = new Scanner(System.in);

        System.out.println("Enter value to push");
        int x = scr.nextInt();
        Vit.push(x);
        Vit.push(18);
        Vit.push(48);
        Vit.push(6546);
        Vit.displayStack();
        System.out.println("pop");
        Vit.pop();
        Vit.displayStack();
        System.out.println("peek");
        Vit.peek();
        Vit.displayStack();
        Vit.size();
        int A= 0;
    }
}