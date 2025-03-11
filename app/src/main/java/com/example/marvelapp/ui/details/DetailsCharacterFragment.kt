package com.example.marvelapp.ui.details

import androidx.fragment.app.viewModels
import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.marvelapp.databinding.FragmentDetailsCharacterBinding
import com.example.marvelapp.ui.base.BaseFragment

class DetailsCharacterFragment : BaseFragment<FragmentDetailsCharacterBinding, DetailsCharacterViewModel>() {
    override val viewModel: DetailsCharacterViewModel by viewModels()

    override fun getViewBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FragmentDetailsCharacterBinding = FragmentDetailsCharacterBinding.inflate(inflater, container, false)
}