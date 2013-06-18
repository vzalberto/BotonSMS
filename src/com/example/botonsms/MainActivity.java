package com.example.botonsms;

import android.os.Bundle;
import android.app.Activity;
import android.view.*;
//import android.widget.TextView;
import android.telephony.SmsManager;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
    public void sendSMS(View view){
    	SmsManager smsManager = SmsManager.getDefault();
    	smsManager.sendTextMessage("+525521884383", null, "me están picando en tepito ven", null, null);

    }
    
}