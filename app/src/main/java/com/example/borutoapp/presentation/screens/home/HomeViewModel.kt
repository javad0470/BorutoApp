package com.example.borutoapp.presentation.screens.home

import androidx.lifecycle.ViewModel
import com.example.borutoapp.domain.use_cases.UseCases
import javax.inject.Inject

class HomeViewModel @Inject constructor(
    useCases: UseCases,
) : ViewModel() {

    val getAllHeroes = useCases.getAllHeroesUseCase()



}