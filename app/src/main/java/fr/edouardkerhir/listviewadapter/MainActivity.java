package fr.edouardkerhir.listviewadapter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listObjects = findViewById(R.id.listObjects);
        ArrayList<TestObjects> objets = new ArrayList<>();
        objets.add(new TestObjects("Objet 1", "Sub Title 1", "Description 1", R.color.colorAccent));
        objets.add(new TestObjects("Objet 2", "Sub Title 2", "Description 2", R.color.colorPrimary));
        objets.add(new TestObjects("Objet 3", "Sub Title 3", "Description 3", R.color.colorPrimaryDark));
        objets.add(new TestObjects("Objet 4", "Sub Title 4", "Description 4", R.color.colorAccent));
        objets.add(new TestObjects("Objet 5", "Sub Title 5", "Description 5", R.color.colorPrimary));
        objets.add(new TestObjects("Objet 6", "Sub Title 6", "Description 6", R.color.colorPrimaryDark));
        objets.add(new TestObjects("Objet 7", "Sub Title 7", "Description 7", R.color.colorAccent));
        objets.add(new TestObjects("Objet 8", "Sub Title 8", "Description 8", R.color.colorPrimary));
        objets.add(new TestObjects("Objet 9", "Sub Title 9", "Description 7", R.color.colorPrimaryDark));

        ObjectAdapter adapter = new ObjectAdapter(this, objets);
        listObjects.setAdapter(adapter);

    }
}
