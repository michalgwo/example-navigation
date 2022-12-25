package com.example.examplenavigation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.os.bundleOf
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.example.examplenavigation.databinding.FragmentSecondBinding

class SecondFragment : Fragment() {
    private lateinit var binding: FragmentSecondBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_second, container, false)

        val name = arguments?.getString("name")

        binding.submitAge.setOnClickListener {
            if (binding.age.text.isNotBlank()) {
                val bundle = bundleOf(
                    "name" to name,
                    "age" to binding.age.text.toString()
                )

                it.findNavController().navigate(R.id.action_secondFragment_to_lastFragment, bundle)
            } else {
                Toast.makeText(activity, "Enter your age", Toast.LENGTH_SHORT).show()
            }
        }

        return binding.root
    }
}