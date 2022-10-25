package src.main.java.j05_Scanner;


import java.util.Scanner; //scanner 클래스 불러오기


public class Input3 {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
/*
 이름  : 김준일         자료형 String(문자열)        name
 나이  :    29            자료형 int                 age
 주소:  부산 동래구 사직동                          address
 연락처 : 010 9988  1916                            phone

사용자의 이름은 김준일이고 나이는 29입니다.
주소는 부산 동래구 사직동이며, 연락처는 010 9988 1916입니다.

 */





        int age    = 0 ;
        String name = null;
        String address;  //  " 부산 동래구 사직동";
        String phone;    // "010 9988 1916"  ;


        System.out.print("이름:"); 
        name= scanner.next();      //스페이스, 엔터입력 x 글자만인식


        System.out.print("나이:");
        age= scanner.nextInt();
        scanner.nextLine();


        System.out.print("주소:");
        scanner.nextLine();
        address = scanner.nextLine();    //스페이스,엔터도 문자로 인식


        System.out.print("연락처:");
        phone  = scanner.nextLine();


        System.out.println( " 사용자의 이름은" + name +"  이고 나이는 " + age +" 입니다."    );
        System.out.println( " 주소는 " + address +  "이며 연락처는 " + phone +" 입니다."    );


    }
}
