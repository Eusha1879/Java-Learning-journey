package Advance_OOP_Concept.OOP_basics_in_java.Working_with_Collections_in_java;
import java.util.ArrayList;
public class ArrayList_Practice {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();
        students.add("Sami");
        students.add("Rico");
        students.add("Ahmead");

        for(String bunyboo : students){
            System.out.println("New Student of CCT: Mr. "+bunyboo);
        }
    }
}
