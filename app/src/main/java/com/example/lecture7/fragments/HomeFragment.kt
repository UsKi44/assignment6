package com.example.lecture7.fragments

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.lecture7.R

class HomeFragment : Fragment(R.layout.fragment_home) {
    private lateinit var personNameEditText : EditText;
    private lateinit var button : Button

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        personNameEditText = view.findViewById(R.id.editTextTextPersonName)
        button = view.findViewById(R.id.button2)

        button.setOnClickListener{
            val text = personNameEditText.text.toString()
            val action = HomeFragmentDirections.actionHomeFragmentToDashboardFragment(text)

            findNavController().navigate(action)

        }
    }

}