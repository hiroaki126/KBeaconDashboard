package com.iot.kbeacondashboard;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

import com.kkmcn.sensordemo.R;

public class MainActivity extends AppCompatActivity {

    DeviceAdapter mAdapter ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mAdapter = new DeviceAdapter(this);
        GridView gridView = findViewById(R.id.grdDevices);
        gridView.setAdapter(mAdapter);

        mAdapter.addData(new DeviceInfo("sadfa", 100, 20));
        mAdapter.addData(new DeviceInfo("sadfa", 100, 20));
        mAdapter.addData(new DeviceInfo("sadfa", 100, 20));
        mAdapter.notifyDataSetChanged();
    }
}