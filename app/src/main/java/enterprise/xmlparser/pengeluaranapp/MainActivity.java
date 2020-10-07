package enterprise.xmlparser.pengeluaranapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class MainActivity extends AppCompatActivity {

    public static final int DURASI_SPALSH_SCREEN = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(MainActivity.this, BerandaActivity.class);
                MainActivity.this.startActivity(i);
                MainActivity.this.finish();
            }
        }, DURASI_SPALSH_SCREEN);
    }
}