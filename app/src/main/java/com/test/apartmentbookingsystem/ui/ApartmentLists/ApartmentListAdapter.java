package com.test.apartmentbookingsystem.ui.ApartmentLists;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.test.apartmentbookingsystem.R;
import com.test.apartmentbookingsystem.models.Apartments;

import java.util.List;

import static android.content.ContentValues.TAG;

public class ApartmentListAdapter extends RecyclerView.Adapter<ApartmentListAdapter.ApartmentsViewHolder>  {

    List<Apartments> apartmentsList;
    Context context;

    public ApartmentListAdapter(List<Apartments> apartmentsList) {
        this.apartmentsList = apartmentsList;
    }

    @NonNull
    @Override
    public ApartmentListAdapter.ApartmentsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_apartment_card, parent, false);
        context = parent.getContext();
        return new ApartmentsViewHolder(view);
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onBindViewHolder(@NonNull ApartmentListAdapter.ApartmentsViewHolder holder, int position) {

        Apartments apartment = apartmentsList.get(position);
        Log.e(TAG, "onBindViewHolder: " + apartment.getRooms() );

        holder.apartmentName.setText(apartment.getName());
        holder.rooms.setText("No. of Rooms: " + apartment.getRooms());
        if(apartment.isBooked()){
            holder.available.setText("Not Available");
            holder.bookButton.setEnabled(false);
        }else{
            holder.available.setText("Available");
            holder.bookButton.setEnabled(true);
            holder.bookButton.setOnClickListener(v ->{
                apartment.setBooked(true);
                notifyDataSetChanged();
            });
        }
    }

    @Override
    public int getItemCount() {
        return apartmentsList.size();
    }

    public static class ApartmentsViewHolder extends RecyclerView.ViewHolder {

        TextView apartmentName;
        TextView rooms;
        TextView available;
        Button bookButton;

        public ApartmentsViewHolder(@NonNull View itemView) {
            super(itemView);

            apartmentName = itemView.findViewById(R.id.tv_apartment_name);
            rooms = itemView.findViewById(R.id.tv_rooms);
            available = itemView.findViewById(R.id.tv_availablity);
            bookButton = itemView.findViewById(R.id.button);

        }
    }
}
