package sdaacademy.pl.layout;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class DetailFragment extends Fragment {

    private TextView titleTextView;
    private TextView detailTextView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.detail_layout, container);
        titleTextView = (TextView) view.findViewById(R.id.titleTextView);
        detailTextView = (TextView) view.findViewById(R.id.detailTextView);

        return view;
    }

    public void showBasicData() {
        titleTextView.setText("Dane podstawowe");
        detailTextView.setText("Arek Plumbaum");
    }
    public void showDetailData(){
        titleTextView.setText("Szczegóły");
        detailTextView.setText("Lat 26, wzrost 183");
    }
}
