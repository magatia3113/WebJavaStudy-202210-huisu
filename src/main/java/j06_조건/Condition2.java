package src.main.java.j06_조건;

import java.util.Scanner;

public class Condition2 {

    public static void main(String[] args) {

Scanner scanner = new Scanner(System.in);

    final int VIP_POINT  = 80;  ////  행선택 + Alt + Shift +방향키 =  행 이동
    final int GOLD_POINT  = 60;
    final int SILVER_POINT  = 40;
    final int BRONZE_POINT  = 20;


        int point  =0;
        String rating = null;
        System.out.println("회원 포인트 정수를 입력하세요: ");
        point = scanner.nextInt();

        if(point >VIP_POINT)   {rating = "VIP";

        }else if(point > GOLD_POINT){rating = "Gold";
        }else if (point > SILVER_POINT){rating = "Silver";
        }else if (point > BRONZE_POINT){rating = "Bronze";
        }else{rating = "GENERAL";}



    }


}
