package src.main.java.j07_반복;

import java.util.Scanner;

public class Loop3 {
    public static void main(String[] args) {

Scanner scanner = new Scanner(System.in);

int n = 0;

        System.out.println("몇번 반복할지 입력하세요");
        n = scanner.nextInt();  //() 반복횟수


        for( int i = 0; i <n; i++){   // 반복횟수 5번은 동일, print out 의 식만 변경해줄것

            System.out.println(" i:"+   (n-i) );



        }




    }




}
