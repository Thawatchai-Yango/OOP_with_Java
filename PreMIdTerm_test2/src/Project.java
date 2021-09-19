import java.util.ArrayList;
import java.util.List;

public class Project {
	private String id;
	private String title;
	private List<WorkerPosition> WPlist = new ArrayList<WorkerPosition>();
	double total = 0.0;
	
	
	public Project(String id, String title) {
		this.id = id;
		this.title = title;
	}
	
	public String getId()
	{
		return this.id;	
	}
	
	public String getTitle()
	{
		return this.title;
	}
	
	public void addMember(Worker worker, Position position, double rate) {
		WorkerPosition list= new WorkerPosition(worker,position,rate);
		WPlist.add(list);
	}

	public void print() {
		System.out.println("Project :"+getId()+" "+getTitle());
		System.out.print("---------- List of Workers --------------\n");
		System.out.println("id\tName\t\t\tRate\tHours\tAmount");
		for(WorkerPosition temp:WPlist) {
			System.out.format("%s\t%s\t\t\t%.2f\t%.2f\t%.2f\n",
					temp.getWorker().getId(),
					temp.getWorker().getName(),
					temp.getPosition().getRate(),
					temp.getHour(),
					temp.getEearnAmount());
		}
		
		for(WorkerPosition temp:WPlist) {
			total = total + temp.getEearnAmount();
			
		}
		System.out.format("\t\t\t\t\tTotal   %.2f",total);
		System.out.println();
		
	
	}
		
}
