package com.studio.dynamica.icgroup.StartFragments;


import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.studio.dynamica.icgroup.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class StartTextFragment extends Fragment {
    TextView tx;

    public StartTextFragment() {
        // Required empty public constructor
    }
    @Override
    public View onCreateView( LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_start_text, container, false);
        tx=(TextView) view.findViewById(R.id.startInfo);
        tx.setText(getArguments().getString("startext"));
        tx.setTypeface(Typeface.createFromAsset(getActivity().getAssets(),"fonts/AvenirNext-Medium.ttf"));
        return view;
    }
    public void setText(String s){
        tx.setText(s);
    }
}
