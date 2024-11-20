package homework;
import java.util.Scanner;

public class App2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Calculator 인스턴스 생성
        Calculator calculator = new Calculator();

        while (true) {
            System.out.print("첫 번째 숫자를 입력하세요: ");
            int a = sc.nextInt();
            System.out.print("두 번째 숫자를 입력하세요: ");
            int b = sc.nextInt();
            System.out.print("사칙연산 기호를 입력하세요 (+, -, *, /): ");
            char operator = sc.next().charAt(0);

            int result = calculator.calculate(a, b, operator);

            if (result != -1) { // 오류가 아니면 결과 출력
                System.out.println("결과: " + result);
            }

            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            String exit = sc.next();
            String delete = sc.next();

            if (exit.equalsIgnoreCase("exit")) {
                break; // 반복문 종료
            }
            // 연산 결과 삭제 여부 묻기
            System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (yes/no): ");
            if (delete.equalsIgnoreCase("yes")) {
                calculator.removeResult();
            }
        }

        // 계산기를 종료합니다.
        System.out.println("계산기를 종료합니다.");
    }
}