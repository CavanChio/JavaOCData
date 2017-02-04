package mainclass;

/**
 * Created by Cavan on 2017/2/4.
 */
public class MainClass {
    public static void main(String args[]) {

        //BasicNumber
        Integer x = 5;//此时x的对象类型, 装箱
        x += 10;//此时x是内置基础类型, 拆箱
        System.out.println(x);
    }
}
