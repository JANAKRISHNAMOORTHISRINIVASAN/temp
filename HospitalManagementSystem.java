import java.util.ArrayList;
import java.util.Scanner;

// Patient Class
class Patient {
    private String id;
    private String name;
    private int age;
    private String gender;
    private String contact;

    public Patient(String id, String name, int age, String gender, String contact) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.contact = contact;
    }

    public String getId() { return id; }
    public String getName() { return name; }
    public int getAge() { return age; }
    public String getGender() { return gender; }
    public String getContact() { return contact; }

    public void displayPatientDetails() {
        System.out.println("Patient ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("Contact: " + contact);
    }
}

// Patient Registry Class
class PatientRegistry {
    private ArrayList<Patient> patients = new ArrayList<>();

    public void registerPatient(Patient patient) {
        patients.add(patient);
        System.out.println("Patient Registered Successfully!\n");
    }

    public void displayAllPatients() {
        if (patients.isEmpty()) {
            System.out.println("No patients registered yet.\n");
            return;
        }
        for (Patient patient : patients) {
            patient.displayPatientDetails();
            System.out.println();
        }
    }

    public Patient getPatientById(String id) {
        for (Patient patient : patients) {
            if (patient.getId().equals(id)) {
                return patient;
            }
        }
        return null;
    }
}

// Appointment Class
class Appointment {
    private String appointmentId;
    private Patient patient;
    private String doctor;
    private String appointmentDate;

    public Appointment(String appointmentId, Patient patient, String doctor, String appointmentDate) {
        this.appointmentId = appointmentId;
        this.patient = patient;
        this.doctor = doctor;
        this.appointmentDate = appointmentDate;
    }

    public void displayAppointmentDetails() {
        System.out.println("Appointment ID: " + appointmentId);
        System.out.println("Patient Name: " + patient.getName());
        System.out.println("Doctor: " + doctor);
        System.out.println("Date: " + appointmentDate);
    }
}

// Appointment Scheduler Class
class AppointmentScheduler {
    private ArrayList<Appointment> appointments = new ArrayList<>();

    public void scheduleAppointment(Appointment appointment) {
        appointments.add(appointment);
        System.out.println("Appointment Scheduled Successfully!\n");
    }

    public void displayAppointments() {
        if (appointments.isEmpty()) {
            System.out.println("No appointments scheduled yet.\n");
            return;
        }
        for (Appointment appointment : appointments) {
            appointment.displayAppointmentDetails();
            System.out.println();
        }
    }
}

// EHR (Electronic Health Record) Class
class EHR {
    private String recordId;
    private Patient patient;
    private String diagnosis;
    private String treatment;
    private String prescription;

    public EHR(String recordId, Patient patient, String diagnosis, String treatment, String prescription) {
        this.recordId = recordId;
        this.patient = patient;
        this.diagnosis = diagnosis;
        this.treatment = treatment;
        this.prescription = prescription;
    }

    public void displayEHRDetails() {
        System.out.println("EHR Record ID: " + recordId);
        System.out.println("Patient Name: " + patient.getName());
        System.out.println("Diagnosis: " + diagnosis);
        System.out.println("Treatment: " + treatment);
        System.out.println("Prescription: " + prescription);
    }
}

// EHR Manager Class
class EHRManager {
    private ArrayList<EHR> records = new ArrayList<>();

    public void addRecord(EHR ehr) {
        records.add(ehr);
        System.out.println("EHR Record Added Successfully!\n");
    }

    public void displayAllRecords() {
        if (records.isEmpty()) {
            System.out.println("No EHR records found.\n");
            return;
        }
        for (EHR ehr : records) {
            ehr.displayEHRDetails();
            System.out.println();
        }
    }
}

// Bill Class (for Billing and Invoicing)
class Bill {
    private String billId;
    private Patient patient;
    private double amount;
    private String services;

    public Bill(String billId, Patient patient, double amount, String services) {
        this.billId = billId;
        this.patient = patient;
        this.amount = amount;
        this.services = services;
    }

