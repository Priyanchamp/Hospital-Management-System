package project;

public class doctor {
    private static int idcounter=1;
    private int id;
    private String name;
    private String specialty;

    public doctor(String name, String specialty){
        this.id=idcounter++;
        this.name=name;
        this.specialty=specialty;
    }

    public int getid(){
        return id;
    }

    @Override
    public String toString(){
        return "Doctor ID: " + id + ",Name "+name+", Specialty: "+specialty;
    }
}
