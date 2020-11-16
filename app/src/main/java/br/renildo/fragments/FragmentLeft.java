package br.renildo.fragments;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class FragmentLeft extends Fragment{
    Comunicacao cListener;

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        if (!(context instanceof Comunicacao)){
            throw new RuntimeException("Interface não implementada");
        }
        cListener = (Comunicacao) context;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_left, container, false);
        Button button = view.findViewById(R.id.btnEnviar);
        final TextView textView = null;
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cListener != null) {

                    cListener.onComunication("ESSA INFORMAÇÂO VEIO DO FRAGMENTO ESQUERDO");
                }
            }
        });
        return view;
    }


}