    public void displayBillDetails() {
        System.out.println("Bill ID: " + billId);
        System.out.println("Patient Name: " + patient.getName());
        System.out.println("Services: " + services);
        System.out.println("Amount: " + amount);
    }
}

// Billing System Class
class BillingSystem {
    private ArrayList<Bill> bills = new ArrayList<>();

    public void generateBill(Bill bill) {
        bills.add(bill);
        System.out.println("Bill Generated Successfully!\n");
    }

    public void displayBills() {
        if (bills.isEmpty()) {
            System.out.println("No bills generated yet.\n");
            return;
        }
        for (Bill bill : bills) {
            bill.displayBillDetails();
            System.out.println();
        }
    }
}

// Inventory Class
class Inventory {
    private String itemName;
    private int quantity;
    private double price;

    public Inventory(String itemName, int quantity, double price) {
        this.itemName = itemName;
        this.quantity = quantity;
        this.price = price;
    }

    public void displayInventoryDetails() {
        System.out.println("Item: " + itemName);
        System.out.println("Quantity: " + quantity);
        System.out.println("Price: " + price);
    }

    public void updateQuantity(int quantity) {
        this.quantity = quantity;
    }
}

// Inventory Manager Class
class InventoryManager {
    private ArrayList<Inventory> inventoryList = new ArrayList<>();

    public void addInventory(Inventory inventory) {
        inventoryList.add(inventory);
        System.out.println("Inventory Added Successfully!\n");
    }

    public void displayInventory() {
        if (inventoryList.isEmpty()) {
            System.out.println("No inventory items found.\n");
            return;
        }
        for (Inventory inventory : inventoryList) {
            inventory.displayInventoryDetails();
            System.out.println();
        }
    }
}

// Staff Class
class Staff {
    private String staffId;
    private String name;
    private String role;
    private String contact;

    public Staff(String staffId, String name, String role, String contact) {
        this.staffId = staffId;
        this.name = name;
        this.role = role;
        this.contact = contact;
    }

    public void displayStaffDetails() {
        System.out.println("Staff ID: " + staffId);
        System.out.println("Name: " + name);
        System.out.println("Role: " + role);
        System.out.println("Contact: " + contact);
    }
}

// Staff Manager Class
class StaffManager {
    private ArrayList<Staff> staffList = new ArrayList<>();

    public void addStaff(Staff staff) {
        staffList.add(staff);
        System.out.println("Staff Added Successfully!\n");
    }

    public void displayStaff() {
        if (staffList.isEmpty()) {
            System.out.println("No staff members found.\n");
            return;
        }
        for (Staff staff : staffList) {
            staff.displayStaffDetails();
            System.out.println();
        }
    }
}

// Main Class
public class HospitalManagementSystem {
    static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        PatientRegistry patientRegistry = new PatientRegistry();
        AppointmentScheduler appointmentScheduler = new AppointmentScheduler();
        EHRManager ehrManager = new EHRManager();
        BillingSystem billingSystem = new BillingSystem();
        InventoryManager inventoryManager = new InventoryManager();
        StaffManager staffManager = new StaffManager();
        
        Patient selectedPatient = null; // Ensure patient is selected

