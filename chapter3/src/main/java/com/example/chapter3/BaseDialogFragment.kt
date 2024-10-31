package com.example.chapter3

import androidx.fragment.app.DialogFragment
import androidx.fragment.app.activityViewModels
import com.example.chapter3.features.common.viewmodel.ThemeViewModel
import dagger.hilt.android.AndroidEntryPoint

open class BaseDialogFragment : DialogFragment() {
    protected val themeViewModel: ThemeViewModel by activityViewModels()
}