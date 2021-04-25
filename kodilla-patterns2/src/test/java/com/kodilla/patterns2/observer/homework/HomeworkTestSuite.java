package com.kodilla.patterns2.observer.homework;

import org.junit.jupiter.api.Test;
import org.testng.Assert;

public class HomeworkTestSuite {

    @Test
    public void testUpdate() {
        //Given
        HomeTask sandra = new Student("Sandra", 10.1);
        HomeTask benni = new Student("Benni", 12.4);
        HomeTask jenny = new Student("Jenny", 3.1);
        HomeTask skjalg = new Student("Skjalg", 15.1);
        HomeTask brit = new Student("Brit", 10.2);
        Mentor mentor = new Mentor ("Gosia");
        Mentor mentor2 = new Mentor("Malgosia>");
        sandra.addMentor(mentor);
        brit.addMentor(mentor);
        benni.addMentor(mentor);
        jenny.addMentor(mentor);
        skjalg.addMentor(mentor2);
        //When
        sandra.addTaskToCheck(sandra);
        brit.addTaskToCheck(brit);
        benni.addTaskToCheck(benni);
        jenny.addTaskToCheck(jenny);
        skjalg.addTaskToCheck(skjalg);

        int mentorExcpected = 4;
        int mentor2Expected = 1;
        int mentorActual = mentor.getUpdateCount();
        int mentro2Actual = mentor2.getUpdateCount();
        //Then
        Assert.assertEquals(mentorExcpected, mentorActual);
        Assert.assertEquals(mentor2Expected, mentro2Actual);

    }
}