package ac.id.atmaluhur.mhs.ranumfatwaaulia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText nilaia;
    EditText nilaib;
    EditText nilaic;
    EditText nilaid;
    TextView hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nilaia = (EditText) findViewById(R.id.nilaia);
        nilaib = (EditText) findViewById(R.id.nilaib);
        nilaic = (EditText) findViewById(R.id.nilaic);
        nilaid = (EditText) findViewById(R.id.nilaid);
        hasil = (TextView) findViewById(R.id.hasil);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    public void hitung (View View){
        Integer a = Integer.parseInt(nilaia.getText().toString());
        Integer b = Integer.parseInt(nilaib.getText().toString());
        Integer c = Integer.parseInt(nilaic.getText().toString());
        Integer d = Integer.parseInt(nilaid.getText().toString());
        Integer e = a * 10/100 + b * 20/100 + c * 30/100 + d * 40/100;
        hasil.setText("HASIL NILAI AKHIR = "+e);
    }
}