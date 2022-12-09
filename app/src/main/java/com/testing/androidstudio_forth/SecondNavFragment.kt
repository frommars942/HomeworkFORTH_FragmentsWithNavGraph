package com.testing.androidstudio_forth

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.testing.androidstudio_forth.databinding.FragmentSecondNavBinding

class SecondNavFragment : Fragment() {

    lateinit var binding: FragmentSecondNavBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSecondNavBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.buttonToFirst.setOnClickListener{
            Navigation.findNavController(binding.root).navigate(R.id.secon_nav_arrow)
        }
    }
}