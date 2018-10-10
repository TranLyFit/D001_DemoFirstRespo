package com.example.tran_ly.listview2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener, View.OnClickListener {

    private ListView lstv;
    private ArrayList<ContactModel> arr = new ArrayList<>();
    private Button btnSelect;
    private int pos=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lstv = this.findViewById(R.id.mainlstv);
        inItData();
        CustomAdaptorLstv adaptor = new CustomAdaptorLstv(this,arr);
        lstv.setAdapter(adaptor);
        lstv.setOnItemClickListener(this);

        btnSelect= this.findViewById(R.id.btnSelect);
        btnSelect.setOnClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Toast.makeText(this, "Position "+position+": "+ arr.get(position).getName(), Toast.LENGTH_SHORT).show();
        pos= position;
    }

    public void inItData(){
        arr.add(new ContactModel(R.drawable.a, R.drawable.a, "Tran Van A", "0909000111"));
        arr.add(new ContactModel(R.drawable.b, R.drawable.b, "Tran Van B", "0909000112"));
        arr.add(new ContactModel(R.drawable.c, R.drawable.c, "Tran Van C", "0909000113"));
        arr.add(new ContactModel(R.drawable.d, R.drawable.d, "Tran Van D", "0909000114"));
        arr.add(new ContactModel(R.drawable.e, R.drawable.e, "Tran Van E", "0909000115"));
        arr.add(new ContactModel(R.drawable.f, R.drawable.f, "Tran Van F", "0909000116"));
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnSelect:
                Intent intent= new Intent(this, ActivityWelcome.class);
                intent.putExtra("NAME", arr.get(pos).getName());
                startActivity(intent);
                break;
                default:
                    break;
        }
    }
}
