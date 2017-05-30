
public class MainApp {
	public static void main(String[] args) {
		FrontController fc = new FrontController();
		fc.dispatcherRequest("Home");
		fc.dispatcherRequest("Student");
	}
}
