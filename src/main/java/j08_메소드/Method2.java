package src.main.java.j08_메소드;

import java.util.Scanner;

public class Method2 {

    /*
    별찍기

     */

    public static  String getStar( int select ,int n ){
        String result = "";

    if (select==1){


        for( int i  =0; i<n ; i++){   // n번 별 찍기 반복

            for(int j = 0; j<i+1;j++){  //

                result += "*";
            }
            result += "\n";
        }

}else if (select==2){

}else if (select==3){

}else if (select==4){

}else{System.out.println("입력 오류 ");}
return result;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 입력
        int n  = 0;     //
        int select=  0;   //
        System.out.println("별의 개수 입력 ");

        n = scanner.nextInt();   // n에 입력받을값 넣기 별을 찍을 갯수

        System.out.println("1. 왼쪽에 치우친 증가하는 별");
        System.out.println("2. 오른쪽에 치우친 증가하는 별");
        System.out.println("3. 왼쪽에 치우친 감소하는 별");
        System.out.println("4. 오른쪽에 치우친 감소하는 별");
        System.out.println("메뉴선택");
        select = scanner.nextInt();          //1~4 선택후 select 값 입력


        String star = getStar(select, n);    // select  = 1 ,n =10 입력받을 시
                                                            //  함수값 통해 결과값 출력

        System.out.println("[결과]");

        System.out.println(star);

        System.out.println("*\n**\n***\n");











    }
}
