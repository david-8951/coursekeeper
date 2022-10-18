package com.example.coursekeeper

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.coursekeeper.databinding.FragmentWelcomePageOneBinding


class WelcomePageOne : Fragment() {
    private var _binding: FragmentWelcomePageOneBinding? = null

    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentWelcomePageOneBinding.inflate(inflater, container, false)
        binding.btnContinue.setOnClickListener {
            view?.let { it1 -> Navigation.findNavController(it1).navigate(R.id.action_welcomePageOne_to_welcome_Screen_Two) }
        }
       return binding.root
    }
}