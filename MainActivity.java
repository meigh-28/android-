package com.example.myfeeds;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

import com.example.myfeeds.Adapter.FeedsAdapter;
import com.example.myfeeds.api.APIClient;
import com.example.myfeeds.api.APIInterface;
import com.example.myfeeds.model.Posts;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fetchPosts();
        
    }

    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater inflater =getMenuInflater();
        inflater.inflate(R.menu.main_menu, menu);
        return super.onCreateOptionsMenu(menu);

    }

    public boolean onOptionsItemsSelected(MenuItem item){
        if(item.getItemId()== R.id.action_add){
            Toast.makeText(this, "Add Tapped", Toast.LENGTH_LONG).show();
        }
        return onOptionsItemSelected(item);
    }

     private void fetchPosts() {

         APIInterface apiInterface = APIClient.getRClient().create(APIInterface.class);
         Call<List<Posts>> call = apiInterface.getAllPosts();

         call.enqueue(new Callback<List<Posts>>() {
             @Override
             public void onResponse(Call<List<Posts>> call, Response<List<Posts>> response) {
            List<Posts> posts = response.body();
                 FeedsAdapter feedsAdapter = new FeedsAdapter(posts);
                 RecyclerView recyclerView = findViewById(R.id.rv_feeds);
                 recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));
                 recyclerView.setAdapter(feedsAdapter);
              }

             @Override
             public void onFailure(Call<List<Posts>> call, Throwable t) {

             }
         });



    }
}
