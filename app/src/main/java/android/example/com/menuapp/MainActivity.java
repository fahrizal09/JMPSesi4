package android.example.com.menuapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.optionmenu,menu);
        return super.onCreateOptionsMenu(menu);

    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId()==R.id.menu1){
            startActivity(new Intent(getApplicationContext(),FirstMenu.class));
        }else if (item.getItemId()==R.id.menu2){
            startActivity(new Intent(getApplicationContext(),SecondMenu.class));
        }else if (item.getItemId()==R.id.menu3){
            startActivity(new Intent(getApplicationContext(),ThirdMenu.class));
        }

        return true;
    }
}