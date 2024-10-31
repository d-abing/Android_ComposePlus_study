package com.example.chapter3.features.common.viewmodel

import androidx.compose.ui.graphics.Color
import androidx.lifecycle.ViewModel
import com.example.chapter3.ui.config.ComponentConfig
import com.example.chapter3.ui.config.DefaultComponentConfig
import com.example.chapter3.ui.theme.color.ColorSet
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import javax.inject.Inject

@HiltViewModel
class ThemeViewModel @Inject constructor() : ViewModel() {
    private val _themeState: MutableStateFlow<ComponentConfig> =
        MutableStateFlow(DefaultComponentConfig.RED_THEME)
    val themeState: StateFlow<ComponentConfig>
        get() = _themeState

    private val _nextColorState: MutableStateFlow<Color> =
        MutableStateFlow(DefaultComponentConfig.BLUE_THEME.colors.LightColors.primary)
    val nextColorState: StateFlow<Color>
        get() = _nextColorState

    fun toggleColorSet() {
        if (themeState.value.colors is ColorSet.Red) {
            _themeState.value = DefaultComponentConfig.BLUE_THEME
            _nextColorState.value = ColorSet.Red.LightColors.primary
        } else {
            _themeState.value = DefaultComponentConfig.RED_THEME
            _nextColorState.value = ColorSet.Blue.LightColors.primary
        }
    }

}