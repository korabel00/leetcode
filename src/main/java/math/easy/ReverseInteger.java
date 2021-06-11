package math.easy;

//Google
//Time Complexity: O(log(x)) Space Complexity: O(1)
public class ReverseInteger {

    public int reverse(int x) {

        int result = 0;

        while (x != 0) {
            System.out.println(Integer.MIN_VALUE % 10);
            int pop = x % 10; // "снимает" последнюю цифру у X
            x = x / 10; //удаляет эту цифру из x
            if (result > Integer.MAX_VALUE / 10 || (result == Integer.MAX_VALUE / 10 && pop > 7)) return 0;// проверка на переподнение int
            if (result < Integer.MIN_VALUE / 10 || (result == Integer.MIN_VALUE / 10 && pop < -8)) return 0;
            result = result * 10 + pop; //"добавляет" снятую цифру если проверка пройдена
        }

        return result;
    }
}
