package hridoy.aiz.customactionbar;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        ActionBar ab  = getSupportActionBar();
        ab.setIcon(R.mipmap.chrome);
        ab.setTitle("welcome");
        ab.setDisplayUseLogoEnabled(true);
        ab.setDisplayShowHomeEnabled(true);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.download:
                startActivity(new Intent(this,Main2Activity.class));
                Toast.makeText(this,"Download is clicked",Toast.LENGTH_SHORT).show();
            case R.id.send:
                Toast.makeText(this,"Send is clicked",Toast.LENGTH_SHORT).show();
            case R.id.refresh:
                Toast.makeText(this,"Refresh is clicked",Toast.LENGTH_SHORT).show();
        }
        return super.onOptionsItemSelected(item);
    }
}
