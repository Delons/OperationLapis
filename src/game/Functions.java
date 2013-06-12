package game;

public class Functions {
	
	public static Functions functions;
	
	public static Functions getInstance(){
		if (functions == null){
			functions = new Functions();
		}
		return functions;
	}
	
	boolean writing;
	String out;
	
	public void write(String text){
		
		
		
	}
	
	public boolean isWriting() {
		return writing;
	}

	public void setWriting(boolean writing) {
		this.writing = writing;
	}

	public String getOut() {
		return out;
	}

	public void setOut(String out) {
		this.out = out;
	}

	
}
