package id.yusufrizalh.fragmentandroid;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class ReceiverFragment extends Fragment {
    // global variable
    TextView txt_receiver;

    public ReceiverFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_receiver, container, false);
        txt_receiver = view.findViewById(R.id.txt_receiver);

        return view;
    }

    // untuk menuliskan message dari sender ke receiver kedalam text view nya
    public void messageReceived(String message){
        txt_receiver.setText(message);
    }
}