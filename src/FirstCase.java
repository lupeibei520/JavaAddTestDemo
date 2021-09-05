/**
 * @author lupeibei
 * @date 2021/9/5 7:47 下午
 */
public class FirstCase {
    public static void main(String[]args){
        byte a =-128;
        System.out.println("我是byte类型，最小为"+a);
        byte b =127;
        System.out.println("我是byte类型，最大为"+b);
        short c =-32768;
        //32768=（2^15）
        System.out.println("我是short类型，最小为"+c);
        short d = 32767;
        System.out.println("我是short类型，最大为"+d);
        int e=-2147483648;
        //2147483648=（2^31）
        System.out.println("我是int类型，最小为"+e);
        int g =2147483647;
        System.out.println("我是int类型，最小为"+g);
        long h =-92233720L;
        System.out.println("我是long类型，为"+g);
        float i=234.5f;
        System.out.println("我是单精度类型，为"+i);
        double j=568.8d;
        System.out.println("我是双精度类型，为"+j);
        boolean m = false;
        System.out.println("我是布尔类型，为"+m);
        char K ='A';
        System.out.println("我是char类型，为"+K);

    }
}
