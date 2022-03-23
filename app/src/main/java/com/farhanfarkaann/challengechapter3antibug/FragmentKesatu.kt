package com.farhanfarkaann.challengechapter3antibug

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.farhanfarkaann.challengechapter3antibug.databinding.FragmentKesatuBinding


class FragmentKesatu : Fragment() {
    private lateinit var binding: FragmentKesatuBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentKesatuBinding.inflate(layoutInflater)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btnGts2.setOnClickListener {
            val mBundle = Bundle()
            it.findNavController().navigate(R.id.action_fragmentKesatu_to_fragmentKedua, mBundle)
        }

    }
}
