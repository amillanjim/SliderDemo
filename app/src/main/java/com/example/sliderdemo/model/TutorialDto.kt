package com.example.sliderdemo.model

data class AnimationDto(
    val topActionLabel: String,
    val lottieResource: String,
    val titleLabel: String,
    val descriptionLabel: String,
    val mainActionButtonLabel: String,
    val leftNavButtonLabel: String,
    val rightNavButtonLabel: String,
    val dotIndicatorColor: Long,
    val backgroundColor: Long
)

val mocModel = listOf(
    AnimationDto(
        topActionLabel = "Cerrar",
        lottieResource = "https://assets10.lottiefiles.com/packages/lf20_MSznfvMmqi.json",
        titleLabel = "Refiere a un amigo",
        descriptionLabel = "Refiere a un amigo y gana puntos por hacerlo, es rápido y sencillo.",
        mainActionButtonLabel = "Referir",
        leftNavButtonLabel = "Anterior",
        rightNavButtonLabel = "Siguiente",
        dotIndicatorColor = 0XFF7718D7,
        backgroundColor = 0xFF6DE7EC
    ),
    AnimationDto(
        topActionLabel = "Cerrar",
        lottieResource ="https://assets4.lottiefiles.com/packages/lf20_ZXvjFxGCy6.json",
        titleLabel = "Has crecer tu Stori",
        descriptionLabel = "Incrementa tu línea de crédito haciendo un buen uso de tu tarjeta",
        mainActionButtonLabel = "Saber más",
        leftNavButtonLabel = "Anterior",
        rightNavButtonLabel = "Siguiente",
        dotIndicatorColor = 0XFF7718D7,
        backgroundColor = 0xFFFD547C
    ),
    AnimationDto(
        topActionLabel = "Cerrar",
        lottieResource ="https://assets5.lottiefiles.com/packages/lf20_r2dGrCFXsF.json",
        titleLabel = "Compra en donde quieras",
        descriptionLabel = "Puedes hacer compras en cualquier local que acepte mastercard",
        mainActionButtonLabel = "Ir a comprar",
        leftNavButtonLabel = "Anterior",
        rightNavButtonLabel = "Siguiente",
        dotIndicatorColor = 0XFF7718D7,
        backgroundColor = 0xFFFD547C
    ),
    AnimationDto(
        topActionLabel = "Cerrar",
        lottieResource = "https://assets10.lottiefiles.com/packages/lf20_F49hQkvO3U.json",
        titleLabel = "Paga a tiempo",
        descriptionLabel = "No olvides pagar antes de tu fecha límite de pago, esto hará un buen hisotrial",
        mainActionButtonLabel = "Pagar mi Stori",
        leftNavButtonLabel = "Anterior",
        rightNavButtonLabel = "Siguiente",
        dotIndicatorColor = 0XFF7718D7,
        backgroundColor = 0XFFFFB07D
    ),
    AnimationDto(
        topActionLabel = "Cerrar",
        lottieResource = "https://assets2.lottiefiles.com/packages/lf20_hAvF1pS1pb.json",
        titleLabel = "Promiciones exclusivas",
        descriptionLabel = "Ten acceso a promociones que solo encontraras con tu tarjeta Stori",
        mainActionButtonLabel = "Ver promociones",
        leftNavButtonLabel = "Anterior",
        rightNavButtonLabel = "Siguiente",
        dotIndicatorColor = 0XFF7718D7,
        backgroundColor = 0xFF6DE7EC
    )
)
