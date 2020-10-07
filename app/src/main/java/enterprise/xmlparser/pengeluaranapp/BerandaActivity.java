package enterprise.xmlparser.pengeluaranapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;

public class BerandaActivity extends AppCompatActivity {

    public static ArrayList<String> dataPengeluaran;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beranda);

        if (dataPengeluaran == null){
            dataPengeluaran = new ArrayList<>();
            dataPengeluaran.add("Sarapan - 8000");
            dataPengeluaran.add("Bensin - 10000");
        }

    }

    public void btn_tmbh_pengeluaran(View view) {
        Intent i = new Intent(BerandaActivity.this, TambahPengeluaranActivity.class);
        this.startActivity(i);
    }

    public void btn_lht_pengeluaran(View view) {
        Intent i = new Intent(BerandaActivity.this, LihatPengeluaranActivity.class);
        this.startActivity(i);
    }
}