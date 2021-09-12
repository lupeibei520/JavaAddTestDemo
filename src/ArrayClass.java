import java.util.Arrays;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
/**
 * @author lupeibei
 * @date 2021/9/10 12:45 下午
 */
public class ArrayClass {
    public static void main(String[] args) {
        //自己的
//        Scanner in=new Scanner(System.in);
//        int [] ns = {10,11,12,13,14,15,16};
//        System.out.println("请输入一个数字");
//        int sz=in.nextInt();
//        for (int i =0;i<ns.length;i++){
//            if (sz == ns[i]) {
//                System.out.println("数字下标为"+i);
//                return;
//            }
//        }
//        int size=10;
//        int[] mylist =new int[2];
//        mylist[0] = 5;
//        mylist[1] = 4;
//        System.out.println(Arrays.toString(mylist));
//        mylist[0]=1;
//        mylist[1]=8;

//
        ArrayList<Integer> myList = new ArrayList<> (Arrays.asList(15,13,243,34,23));
        myList.remove(2);
        myList.remove(3);
        System.out.println(myList);
//数列中每个数都增加2
//        for (int i =0;i<myList.length;i++){
//
////            myList[i]=myList[i]+2;
//
//        }

        // 删除myList第3，5位

        // 删除myList第3后得到的数组在删除第5位；

        //[11,22,33,44,55,66,77,88,99,10]

//        System.out.println(Arrays.toString(myList));

//        System.out.println(Arrays.toString(myList));


    }
}