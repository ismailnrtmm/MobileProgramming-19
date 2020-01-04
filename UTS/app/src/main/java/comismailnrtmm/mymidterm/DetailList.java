package comismailnrtmm.mymidterm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class DetailList extends AppCompatActivity {

    private int iphone;
    ImageView imgDetail;
    TextView tvName, tvDesc, tvTitle;
    private ArrayList<iph> listIph = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_list);

        iphone = getIntent().getIntExtra("iphone", 0);
        tvName = findViewById(R.id.nama_iph);
        tvTitle = findViewById ( R.id. )
        tvDesc = findViewById(R.id.desc_detail);
        imgDetail = findViewById(R.id.img_detail);

        listIph.addAll(IphData.getListData());

        setLayout();
    }

    private void setLayout() {
        tvName.setText(listIph.get(iphone).getName());
        tvDesc.setText(listIph.get(iphone).getDescription());
        Glide.with(this)
                .load(listIph.get(iphone).getPhoto())
                .apply(new RequestOptions ().fitCenter())
                .into(imgDetail);
    }
}
