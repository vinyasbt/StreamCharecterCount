package distinct;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class App {

	public static void main(String[] args) {
		Filter f=new Filter();
		Mapper m=new Mapper();
		List<String> list=Arrays.asList( "aaryanna", "aayanna", "airianna", "alassandra", "allanna", "allannah",
		                                  "allessandra", "allianna", "allyanna", "anastaisa", "anastashia", "anastasia", "annabella", "annabelle",
		                                  "annebelle");
								 list.stream()
								.filter(f.nameStartingWithPrefix("aa"))
								.map(m.getDistinctCharactersCount())
								.forEach(System.out::println);
		

	}

}
