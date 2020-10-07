package enterprise.xmlparser.pengeluaranapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class LihatPengeluaranActivity extends AppCompatActivity {

    private ListView lsvPengeluaran;
    private ArrayAdapter<String> adapterlsvPengeluaran;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lihat_pengeluaran);

        this.lsvPengeluaran = this.findViewById(R.id.lsv_pengeluaran);

        this.adapterlsvPengeluaran = new ArrayAdapter<>(
                this,
                R.layout.layout_listview_sederhana,
                BerandaActivity.dataPengeluaran
        );

        this.lsvPengeluaran.setAdapter(this.adapterlsvPengeluaran);

    }
}