import java.util.Arrays;
public class Task1{
 	public static void main(String[] args){

 		char a[] = {'a','f','e','k','b'};
 		ICharStack st = new LinkedCharStack();
		System.out.println(Arrays.toString(a));
 		for(int i = 0; i < a.length; i++){
 			st.push(a[i]);
 		}
 		for(int i = 0; i < a.length; i++){
 			a[i] = st.pop();
 		}
 		System.out.println(Arrays.toString(a));
 	}
}