package com.nityoapps.customtoast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
Button btn_toast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_toast = findViewById(R.id.button);

        btn_toast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              //  Toast.makeText(MainActivity.this, "Hello Nityoday", Toast.LENGTH_LONG).show();

                showToast("Happy Birthday!");

            }
        });

    }

    public void showToast(String message)
    {
        View toastView = getLayoutInflater().inflate(R.layout.toast, (ViewGroup) findViewById(R.id.layToast));
        TextView tv_toast = (TextView) toastView.findViewById(R.id.tvToast);            // this one is because it's external view so tastview.findviewbyid for link
        tv_toast.setText(message);

        Toast premmium_toast = new Toast(MainActivity.this);
        premmium_toast.setDuration(Toast.LENGTH_LONG);
        premmium_toast.setView(toastView);
        premmium_toast.setGravity(Gravity.BOTTOM|Gravity.FILL_HORIZONTAL,0,0);
        premmium_toast.show();
    }



}