package com.example.admin.starbuzz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class TopLevelActivity extends AppCompatActivity {

    private static final String LOG_TAG = "top_level_activity" ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_top_level);

        ////////////////////////////////////////////////////////////////////////////
        /*ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(
                this, R.array.options, android.R.layout.simple_list_item_1);
        lvList.setAdapter(adapter);

        lvList.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                Log.d(LOG_TAG, "itemClick: position = " + position + ", id= " + id);
            }
        });
        *////////////////////////////////////////////////////////////////////////////

        AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                if(position == 0){
                    Intent intent = new Intent(TopLevelActivity.this, DrinkCategoryActivity.class);
                    startActivity(intent);
                }
            }
        };

        ListView lvList = (ListView) findViewById(R.id.list_options);
        lvList.setOnItemClickListener(itemClickListener);
    }
}
