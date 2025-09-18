package project;

public class patient {
     
    private static int idcounter =1;
    private int id;
    private String name;
    private String gender;
    private int age;
    
    public patient(String name,String gender,int age){
        this.id=idcounter++;
        this.name=name;
        this.gender=gender;
        this.age=age;
    }
    
    public int getid(){
        return id;
    }

    public String toString(){
        return "Patient ID: "+id+",Name: "+name+ ",Gender "+gender+ ", Age "+age;
    }
}
