package id.putraprima.mobile06siplecalcsolution;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button button_kali, button_tambah,button_kurang, button_bagi;
    private TextView text_hasil;
    private EditText edit_text_angka_pertama,edit_text_angka_kedua;

    private int angka_pertama, angka_kedua;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button_kali = findViewById(R.id.button_kali);
        button_bagi = findViewById(R.id.button_bagi);
        button_kurang = findViewById(R.id.button_kurang);
        button_tambah = findViewById(R.id.button_tambah);
        text_hasil = findViewById(R.id.text_hasil);
        edit_text_angka_kedua = findViewById(R.id.edit_text_angka_kedua);
        edit_text_angka_pertama = findViewById(R.id.edit_text_angka_pertama);

        //TODO 02 Buatlah kode program untuk menambahkan event klik dari tombol kali dan tombol bagi

        //TODO 03 Gunakanlah Log Cat Untuk memperbaiki kesalahan program

        //TODO 04 Gunakanlah Debugger untuk mencari kesalahan program (program berjalan dengan baik namun hasilnya salah)

        //TODO 05 Buatlah Validasi input agar masukan yang di isi oleh user tidak membuat program Force Close

        button_kurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getAngkaMasukan();
                text_hasil.setText(angka_pertama+angka_kedua);

            }
        });

        button_tambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getAngkaMasukan();
                text_hasil.setText(angka_pertama+angka_kedua);
            }
        });
    }

    public void getAngkaMasukan(){
        //TODO 01 Buatlah kode program untuk mengambil nilai input dari edit text
    }
}