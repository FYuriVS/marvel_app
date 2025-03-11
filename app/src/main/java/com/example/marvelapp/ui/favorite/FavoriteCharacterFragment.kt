package com.example.marvelapp.ui.favorite

import androidx.fragment.app.viewModels
import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.marvelapp.databinding.FragmentFavoriteCharacterBinding
import com.example.marvelapp.ui.base.BaseFragment

class FavoriteCharacterFragment : BaseFragment<FragmentFavoriteCharacterBinding, FavoriteCharacterViewModel>() {
    override val viewModel: FavoriteCharacterViewModel by viewModels()

    override fun getViewBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FragmentFavoriteCharacterBinding = FragmentFavoriteCharacterBinding.inflate(inflater, container, false)
}