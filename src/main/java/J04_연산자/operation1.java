package J04_연산자;

public class operation1 {
    public static void main(String[] args) {

            //  증감 연산자   >> 자료구조의 " 스택"구조로 연산함

                // ++,--가 앞에붙으면 앞에붙은순서대로 시작
        int num = 10;
        num = num+1;
        System.out.println(num);

        num++;
        System.out.println(num);

        System.out.println(num++);
        System.out.println(num);

        System.out.println(--num);
        System.out.println(num--);
        System.out.println(num);



    }
}
