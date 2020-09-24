package id.putraprima.mobile06siplecalcsolution;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button button_kali, button_tambah,button_kurang, button_bagi;
    private TextView text_hasil;
    private EditText edit_text_angka_pertama,edit_text_angka_kedua;

    private int angka_pertama, angka_kedua;

    public int getAngka_kedua() {
        return angka_kedua;
    }

    public int getAngka_pertama() {
        return angka_pertama;
    }

    public void setAngka_kedua(int angka_kedua) {
        this.angka_kedua = angka_kedua;
    }

    public void setAngka_pertama(int angka_pertama) {
        this.angka_pertama = angka_pertama;
    }

    public void setButton_bagi(Button button_bagi) {
        this.button_bagi = button_bagi;
    }

    public Button getButton_bagi() {
        return button_bagi;
    }

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
        button_bagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getAngkaMasukan(view);
                if (!TextUtils.isEmpty(edit_text_angka_pertama.getText()) ||
                        !TextUtils.isEmpty(edit_text_angka_kedua.getText()))
                    if (Integer.parseInt(String.valueOf(edit_text_angka_kedua.getText()))>0) {
                        text_hasil.setText(""+(angka_pertama/angka_kedua));
                    }else text_hasil.setText("do not divide value with 0");
            }
        });

        button_kali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getAngkaMasukan(view);
                if (!TextUtils.isEmpty(edit_text_angka_pertama.getText()) ||
                        !TextUtils.isEmpty(edit_text_angka_kedua.getText()))
                    text_hasil.setText(""+(angka_pertama*angka_kedua));
            }
        });

        //TODO 03 Gunakanlah Log Cat Untuk memperbaiki kesalahan program

        //TODO 04 Gunakanlah Debugger untuk mencari kesalahan program (program berjalan dengan baik namun hasilnya salah)

        //TODO 05 Buatlah Validasi input agar masukan yang di isi oleh user tidak membuat program Force Close

        button_kurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getAngkaMasukan(view);
                if (!TextUtils.isEmpty(edit_text_angka_pertama.getText()) ||
                        !TextUtils.isEmpty(edit_text_angka_kedua.getText()))
                    text_hasil.setText(""+(angka_pertama-angka_kedua));
            }
        });

        button_tambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getAngkaMasukan(view);
                if (!TextUtils.isEmpty(edit_text_angka_pertama.getText()) ||
                        !TextUtils.isEmpty(edit_text_angka_kedua.getText()))
                   text_hasil.setText(""+(angka_kedua+angka_pertama));
            }
        });
    }

    public void getAngkaMasukan(View view){
        //TODO 01 Buatlah kode program untuk mengambil nilai input dari edit text
        if (TextUtils.isEmpty(edit_text_angka_pertama.getText()) ||
                TextUtils.isEmpty(edit_text_angka_kedua.getText())){
            edit_text_angka_pertama.setError("Enter value");
            edit_text_angka_kedua.setError("Enter value");
            edit_text_angka_kedua.requestFocus();
            edit_text_angka_pertama.requestFocus();
        }
        else{
            angka_pertama = Integer.parseInt(String.valueOf(edit_text_angka_pertama.getText()));
            angka_kedua = Integer.parseInt(String.valueOf(edit_text_angka_kedua.getText()));
            System.out.println(angka_kedua+" "+angka_pertama);
        }
    }
}