        while (true) {
            System.out.println("---- Hospital Management System ----");
            System.out.println("1. Register Patient");
            System.out.println("2. Display Patients");
            System.out.println("3. Schedule Appointment");
            System.out.println("4. Display Appointments");
            System.out.println("5. Add EHR Record");
            System.out.println("6. Display EHR Records");
            System.out.println("7. Generate Bill");
            System.out.println("8. Display Bills");
            System.out.println("9. Add Inventory");
            System.out.println("10. Display Inventory");
            System.out.println("11. Add Staff");
            System.out.println("12. Display Staff");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume the newline

            switch (choice) {
                case 1:
                    // Register Patient
                    System.out.print("Enter Patient ID: ");
                    String patientId = scanner.nextLine();
                    System.out.print("Enter Patient Name: ");
                    String patientName = scanner.nextLine();
                    System.out.print("Enter Age: ");
                    int age = scanner.nextInt();
                    scanner.nextLine();  // consume newline
                    System.out.print("Enter Gender: ");
                    String gender = scanner.nextLine();
                    System.out.print("Enter Contact: ");
                    String contact = scanner.nextLine();
                    Patient patient = new Patient(patientId, patientName, age, gender, contact);
                    patientRegistry.registerPatient(patient);
                    selectedPatient = patient;  // Assign the newly registered patient as the selected one
                    break;

                case 2:
                    // Display Patients
                    System.out.println("\nRegistered Patients:");
                    patientRegistry.displayAllPatients();
                    break;

                case 3:
                    if (selectedPatient == null) {
                        System.out.println("No patient selected! Please register a patient first.\n");
                        break;
                    }
                    // Schedule Appointment
                    System.out.print("Enter Appointment ID: ");
                    String appointmentId = scanner.nextLine();
                    System.out.print("Enter Doctor Name: ");
                    String doctor = scanner.nextLine();
                    System.out.print("Enter Appointment Date: ");
                    String appointmentDate = scanner.nextLine();
                    appointmentScheduler.scheduleAppointment(new Appointment(appointmentId, selectedPatient, doctor, appointmentDate));
                    break;

                case 4:
                    // Display Appointments
                    System.out.println("\nScheduled Appointments:");
                    appointmentScheduler.displayAppointments();
                    break;

                case 5:
                    if (selectedPatient == null) {
                        System.out.println("No patient selected! Please register a patient first.\n");
                        break;
                    }
                    // Add EHR Record
                    System.out.print("Enter EHR Record ID: ");
                    String recordId = scanner.nextLine();
                    System.out.print("Enter Diagnosis: ");
                    String diagnosis = scanner.nextLine();
                    System.out.print("Enter Treatment: ");
                    String treatment = scanner.nextLine();
                    System.out.print("Enter Prescription: ");
                    String prescription = scanner.nextLine();
                    ehrManager.addRecord(new EHR(recordId, selectedPatient, diagnosis, treatment, prescription));
                    break;

                case 6:
                    // Display EHR Records
                    System.out.println("\nEHR Records:");
                    ehrManager.displayAllRecords();
                    break;

                case 7:
                    if (selectedPatient == null) {
                        System.out.println("No patient selected! Please register a patient first.\n");
                        break;
                    }
                    // Generate Bill
                    System.out.print("Enter Bill ID: ");
                    String billId = scanner.nextLine();
                    System.out.print("Enter Amount: ");
                    double amount = scanner.nextDouble();
                    scanner.nextLine();  // consume newline
                    System.out.print("Enter Services Provided: ");
                    String services = scanner.nextLine();
                    billingSystem.generateBill(new Bill(billId, selectedPatient, amount, services));
                    break;

                case 8:
                    // Display Bills
                    System.out.println("\nBills Generated:");
                    billingSystem.displayBills();
                    break;

                case 9:
                    // Add Inventory
                    System.out.print("Enter Inventory Item Name: ");
                    String itemName = scanner.nextLine();
                    System.out.print("Enter Quantity: ");
                    int quantity = scanner.nextInt();
                    System.out.print("Enter Price: ");
                    double price = scanner.nextDouble();
                    scanner.nextLine();  // consume newline
                    inventoryManager.addInventory(new Inventory(itemName, quantity, price));
                    break;

                case 10:
                    // Display Inventory
                    System.out.println("\nInventory Details:");
                    inventoryManager.displayInventory();
                    break;

                case 11:
                    // Add Staff
                    System.out.print("Enter Staff ID: ");
                    String staffId = scanner.nextLine();
                    System.out.print("Enter Staff Name: ");
                    String staffName = scanner.nextLine();
                    System.out.print("Enter Role: ");
                    String role = scanner.nextLine();
                    System.out.print("Enter Contact: ");
                    String staffContact = scanner.nextLine();
                    staffManager.addStaff(new Staff(staffId, staffName, role, staffContact));
                    break;

                case 12:
                    // Display Staff
                    System.out.println("\nStaff Details:");
                    staffManager.displayStaff();
                    break;

                case 0:
                    System.out.println("Exiting the system...");
                    return;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}