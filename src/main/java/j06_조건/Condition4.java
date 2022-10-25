package src.main.java.j06_조건;

import java.util.Scanner;
public class Condition4 {


    public static void main(String[] args) {

        Scanner scanner  = new Scanner(System.in);

    String selected = null;   //      =  selected = scanner.nextLine();
                                // 문자열 변수 사용시= null;로 초기화 ,scanner.next "Line" 사용
                                 // 정수 변수 사용시 =0 ; 으로 초기화,  scanner.next "Int" 사용
        System.out.println("[선택 프로그램]");
        System.out.println("a. 메뉴1");
        System.out.println("b. 메뉴2");
        System.out.println("c. 메뉴3");
        System.out.println("d. 메뉴4");
        System.out.println("e. 메뉴5");
        System.out.print("실행 할 명령을 선택하세요");
        selected = scanner.nextLine();

    switch (selected) {     //switch() 안에 입력받은값에 따라 "시작 위치" 선정 (변수 null 로 지정)
                            // break; 문을 사용해서 원하는 값만 출력 하게 끔 만듬,  (원하는 위치에 명령문 종료)

    case "a" : System.out.println("메뉴1을 선택하셨습니다."); break;

    case "b" : System.out.println("메뉴2을 선택하셨습니다."); break;

    case "c" :  System.out.println("메뉴3을 선택하셨습니다.");  break;

    case "d" : System.out.println("메뉴4을 선택하셨습니다."); break;

    case "e" : System.out.println("메뉴5을 선택하셨습니다."); break;




    }



    }
}
