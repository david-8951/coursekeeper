package com.example.coursekeeper

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.coursekeeper.databinding.FragmentLoginScreenBinding

class LoginScreen : Fragment() {
    private var _binding: FragmentLoginScreenBinding? = null
    private val binding get() = _binding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentLoginScreenBinding.inflate(inflater, container, false)
        binding?.btnLoging?.setOnClickListener {
            view?.let { it1 -> Navigation.findNavController(it1).navigate(R.id.action_loginScreen_to_eventAddPage) }
        }
        return binding?.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}