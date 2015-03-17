
package Factory;

import DataStructure.Rule.RuleImpl_five;
import DataStructure.Rule.RuleImpl_four;
import DataStructure.Rule.Rule;

public class RuleFactory {
	public static Rule createRule(int number) {
		if(number == 4) {
			return new RuleImpl_four();
		} else if (number == 5) {
			return new RuleImpl_five();
		} else {
			return null;
		}
	}
}	
