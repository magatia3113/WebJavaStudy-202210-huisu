package src.main.java.j07_반복;

public class Loop {


    public static void main(String[] args) {
int result =0;        //반복을 해라 i 가 0부터 100이 되기 전까지 i<100  = 반복횟수


for(int i =0; i<100; i++){ // 반복문순서 "int i  =0;" > "i <100;" > "{}" > "i++ >"  >  "i<100"
                            //    0부터 100까지 반복 >  {} 중괄호문   >> i++
result += i + 1;

}

        System.out.println("1에서 100까지 더한값 :"+result);




    }
}
