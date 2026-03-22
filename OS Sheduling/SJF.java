import java.util.*;
import java.lang.Integer;

class Processs{
    int pid;
    int at;
    int bt;
    int ct;
    int tat;
    int wt;
    Processs(int pid,int at,int bt){
        this.pid=pid;
        this.at=at;
        this.bt=bt;
    }
}
class Scheduer{
    Processs pList[];
    Scheduer(Processs pList[]){
        this.pList=pList;
    }
    
    void input_Details(){
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<pList.length;i++){
            int x=i+1;
            System.out.println("For process "+ x);
            System.out.println("Enter arrival & burst time");
            int arrivalTime=sc.nextInt();
            int burstTime=sc.nextInt();

            pList[i]=new Processs(i+1,arrivalTime,burstTime);
        }
    }
    void output_Details(){
        System.out.println("Pid | AT | BT | CT | TAT | WT");
        for(int i=0;i<pList.length;i++){
            Processs p=pList[i];
            System.out.println("P"+p.pid+" | "+p.at+" | "+p.bt+" | "+p.ct+" | "+p.tat+" | "+p.wt);
        }
    }
}
public class SJF extends Scheduer{
    SJF(Processs plist[]){
        super(plist);
    }
    void fcfs_Shudling(){
        int time=0;
        Arrays.sort(pList, (p1,p2) -> Integer.compare(p1.bt,p2.bt));
        for(int i=0;i<pList.length;i++){
            if(pList[i].at>=time){
                pList[i].ct=pList[i].at + pList[i].bt;
            }
            else{
                pList[i].ct=time+pList[i].bt;
            }
            pList[i].tat=pList[i].ct-pList[i].at;
            pList[i].wt=pList[i].tat-pList[i].bt;
            time=pList[i].ct;
        }
    }
    public static void main(String[] args) {
        System.out.println("Enter number of Process");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Processs pList[]=new Processs[n];
        SJF o1=new SJF(pList);
        o1.input_Details();
        o1.fcfs_Shudling();
        o1.output_Details();
    }
}

