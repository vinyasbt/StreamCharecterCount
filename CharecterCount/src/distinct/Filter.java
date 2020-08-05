package distinct;

import java.util.function.Predicate;

public class Filter {
	Predicate<String> nameStartingWithPrefix(String prefix){
		return name->name.startsWith(prefix);
	}
}
