package com.example.coursekeeper

import android.app.DatePickerDialog
import android.app.TimePickerDialog
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.EditText
import android.widget.TextView
import android.widget.TimePicker
import androidx.appcompat.widget.AppCompatButton
import com.example.coursekeeper.databinding.FragmentCoursesListBinding
import java.text.SimpleDateFormat
import java.util.*

class CoursesList : Fragment() {
    private lateinit var btn_showDatePicker: AppCompatButton
   private var _binding: FragmentCoursesListBinding? = null
    private val binding get() = _binding!!

    override fun onResume() {
        super.onResume()

        val daysOfTheWeek = resources.getStringArray(R.array.days)
        val arrayAdapter = ArrayAdapter(requireContext(), R.layout.drop_down_items, daysOfTheWeek)
        binding.autoTv.setAdapter(arrayAdapter)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentCoursesListBinding.inflate(inflater, container, false)

        val btn_save = binding.btnSaved
        btn_save.setOnClickListener {



        }


//        fun setDate(){
//        val myCalendar = Calendar.getInstance()
//        val datePicker = DatePickerDialog.OnDateSetListener { view, year, month, dayOfMonth ->
//            myCalendar.set(Calendar.YEAR, year)
//            myCalendar.set(Calendar.MONTH, month)
//            myCalendar.set(Calendar.DAY_OF_MONTH, dayOfMonth)
////            updatable(myCalendar)
//        }
//        DatePickerDialog(requireContext(), datePicker, myCalendar.get(Calendar.YEAR),
//            myCalendar.get(Calendar.MONTH), myCalendar.get(Calendar.DAY_OF_MONTH)).show()
//        }
        btn_showDatePicker = binding.startTimeEd
        btn_showDatePicker.setOnClickListener {
//           setDate()
            timeSetter()
        }

        return binding.root
    }

//    private fun updatable(myCalendar: Calendar) {
//        val myFormat = "dd-mm-yyyy"
//        val sdf = SimpleDateFormat(myFormat, Locale.ENGLISH)
//        btn_showDatePicker.setText(sdf.format(myCalendar.time))
//
//    }

    fun timeSetter(){
        val currentTime= Calendar.getInstance()
        val startHour = currentTime.get(Calendar.HOUR_OF_DAY)
        val startMinute = currentTime.get(Calendar.MINUTE)

        TimePickerDialog(requireContext(), TimePickerDialog.OnTimeSetListener { view, hourOfTheDay, minute ->
            btn_showDatePicker.setText("$hourOfTheDay:$minute")
        },startHour, startMinute, false).show()
    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}