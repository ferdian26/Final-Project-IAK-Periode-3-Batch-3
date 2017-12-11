package com.example.user.nusantara;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link LocalBrandFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link LocalBrandFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class LocalBrandFragment extends Fragment {
    // TODOs: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODOs: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    //--- init xml element ---//
    private RecyclerView rv_list_localbrand;
    private AdapterLocalBrand localbrand_adapter;
    private List<DataLocalBrand> data_localbrand;
    private GridLayoutManager GridLayout_brandlocal;

    public LocalBrandFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment LocalBrandFragment.
     */
    // TODOs: Rename and change types and number of parameters
    public static LocalBrandFragment newInstance(String param1, String param2) {
        LocalBrandFragment fragment = new LocalBrandFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_local_brand, container, false);

        // todo 6: sebaiknya setup dan load data di pisahkan agar lebih rapi
        setupEnv(view);
        setupList(view);

        loadDataDummy();

        return view;
    }

    // todo 7: method ini tidak digunakan, sebaiknya di non-aktifkan
    // TODOs: Rename method, update argument and hook method into UI event
    /*public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }*/

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODOs: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }

    private void setupEnv(View view) {
        data_localbrand = new ArrayList<>();
        rv_list_localbrand = (RecyclerView) view.findViewById(R.id.rv_menu_localbrand);
    }

    private void setupList(View view) {
        localbrand_adapter = new AdapterLocalBrand(data_localbrand);
        rv_list_localbrand.setAdapter(localbrand_adapter);
        rv_list_localbrand.setLayoutManager(new GridLayoutManager(view.getContext(), 2));
    }

    private void loadDataDummy() {
        //** DATA LOCAL BRAND **//
        data_localbrand.add(new DataLocalBrand("lb1", "Manikan", "Bali", getResources().getIdentifier("com.example.user.nusantara:drawable/lb1", null, null)));
        data_localbrand.add(new DataLocalBrand("lb2", "Sejauh Mata Memandang", "Tanggerang", getResources().getIdentifier("com.example.user.nusantara:drawable/lb2", null, null)));
        data_localbrand.add(new DataLocalBrand("lb3", "Lekat", "Jakarta", getResources().getIdentifier("com.example.user.nusantara:drawable/lb3", null, null)));
        data_localbrand.add(new DataLocalBrand("lb4", "Ageman", "Jakarta", getResources().getIdentifier("com.example.user.nusantara:drawable/lb4", null, null)));
    }
}
