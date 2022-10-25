package src.main.java.j08_메소드;

public class OverLoading {
// 같은이름의 메소드 정의= 불가능
// but 매개변수를 가지는 메소드 매개변수가 다를경우 사용가능==메소드 오버로딩

    //메소드 오버로딩 = 매개변수의 형태가 다르면 동일한 메소드 명을 가지고 정의할 수 있다.
    public static void add(){                            //1

        System.out.println("add()");



    }



public static void  add(int a ){                            //2


    System.out.println("add()");


}

public static void add(String s){                            //3

    System.out.println("add(String s)");

}

public static void add(int a ,int b) {                            //4

    System.out.println("add(int a ,int b)");


}

public static void add(int a ,String b) {                            //5

    System.out.println("add(int a , String b)");


}

    public static void add(String b ,int a ) {                            //6

        System.out.println("add(String b , int a)");


    }


    public static void main(String[] args) {

    add();   // add 메소드 호출
    add(10); // 정수기때문에 2번째 함수호출
    add("10") ; //  문자열이기때문에 세번째 메소드(문자열 자료형 으로선언된) 호출
    add(10,20); //매개변수가 두개인 4번쨰 메소드 함수  호출
    add(10,"20");// int a string b순서로 이루어진 5번째 메소드 호출
    add("10",20); // string  n  int a 순서로 이루어진6번쨰 메소드 호출






    }

}
