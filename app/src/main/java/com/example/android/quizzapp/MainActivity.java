package com.example.android.quizzapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /**initializing question 1 questions and answers on onloading the app**/
        TextView question1 = (TextView) findViewById(R.id.question1);
        question1.setText(R.string.question1);

        RadioButton answerQst1a = (RadioButton) findViewById(R.id.answer_question_1a);
        answerQst1a.setText(R.string.answer_question_1a);

        RadioButton answerQst1b = (RadioButton) findViewById(R.id.answer_question_1b);
        answerQst1b.setText(R.string.answer_question_1b);

        RadioButton answerQst1c = (RadioButton) findViewById(R.id.answer_question_1c);
        answerQst1c.setText(R.string.answer_question_1c);
        /**End initializing question 1**/

        /**initializing question 2 questions and answers on onloading the app**/
        TextView question2 = (TextView) findViewById(R.id.question2);
        question2.setText(R.string.question2);

        RadioButton answerQst2a = (RadioButton) findViewById(R.id.answer_question_2a);
        answerQst2a.setText(R.string.answer_question_2a);

        RadioButton answerQst2b = (RadioButton) findViewById(R.id.answer_question_2b);
        answerQst2b.setText(R.string.answer_question_2b);

        RadioButton answerQst2c = (RadioButton) findViewById(R.id.answer_question_2c);
        answerQst2c.setText(R.string.answer_question_2c);
        /**End initializing question 2**/

        /**initializing question 3 questions and answers on onloading the app**/
        TextView question3 = (TextView) findViewById(R.id.question3);
        question3.setText(R.string.question3);

        RadioButton answerQst3a = (RadioButton) findViewById(R.id.answer_question_3a);
        answerQst3a.setText(R.string.answer_question_3a);

        RadioButton answerQst3b = (RadioButton) findViewById(R.id.answer_question_3b);
        answerQst3b.setText(R.string.answer_question_3b);

        RadioButton answerQst3c = (RadioButton) findViewById(R.id.answer_question_3c);
        answerQst3c.setText(R.string.answer_question_3c);
        /**End initializing question 3**/

        /**initializing question 4 questions and answers on onloading the app**/
        TextView question4 = (TextView) findViewById(R.id.question4);
        question4.setText(R.string.question4);

        RadioButton answerQst4a = (RadioButton) findViewById(R.id.answer_question_4a);
        answerQst4a.setText(R.string.answer_question_4a);

        RadioButton answerQst4b = (RadioButton) findViewById(R.id.answer_question_4b);
        answerQst4b.setText(R.string.answer_question_4b);

        RadioButton answerQst4c = (RadioButton) findViewById(R.id.answer_question_4c);
        answerQst4c.setText(R.string.answer_question_4c);
        /**End initializing question 4**/
    }

    private Character checkQuestion1 (){

        Character answerSelected = 'r'; //r for random nothing

        RadioButton answerQst1a = (RadioButton) findViewById(R.id.answer_question_1a);
        boolean isCheckedQstnA = answerQst1a.isChecked();

        RadioButton answerQst1b = (RadioButton) findViewById(R.id.answer_question_1b);
        boolean isCheckedQstnB = answerQst1b.isChecked();

        RadioButton answerQst1c = (RadioButton) findViewById(R.id.answer_question_1c);
        boolean isCheckedQstnC = answerQst1c.isChecked();

        if(isCheckedQstnA){
            answerSelected = 'A';
        }

        if(isCheckedQstnB){
            answerSelected = 'B';
        }

        if(isCheckedQstnC){
            answerSelected = 'C';
        }

        return answerSelected;
    }

    private Character checkQuestion2 (){

        Character answerSelected = 'r'; //r for random nothing

        RadioButton answerQst2a = (RadioButton) findViewById(R.id.answer_question_2a);
        boolean isCheckedQstnA = answerQst2a.isChecked();

        RadioButton answerQst2b = (RadioButton) findViewById(R.id.answer_question_2b);
        boolean isCheckedQstnB = answerQst2b.isChecked();

        RadioButton answerQst2c = (RadioButton) findViewById(R.id.answer_question_2c);
        boolean isCheckedQstnC = answerQst2c.isChecked();

        if(isCheckedQstnA){
            answerSelected = 'A';
        }

        if(isCheckedQstnB){
            answerSelected = 'B';
        }

        if(isCheckedQstnC){
            answerSelected = 'C';
        }

        return answerSelected;
    }

    private Character checkQuestion3 (){

        Character answerSelected = 'r'; //r for random nothing

        RadioButton answerQst3a = (RadioButton) findViewById(R.id.answer_question_3a);
        boolean isCheckedQstnA = answerQst3a.isChecked();

        RadioButton answerQst3b = (RadioButton) findViewById(R.id.answer_question_3b);
        boolean isCheckedQstnB = answerQst3b.isChecked();

        RadioButton answerQst3c = (RadioButton) findViewById(R.id.answer_question_3c);
        boolean isCheckedQstnC = answerQst3c.isChecked();

        if(isCheckedQstnA){
            answerSelected = 'A';
        }

        if(isCheckedQstnB){
            answerSelected = 'B';
        }

        if(isCheckedQstnC){
            answerSelected = 'C';
        }

        return answerSelected;
    }

    private Character checkQuestion4 (){

        Character answerSelected = 'r'; //r for random nothing

        RadioButton answerQst4a = (RadioButton) findViewById(R.id.answer_question_4a);
        boolean isCheckedQstnA = answerQst4a.isChecked();

        RadioButton answerQst4b = (RadioButton) findViewById(R.id.answer_question_4b);
        boolean isCheckedQstnB = answerQst4b.isChecked();

        RadioButton answerQst4c = (RadioButton) findViewById(R.id.answer_question_4c);
        boolean isCheckedQstnC = answerQst4c.isChecked();

        if(isCheckedQstnA){
            answerSelected = 'A';
        }

        if(isCheckedQstnB){
            answerSelected = 'B';
        }

        if(isCheckedQstnC){
            answerSelected = 'C';
        }

        return answerSelected;
    }

    private String createAnswerString (char question1SelectedOptn, char question2SelectedOptn, char question3SelectedOptn, char question4SelectedOptn){
        String responseMsg = "";

        if(question1SelectedOptn == 'A' && question2SelectedOptn == 'B' && question3SelectedOptn == 'A' && question4SelectedOptn == 'C'){
            responseMsg = "Congratulations, you answered all FOUR questions corrections";
        }
        else{
            responseMsg = "Whoops! you did not get all 4 questions right. TRY AGAIN";
        }

        return responseMsg;
    }

    public void SubmitAnswer (View view){
        String answerMsg;
        char qstn1, qstn2, qstn3, qstn4;

        qstn1 = checkQuestion1();
        qstn2 = checkQuestion2();
        qstn3 = checkQuestion3();
        qstn4 = checkQuestion4();

        if(qstn1 == 'r' && qstn2 == 'r' && qstn3 =='r' && qstn4 == 'r'){

            answerMsg = "Please select your Answers";

            Toast.makeText(this, answerMsg, Toast.LENGTH_LONG).show();
        }else {

            answerMsg = createAnswerString(qstn1, qstn2, qstn3, qstn4);

            Toast.makeText(this, answerMsg, Toast.LENGTH_LONG).show();
        }


    }
}
