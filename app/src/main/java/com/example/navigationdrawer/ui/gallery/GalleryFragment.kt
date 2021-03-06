package com.example.navigationdrawer.ui.gallery

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.navigationdrawer.R
import com.example.navigationdrawer.databinding.FragmentGalleryBinding
import com.example.navigationdrawer.databinding.FragmentHomeBinding
import com.example.navigationdrawer.ui.home.HomeViewModel

class GalleryFragment : Fragment() {
    //cambiar esto
    private var _binding: FragmentGalleryBinding? = null

    private val binding get() = _binding!!

    //cambiar esto
    private lateinit var galleryViewModel: GalleryViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        //cambiar esto
        galleryViewModel =
            ViewModelProvider(this).get(GalleryViewModel::class.java)
        _binding = FragmentGalleryBinding.inflate(layoutInflater,container,false)

        //cambiar esto
        galleryViewModel.text.observe(viewLifecycleOwner, Observer {
            binding.textGallery.text = it
        })
        val view = binding.root
        return view
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}