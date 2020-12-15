package id.yusufrizalh.fragmentandroid;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class SenderFragment extends Fragment {

    SenderFragmentListener myListener;

    public interface SenderFragmentListener {
        void messageFromSenderFragment(String message);
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        myListener = (SenderFragmentListener) context;
    }

    @Override
    public void onDetach() {
        super.onDetach();
        myListener = null;
    }

    public SenderFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_sender, container, false);
        Button btn_sender = view.findViewById(R.id.btn_sender);
        btn_sender.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // perintah untuk mengirim data dari fragment sender ke fragment receiver
                myListener.messageFromSenderFragment("Halo, saya fragment sender...");
            }
        });
        return view;
    }
}