package com.farhanfarkaann.challengechapter3antibug

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.farhanfarkaann.challengechapter3antibug.databinding.FragmentKeempatBinding

class FragmentKeempat : Fragment() {
    private var bind : FragmentKeempatBinding? = null
    private val binding get() = bind!!
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
    ): View {
        bind = FragmentKeempatBinding.inflate(inflater,container,false)
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
                bundle.putString(NAMA, nama)
                bundle.putInt(KECEPATAN, kecepatan)
                bundle.putInt(WAKTU, waktu)
                bundle.putInt(GRAVITASI, gravitasi)
                bundle.putString(HASIL, hasil)

            findNavController().navigate(R.id.action_fragmentKeempat_to_fragmentKetiga, bundle,)
        }
    }
    override fun onDestroyView() {
        super.onDestroyView()
        bind  = null
    }

}
