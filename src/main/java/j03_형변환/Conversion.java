package src.main.java.j03_형변환;

public class Conversion {


    public static void main(String[]args){

    //upcasting (업캐스팅)
    char cast1 = 'a';
        System.out.println((int)cast1);     // 자료형이 작은것에서 큰것으로 가는것
                                            //  cast1의 값을 int 자료형으로 변형한다는 의미
                                            // (int)  = 묵시적 형변환 = 생략해도됨

    int cast2 = cast1;
        System.out.println(cast2);


    // down casting  (다운 캐스팅)            자료형이 큰것에서 아래로 가는것이기때문에 명시적 형변환필요
                                                    // 형변환 타입 생략불가
        int cast3 = 98;
        char cast4 = (char) cast3; // (char) 명시적 형변환
        //  char cast4 = cast3;  //  오류 > 문자 저장공간에 정수저장불가
    System.out.println((int)cast4);  //  

    double cast5= 3.14;
    int cast6 = (int) cast5;              //  (int) 를 한번 거치고 변형
        System.out.println(cast6);

        double cast7 = cast6;       // 뒤에서 소수점 사라짐

        System.out.println(cast7);








    }




}
