package com.example.thapareatsserver.ViewHolder;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.ContextMenu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.thapareatsserver.Interface.ItemClickListener;
import com.example.thapareatsserver.R;

public class OrderViewHolder extends RecyclerView.ViewHolder {

    public TextView txtOrderId, txtOrderStatus, txtOrderPhone, txtOrderAddress, txtOrdeDate;

    public Button btnEdit, btnRemove, btnDetail;


    public OrderViewHolder(@NonNull View itemView) {
        super(itemView);

        txtOrderAddress = itemView.findViewById(R.id.order_address);
        txtOrderId = itemView.findViewById(R.id.order_id);
        txtOrderPhone = itemView.findViewById(R.id.order_phone);
        txtOrderStatus = itemView.findViewById(R.id.order_status);
        txtOrdeDate = itemView.findViewById(R.id.order_date);

        btnEdit = itemView.findViewById(R.id.btnEdit);
        btnRemove = itemView.findViewById(R.id.btnRemove);
        btnDetail = itemView.findViewById(R.id.btnDetail);
    }
}
