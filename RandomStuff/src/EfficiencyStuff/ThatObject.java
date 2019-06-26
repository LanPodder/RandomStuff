package EfficiencyStuff;

public class ThatObject {
	private int id;
	private String content;
	
	public ThatObject(int id, String content) {
		this.id = id;
		this.content = content;
	}
	
	public void doSomething() {
		content += " did something";
	}
	
	@Override
	public boolean equals(Object o) {
		return ((ThatObject) o).id == this.id;
	}
	
	@Override
	public int hashCode() {
		return id;
	}
	
	@Override
	public String toString() {
		return content;
	}
}
