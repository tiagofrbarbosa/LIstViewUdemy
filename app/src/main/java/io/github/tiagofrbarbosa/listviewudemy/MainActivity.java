package io.github.tiagofrbarbosa.listviewudemy;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity{

    private ListView mListView;
    private String[] itens = {"Homem-aranha", "Batman", "Superman",
            "Homem-aranha", "Batman", "Superman",
            "Homem-aranha", "Batman", "Superman",
            "Homem-aranha", "Batman", "Superman",
            "Homem-aranha", "Batman", "Superman",
            "Homem-aranha", "Batman", "Superman"};

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mListView = findViewById(R.id.listView);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                this,
                android.R.layout.simple_list_item_1,
                android.R.id.text1,
                itens
        );

        mListView.setAdapter(adapter);

        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String mToastMsg = mListView.getItemAtPosition(position).toString();
                Toast.makeText(getApplicationContext(), mToastMsg, Toast.LENGTH_SHORT).show();
            }
        });
    }
}