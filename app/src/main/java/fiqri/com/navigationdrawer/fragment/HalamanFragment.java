package fiqri.com.navigationdrawer.fragment;


import android.nfc.Tag;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.lang.ref.SoftReference;

import fiqri.com.navigationdrawer.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class HalamanFragment extends Fragment {

    public static final String EXTRAS = "extras";
    static final String TAG = HalamanFragment.class.getSimpleName();

    public HalamanFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View v = inflater.inflate(R.layout.fragment_halaman, container, false);

        TextView tv = (TextView) v.findViewById(R.id.tv_halaman);
        String halaman = getArguments().getString(EXTRAS);
        tv.setText(halaman);

        Log.e(TAG, "onCreateView : Halaman Fragment" + halaman);

        return v;

    }
}
