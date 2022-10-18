package com.example.coursekeeper

import android.os.Bundle
import android.os.Handler
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation


class SplashScreen : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_splash_scren, container, false)
        Handler().postDelayed({
            Navigation.findNavController(view).navigate(R.id.action_splashScren_to_welcomePageOne)
        },3000)
        return view
    }
}