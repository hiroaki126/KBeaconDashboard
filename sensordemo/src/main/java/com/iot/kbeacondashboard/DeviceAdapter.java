package com.iot.kbeacondashboard;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.anychart.AnyChart;
import com.anychart.AnyChartView;
import com.anychart.chart.common.dataentry.SingleValueDataSet;
import com.anychart.charts.CircularGauge;
import com.anychart.enums.Anchor;
import com.anychart.graphics.vector.text.HAlign;
import com.kkmcn.sensordemo.R;

import java.util.ArrayList;
import java.util.List;

public class DeviceAdapter extends BaseAdapter {
    Context mContext;
    List<DeviceInfo> mData;
    LayoutInflater mInflter;

    public DeviceAdapter(Context context) {
        mContext = context;
        mInflter = (LayoutInflater.from(mContext));
        mData = new ArrayList<>();
    }

    public DeviceAdapter(Context context, List<DeviceInfo> data) {
        mContext = context;
        mData = data;
        mInflter = (LayoutInflater.from(mContext));
    }

    public void setData(List<DeviceInfo> data) {
        mData = data;
        notifyDataSetChanged();
    }

    public void addData(DeviceInfo data) {
        mData.add(data);
        notifyDataSetChanged();
    }
    @Override
    public int getCount() {
        return mData.size();
    }

    @Override
    public DeviceInfo getItem(int i) {
        return mData.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = mInflter.inflate(R.layout.layout_grid, null);

        return view;
    }
}
