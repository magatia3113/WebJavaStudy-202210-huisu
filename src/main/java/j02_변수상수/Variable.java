package src.main.java.j02_변수상수;

public class Variable {

/// var =  변수

    public static void main(String[] args) {


        //논리 자료형 변수

        boolean checkFlag = false;      // 선언  boolean 자료형 크기 저장 false 값 초기화

        System.out.println(checkFlag);

        checkFlag = true;

        System.out.println(checkFlag);

        //문자 자료형 변수
        char name1 = '김';
        char name2 = '준';
        char name3 = '일';
        System.out.println(name1);
        System.out.println(name2);
        System.out.println(name3);
        System.out.println("" + name1 + name2 + name3);
        System.out.println('가' + 0);



//문자열 자료형 변수

        String name = "김준일";
        String name4 = "윤도영";
        String name5 = name + name4;
        System.out.println(name5);


        System.out.println(name);    // string name  = "김준일"  동일

//정수 자료형 변수

        int width = 100;
        int width2 = 200;

        String width3 = "300";
        String width4 = "400";

        int widthResult = width + width2;   // 값 =  300
        String widthResult2 = width3 + width4;  // 값 400


        System.out.println(widthResult);   // 결과 출력
        System.out.println(widthResult2);   // 결과 출력
// 문자열 + 상수 = 문자열

        long time = System.currentTimeMillis();    // 현재시간 표기
        System.out.println(time);   // 현재시간  출력

        /*int time2 = 166178885589l;     <<<    L,l 이없으면 오류발생:지정크기를 벗어남 , 대문자 L , 소문자 l 뒤에 삽입시 에러x
         */

        long time2 = System.currentTimeMillis();    // 현재시간 표기
        System.out.println(time2);


//실수자료형 변수

        double pi = 3000.1415926359;                            // 대문자 E7 =  10의 7승
        // 정수가커지면 표기가능한 수치를 넘어섬, 표기법 변화

        System.out.println(pi);  // pi 값 출력


        final String FILE_PATH = "C:/Users/"; // final 이 없으면 일반변수 , 상수 = final 붙여야함
        // 상수 = 대문자표기
//    System.out.println(FILE_PATH);


    }


}

 

