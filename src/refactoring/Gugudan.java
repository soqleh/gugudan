package refactoring;

import java.util.Scanner;

public class Gugudan {
    public static void main(String[] args){

//        final int multi_value = 9;
        final int min_gugudan = 2;
        final int max_gugudan = 9;

        Scanner s = new Scanner(System.in);

        System.out.print("[안내]희망하는 구구단을 숫자로 입력해 주세요 (2 ~ 9) : ");

        int dan = s.nextInt();
        s.close(); //한번만 입력받고 변수에 넣어줬으므로 s.close()위치를 변경함
        System.out.printf("\n%d 단 이 입력되었습니다.\n",dan);
        if(min_gugudan > dan || dan > max_gugudan){
            System.out.println("[경고]구구단은 2단 ~ 9단 까지만 선택할 수 있습니다.\n프로그램을 종료합니다.");
//            s.close();
            return;
        }
        //어차피 구구단이라 오히려 변수보다 1부터 9까지 곱하는게 더 가독성이 좋은 것 같다.
        for (int i = 1; i <= 9; ++i){
//        for (int i = 1; i <= multi_value; ++i){
            System.out.println(dan + " * " + i + " = " + (dan * i));
        }
        s.close();
    }
}