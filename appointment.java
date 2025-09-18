package project;

public class appointment {
    private patient patient;
    private doctor doctor;
    private String date;

    public appointment(patient patient,doctor doctor,String date){
        this.patient=patient;
        this.doctor=doctor;
        this.date=date;
    }

    public String toString(){
        return "Appointment: [Patient:"+patient+",Doctor: "+doctor+",Date:"+date+"]";
    }
}
