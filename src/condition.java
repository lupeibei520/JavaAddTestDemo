/**
 * @author lupeibei
 * @date 2021/9/5 10:56 下午
 */
//增加条件case
public class condition {
    public static void main(String[]args){
        //if语句
        int X=10;
        if(X<20){
            System.out.println("这个是正确的");
        }
        //if...else
        int Y=50;
        if (Y<40){
            System.out.println("这个是正确的");
        }
        else {
            System.out.println("这个是错误的");
        }
        //if..else and if...else
        int z=50;
        if (z==10){
            System.out.println("这个是10哦");
        } else if (z==20){
            System.out.println("这个是20哦");
        }else if (z==30){
            System.out.println("这个是30哦");
        }else
            System.out.println("这个是其他数据哦");
        //嵌套的if...else语句
        int m=21;
        int n=22;
        if (m==21){
            if (n==22){
                System.out.println("m等于21或者n等于22");
            }
        }
    }
}
