package adapter.classadapter;

public class Client {

	public static void main(String[] args) {

		System.out.println("This is class adapter ...");

		NoteBook noteBook = new NoteBook();
		noteBook.powerOn(new PowerAdapter());

	}

}
