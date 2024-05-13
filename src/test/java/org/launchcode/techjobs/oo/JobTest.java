package org.launchcode.techjobs.oo;

import org.junit.Test;

import static java.lang.System.lineSeparator;
import static org.junit.Assert.*;

public class JobTest {
    //TODO: Create your unit tests here
    @Test
    public void testSettingJobId () {
        Job testJob = new Job();
        Job testJob2 = new Job();
                assertNotEquals(testJob.getId(), testJob2.getId());
    }

    @Test
    public void testJobConstructorSetsAllFields () {
        Job testJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertTrue(testJob instanceof Job);
        assertEquals(testJob.getName(), "Product tester");
        assertEquals(testJob.getEmployer().getValue(),"ACME");
        assertEquals(testJob.getLocation().getValue(),"Desert");
        assertEquals(testJob.getPositionType().getValue(),"Quality control");
        assertEquals(testJob.getCoreCompetency().getValue(),"Persistence");
    }

    @Test
    public void testJobsForEquality () {
        Job testJob = new Job("Developer", new Employer("Google"), new Location("Desert"), new PositionType("Front-end"), new CoreCompetency("Talent"));
        Job testJob2 = new Job("Developer", new Employer("Google"), new Location("Desert"), new PositionType("Front-end"), new CoreCompetency("Talent"));
        assertFalse(testJob == testJob2);
    }

    @Test
    public void testToStringStartsAndEndsWithNewLine () {
        Job testJob = new Job();
        assertTrue(testJob.toString().endsWith(lineSeparator()));
        assertTrue(testJob.toString().startsWith(lineSeparator()));
    }

    @Test
    public void testToStringContainsCorrectLabelsAndData () {
        Job testJob = new Job("Developer", new Employer("Google"), new Location("Desert"), new PositionType("Front-end"), new CoreCompetency("Talent"));
        assertTrue(testJob.toString().contains(testJob.getName()));
        assertTrue(testJob.toString().contains(testJob.getEmployer().getValue()));
        assertTrue(testJob.toString().contains(testJob.getCoreCompetency().getValue()));
        assertTrue(testJob.toString().contains(testJob.getLocation().getValue()));
        assertTrue(testJob.toString().contains(testJob.getPositionType().getValue()));
    }

    @Test
    public void testToStringHandlesEmptyField () {
        Job testJob = new Job("Developer", new Employer("Google"), new Location("Desert"), new PositionType("Front-end"), new CoreCompetency());
        assertEquals(testJob.toString(), System.lineSeparator() +
                "id: 1\n" +
                "name: Developer\n" +
                "employer: Google\n" +
                "location: Desert\n" +
                "positionType: Front-end\n" +
                "coreCompetency: Data not available");
    }

//    @Test
//    public void testJobDoesNotExist () {
//
//    }
}
