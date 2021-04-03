package com.example.rkapps;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class RS extends ListActivity {
    protected void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        String[] ListRS = new String[]{"Rumah Sakit Awal Bross", "RS Eka Hospital",
                "Rumah Sakit Jiwa Tampan", "RS Tabrani"};
        this.setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, ListRS));

    }

    protected void onListItemClick(ListView L, View V, int posisition, long id) {
        super.onListItemClick(L, V, posisition, id);
        Object o = this.getListAdapter().getItem(posisition);
        String pilihan = o.toString();
        tampilkanpilihan(pilihan);
    }

    private void tampilkanpilihan(String pilihan) {
        try {
            Intent a = null;
            if (pilihan.equals("Rumah Sakit Awal Bross")) {
                a = new Intent(this, RSAwalBross.class);




            } else if (pilihan.equals("RS Eka Hospital"))
            {


            }


            startActivity(a);


        } catch (Exception e)
        {
            e.printStackTrace();
        }
    }

}