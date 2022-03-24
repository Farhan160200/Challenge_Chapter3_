package com.farhanfarkaann.challengechapter3antibug

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.farhanfarkaann.challengechapter3antibug.databinding.FragmentKesatuBinding
import com.farhanfarkaann.challengechapter3antibug.databinding.FragmentKetigaBinding


class FragmentKesatu : Fragment() {
    private var bind : FragmentKesatuBinding? = null
    private val binding get() = bind!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        bind = FragmentKesatuBinding.inflate(inflater,container,false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btnGts2.setOnClickListener {
            val mBundle = Bundle()
            it.findNavController().navigate(R.id.action_fragmentKesatu_to_fragmentKedua, mBundle)
        }

    }

    override fun onDestroyView() {
        super.onDestroyView()
        bind  = null
    }

}
