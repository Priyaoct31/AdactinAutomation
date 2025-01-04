package org.testng;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import org.testng.annotations.*;

public class ExtentReport {
    ExtentReports extent;
    ExtentTest test;

    @BeforeClass
    public void setupReport() {
        // Set up the Spark reporter
        ExtentSparkReporter sparkReporter = new ExtentSparkReporter("extentReport.html");
        sparkReporter.config().setDocumentTitle("TestNG Extent Report Example");
        sparkReporter.config().setReportName("Automation Test Results");
        sparkReporter.config().setTheme(Theme.STANDARD);

       
        extent = new ExtentReports();
        extent.attachReporter(sparkReporter);

       
    }

    @Test
    public void testPassExample() {
        test = extent.createTest("Pass Test Case", "This test will pass.");
        Assert.assertTrue(true);
        test.pass("The test passed successfully.");
    }

    @Test
    public void testFailExample() {
        test = extent.createTest("Fail Test Case", "This test will fail.");
        try {
            Assert.assertTrue(false);
        } catch (AssertionError e) {
            test.fail("The test failed. Error: " + e.getMessage());
            throw e;
        }
    }

    @Test
    public void testSkipExample() {
        test = extent.createTest("Skip Test Case", "This test will be skipped.");
        throw new SkipException("This test is skipped intentionally.");
    }

    @AfterClass
    public void tearDownReport() {
        // Generate the report
        extent.flush();
    }
}
