package adapter.objectadapter;

public class Client {

	public static void main(String[] args) {

		System.out.println("This is class adapter ...");

		NoteBook noteBook = new NoteBook();
		PowerAdapter powerAdapter = new PowerAdapter(new Power220V());
		noteBook.powerOn(powerAdapter);

	}

}
