package src.main.java.j07_반복;
import java.util.Scanner;

public class Loop4 {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

    int dan = 0;

        System.out.println("단 입력");


        dan = scanner.nextInt();   // dan 값에 스캔f값 입력

        for(int i =0; i <9; i++){               //    " 1단에서 부터 9단까지 " 9번 반복

            int num = i+1;  // num = 곱해지는 숫자> 1씩증가

            System.out.println(dan+"x"+num+"="+(dan*num));     // 단 X 곱해지는숫자




        }




    }
}
