package DemoStack;

import java.util.Scanner;
import java.util.Stack;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        System.out.println("Nhập vào số lương phần tử: ");
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập vào phần tử thứ " + (i+1));
            int a = scanner.nextInt();
            stack.push(a);
        }
        System.out.println(stack);
        for (int i = 0; i < n; i++) {
            System.out.println(stack.pop());
        }
    }
}
