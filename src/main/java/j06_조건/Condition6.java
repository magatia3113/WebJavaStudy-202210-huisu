package src.main.java.j06_조건;

import java.util.Scanner;

public class Condition6 {


    public static void main(String[] args) {

        Scanner scanner  = new Scanner(System.in);

   int score = 0;


        System.out.print("점수를 입력하세요");
        score = scanner.nextInt();


        if (score <0 || score >100){

            System.out.println("계산불가");
        }






    switch (score / 10) {     //switch() 안에 입력받은값에 따라 "시작 위치" 선정 (변수 null 로 지정)
                            // break; 문을 사용해서 원하는 값만 출력 하게 끔 만듬,  (원하는 위치에 명령문 종료)


/*   소수점 버림 switch() 문의 괄호값 결과에 따라 case 위치이동 ,
 100점/10 = " 10" >> case "10" 으로 이동
  95점 /10 =  "9.5"  >> case "9"로 이동 0.5 소수점 버림
 */
        //switch case, while,for 문에서만 break 사용 가능

         case 10 :   // 100점일 경우 포함해서 case9 까지 내려감

        case 9  :    System.out.println("A학점"); break;

        case 8  :    System.out.println("B학점"); break;

        case 7  :    System.out.println("C학점"); break;

        case 6  :    System.out.println("D학점"); break;
        
        
        
        
        
    default: System.out.println("F학점"); break; //  default  = if 문의 else 역할
                                                              //default = 해당하는 케이스가 없을 경우 찾아가는 지점

    }



    }
}
