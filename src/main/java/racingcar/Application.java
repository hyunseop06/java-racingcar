package racingcar;

import java.util.Scanner;
import java.io.IOException;
import java.util.Random;

public class Application {
    public static <string> void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("첫번째 자동차의 이름을 적으시오: ");
        String a = scanner.nextLine();
        System.out.println("두번째 자동차의 이름을 적으시오: ");
        String b = scanner.nextLine();
        System.out.println("세번째 자동차의 이름을 적으시오: ");
        String c = scanner.nextLine();
        if (a.length() > 5) {
            System.out.println("5자 이내로 쓰셈");
            throw new IllegalArgumentException();
        }
        if (b.length() > 5) {
            System.out.println("5자 이내로 쓰셈");
            throw new IllegalArgumentException();
        }
        if (c.length() > 5) {
            System.out.println("5자 이내로 쓰셈");
            throw new IllegalArgumentException();
        }
        System.out.println("자동차 이름 : \"a\",\"b\",\"c\"");
        {
            System.out.println("시도할 횟수 : ");
            int y = 0; int r=0;
            public int t;
            t = nextInt();
            y = t; r = t;
            int u = t;
            //잘못된 값 썼을 때 꺼 만들어야함
        }
    }

    private static int nextInt() {
        Scanner scanner = new Scanner(System.in);
        return 0;
    }

    public class RandomExam2 {
        public static <string> void main(String[] args) throws IOException {
            Random random = new Random(); // 랜덤 객체 생성
            random.setSeed(System.currentTimeMillis());
            for(int r; r<=0; r--) {
                String v = "-";
                String resultA = null;
                int i = random.nextInt(10);
                if (i >= 4) {
                    resultA = v + resultA;
                }
            }
            for(int y; y<=0; y--) {
                String v = "-";
                String resultB = null;
                int i = random.nextInt(10);
                if (i >= 4) {
                    resultB = v + resultB;
            }
        }
            for(int u = ; u<=0; u--) {
                String v = "-";
                String resultC = null;
                int i = random.nextInt(10);
                if (i >= 4) {
                    resultC = v + resulC;
                }
            }
            }}}
11

