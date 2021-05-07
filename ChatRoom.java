package zadachaDve;

import java.util.ArrayList;
import java.util.List;

public class ChatRoom implements Mediator {
	private List<User> users;

	public ChatRoom() {
		this.users = new ArrayList<>();
	}

	public void addUser(User user) {
		this.users.add(user);
		// TODO Auto-generated method stub

	}

	@Override
	public void sendMessage(String message, User user) {
		
		for(User chatUser: this.users) {
			if(user != chatUser) {
			chatUser.recieve(message);
			}
		}

	}

}
