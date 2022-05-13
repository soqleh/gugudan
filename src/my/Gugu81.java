package my;

import java.util.Scanner;

public class Gugu81 {
    //사용자가 프로그램을 종료할 때 까지 계속해서 구동되고
    //사용자가 입력 범위를 잘못 입력하면 다시 재 입력을 받는 프로그램
    public static void main(String[] args) {

        final int min_gugudan = 2;
        final int max_gugudan = 9;

        Scanner sc = new Scanner(System.in);
        boolean running = true;
        while (running) {
            System.out.print("[안내]희망하는 구구단을 숫자로 입력해 주세요 (2 ~ 9) : ");

            int dan = sc.nextInt();

            System.out.printf("\n%d 단 이 입력되었습니다.\n", dan);
            if (min_gugudan > dan || dan > max_gugudan) {
                System.out.println("[경고]구구단은 2단 ~ 9단 까지만 선택할 수 있습니다.\n다시 입력해주세요..\n\n");
                continue;//다시 재 입력 받기
            }
            //어차피 구구단이라 오히려 변수보다 1부터 9까지 곱하는게 더 가독성이 좋은 것 같다.
            for (int i = 1; i <= 9; ++i) {
                System.out.println(dan + " * " + i + " = " + (dan * i));
            }
            System.out.println("계속 진행할까요? y/n");
            String check = sc.next();
            if(check.equals("n")) running = false;//종료를 위해 while 조건을 빠져나온다.
        }
        System.out.println("[안내] 프로그램을 종료합니다.");
        sc.close(); //scanner종료
    }
}