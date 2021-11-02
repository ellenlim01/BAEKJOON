
import java.util.Scanner;

public class Main {
    int[] stack;
    int size = 0; 

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        stack = new int[N];

        for(int i =0; i<N; i++){

        }
    
    }

    public void push(int num) {
        stack[size] = num;
        size++;
    }
    
    public int pop() {
        int temp = stack[size-1];
        stack[size-1] = null;
        size--;
        return temp;
    }
    
    public int size() {
        return size;
    }
    
    public int empty() {
        if(size == 0){
            return 1;
        } else {
            return 0;
        }
    }
    
    public int top() {
        if(size == 0){
            return -1;
        } else {
            return stack[size-1];
        }
    } 

 }



