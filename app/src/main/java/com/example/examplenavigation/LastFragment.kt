package com.example.examplenavigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.examplenavigation.databinding.FragmentLastBinding

class LastFragment : Fragment() {
    private lateinit var binding: FragmentLastBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_last, container, false)

        val name = arguments?.getString("name")
        val age = arguments?.getString("age")

        binding.tvName.text = getString(R.string.your_name, name)
        binding.tvAge.text = getString(R.string.your_age, age)

        return binding.root
    }
}