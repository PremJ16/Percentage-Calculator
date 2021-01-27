package com.example.sgpa_calculator.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.sgpa_calculator.R;

import static com.example.sgpa_calculator.helpers.ConstantHelper.DOUBLE_DECIMAL;
import static com.example.sgpa_calculator.helpers.ConstantHelper.DOUBLE_TEN;
import static com.example.sgpa_calculator.helpers.ConstantHelper.YOUR_PERCENTAGE_IS;

public class DisplayFragment extends Fragment {
    //view
    private View view;

    //objects
    EditText etName;
    EditText etSgpa;
    Button btCalculate;
    TextView tvResult;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //return super.onCreateView(inflater, container, savedInstanceState);
        view = inflater.inflate(R.layout.fragment_display, container, false);
        initViews();
        return view;
    }

    private void initViews() {
        etName=(EditText) view.findViewById(R.id.f_display_et_name);
        etSgpa=(EditText) view.findViewById(R.id.f_display_et_sgpa);
        btCalculate=(Button) view.findViewById(R.id.f_display_bt_calculate);
        tvResult=(TextView) view.findViewById(R.id.f_display_tv_result);



        btCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name=etName.getText().toString();
                double sgpa=Double.parseDouble(etSgpa.getText().toString());
                Double result;
                result=(sgpa*DOUBLE_TEN)-DOUBLE_DECIMAL;
                tvResult.setText(name+" "+YOUR_PERCENTAGE_IS+" " +result.toString());
            }
        });






    }
}
