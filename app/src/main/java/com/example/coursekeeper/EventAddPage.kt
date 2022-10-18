package com.example.coursekeeper

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AutoCompleteTextView
import androidx.appcompat.widget.AppCompatButton
import androidx.navigation.Navigation
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.coursekeeper.databinding.FragmentEventAddPageBinding
import com.google.android.material.textfield.TextInputEditText

class EventAddPage : Fragment() {

    private  var _binding: FragmentEventAddPageBinding? = null
    private val binding get() = _binding
    private lateinit var recyclerView: RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentEventAddPageBinding.inflate(inflater, container, false)

        binding?.floatingBtn?.setOnClickListener {

            view?.let { it1 ->
                Navigation.findNavController(it1).navigate(R.id.action_eventAddPage_to_coursesList)
            }
        }
        
            return binding?.root
    }

}