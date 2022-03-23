package com.farhanfarkaann.challengechapter3antibug


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import com.farhanfarkaann.challengechapter3antibug.databinding.FragmentKeduaBinding

class FragmentKedua : Fragment() {
    private lateinit var binding : FragmentKeduaBinding


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentKeduaBinding.inflate(layoutInflater)
        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        binding.btnGts3.setOnClickListener {
            val inputName = FragmentKeduaDirections.actionFragmentKeduaToFragmentKetiga()

//            val inputName = FragmentKeduaDirections.actionFragmentKeduaToFragmentKetiga()
            findNavController().navigate(inputName)
        }
    }
}
