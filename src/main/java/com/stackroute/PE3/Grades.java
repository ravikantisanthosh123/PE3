package com.stackroute.PE3;

public class Grades {
    public String Grades(int stuGrades[], int n) {
        try {
            for (int i = 0; i < n; i++) {
                if (stuGrades[i] < 0 || stuGrades[i] > 100 && stuGrades.length!=n) {
                    exception ex = new exception();
                    throw ex;


                }


            }
        } catch (Exception e) {

            return e.getMessage();


        }
        return "correct";
    }
}

class exception extends Exception {
    public String getMessage() {
        return "exception";
    }
}
