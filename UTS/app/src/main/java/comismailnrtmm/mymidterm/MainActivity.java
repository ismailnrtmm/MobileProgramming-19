package comismailnrtmm.mymidterm;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvIph;
    private ArrayList<iph> list = new ArrayList<>();

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.profil, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId()==R.id.item_about){
            startActivity(new Intent (this, aboutme.class));
        }
        return true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvIph = findViewById(R.id.rv_iph);
        rvIph.setHasFixedSize(true);

        list.addAll(IphData.getListData());
        showRecyclerList();
    }

    private void showRecyclerList() {
        rvIph.setLayoutManager(new LinearLayoutManager (this));
        CardIphAdapter cardIphAdapter = new CardIphAdapter(this, list);
        rvIph.setAdapter(cardIphAdapter);
    }
}