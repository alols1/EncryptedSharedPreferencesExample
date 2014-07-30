package com.og.encryptedsharedpreferencesexample;

import android.test.ActivityInstrumentationTestCase2;
import com.robotium.solo.Solo;

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
    public void testActivity() {
        // robotium assert
        solo.assertCurrentActivity("Main activity", MyActivity.class);
        // junit assert
        assertEquals(true, true);
    }
}