package com.example.marvelapp.ui.search

import androidx.fragment.app.viewModels
import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.marvelapp.databinding.FragmentSearchCharacterBinding
import com.example.marvelapp.ui.base.BaseFragment

class SearchCharacterFragment : BaseFragment<FragmentSearchCharacterBinding, SearchCharacterViewModel>() {
    override val viewModel: SearchCharacterViewModel by viewModels()

    override fun getViewBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FragmentSearchCharacterBinding = FragmentSearchCharacterBinding.inflate(inflater, container, false)


}