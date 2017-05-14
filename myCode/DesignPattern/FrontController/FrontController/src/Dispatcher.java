
public class Dispatcher {
	private HomeView home;
	private StudentView stu;
	public Dispatcher(){
		home = new HomeView();
		stu = new StudentView();
	}
	
	public void dispatch(String request){
		if(request.equalsIgnoreCase("HOME")){
			home.show();
		}else if(request.equalsIgnoreCase("STUDENT")){
			stu.show();
		}
	}
}
