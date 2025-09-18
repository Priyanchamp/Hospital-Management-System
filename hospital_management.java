package project_pw;

import java.util.ArrayList;
import java.util.Scanner;

import project.patient;
import project.doctor;
import project.appointment;

public class hospital_management {

    private static ArrayList<patient> patients = new ArrayList<>();
    private static ArrayList<doctor> doctors = new ArrayList<>();
    private static ArrayList<appointment> appointments = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\nHospital Management System");
            System.out.println("1. Add Patient");
            System.out.println("2. Add Doctor");
            System.out.println("3. Schedule Appointment");
            System.out.println("4. View Patients");
            System.out.println("5. View Doctors");
            System.out.println("6. View Appointments");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addPatient(scanner);
                    break;
                case 2:
                    addDoctor(scanner);
                    break;
                case 3:
                    scheduleAppointment(scanner);
                    break;
                case 4:
                    viewPatients();
                    break;
                case 5:
                    viewDoctors();
                    break;
                case 6:
                    viewAppointments();
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 0);
    }

    private static void addPatient(Scanner scanner) {
        System.out.print("Enter patient name: ");
        String name = scanner.next();
        System.out.print("Enter patient age: ");
        int age = scanner.nextInt();
        System.out.print("Enter patient gender: ");
        String gender = scanner.next();

        patient patient = new patient(name, gender, age);
        patients.add(patient);
        System.out.println("Patient added successfully!");
    }

    private static void addDoctor(Scanner scanner) {
        System.out.print("Enter doctor name: ");
        String name = scanner.next();
        System.out.print("Enter doctor's specialty: ");
        String specialty = scanner.next();

        doctor doctor = new doctor(name, specialty);
        doctors.add(doctor);
        System.out.println("Doctor added successfully!");
    }

    private static void scheduleAppointment(Scanner scanner) {
        if (patients.isEmpty() || doctors.isEmpty()) {
            System.out.println("Please add at least one patient and one doctor before scheduling an appointment.");
            return;
        }

        System.out.println("Select patient by index:");
        for (int i = 0; i < patients.size(); i++) {
            System.out.println(i + ". " + patients.get(i));
        }
        int patientIndex = scanner.nextInt();

        System.out.println("Select doctor by index:");
        for (int i = 0; i < doctors.size(); i++) {
            System.out.println(i + ". " + doctors.get(i));
        }
        int doctorIndex = scanner.nextInt();

        System.out.print("Enter appointment date (e.g., 2025-04-25): ");
        String date = scanner.next();

        appointment appointment = new appointment(patients.get(patientIndex), doctors.get(doctorIndex), date);
        appointments.add(appointment);
        System.out.println("Appointment scheduled successfully!");
    }

    private static void viewPatients() {
        if (patients.isEmpty()) {
            System.out.println("No patients added.");
        } else {
            for (patient patient : patients) {
                System.out.println(patient);
            }
        }
    }

    private static void viewDoctors() {
        if (doctors.isEmpty()) {
            System.out.println("No doctors added.");
        } else {
            for (doctor doctor : doctors) {
                System.out.println(doctor);
            }
        }
    }

    private static void viewAppointments() {
        if (appointments.isEmpty()) {
            System.out.println("No appointments scheduled.");
        } else {
            for (appointment appointment : appointments) {
                System.out.println(appointment);
            }
        }
    }
}
