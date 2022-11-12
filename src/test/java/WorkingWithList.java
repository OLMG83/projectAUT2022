import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class WorkingWithList {
    @Test
    public void createAndWorkWithList() {
        Student valera = new Student();
        valera.setFirstName("valera");
        valera.setLastName("The Tester");
        valera.setEmail("valerunchik@test.lv");
        valera.setPhone("+14175932222");

        Student liga = new Student("Liga", "Ivanova", "liga@test.lv", "125");
        Student dmitro = new Student("Dmitro", "Tkachov", "tkachow@test.lv", "123");
        Student artis = new Student("Artis", "Greatest", "", "115");

        liga.setLastName("Zvaigzne");

        List<Student> students = new ArrayList<>();
        students.add(valera); //0
        students.add(liga); //1
        students.add(dmitro); //2
        students.add(artis); //3

        //----------------------------FOR----------------------//

        for (int i = 0;i < 2;) {   // i = i + 1 ->> i++
            System.out.println(students.get(i).getFirstName());
        }

        //----------------------FOREACH--------------
        for (Student s :students) {
            System.out.println(s.getFullName());
        }

            //-----------------------FOREACH IF----------------------

            for (Student s : students){
                System.out.println("Printing students with phone nr starting with +371:");
                if (s.getPhone().startsWith("+371")) {
                    System.out.println(s.getFullName());
            }

        }
    }
}

