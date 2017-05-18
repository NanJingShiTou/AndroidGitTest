package androidgittest.mw.com.androidgittest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import androidgittest.mw.com.mylibrary.TestLibrary;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(MainActivity.this,TestLibrary.getTest()+"",Toast.LENGTH_SHORT).show();

    }


}
