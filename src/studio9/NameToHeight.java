package studio9;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import support.cse131.NotYetImplementedException;

public class NameToHeight {
	/**
	 * Construct and fill a map with your studio group members' names, each
	 * associated with his or her height.
	 * 
	 * Construct an ArgsProcessor and loop asking the args processor for a name to
	 * lookup the height. When the user cancels (that is: when args processor
	 * returns null), break from the loop. Otherwise, loop up the name in the map
	 * and output the results. Be sure to handle the case where the map does not
	 * contain a specified name.
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		// FIXME
		Map<String, Integer> map1 = new HashMap<>();
		map1.put("Zhiyang Xue", 180);
		map1.put("Jin Qian", 181);
		map1.put("Zexi Huang", 182);
		String name = "";
		do {
			System.out.println("Please enter a name.");
			name = in.nextLine();
			if(map1.containsKey(name)) {
				int value = map1.get(name);
				System.out.println(name + " " + value);
			}
		}while(!name.equals("quit")); 
	}
}
