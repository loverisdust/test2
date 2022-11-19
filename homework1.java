import java.util.Scanner;

public class homework1 {
    static String result = null;// 得到的算数式结果
    static int randomNumber = 0;// 每一个随机生成的运算数，多次调用获得
    static int base = 0;// 每个式子随机生成一个基数--首个运算数
    static int numberAmount = 0;// 随机生成的算数式的运算数的个数（每个运算式的加数个数可能不一样）>1且<5
    static int answer = 0;// 每一个运算式的算数答案

    public static void yield() { // 循环产生运算数和符号的函数
        // 这个for循环执行的是一个式子的事情
        for (int j = 0; j < numberAmount - 1; j++) {
            int symbol = (Math.random() > 0.5 ? 1 : 0);
            randomNumber = (int) (Math.random() * 100) + 1;// 每次生成一个随机运算数
            if (symbol == 0) {
                result = result + "+" + String.valueOf(randomNumber);
                answer = answer + randomNumber;
            } else {
                result = result + "-" + String.valueOf(randomNumber);
                answer = answer - randomNumber;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("请输入想要的题目数量");
        try (Scanner scanner = new Scanner(System.in)) {
            int number = scanner.nextInt();// 用户期望得到的算式数量
            // 循环生成number个式子
            for (int i = 0; i < number; i++) {
                // 首先随机生成一个式子的运算数的个数,要求个数在2个以上(自定义小于5个）
                numberAmount = (int) (2 + Math.random() * (4));
                base = (int) (Math.random() * 100) + 1;// 生成一个随机基数
                result = String.valueOf(base);
                answer = base;
                homework1.yield();
                while (answer < 0) {// 答案为0的时候重新生成，不为0跳出
                    result = String.valueOf(base);
                    answer = base;
                    homework1.yield();
                }
                System.out.println(result + "=" + answer);
            }
        }
    }
}