package com.farhanfarkaann.challengechapter3antibug


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.farhanfarkaann.challengechapter3antibug.databinding.FragmentKeduaBinding

 class FragmentKedua : Fragment() {

    private var bind: FragmentKeduaBinding? = null
    private val binding get() = bind!!


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        bind = FragmentKeduaBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        binding.btnGts3.setOnClickListener {

            if (binding.etName.text.toString().isNotEmpty()) {
            } else {
                Toast.makeText(context, "Tidak Boloh Kosong", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            val inputName =
                FragmentKeduaDirections.actionFragmentKeduaToFragmentKetiga(binding.etName.text.toString())
            findNavController().navigate(inputName)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        bind  = null
    }

}
