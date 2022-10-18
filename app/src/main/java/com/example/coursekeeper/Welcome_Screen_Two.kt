package com.example.coursekeeper

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.AppCompatButton
import androidx.navigation.Navigation


class Welcome_Screen_Two : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_welcome__screen__two, container, false)
        val btn_getStarted = view.findViewById<AppCompatButton>(R.id.btn_getStarte)
        btn_getStarted.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_welcome_Screen_Two_to_registerPage)
        }


        return view
    }
}