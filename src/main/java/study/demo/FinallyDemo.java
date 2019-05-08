package study.demo;

public class FinallyDemo {
    public static void main(String[] args) {
        int a = test1();
        int b = test2();
        System.out.println(a);
        System.out.println(b);
    }

    //返回100
    private static int test1() {
        try {
            return 1;
        } finally {
            return 100;
        }
    }

    //返回1
    private static int test2() {
        int a = 1;
        try {
            return a;
        } finally {
            return a++;
        }
    }
}
