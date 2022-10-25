package src.main.java.j06_조건;

import java.util.Scanner;

public class Condition3 {

    public static void main(String[] args) {

Scanner scanner = new Scanner(System.in);

    int score  = 0;   //시험 점수

    String grade = null;      // 학점

    System.out.println("점수를 입력하세요: ");
        score = scanner.nextInt();                          // score= scanner.nextInt() 가 sout명령어 뒤에 나와야
        //조건                                                알맞는 결과값 나옴
        /*
1. score가  0보다 작거나 100보다 크면  grade는 X
2. score가 90~100 :  grade=  A
3. score가 80~89 :  grade=  B
4. score가 70~79 :  grade=  C
5. score가 60~69 :  grade=  D
6. score가 00~59 :  grade=  F

    입력한 점수는 __이며  학점은 __학점입니다.

         */


final int A = 90;
final int B = 80;
final int C = 70;
final int D = 60;
final int F = 50;

if(score <0 || score> 100 )   {grade = "X";

}else if (score > 89 ){grade = "A";

}else if (score > 79){grade ="B";

}else if (score > 69){grade = "C";

}else if (score > 59){grade= "D";

}else {grade = "F";}



        System.out.println("입력한 점수는  "+ score  +"이며");
        System.out.println("학점은 : "+ grade + "입니다.");

    }

    
    

}
