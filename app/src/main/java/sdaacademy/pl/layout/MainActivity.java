package sdaacademy.pl.layout;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends Activity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void showText(){
        Toast.makeText(this, "Hello World!", Toast.LENGTH_SHORT).show();

    }

}
