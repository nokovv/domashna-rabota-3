package zadachaDve;

public class UserMesage extends User {

	public UserMesage(Mediator mediator, String name) {
		super(mediator, name);
		// TODO Auto-generated constructor stub
	}

	

	@Override
	public void send(String message) {
		// TODO Auto-generated method stub
		System.out.println(this.name + " sends " + message); 
		mediator.sendMessage(message, this);
	}

	@Override
	public void recieve(String message) {
		System.out.println(this.name + " recieved " + message);

	}

}
