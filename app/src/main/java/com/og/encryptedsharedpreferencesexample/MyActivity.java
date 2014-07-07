package com.og.encryptedsharedpreferencesexample;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.og.encryptedsharedpreferences.EncryptedSharedPreferences;

/**
 * Example class that uses the EncryptedSharedPreferences library
 * @author Olivier Goutay
 */
public class MyActivity extends Activity {

    private static final String TEST_SHARED = "TEST_SHARED";

    private EditText editText;
    private Button buttonStore;
    private Button buttonShow;
    private TextView textView;

    private EncryptedSharedPreferences encryptedSharedPreferences;

    /**
     * onCreate
     * @param savedInstanceState saved
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);

        editText = (EditText) findViewById(R.id.editText);
        buttonStore = (Button) findViewById(R.id.buttonStore);
        buttonShow = (Button) findViewById(R.id.buttonShow);
        textView = (TextView) findViewById(R.id.textView);
        encryptedSharedPreferences = new EncryptedSharedPreferences(getApplicationContext());

        buttonStore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                encryptedSharedPreferences.putString(TEST_SHARED, editText.getText().toString());
            }
        });

        buttonShow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(encryptedSharedPreferences.getString(TEST_SHARED));
            }
        });
    }
}
