package com.project_work.challenge_fragandrecycler;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements Car_Adapter.ItemSelected {
    TextView d_logo_name,d_owner,d_number,info_text;
    Button car_info_btn,owner_info_btn;
    ImageView d_logo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        d_logo_name=findViewById(R.id.d_logo_name);
        d_owner=findViewById(R.id.d_owner);
        info_text=findViewById(R.id.info_text);
        d_logo=findViewById(R.id.d_logo);
        d_number=findViewById(R.id.d_number);
        car_info_btn=findViewById(R.id.car_info_btn);
        owner_info_btn=findViewById(R.id.owner_info_btn);

        info_text.setVisibility(View.VISIBLE);
        d_logo.setVisibility(View.GONE);
        d_number.setVisibility(View.VISIBLE);
        d_owner.setVisibility(View.VISIBLE);
        d_logo_name.setVisibility(View.GONE);

        car_info_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info_text.setVisibility(View.GONE);
                d_logo.setVisibility(View.VISIBLE);
                d_number.setVisibility(View.GONE);
                d_owner.setVisibility(View.GONE);
                d_logo_name.setVisibility(View.VISIBLE);
            }
        });
        owner_info_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info_text.setVisibility(View.VISIBLE);
                d_logo.setVisibility(View.GONE);
                d_number.setVisibility(View.VISIBLE);
                d_owner.setVisibility(View.VISIBLE);
                d_logo_name.setVisibility(View.GONE);
            }
        });
        onItemClicked(0);
    }

    @Override
    public void onItemClicked(int index) {
        d_logo_name.setText(ApplicationClass.car.get(index).getCar_name());
        d_owner.setText(ApplicationClass.car.get(index).getCar_owner());
        d_number.setText(ApplicationClass.car.get(index).getOwner_number());
    }
}
