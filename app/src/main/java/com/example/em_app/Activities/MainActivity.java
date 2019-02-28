package com.example.em_app.Activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ListView;

import com.example.em_app.Helperclasses.CardArrayAdapter;
import com.example.em_app.Helperclasses.Objects.Card;
import com.example.em_app.R;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "CardListActivity";
    private CardArrayAdapter caa;
    private ListView lv;

    public void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_main);
        lv = findViewById(R.id.card_listView);

        lv.addHeaderView(new View(this));
        lv.addFooterView(new View(this));

        caa = new CardArrayAdapter(getApplicationContext(), R.layout.list_item_card);

        for (int i = 0; i < 10; i++) {
            Card card = new Card("Card " + (i + 1) + " Line 1", "Card " + (i + 1) + " Line 2");
            caa.add(card);
        }
        lv.setAdapter(caa);
    }


}
