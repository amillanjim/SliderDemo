package com.example.sliderdemo

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import com.example.sliderdemo.jetpackCompose.components.StoriOutlinedButtonComponent
import com.example.sliderdemo.jetpackCompose.components.TextComponent
import com.example.sliderdemo.jetpackCompose.components.TitleTextComponent
import com.example.sliderdemo.model.AnimationDto
import com.example.sliderdemo.theme.sp_16
import com.example.sliderdemo.ui.LottieComponent

class TutorialAdapter(private val tutorialPages: List<AnimationDto>):
    RecyclerView.Adapter<TutorialAdapter.TutorialViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TutorialViewHolder =
        TutorialViewHolder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.item_tutorial_component, parent, false)
        )

    override fun onBindViewHolder(holder: TutorialViewHolder, position: Int) =
        holder.setTutorialData(tutorialPages[position])


    override fun getItemCount(): Int = tutorialPages.size

    class TutorialViewHolder (itemView: View): RecyclerView.ViewHolder(itemView) {

        private var itemContainer: ConstraintLayout
        private var textTitle: TitleTextComponent
        private val textDescription: TextComponent
        private var imageResource: LottieComponent
        private var mainTutorialButton: StoriOutlinedButtonComponent

        init {
            itemContainer = itemView.findViewById(R.id.itemTutorial)
            textTitle = itemView.findViewById(R.id.tutorialTitleText)
            textDescription = itemView.findViewById(R.id.tutorialDescriptionText)
            imageResource = itemView.findViewById(R.id.tutorialLottieImage)
            mainTutorialButton = itemView.findViewById(R.id.mainTutorialButton)
        }

        fun setTutorialData(tutorialData: AnimationDto) {
            textTitle.apply { titleContent =  tutorialData.titleLabel }
            textDescription.apply {
                textContent  = tutorialData.descriptionLabel
                fontSize = sp_16
                maxLines = 2
            }
            imageResource.apply { imageSource = tutorialData.lottieResource }
            mainTutorialButton.apply {
                buttonContent = tutorialData.mainActionButtonLabel
                clickAction = { Toast.makeText(context, tutorialData.titleLabel, Toast.LENGTH_SHORT).show()}
            }
        }
    }
}
