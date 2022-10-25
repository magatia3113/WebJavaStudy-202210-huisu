package src.main.java.j07_반복;
import java.util.Scanner;

public class Loop5 {


    public static void main(String[] args) {

       Scanner scanner = new Scanner(System.in);


       for(int i =0; i<8; i++){ //   구구단 몇번반복할지 i 변수사용   8번반복 >> 2~ 9단
           // 중첩for문 =  지역변수처럼 한가지로 사용불가, 두개의 변수필요

           int dan = i+2;  //2단부터>>  0+2 

           for(int j =0; j <9; j++){

               int num = j+1;  //  num = 곱해지는 숫자> 1씩증가

               System.out.println(dan+"x"+num+"="+(dan*num));





           
           
       }














        }




    }
}
