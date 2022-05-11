package first;

import java.util.Scanner;

public class Gugu81 {
    public static void main(String[] args){

        final int multi_value = 9;
        final int min_gugudan = 2;
        final int max_gugudan = 9;

        Scanner s = new Scanner(System.in);

        System.out.print("[안내]희망하는 구구단을 숫자로 입력해 주세요 (2 ~ 9) : ");

        int dan = s.nextInt();
        System.out.printf("\n%d 단 이 입력되었습니다.\n",dan);

        if(min_gugudan > dan || dan > max_gugudan){
            System.out.println("[경고]구구단은 2단 ~ 9단 까지만 선택할 수 있습니다.\n프로그램을 종료합니다.");
            s.close();
            return;
        }

        for (int i = 1; i <= multi_value; ++i){
            System.out.println(dan + " * " + i + " = " + (dan * i));
        }
        s.close();
    }
}