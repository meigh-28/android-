package com.example.myfeeds.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.myfeeds.R;
import com.example.myfeeds.api.APIClient;
import com.example.myfeeds.api.APIInterface;
import com.example.myfeeds.model.Posts;
import com.example.myfeeds.model.User;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class FeedsAdapter extends RecyclerView.Adapter<FeedsAdapter.FeedsHolder> {

    List<Posts> posts;

    Context context;

    public FeedsAdapter(List<Posts> post){this.posts=post;}

    @NonNull
    @Override
    public FeedsAdapter.FeedsHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.adapter_feeds,viewGroup,false);
        context = viewGroup.getContext();
        return new FeedsHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FeedsAdapter.FeedsHolder holder, int i) {

    Posts post = posts.get(i);

    getUserOfId(post.getUserId(), holder);

    holder.body.setText((post.getBody()));

    String url ="https://source.unsplash.com/random/" + i;

        Glide.with(context)
                .load(url)
                .into(holder.mediaImage);


        Glide.with(context)
                .load(url)
                .into(holder.UserImage);
             }



    private void getUserOfId(int userId, final FeedsHolder holder) {

        APIInterface apiInterface = APIClient.getRClient().create(APIInterface.class);
        Call<User> call =apiInterface.getUser(userId);


        call.enqueue(new Callback<User>() {
            @Override
            public void onResponse(Call<User> call, Response<User> response) {

                User user = response.body();
                holder.userName.setText(user.getUserName());
                holder.Email.setText(user.getUserName());

            }

            @Override
            public void onFailure(Call<User> call, Throwable t) {

            }
        });
    }

    @Override
    public int getItemCount() {
        return posts.size();
    }

    public class FeedsHolder extends RecyclerView.ViewHolder {

        TextView userName;
        TextView Email;
        TextView body;
        ImageView UserImage;
        ImageView mediaImage;



        public FeedsHolder(@NonNull View itemView) {
            super(itemView);


            userName = itemView.findViewById(R.id.tv_userName);
            Email = itemView.findViewById(R.id.tv_Email);
            body = itemView.findViewById(R.id.tv_body);
            UserImage = itemView.findViewById(R.id.imageView);
            mediaImage= itemView.findViewById(R.id.iv_mediaImage);
        }
    }
}
