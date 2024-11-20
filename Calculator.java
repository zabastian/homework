package homework;

import java.util.ArrayList;
import java.util.List;

public class Calculator {
    private List<Integer> results = new ArrayList<>();

    public int calculate(int a, int b, char operator) {
        int result = 0;

        while(true) {
            if (operator == '+') {
                result = a + b;
                break;
            } else if (operator == '-') {
                result = a - b;
                break;
            } else if (operator == '*') {
                result = a * b;
                break;
            } else if (operator == '/') {
                if (b == 0) {
                    System.out.println("나눗셈 연산에서 분모(두 번째 정수)에 0이 입력될 수 없습니다.");
                    return -1;
                }
                result = a / b;
                break;
            } else {
                System.out.println("잘못된 연산자입니다.");
                return -1;
            }
        }

        results.add(result);
        return result;
    }

    public void removeResult() {
        if (!results.isEmpty()) {
            results.remove(0); // 첫 번째 결과 제거
            System.out.println("가장 먼저 저장된 연산 결과가 삭제되었습니다.");
        } else {
            System.out.println("저장된 연산 결과가 없습니다.");
        }
    }

    public List<Integer> getResult() {
        return results;
    }

    public void setResult(List<Integer> results) {
        this.results = results;
    }
}


//package homework;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class Calculator {
//    private List<Integer> results = new ArrayList<>();
//
//    public int calculate(int a, int b, char operator) {
//        int result = 0;
//
//        // 사칙연산 수행 (if-else 문으로 변경)
//        if (operator == '+') {
//            result = a + b;
//        } else if (operator == '-') {
//            result = a - b;
//        } else if (operator == '*') {
//            result = a * b;
//        } else if (operator == '/') {
//            if (b == 0) {
//                System.out.println("나눗셈 연산에서 분모(두 번째 정수)에 0이 입력될 수 없습니다.");
//                return -1;
//            }
//            result = a / b;
//        } else {
//            System.out.println("잘못된 연산자입니다.");
//            return -1;
//        }
//
//        // 연산 결과를 컬렉션에 저장
//        results.add(result);
//        return result;
//    }
//
//    public void removeResult() {
//        if (!results.isEmpty()) {
//            results.remove(0); // 첫 번째 결과 제거
//            System.out.println("가장 먼저 저장된 연산 결과가 삭제되었습니다.");
//        } else {
//            System.out.println("저장된 연산 결과가 없습니다.");
//        }
//    }
//
//    public List<Integer> getResult() {
//        return results;
//    }
//
//    public void setResult(List<Integer> results) {
//        this.results = results;
//    }
//}
