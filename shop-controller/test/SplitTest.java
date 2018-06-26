import org.junit.Test;

public class SplitTest {
    @Test
    public void fun1(){
        String str = "1";
        String[] s = str.split(",");
        for(String e : s){
            System.out.println(e);
        }
    }

    @Test
    public void fun3(){
        String s = ",1,2,3,4,5,6";
        s=s.replaceFirst(",","");
        System.out.println(s);
    }
}
