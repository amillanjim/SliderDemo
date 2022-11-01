package com.example.sliderdemo

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.WindowManager
import androidx.fragment.app.DialogFragment
import androidx.viewpager2.widget.ViewPager2
import com.example.sliderdemo.jetpackCompose.components.SliderIndicatorComponent
import com.example.sliderdemo.jetpackCompose.components.StoriTextButton
import com.example.sliderdemo.model.mocModel
import com.example.sliderdemo.theme.sp_14

class TutorialDialogFragment: DialogFragment() {

    private lateinit var tutorialAdapter: TutorialAdapter
    private lateinit var leftNavLabel: StoriTextButton
    private lateinit var rightNavLabel: StoriTextButton
    private lateinit var sliderComponent: SliderIndicatorComponent
    private var currentPosition: Int = 0

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_dialog_tutorial, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        leftNavLabel = view.findViewById(R.id.leftNavButton)
        rightNavLabel = view.findViewById(R.id.rightNavButton)
        sliderComponent = view.findViewById(R.id.sliderIndicator)
        tutorialAdapter = TutorialAdapter(mocModel)

        val tutorialViewPager = view.findViewById<ViewPager2>(R.id.tutorialViewPager)
        tutorialViewPager.adapter = tutorialAdapter

        tutorialViewPager.registerOnPageChangeCallback(object: ViewPager2.OnPageChangeCallback(){
            override fun onPageSelected(position: Int) {
                super.onPageSelected(position)
                currentPosition = position
                currentTutorialIndicator(position)
            }
        })

        leftNavLabel.apply {
            textButtonContent = mocModel[0].leftNavButtonLabel
            fontSize = sp_14
            onClick = {
                if (currentPosition > 0) {
                    currentPosition -= 1
                    tutorialViewPager.currentItem = currentPosition
                }
            }
        }

        rightNavLabel.apply {
            textButtonContent = mocModel[0].rightNavButtonLabel
            fontSize = sp_14
            onClick = {
                if (currentPosition < mocModel.size) {
                    currentPosition += 1
                    tutorialViewPager.currentItem = currentPosition
                }
            }
        }

        currentTutorialIndicator(0)
    }

    override fun onStart() {
        super.onStart()
        dialog?.window?.setLayout(
            WindowManager.LayoutParams.MATCH_PARENT,
            WindowManager.LayoutParams.MATCH_PARENT)
    }

    private fun currentTutorialIndicator(index: Int){
        sliderComponent.apply {
            totalPages = mocModel.size
            currentPage = index
        }
    }
}