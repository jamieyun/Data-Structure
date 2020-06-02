package array;

public class Main {
    public static void main(String[] args) {
        //int 엘리먼트의 데이터 타입
        //[] 배열임을 표시
        // new int[4] 배열의크기
        int[] numbers1 = new int[4];

        int[] numbers2 = {10,20,30,40};
        int[] number3 = new int[]{10,20,30,40};

        System.out.println("numbers2 = " + numbers2[0]);
        System.out.println("numbers2 = " + numbers2.length);

        int i = 0;
        while (number3.length > i){
            System.out.println(number3[i]);
            i++;
        }

        for (i = 0; i < number3.length; i++) {
            System.out.println(number3[i]);
        }
    }
}
