package com.sample.demo.dto

data class QuestionDTO(
        val thread: String, val choiceNo1: String, val choiceNo2: String,
        val choiceNo3: String, val choiceNo4: String, val correctAnswer: String
)