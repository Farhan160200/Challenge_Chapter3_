package com.farhanfarkaann.challengechapter3antibug


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import com.farhanfarkaann.challengechapter3antibug.databinding.FragmentKeduaBinding
import com.farhanfarkaann.challengechapter3antibug.databinding.FragmentKetigaBinding

class FragmentKedua : Fragment() {

    private var bind : FragmentKeduaBinding? = null
    private val binding get() = bind!!


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        bind = FragmentKeduaBinding.inflate(inflater,container,false)
        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        binding.btnGts3.setOnClickListener {
            val inputName = FragmentKeduaDirections.actionFragmentKeduaToFragmentKetiga(binding.etName.text.toString())
            findNavController().navigate(inputName)
        }
    }
    override fun onDestroyView() {
        super.onDestroyView()
        bind  = null
    }

}
