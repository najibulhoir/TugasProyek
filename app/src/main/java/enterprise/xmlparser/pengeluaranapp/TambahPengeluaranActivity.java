package enterprise.xmlparser.pengeluaranapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class TambahPengeluaranActivity extends AppCompatActivity {

    private EditText edtKeterangan, edtNominal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tambah_pengeluaran);

        this.edtKeterangan = this.findViewById(R.id.edt_keterangan);
        this.edtNominal = this.findViewById(R.id.edt_nominal);
    }

    public void btn_simpan(View view) {
        String keterangan = this.edtKeterangan.getText().toString();
        String nominal = this.edtNominal.getText().toString();

        if (isAngka(nominal)){
            String pengeluaran = keterangan + " - " + nominal;
            BerandaActivity.dataPengeluaran.add(pengeluaran);

            Toast.makeText(this, "Data Berhasil ditambahkan", Toast.LENGTH_SHORT).show();
        }else {
            Toast.makeText(this, "Nominal harus angka", Toast.LENGTH_SHORT).show();
        }
    }

    private boolean isAngka(String nominal) {
        try {
            Double.parseDouble(nominal);
            return true;
        }catch (Exception e){
            return false;
        }
    }

    public void btn_kembali(View view) {
        Intent i = new Intent(TambahPengeluaranActivity.this, BerandaActivity.class);
        this.startActivity(i);
    }
}