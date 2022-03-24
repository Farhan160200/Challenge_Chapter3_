package com.farhanfarkaann.challengechapter3antibug

import android.os.Bundle
import android.provider.ContactsContract
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.os.bundleOf
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.farhanfarkaann.challengechapter3antibug.databinding.FragmentKeempatBinding

class FragmentKeempat : Fragment() {
    private lateinit var binding: FragmentKeempatBinding

    val args : FragmentKeempatArgs by navArgs()



    companion object {
        const val GRAVITASI= "GRAVITASI"
        const val KECEPATAN = "KECEPATAN"
        const val WAKTU = "WAKTU"
        const val NAMA  = "NAMA"
        const val HASIL = "HASIL"
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentKeempatBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnGts5.setOnClickListener {

            val nama  = args.myNameNameName
            val kecepatan = binding.etKecepatan.text.toString().toInt()
            val waktu = binding.etWaktuTempuh.text.toString().toInt()
            val gravitasi = binding.etGravitasi.text.toString().toInt()
            val hasil = ((kecepatan* waktu) - (0.5*gravitasi*waktu*waktu)).toString()


            val bundle = Bundle()
            if(bundle != null) {

                bundle.putString(NAMA, nama)
                bundle.putInt(KECEPATAN, kecepatan)
                bundle.putInt(WAKTU, waktu)
                bundle.putInt(GRAVITASI, gravitasi)
                bundle.putString(HASIL, hasil)
            }
            else{
                Toast.makeText(requireContext(), "Tidak boleh Kosong", Toast.LENGTH_SHORT).show()
            }

            findNavController().navigate(R.id.action_fragmentKeempat_to_fragmentKetiga, bundle,)
        }
    }
}
