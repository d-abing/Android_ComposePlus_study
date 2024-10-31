package com.example.chapter3

import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import com.example.chapter3.features.common.viewmodel.ThemeViewModel
import dagger.hilt.android.AndroidEntryPoint

open class BaseFragment : Fragment() {
    protected val themeViewModel: ThemeViewModel by activityViewModels()
}
