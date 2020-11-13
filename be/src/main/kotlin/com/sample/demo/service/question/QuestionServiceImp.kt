package com.sample.demo.service.question

import com.sample.demo.model.Question

class QuestionServiceImp : QuestionService {
    override fun createQuestion(question: Question): Boolean {
        return false
    }

    override fun getQuestion(questionID: Int): Question {
        TODO("Not yet implemented")
    }

    override fun removeQuestion(questionID: Int): Boolean {
        TODO("Not yet implemented")
    }
}