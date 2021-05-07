package zadachaDve;

public class Main {

	public static void main(String[] args) {
		Singleton connection = Singleton.getInstance();
		connection.messageConnection("You add a bot");
		
		Mediator chat = new ChatRoom();
		
		User user1 = new UserMesage(chat, "Petur");
		User user2 = new UserMesage(chat, "Stoqn");
		User user3 = new UserMesage(chat, "Georgi");
		
		
		user1.send("'Add Bot'");
		
	
		
	}

}
