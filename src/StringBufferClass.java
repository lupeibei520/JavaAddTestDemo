/**
 * @author lupeibei
 * @date 2021/9/10 10:35 上午
 */
public class StringBufferClass {
    public static void main(String[]args){
        StringBuffer sb =new StringBuffer("123456789");
//        sb.append("Runnoob..");
//        sb.reverse();
//        sb.delete(1,6);
//        sb.insert(3,8);//offset=3，实际插入为4，即为0，1，2，3
//        sb.replace(2,5, String.valueOf(4));
//        sb.capacity();//返回当前容量
//        sb.ensureCapacity(5);//确保容量至少等于指定的最小值
//        sb.length();//返回长度（字符数）
//        sb.setLength(5);
        System.out.println(sb);
    }
}
