public class Student {
    String surName;
    String firstName;
    char middleInitial;
    int dateOfBirth; 
    int studentNumber;
    String studentEmailAddress;
    boolean iAmAwesome;

    public void sayMyStudentNumber() {
        System .out.println("studentNumber: " + studentNumber); 
    }

    public void studentEmailAddress(){
        System .out.println("studentEmailAddress" + studentEmailAddress) ;
    }

    public void iAmAwesome() {
        System .out.println("iAmAwesome: " + iAmAwesome + "\n"); 
    
    }
}
