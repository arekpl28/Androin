package sdaacademy.pl.layout;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


public class MasterFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        final MainActivity activity = (MainActivity) getActivity();
        final View view = inflater.inflate(R.layout.master_layout, container);
        Button basicDataButton = (Button) view.findViewById(R.id.basicDataButton);
        Button detailButon = (Button) view.findViewById(R.id.detailButton);
        basicDataButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                activity.showBasicData();
            }
        });
        detailButon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                activity.showDetailData();

            }
        });
        return view;
    }
}
