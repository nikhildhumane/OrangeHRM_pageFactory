package OrangeHRM_pratice.Listener;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.Reporter;

import OrangeHRM_pratice.Utilities.ExtendReportManager;

public class SuiteListener implements ISuiteListener {

    private static final Logger log = LogManager.getLogger(SuiteListener.class);

    @Override
    public void onStart(ISuite suite) {
        String suiteName = suite.getName();
        log.info("Starting Test Suite: " + suiteName);
        Reporter.log("Starting Test Suite: " + suiteName, true);

        ExtendReportManager.initialize(suiteName);
    }

    @Override
    public void onFinish(ISuite suite) {
        String suiteName = suite.getName();
        log.info("Finished Test Suite: " + suiteName);
        Reporter.log("Finished Test Suite: " + suiteName, true);

        // Optional: Clean up any suite-level resources here, if needed
        ExtendReportManager.getExtentReports().flush();  // Finalize the Extent Report
    }

}
