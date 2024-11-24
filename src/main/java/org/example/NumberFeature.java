package org.example;

import java.util.Scanner;

public class NumberFeature {
    public static void main(String[] args) {
        int inputNumber; // 输入的数字
        int result = 0; // 输出结果
        int multiplier = 1;
        Scanner in = new Scanner(System.in);
        inputNumber = in.nextInt();
        // 你的代码逻辑
        
        while (inputNumber > 0) {
            int digit = inputNumber % 10;
            if (digit % 2 == 1) {
                 result += multiplier;
            }
            inputNumber /= 10;
            multiplier *= 2;
     
        }


        result = inputNumber;

        System.out.println(result);
        Scanner.close();
    }
}
