package inc.machine_code.world_orbit_list.Adapter;

import android.annotation.SuppressLint;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import inc.machine_code.world_orbit_list.Country.Satellite;
import inc.machine_code.world_orbit_list.R;

public class SatelliteAdapter extends RecyclerView.Adapter<SatelliteAdapter.ViewHolder> {

    private InterfaceCallback callback;

    private List<Satellite> SatelliteList;

    public SatelliteAdapter(InterfaceCallback callback, List<Satellite> satelliteList) {
        this.callback = callback;
        this.SatelliteList = satelliteList;

    }


    public interface InterfaceCallback {
        void inClickEvent(Satellite satellite);

    }

    public class EmptyHolder extends SatelliteViewHolder {

        public EmptyHolder(View view) {
            super(view);
        }
    }


    @NonNull
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.satellite_photo_fragment, parent, false));

    }


    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, @SuppressLint("RecyclerView") final int position) {

        holder.onBind(position);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Satellite satellite = SatelliteList.get(position);

                callback.inClickEvent(satellite);

            }
        });
    }

    @Override
    public int getItemCount() {

        return SatelliteList.size();
    }


    class SatelliteViewHolder extends RecyclerView.ViewHolder {
        ImageView p_satellite_photo;
        TextView p_satellite_name,
                p_launch_date,
                p_satellite_type;


        SatelliteViewHolder(View view) {
            super(view);

            p_satellite_photo = view.findViewById(R.id.iv_satellite_photo);
            p_satellite_name = view.findViewById(R.id.tv_satellite_name);
            p_launch_date = view.findViewById(R.id.tv_launch_date);
            p_satellite_type = view.findViewById(R.id.tv_satellite_type);
        }
    }

    class ViewHolder extends SatelliteViewHolder {
        ImageView satellite_photo;

        TextView satellite_name,
                launch_date,
                satellite_type;

        ViewHolder(View v) {
            super(v);
            satellite_photo = v.findViewById(R.id.iv_satellite_photo);
            satellite_name = v.findViewById(R.id.tv_satellite_name);
            launch_date = v.findViewById(R.id.tv_launch_date);
            satellite_type = v.findViewById(R.id.tv_satellite_type);

        }

        void onBind(int position) {


            Satellite satellite = SatelliteList.get(position);
            satellite_photo.setImageResource(SatelliteList.get(position).getImage());
            satellite_name.setText(String.valueOf(satellite.getName()));
            launch_date.setText(String.valueOf(satellite.getDate()));
            satellite_type.setText(String.valueOf(satellite.getSatellite_Type()));

        }

    }
}
