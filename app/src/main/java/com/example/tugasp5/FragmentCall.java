package com.example.tugasp5;
import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.ActivityCompat;
import androidx.fragment.app.Fragment;

public class FragmentCall extends Fragment {

    View v;
    EditText editText;

    public FragmentCall() {

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.call_fragment,container,false);
        editText = v.findViewById(R.id.enter_number);
        return v;
    }

    public void phoneCall(View v){
        String number = editText.getText().toString();
        Intent telepon = new Intent(Intent.ACTION_CALL);
        telepon.setData(Uri.parse("tel:" + number));
        if (ActivityCompat.checkSelfPermission(getContext(), Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED){
            return;
        }
        startActivity(telepon);
    }


}
