package streamApi.com;
import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;
public class StreamlistFilter {


		public static void main(String[]arg) {
	List<Integer>list  =new ArrayList<>();
	   list.add(2);
	   list.add(4);
	   list.add(5);
	   list.add(8);
	   list.add(10);
	   
	   //using stream we can filter out the list above 5
	 List<Integer>newlist = list.stream().filter(i-> i>5).collect(Collectors.toList());
	    System.out.println(newlist);
	
	}

}
	
