package com.example.saransk.data

import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.runtime.asIntState
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class PagerViewModel : ViewModel() {
    private val _currentPage = MutableStateFlow(0)
    val pageState : StateFlow<Int> = _currentPage.asStateFlow()
    fun onPageChanged(page: Int) {
        _currentPage.value = page
    }
}