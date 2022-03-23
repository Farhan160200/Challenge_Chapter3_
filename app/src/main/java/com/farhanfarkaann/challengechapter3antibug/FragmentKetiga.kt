package com.farhanfarkaann.challengechapter3antibug


import android.os.Bundle
import android.telephony.TelephonyCallback
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.navigation.fragment.navArgs
import androidx.navigation.findNavController
import com.farhanfarkaann.challengechapter3antibug.databinding.FragmentKetigaBinding


class FragmentKetiga : Fragment() {
    //    private lateinit var binding: FragmentKetigaBinding
    private var bind : FragmentKetigaBinding? = null
    private val binding get() = bind!!

    val args : FragmentKetigaArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        bind = FragmentKetigaBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val myName = args.myName

        val bundle = arguments
        val tKecepatan  = bundle?.getInt(FragmentKeempat.KECEPATAN)
        val tWaktuTempuh  = bundle?.getInt(FragmentKeempat.WAKTU)
        val tGravitasi  = bundle?.getInt(FragmentKeempat.GRAVITASI)
        val tHasil = bundle?.getString(FragmentKeempat.HASIL)
        val tNama = bundle?.getString(FragmentKeempat.NAMA)


        if(bundle != null && tHasil != null){
            binding.run{
                tvName.text = "Nama Anda : $tNama"
                tvKecepatan.text = "Kecepatan Anda : $tKecepatan Km/Jam"
                tvWaktuTempuh.text = "Waktu Tempuh Anda : $tWaktuTempuh detik"
                tvGravitasi.text = "Gravitasi Bumi :  $tGravitasi m/s2"
                tvHasil.text = "Hasil Ketinggian Adalah: $tHasil meter"
                btnGts4.visibility = View.GONE
            }

        }else {
                binding.tvName.text = myName
                binding.tvKecepatan.visibility = View.GONE
                binding.tvWaktuTempuh.visibility = View.GONE
                binding.tvGravitasi.visibility = View.GONE
                binding.tvHasil.visibility = View.GONE
        }

        binding.btnGts4.setOnClickListener {
            val sendingData = FragmentKetigaDirections.actionFragmentKetigaToFragmentKeempat(myName)
            it.findNavController().navigate(sendingData)
        }
    }
}
