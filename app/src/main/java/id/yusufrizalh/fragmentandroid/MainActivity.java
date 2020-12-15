package id.yusufrizalh.fragmentandroid;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity
        implements SenderFragment.SenderFragmentListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void messageFromSenderFragment(String message) {
        // tugas activity sebagai fragment manager / jembatan
        FragmentManager manager = getSupportFragmentManager();
        ReceiverFragment receiverFragment = (ReceiverFragment) manager
                .findFragmentById(R.id.fragment_receiver);
        receiverFragment.messageReceived(message);
    }
}