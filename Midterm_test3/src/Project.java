import java.util.List;
import java.util.ArrayList;

public class Project {
	private String ProjectNum;
	private String Projecttitle;
	public double total = 0.0;
	
	private List<WorkerPosition> WPlist = new ArrayList<WorkerPosition>();
    
	public Project(String ProjectNum, String Projecttitle) {
		this.ProjectNum = ProjectNum;
		this.Projecttitle = Projecttitle;
		
	}
	public String getProjectNum() {
		return this.ProjectNum;
	}
	public String getProjectTitle() {
		return this.Projecttitle;
	}

	

	public void print() {
		System.out.println("\nProject :"+getProjectNum()+" "+getProjectTitle());
		System.out.println("----------List of worker----------");
		System.out.println("Id\tName\t\t\tRate\tHours\tAmount");
		
		for(WorkerPosition i:WPlist) {
			System.out.print(i.getWorker().getId());
			System.out.print("\t"+i.getWorker().getName());
			System.out.print("\t\t\t"+i.getPosition().getRate());
			System.out.print("\t"+i.getHour());
			System.out.println("\t"+i.getEarnAmount());
		}
		
		for(WorkerPosition i:WPlist) {
			total = total + i.getEarnAmount();
		}
		System.out.print("\t\t\t\t\tTotal\t"+total);
		
		
		
		
	}
	public void addMember(Worker w1, Position po1, double d) {
		WorkerPosition addlist = new WorkerPosition(w1, po1, d);
		WPlist.add(addlist);
	}

}
