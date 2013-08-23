import java.util.Scanner;

public class TestPatient {

	public static void main(String[] args) {
		BloodType jonBloodType = new BloodType("O", '-');
		BloodType BloodType = new BloodType();
		
		Patient jon = new Patient(666, 44, jonBloodType);
		Patient jane = new Patient();
		Patient eddie = new Patient ();
		
		jane.setPatientIdNumber(123);
		jane.setPatientAge(35);
		BloodType janesBloodType = new BloodType ("AB", '-');
		
		System.out.println("Jon's Id number is " + jon.getPatientIdNumber() + "He is " + jon.getPatientAge() + " years old." + " His blood type is " + jon.getBloodType());
		System.out.println("Jane's Id number is " + jane.getPatientIdNumber() + " She is " + jane.getPatientAge() + " years old." + " Her blood type is " + jane.getBloodType());
		System.out.println("Eddie's Id number is " + eddie.getPatientIdNumber() + " He is " + eddie.getPatientAge() + " years old." + " His blood type is " + eddie.getBloodType());
	}

}
