package cs2340.woms;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class LoginScreen extends Activity {
	MainActivityMatt ob;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_screen);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main_activity_matt, menu);
        return true;
    }
    

}
