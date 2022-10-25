package src.main.java.J04_연산자;

/*

윤년은 연도가4의 배수이면서, 100의 배수가 아닐때 또는 400의 배수일 때다.
 */




public class Operation3 {

    public static void main(String[] args) {

    int year = 2022;

    boolean result = false;                     //&&=  동시에만족 = 하면서
                                                // or || = 둘중하나 = 혹은

    result =   year % 4 == 0   && year % 100 !=0    || year % 400 ==0;


        System.out.println("결과 :"+ result);





    }



}
