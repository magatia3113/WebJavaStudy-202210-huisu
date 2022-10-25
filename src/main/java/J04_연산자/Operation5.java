package src.main.java.J04_연산자;

public class Operation5 { // 클래스이름 = 대문자



    public static void main(String[] args) {


        int totalCount =202;
        int maxPage = totalCount % 10 == 0    ?   totalCount /10    : totalCount/10 +1;
int maxpage =0;
int page = 15 ;
                        // 삼항 연산자
                        //첫번째 항 결과가 참=>  A:B 기준  A
                        ////첫번째 항 결과가 거짓=>  A:B 기준  B

int startIndex = page % 5   == 0   ?    page  - 4     : page - (page %5) +1;
int endIndex  = startIndex +4  <= maxpage ? startIndex +4 : maxPage;


        System.out.println("page : " + page);
        System.out.println("startIndex : " + startIndex);
        System.out.println("endIndex : " + endIndex);

        String isMaxPageStr = page == endIndex   ?  "마지막 인덱스 입니다." : "마지막 인덱스가 아닙니다." ;
        System.out.println(isMaxPageStr);

        //String=  만들어져있는 클래스
        // 삼항연산자 :  결과의 기준에 따라  자료형 선언(문자열 String)

    }



}
