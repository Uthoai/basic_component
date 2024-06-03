package com.example.component

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.component.databinding.BottomSheetLayoutBinding
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

class MyBottomSheetDialogFragment: BottomSheetDialogFragment() {
    private lateinit var binding: BottomSheetLayoutBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = BottomSheetLayoutBinding.inflate(layoutInflater,container,false)
        
        return binding.root
    }
}