package game;

public class Messages {

	public static Messages messages;
	
	public static Messages getInstance(){
		if (messages == null){
			messages = new Messages();
		}
		return messages;
	}
	
	boolean showMessage = true;
	String messageText;
	
	public void welcome(){
		
		showMessage = true;
		messageText = "The Demiurge welcomes you to Operation Lapis.";
		
	}

	public boolean isShowMessage() {
		return showMessage;
	}

	public void setShowMessage(boolean showMessage) {
		this.showMessage = showMessage;
	}

	
	
}
