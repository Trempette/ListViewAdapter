package fr.edouardkerhir.listviewadapter;

import android.content.Context;
import android.opengl.Visibility;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.ConstraintLayout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import junit.framework.Test;

import java.util.ArrayList;

//Object Adapter
public class ObjectAdapter extends ArrayAdapter {

    //Constructeur de l'Adapteur
    public ObjectAdapter(Context context, ArrayList<TestObjects> objetsTest){ super(context, 0, objetsTest); }


    //Création de la View a partir des éléments mis en paramètres
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        //récupères les infos de l'item n°position de la liste
        TestObjects objetTest = (TestObjects) getItem(position);


        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_objects, parent, false);
        }

        //récupération des éléments du Layout
        TextView title = convertView.findViewById(R.id.titleItem);
        TextView subTitle = convertView.findViewById(R.id.subTitleItem);
        TextView description = convertView.findViewById(R.id.descriptionItem);
        TextView numberItem = convertView.findViewById(R.id.numberItem);
        final TextView visible = convertView.findViewById(R.id.visible);

        ConstraintLayout allItem = convertView.findViewById(R.id.clickable);

        //mettre les infos des objets dans les cases du Layout
        convertView.setBackgroundResource(objetTest.getColor());
        title.setText(objetTest.getTitle());
        subTitle.setText(objetTest.getSubTitle());
        description.setText(objetTest.getDescription());
        numberItem.setText(Integer.toString(position+1));

        visible.setText("BLABLABLABLABLABLALBLBALABLARLAEFEJRAIEFLDGFJIRF?LEF?ZOEFOOEJFALSDLSFAOJOEFJAOEF  AZJDOJAOJA?FAOJ AOFJAOFOJAEO AFJA OJFAOJEFAKOKLAGKMA");
        visible.setVisibility(View.GONE);

        allItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (visible.getVisibility()== View.GONE){
                   visible.setVisibility(View.VISIBLE);
                }
                else if (visible.getVisibility() == View.VISIBLE){
                    visible.setVisibility(View.GONE);
                }
            }
        });


        return convertView;
    }
}
