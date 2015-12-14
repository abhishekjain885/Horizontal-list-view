package dell.horizontalview;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;


public class HorizontalListActivity extends ActionBarActivity {
    RecyclerView recyclerView;
    ArrayList<GridViewItemData> arrayList;
    GridViewItemAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_horizontal_list);
        recyclerView=(RecyclerView)findViewById(R.id.item_detail_rv);
        arrayList=new ArrayList<GridViewItemData>();
        final LinearLayoutManager layoutManager=new LinearLayoutManager(this);
        layoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        recyclerView.setLayoutManager(layoutManager);
        initializeData();
        adapter=new GridViewItemAdapter(this,arrayList);
        recyclerView.setAdapter(adapter);
    }
    public void initializeData()
    {   arrayList.add(new GridViewItemData("The Accidental Prime minister","https://kitaabonline.files.wordpress.com/2014/04/accidental-pm.jpg","Rs 501"));
        arrayList.add(new GridViewItemData("The 3 mistakes of my life","https://d.gr-assets.com/books/1216107646l/3320520.jpg","Rs 200"));
        arrayList.add(new GridViewItemData("Secret Daughter","http://d.gr-assets.com/books/1347708559l/6905012.jpg","Rs 99"));
        arrayList.add(new GridViewItemData("The Namo Story","http://www.blog.indiareads.com/wp-content/uploads/2014/05/the-namo-story-a-political-life-400x400-imadjhjw3z8dfdrm.jpeg","Rs 100"));
        arrayList.add(new GridViewItemData("The Promise","http://img5a.flixcart.com/image/book/1/6/7/the-promise-400x400-imadf4fgfwghyzh6.jpeg","Rs 99"));
        arrayList.add(new GridViewItemData("2 States","http://media2.intoday.in/indiatoday/images/Photo_gallery/0625100103161%29-2-States.jpg","Rs 99"));
        arrayList.add(new GridViewItemData("Godan","https://qph.is.quoracdn.net/main-qimg-dbde0fdde2317aca1e51913e2c6daabe?convert_to_webp=true","Rs 99"));
        arrayList.add(new GridViewItemData("Half Girlfriend","http://static.ibnlive.in.com/ibnlive/pix/ibnhome/half-girlfriend-chetan-bhagat-050814.jpg","Rs 215"));
        arrayList.add(new GridViewItemData("The discovery of india","http://4.bp.blogspot.com/-vf05NgXjRmU/ULimSc_-ArI/AAAAAAAADRg/d7pQ2qs9Nk0/s1600/The+Discovery+of+India.jpg","Rs 300"));
        arrayList.add(new GridViewItemData("Making India Awesome","http://static.dnaindia.com/sites/default/files/2015/08/22/368279-awesome.jpg","Rs 100"));

    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_horizontal_list, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement


        return super.onOptionsItemSelected(item);
    }
}
