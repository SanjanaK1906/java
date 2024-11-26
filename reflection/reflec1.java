package reflection;
import java.lang.reflect.Field;
//import java.lang.reflect.*;
public class reflec1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Class c = Class.forName("java.lang.String");
		Class<?>c = Class.forName("java.lang.String");
		Field v[]= c.getFields();
		for(int i=0;i<v.length;i++) {
			System.out.println("\n"+v[i]);
		}
	}
}
