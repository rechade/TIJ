import java.util.*;
class GenericVarargs {
	static <T> List<T> makeList(T... args) {
		ArrayList<T> result = new ArrayList<T>();
		for(T arg : args) {
			result.add(arg);
		}
		return result;
	}
	public static void main (String[] args) {
		List<String> lis = makeList("as","df");
		System.out.println(lis);
	}	
}
