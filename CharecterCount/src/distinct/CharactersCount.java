package distinct;

public class CharactersCount {
private String name;
private Integer distinctCharacterCount;

public CharactersCount() {
	super();
}

public CharactersCount(String name, Integer distinctCharacterCount) {
	super();
	this.name = name;
	this.distinctCharacterCount = distinctCharacterCount;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public Integer getDistinctCharacterCount() {
	return distinctCharacterCount;
}

public void setDistinctCharacterCount(Integer distinctCharacterCount) {
	this.distinctCharacterCount = distinctCharacterCount;
}

@Override
public String toString() {
	return "CharactersCount [name=" + name + ", distinctCharacterCount=" + distinctCharacterCount + "]";
}

}
