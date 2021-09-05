/**
 * @author lupeibei
 * @date 2021/9/5 11:17 下午
 */
public class JavaSwitchCase {
    public static void main(String[]args){
     //switch
        int i=1;
        switch (i){
            case 0:
                System.out.println("0");
            case 1:
                System.out.println("1");
            case 2:
                System.out.println("2");
            case 3:
                System.out.println("3");
            default:
                System.out.println("default");
        }
     //switch   break;
        int j=1;
        switch (j){
            case 0:
                System.out.println("0");
            case 1:
                System.out.println("1");
            case 2:
                System.out.println("2");break;
            case 3:
                System.out.println("3");
            default:
                System.out.println("default");
        }

    }
}
