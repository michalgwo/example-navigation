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
import com.example.examplenavigation.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {
    private lateinit var binding: FragmentHomeBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_home, container, false)

        binding.submitName.setOnClickListener {
            if (binding.name.text.isNotBlank()) {
                val bundle = bundleOf("name" to binding.name.text.toString())
                it.findNavController().navigate(R.id.action_homeFragment_to_secondFragment, bundle)
            } else {
                Toast.makeText(activity, "Enter name", Toast.LENGTH_SHORT).show()
            }
        }


        return binding.root
    }
}