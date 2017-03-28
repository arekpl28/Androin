package sdaacademy.pl.layout;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        showBasicData();
    }

    public void showBasicData() {
        DetailFragment detailFragment = getDetailFragment();
        if (detailFragment != null) {
            detailFragment.showDasicData();
        } else {
            Intent intent = new Intent(this, DetailActivity.class);
            startActivity(intent);

        }
    }

    public void showDetailData() {
        DetailFragment detailFragment = getDetailFragment();
        if (detailFragment != null) {
            detailFragment.showDasicData();
        } else {
            Intent intent = new Intent(this, DetailActivity.class);
            startActivity(intent);

        }
    }

    private DetailFragment getDetailFragment() {
        FragmentManager fm = getFragmentManager();
        return (DetailFragment) fm.findFragmentById(R.id.detailFragment);
    }
}
