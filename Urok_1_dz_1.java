package DZ_train;
//Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
public class Urok_1_dz_1 {

        public static int trianglenum(int x)
        {
            return (3 * x * (x + 1)) / 2;
        }
        public static void main(String[] args)
        {
            System.out.println(trianglenum(2));
        }
    }
