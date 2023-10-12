import java.util.ArrayList;
import java.util.Collections;
public class Shuffle {
    public static void main(String[] args) {
		int[] arr={1,2,3,4,5,6,7};
        ArrayList<Integer> li= new ArrayList<Integer>();
		for(int n:arr)
		{
			li.add(n);
		}

        Collections.shuffle(li);

		for(int n:li)
		{
			System.out.println(n);
		}
    }
}
