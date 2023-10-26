
public class Test {
    public static void main(String[] args) {
      String str = "Good";
			change(str);
			System.out.println(str);
    }
		private static void change(String s){
			s.concat("_Morning");
		}
}
