package instrumentation;

import android.test.ActivityInstrumentationTestCase2;
import android.test.suitebuilder.annotation.LargeTest;

import com.og.encryptedsharedpreferencesexample.MyActivity;
import com.robotium.solo.Solo;
import com.squareup.spoon.Spoon;

/**
 * <a href="http://d.android.com/tools/testing/testing_android.html">Testing Fundamentals</a>
 */
public class ApplicationTest extends ActivityInstrumentationTestCase2<MyActivity> {
    private Solo solo;

    /**
     * Constructor
     */
    public ApplicationTest() {
        super(MyActivity.class);
    }

    /**
     * Set up
     * @throws Exception if one
     */
    protected void setUp() throws Exception {
        super.setUp();

        solo = new Solo(getInstrumentation(), getActivity());
    }

    /**
     * Main test
     */
    @LargeTest
    public void testActivity() {
        // robotium assert
        solo.assertCurrentActivity("Main activity", MyActivity.class);
        Spoon.screenshot(solo.getCurrentActivity(), "check_example");

        // junit assert
        assertEquals(true, true);
    }
}