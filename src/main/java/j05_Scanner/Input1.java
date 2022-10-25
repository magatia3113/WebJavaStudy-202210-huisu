package src.main.java.j05_Scanner;

import java.util.Scanner;

public class Input1 {

    public static void main(String[] args) {

        /*
          문자열 입력
         next()    -> 띄어쓰기 포함 x

        nextLine()  -> 띄어쓰기 포함 o
        */




        String name = "김준일";
        Scanner scanner = new Scanner(System.in);

        String s = scanner. nextLine();            // scanner.next = 하나당 한번의 입력(스페이스바 단위 )
        String s2 = scanner.nextLine();            // scanner.nextLine  = 띄워 쓰기 넣어도 사용가능
        String s3 = scanner.nextLine();
        System.out.println("입력 받은 값1: "  +s);
        System.out.println("입력 받은 값2: "  +s2);
        System.out.println("입력 받은 값2: "  +s3);


    }


}
