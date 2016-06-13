package com.example.admin.starbuzz;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by admin on 13.06.2016.
 */
public class DrinkCategoryActivity extends ListActivity {
    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        Intent intent = new Intent(this, DrinkActivity.class);
        intent.putExtra(DrinkActivity.EXTRA_DRINKNO, (int) id);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ListView listView = getListView();

        ArrayAdapter<Drink> ListAdapter = new ArrayAdapter<Drink>(
                this, android.R.layout.simple_list_item_1, Drink.drinks
        );

        listView.setAdapter(ListAdapter);



    }
}
