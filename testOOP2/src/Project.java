import java.util.ArrayList;
import java.util.List;

public class Project {
    private String id;
    private String title;
    private List<WorkerPosition> WP =new ArrayList<WorkerPosition>();
    
    public Project(String id,String title) {
        this.id = id;
        this.title = title;
    }
    
    public void addMember(Worker worker,Position position,double hour) {
        WorkerPosition temp = new WorkerPosition(worker,position,hour);
        WP.add(temp);
    }
    public String getId(){
        return this.id;
    }
    
    public String getTitle(){
        return this.title;
    }
    
    public void print() {
        System.out.format("Project : %s %s\n",getId(),getTitle());
        System.out.format("---------- List of Workers --------------\n");
        System.out.format("id\tName%10s%10s%10s\n","Rate","Hours","Amount");
        for(WorkerPosition temp:WP) {
            System.out.format("%s\t%s%10.2f%10.2f%10.2f\n",temp.getWorker().getId(),temp.getWorker().getName(),temp.getPosition().getRate(),temp.getHour(),temp.getEarnAmount());
        }
    }
    

}