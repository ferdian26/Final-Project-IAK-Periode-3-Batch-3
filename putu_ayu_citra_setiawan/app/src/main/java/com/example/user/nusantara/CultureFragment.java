package com.example.user.nusantara;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link CultureFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link CultureFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class CultureFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;


    //--- init xml element ---//
        private RecyclerView rv_list_event,rv_list_craftmen;

        private MenuActivityAdapter event_adapter;
        private AdapterCraftsmen craftsmen_adapter;

        private List<DataEvent> data_event;
        private List<DataCraftsmen> data_craftsmen;

        private LinearLayoutManager HorizontalLayout_event;




    public CultureFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment CultureFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static CultureFragment newInstance(String param1, String param2) {
        CultureFragment fragment = new CultureFragment();
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
        View view = inflater.inflate(R.layout.fragment_culture, container, false);

        data_event = new ArrayList<>();

        rv_list_event = (RecyclerView) view.findViewById(R.id.rv_menu_event);
        event_adapter = new MenuActivityAdapter(data_event);
        rv_list_event.setLayoutManager(new LinearLayoutManager(view.getContext()));
        rv_list_event.setAdapter(event_adapter);

        HorizontalLayout_event = new LinearLayoutManager(view.getContext(), LinearLayoutManager.HORIZONTAL, false);
        rv_list_event.setLayoutManager(HorizontalLayout_event);

        // *** DATA CULTURE *** //
        data_event.add(new DataEvent("c1","Geret Pandan","Tenganan - Bali",getResources().getIdentifier("com.example.user.nusantara:drawable/c1",null,null)));
        data_event.add(new DataEvent("c2","Pasola","NTT",getResources().getIdentifier("com.example.user.nusantara:drawable/c2",null,null)));
        data_event.add(new DataEvent("c3","Tabuik","Sumatra Barat",getResources().getIdentifier("com.example.user.nusantara:drawable/c3",null,null)));
        data_event.add(new DataEvent("c4","Lompat Batu","Nias - Sumatra",getResources().getIdentifier("com.example.user.nusantara:drawable/c4",null,null)));



        data_craftsmen = new ArrayList<>();

        rv_list_craftmen = (RecyclerView) view.findViewById(R.id.rv_menu_craftsmen);
        craftsmen_adapter = new AdapterCraftsmen(data_craftsmen);
        rv_list_craftmen.setLayoutManager(new LinearLayoutManager(view.getContext()));
        rv_list_craftmen.setAdapter(craftsmen_adapter);

        // *** DATA HAND CRAFTS *** //
        data_craftsmen.add(new DataCraftsmen("cr1","Kerajinan Patung Pak Toklas","Patung, Kerajinan ukir-ukiran dari kayu ","Br Peringsada, Gianyar, Bali",getResources().getIdentifier("com.example.user.nusantara:drawable/cr1",null,null)));
        data_craftsmen.add(new DataCraftsmen("cr2","Sentra Pengrajin Batik Tulis Giriloyo","Batik dan Perlengkapan","Kec. Imogiri - Kab. Bantul Yogyakarta",getResources().getIdentifier("com.example.user.nusantara:drawable/cr2",null,null)));
        data_craftsmen.add(new DataCraftsmen("cr3","Ibu Maxima Safe","Kain Tenun Ikat","Desa Fafinesu, NTT",getResources().getIdentifier("com.example.user.nusantara:drawable/cr3",null,null)));
        data_craftsmen.add(new DataCraftsmen("cr4","Rotan Mulyono","Kerajinan anyaman rotan khas Kalimantan","Palangkaraya - Kalimantan Tengah",getResources().getIdentifier("com.example.user.nusantara:drawable/cr4",null,null)));

        return view;
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

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
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
