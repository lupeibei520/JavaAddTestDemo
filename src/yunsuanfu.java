/**
 * @author lupeibei
 * @date 2021/9/5 8:37 下午
 */
public class yunsuanfu {
    public static void main(String[]args){

       int a=1;
       int b=1;
       int c=1;
       int d=1;
        //算术运算符
       System.out.println("加法:"+(a+b));
       System.out.println("减法:"+(a-b));
       System.out.println("乘法:"+(a*b));
       System.out.println("除法"+(a/b));
       System.out.println("取余"+(a%b));
        System.out.println(a);
       System.out.println("自增后+:"+(a++));
        System.out.println(a);
        System.out.println(b);
       System.out.println("自增前+:"+(++b));
        System.out.println(b);
       System.out.println("自减后-:"+(c--));
       System.out.println("自减前-:"+(--d));
       //关系运算符
//       int e =20;
//       int f=30;
//       System.out.println("a==b="+(e==f));
//       System.out.println(""+(e!=f));
//       System.out.println(""+(e>f));
//       System.out.println(""+(e<f));
//       System.out.println(""+(e>=f));
//       System.out.println(""+(e<=ßf));
      //位运算符
        int h =1111;
        int g =1000;
        System.out.println(""+(h&g));
        //为啥是64，是1111是十进制的数，需要先转化为10001010111；1000是十进制的数，转化为1111101000后再取并
        System.out.println(""+(h|g));
        //为啥是2047同上
        System.out.println(""+(h^g));
        System.out.println(""+(~g));
        //???
        System.out.println(""+(a<<2));
        System.out.println(""+(g>>2));
        //逻辑运算符
        boolean i=true;
        boolean j=false;
        System.out.println(i&&j);
        System.out.println(i||j);
        System.out.println(!j);
        //短路逻辑
        //赋值运算符
        int k=25;
        int l=35;
        int m=0;
//        System.out.println(m=k);
//        System.out.println(m);
//        System.out.println(k+=l);
//        System.out.println(k-=l);
//        System.out.println(k*=l);
//        System.out.println(l/=k);
        System.out.println(k%=l);
        //条件运算符

    }
}
