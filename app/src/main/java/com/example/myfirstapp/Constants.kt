package com.example.myfirstapp

object Constants {

    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_question"
    const val CORRECT_ANSWERS: String = "correct_answers"

    fun getQuestions(): ArrayList<Question>{
        val questionList = ArrayList<Question>()

        val que1 = Question(
                1,
                "What country does this flag belong to?",
                R.drawable.ic_flag_of_argentina,
                "Argentina",
                "Australia",
                "Armenia",
                "Austria",
                1
        )
        questionList.add(que1)

        val que2 = Question(
                2,
                "What country does this flag belong to?",
                R.drawable.ic_flag_of_brazil,
                "Argentina",
                "Brazil",
                "Armenia",
                "Austria",
                2
        )
        questionList.add(que2)

        val que3 = Question(
                3,
                "What country does this flag belong to?",
                R.drawable.ic_flag_of_denmark,
                "Argentina",
                "Brazil",
                "Armenia",
                "Denmark",
                4
        )
        questionList.add(que3)

        val que4 = Question(
                4,
                "What country does this flag belong to?",
                R.drawable.ic_flag_of_new_zealand,
                "New Zealand",
                "Brazil",
                "Armenia",
                "Austria",
                1
        )
        questionList.add(que4)

        return questionList
    }

}