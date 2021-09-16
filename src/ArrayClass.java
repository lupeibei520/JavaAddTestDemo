import com.sun.deploy.util.ArrayUtil;

import  java.util.*;
import java.lang.reflect.Array;
//import java.util.Arrays;
//import java.util.Scanner;
//import java.util.List;
//import java.util.LinkedHashSet;
//import java.util.ArrayList;
import java.util.Collection;
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

// 删除myList第3，5位
//        ArrayList<Integer> myList = new ArrayList<> (Arrays.asList(15,13,243,34,23));
//        myList.remove(2);
//        myList.remove(3);
//        System.out.println(myList);
        //定义10位朝上的数组，截取3-8的数组，返回，原数组不变
//        ArrayList<Integer> myList = new ArrayList<> (Arrays.asList(15,13,243,34,23,87,23,45,23,10));
//        myList.subList(3,8);
//        System.out.println(myList.subList(3,8));
        //将2各数组合并，生成新数组
//          ArrayList<Integer> myList = new ArrayList<> (Arrays.asList(15,13,243,34,23,87,23,45,23,10));
//          ArrayList<Integer> myJy = new ArrayList<> (myList.subList(3,8));
//          myJy.addAll(myList);
//          System.out.println(myJy);
        //数组去重(使用LinkedHashSet删除arraylist中的重复数据)
//        ArrayList<Integer> myList = new ArrayList<> (Arrays.asList(15,13,243,34,23,87,23,45,23,10));
//        ArrayList<Integer> myJy = new ArrayList<> (myList.subList(3,8));
//        myJy.addAll(myList);
//        System.out.println(myJy);
//        LinkedHashSet<Integer> hashSet = new LinkedHashSet<>(myJy);
//        ArrayList<Integer> listWithoutDuplicates = new ArrayList<>(hashSet);
//        System.out.println(listWithoutDuplicates);
        //数组从大到小排序
        ArrayList<Integer> myList = new ArrayList<> (Arrays.asList(15,13,243,34,23,87,23,45,23,10));
        ArrayList<Integer> myJy = new ArrayList<> (myList.subList(3,8));
        myJy.addAll(myList);
        System.out.println(myJy);
        LinkedHashSet<Integer> hashSet = new LinkedHashSet<>(myJy);
        ArrayList<Integer> listWithoutDuplicates = new ArrayList<>(hashSet);
        Collection.sort(myJy);
        System.out.println(myJy);
//        Arrays.sort(listWithoutDuplicates);

        //数组从小到大排序

//数列中每个数都增加2
//        for (int i =0;i<myList.length;i++){
//
////            myList[i]=myList[i]+2;
//
//        }

        // 删除myList第3，5位.

        // 删除myList第3后得到的数组在删除第5位；

        //[11,22,33,44,55,66,77,88,99,10]

//        System.out.println(Arrays.toString(myList));

//        System.out.println(Arrays.toString(myList));


    }

}