package com.sample.demo.service.question

import com.sample.demo.model.Question

interface QuestionService {
    fun createQuestion(question: Question) : Boolean
    fun getQuestion(questionID: Int) : Question
    fun removeQuestion(questionID: Int) : Boolean
}