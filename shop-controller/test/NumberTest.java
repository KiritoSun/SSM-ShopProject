import com.zt.util.NumberUtil;
import org.junit.Test;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class NumberTest {
    @Test
    public void fun1(){
        String s = "011";
        int n = new Integer(s);
        n++;
        String x = n+"";
        int c = 3-x.length();
        for(int i=0;i<c;i++){
            x = "0"+x;
        }
        System.out.println(x);
    }

    @Test
    public void fun2(){
        String date = NumberUtil.createDate();
        System.out.println(date);
    }

    @Test
    public void fun3(){
        String number = NumberUtil.createNumber();
        System.out.println(number);
    }
}
