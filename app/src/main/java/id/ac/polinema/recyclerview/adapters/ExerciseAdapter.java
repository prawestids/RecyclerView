package id.ac.polinema.recyclerview.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.List;

import id.ac.polinema.recyclerview.R;
import id.ac.polinema.recyclerview.models.Berita;

public class ExerciseAdapter extends RecyclerView.Adapter<ExerciseAdapter.ViewHolder> {
    private static final int WHITE_BG = 1;
    private static final int GREY_BG = 2;

    private Context context;
    private List<Berita> items;

    public ExerciseAdapter(Context context, List<Berita> items) {
        this.context = context;
        this.items = items;
    }

    @NonNull
    @Override

    public ExerciseAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = null;
        if (viewType == WHITE_BG){
            view = LayoutInflater.from(context)
                    .inflate(R.layout.item_exercise, parent, false);
        } else if (viewType == GREY_BG){
            view = LayoutInflater.from(context)
                    .inflate(R.layout.item_exercise_g, parent, false);
        }
        return new ExerciseAdapter.ViewHolder(view);
    }


    @Override
    public void onBindViewHolder(@NonNull ExerciseAdapter.ViewHolder holder, int position) {
        Berita item = items.get(position);
        Picasso.get().load(item.getImage()).into(holder.logoImage);
        holder.companyText.setText(item.getCompany());
        holder.judulText.setText(item.getJudul());
    }

    @Override
    public int getItemCount() {
        return (items != null) ? items.size() :0;
    }
    @Override
    public int getItemViewType(int position) {
        return (position %4 == 0 || position %4 == 3) ? GREY_BG : WHITE_BG;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView logoImage;
        TextView companyText;
        TextView judulText;

        public ViewHolder(@NonNull View itemView){
            super(itemView);
            logoImage = itemView.findViewById(R.id.logo);
            companyText = itemView.findViewById(R.id.text_company);
            judulText = itemView.findViewById(R.id.text_header);
        }
    }
}
