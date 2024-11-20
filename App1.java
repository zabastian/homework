package homework;
import java.util.Scanner;

public class App1 {

        public static void main(String[] args) {

            while (true) {
                System.out.print("첫 번째 정수를 입력하세요: ");
                Scanner x = new Scanner(System.in);
                int a = x.nextInt();

                System.out.print("두 번째 정수를 입력하세요: ");
                Scanner xx = new Scanner(System.in);
                int b = xx.nextInt();

                System.out.print("사칙연산 기호를 입력하세요 (+, -, *, /): ");
                Scanner xxx = new Scanner(System.in);
                char operator = xxx.next().charAt(0);

                int result = 0;
                if (operator == '+') {
                    result = a+b;
                } else if (operator == '-') {
                    System.out.println(a-b);
                } else if (operator == '*') {
                    result = a*b;
                } else if (operator == '/') {
                    if (b == 0) {
                        System.out.println("0이 입력되었습니다.");
                        continue;
                    }
                    result = a / b;
                } else {
                    System.out.println("잘못된 연산자입니다.");
                    continue;
                }

                System.out.println("결과: " + result);

                System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
                Scanner xxxx = new Scanner(System.in);
                String exit = xxxx.next();
                if (exit.equalsIgnoreCase("exit")) {
                    break;
                }
            }

            System.out.println("계산기를 종료합니다.");
        }
    }
