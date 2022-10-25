package src.main.java.J04_연산자;

/*
           ---------------------논리 연산자 ---------------------
 */

//               True(1),False(0)

/*                    AND   &&     > 논리곱    t X t = T   = (1X1)  t X f   = False  =  (1X0)
                        >> 하나라도 거짓이면 무조건 거짓
                      OR    ||     > 논리합    t + t  = T (1+1)     t+f   = T =(1+0)    f X f  =false  =(0x0)
                        >> 하나라도 참이면 무조건 참
                      NOT   !      > 논리부정
                        >>  거짓이면  1     참이면 0

 */





public class Operation2 {


    public static void main(String[] args) {    // psvm  =   public static void main string   약자 >> 단축키워드


    boolean flag1 = true;
    boolean flag2 = false;

    boolean result1 = flag1 && flag1;
        System.out.println("T X T =>" + result1);



   boolean result2 = flag1 && flag2;

        System.out.println("T X F =>" + result2);


        boolean result3 = flag1 && flag1;
        System.out.println("F X F =>" + result3);

        System.out.println();


        boolean result4 = flag1 || flag2;
        System.out.println("T + T =>" + result4);



        boolean result5 = flag1 || flag2;
        System.out.println("T + F =>" + result5);



        boolean result6 = flag1 || flag2;
        System.out.println("F + F =>" + result6);

        System.out.println();   //줄바꿈
        
        
        boolean result7 = flag1 || flag2 && flag1;

        System.out.println("T + F  X T  =>" + result7);
        

        boolean result8 = 10 % 3 != 0;   //  > true

        System.out.println("10 % 3 != 0 =>" + result8);


        int year = 2022;


        boolean result9 =  year % 2  ==0 && year %  300  != 0   || year % 100  == 0;
        System.out.println(result9);






    }

}
