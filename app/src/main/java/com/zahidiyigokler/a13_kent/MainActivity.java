package com.zahidiyigokler.a13_kent;

import android.os.Bundle;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import android.view.View;
import java.util.ArrayList;
import com.zahidiyigokler.a13_kent.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    // static Landmark selectedLandmark;
    private ActivityMainBinding binding;
    ArrayList<Landmark> landmarkArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        // Data
        landmarkArrayList = new ArrayList<>();
        Landmark pisa = new Landmark("Pisa","Italy",R.drawable.pisa);
        Landmark eiffel = new Landmark("Eiffel","France",R.drawable.eiffel);
        Landmark colloseum = new Landmark("Colloseum","Italy",R.drawable.colesseo);
        Landmark londonBridge = new Landmark("London Bridge","UK",R.drawable.londonbridge);
        landmarkArrayList.add(pisa);
        landmarkArrayList.add(eiffel);
        landmarkArrayList.add(colloseum);
        landmarkArrayList.add(londonBridge);

        // RecyclerView
        binding.recyclerView.setLayoutManager(new LinearLayoutManager(this));
        LandmarkAdapter landmarkAdapter=new LandmarkAdapter(landmarkArrayList);
        binding.recyclerView.setAdapter(landmarkAdapter);

        /*

        // Not Efficient

        Bitmap pisa = BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.pisa);
        Bitmap eiffel = BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.eiffel);
        Bitmap coolesseo = BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.colesseo);
        Bitmap londonBridge = BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.londonbridge);
        */

        /*

        // ListView

        ArrayAdapter arrayAdapter = new ArrayAdapter(MainActivity.this, android.R.layout.simple_list_item_1,landmarkArrayList);
        binding.listView.setAdapter(arrayAdapter);
        binding.listView.setOnItemClickListener(new View.OnClickListener()){
            @Override
            public void onItemClick(AdapterView<?> adapterView,View view,int i,long 1){
                // System.out.println(landmarkNames.get(i));
                // System.out.println(counttryNames.get(i));
                Intent intent = new Intent(MainActivity.this,DetailsActivity.class);
                intent.putExtra("landmark",landmarkArrayList.get(i));
                startActivities(intent);
            }
        }
        */
    }
}
