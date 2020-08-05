package distinct;

import java.util.HashSet;
import java.util.Set;
import java.util.function.Function;

public class Mapper {
Function<String, CharactersCount> getDistinctCharactersCount(){
	return count->{
		char charecters[]=count.toCharArray();
		Set charecterStore=new HashSet();
		for(char c:charecters) {
			charecterStore.add(c);
		}
		Integer distinctelements=charecterStore.size();
		return new CharactersCount(count,distinctelements);
	};
}
}
