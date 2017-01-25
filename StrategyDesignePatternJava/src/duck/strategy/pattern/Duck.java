package duck.strategy.pattern;

public abstract class Duck {
	
	public String quack() {
		return "Quack Quack";
	}

	public String swim() {
		return "can swim";
	}
	
	public abstract String display();
}
