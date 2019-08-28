package poly;
import java.lang.reflect.Method;

public class PriavteMethodAccessTest {
   public static void main(String[] args) throws Exception {

	   System.out.println("inside PriavteMethodAccessTest");
	   Return ret = new Return();
	   Class<?> clazz = ret.getClass();
	   Method method = clazz.getDeclaredMethod("rate");
	   method.setAccessible(true);
	   System.out.println(method.invoke(ret));
   }
}

