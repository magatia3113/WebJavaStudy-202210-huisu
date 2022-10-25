package src.main.java.j08_메소드;

import org.w3c.dom.ls.LSOutput;

import java.util.Random;

public class RandomNumber {


    public static int calcRandom(int m) {
        Random random  = new Random();
        
    int result = random.nextInt(10)*1000+m;


    return result;  //result 가 int 로 선언됨>  결과값= 무조건 int  > 리턴자료형(반환자료형)
    }


    public static void main(String[] args) {

    int money = 5000;
    Random random  = new Random();  // 랜덤 클래스 생성

//Random = 자료형 , random = 변수


        /*
        int a = random.nextInt(10 )*1000 + money;//0~10 * 1000   + money= 최소단위 5000 이상사용
        System.out.println(a);
        int b = random.nextInt(10 )*1000 + money;
        System.out.println(b);
        int c = random.nextInt(10 )*1000 + money;
        System.out.println(c);
        int d = random.nextInt(10 )*1000 + money;
        System.out.println(d);*/




/*for(int i =0; i<10; i++){         // Ctrl +Shift +/ =  자체 주석 설정

int randNum  = random.nextInt(10)+10; //(0에서~10) +10 = 10~19까지

   // int randNum  = random.nextInt(100)+100; //(0에서~100) +100 = 100~199까지
    System.out.println(randNum);

        System.out.println(a+b+c+d);
*/

        System.out.println(calcRandom(money));   // 랜덤한 값의 결과 출력
    // 기능, 동작  정의 = 함수정의 = 메소드정의
        System.out.println(calcRandom(money));
        System.out.println(calcRandom(money));
        System.out.println(calcRandom(money));
        System.out.println(calcRandom(money));
        System.out.println(calcRandom(money));
        System.out.println(calcRandom(money));

        int r =  calcRandom(money);

        System.out.println(r+100);
        System.out.println(r+1000);
        System.out.println(r+10000);
        System.out.println(r+100000);



        // calcRandom(money) =  calcRandom 함수에 money 변수 대입한 결과









}






    }




