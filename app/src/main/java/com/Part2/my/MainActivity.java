package com.Part2.my;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Message;
import android.text.BoringLayout;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {

    int quantity= 0;
    int votered , voteblue = 0;
    int toppings = 2;
    String message= "you voted RED";
    String message2= "you voted BLUE";
    int noOfEmails = 0;
    int noOfDraftEmails = 2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button go = (Button) findViewById(R.id.go_to);
        // basket ball Score (POINTS)

        go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent second = new Intent(MainActivity.this,basketball.class);
                startActivity(second);
            }
        });




    }


    /**

         * This method is called when the order button is clicked.

         */
// calculate the price @return total price
    public int calculatePrice(){
        int Total = quantity *10;

        return Total;



    }

        //add and subtract by number (1)
    public void plus (View view) {

            quantity = quantity + 1;//4


            display(quantity);

    }

    //minus
    public void minus (View view){
        if(quantity==1){
            return;
        }

            quantity = quantity - 1;
            display(quantity);

    }


    public void submitOrder(View view) {
        EditText name = (EditText) findViewById(R.id.your_name);
        String nametext = name.getText().toString();
        name.setTextSize(22);
        name.setTextColor(Color.LTGRAY);

        CheckBox cakecheckbox = (CheckBox) findViewById(R.id.cakeCheckBox);
        CheckBox snakescheckbox = (CheckBox) findViewById(R.id.snakesCheckBox);
        Boolean hascakepiece =  cakecheckbox.isChecked();
        Boolean hassnakes =  snakescheckbox.isChecked();
        Log.v("MainActivity","cakepiece" +hascakepiece);

       int Total = calculatePrice();


        displaymessage(createOrderSummary(Total,hascakepiece,hassnakes,nametext));


    }

    // Create ordercummarymethed

    public String createOrderSummary(int price,boolean cake, boolean snake, String nametext){
        String priceMessage ="Name  " +nametext +"\n Cups  "+ quantity +"\nWant Cake Piece  "+cake+"\nWant Snakes Piece  "+snake+"\nAmount is $" + price ;
        priceMessage = priceMessage +"\nThank you";
        return priceMessage;


    }

        /**

         * This method displays the given quantity value on the screen.

         */

        private void display(int number) {

            TextView quantityTextView = (TextView) findViewById(R.id.textinput);
            quantityTextView.setTextSize(22);
            quantityTextView.setTextColor(Color.BLUE);
            quantityTextView.setText("" + number);

        }


        //displaymessage   submitorder linked
    public void displaymessage(String message){
            TextView ordersummaryPriceTextView = findViewById(R.id.ordersummary_pricetext);
            ordersummaryPriceTextView.setText(message);
    }








// C o L O R competition


    public void redvote(int voting){
        TextView redvotetext=findViewById(R.id.redtext);
        redvotetext.setText(""+voting);
    }

    // blue vote
    public  void bluevote(int voting){
        TextView bluevotetext = findViewById(R.id.bluetext);
        bluevotetext.setText(""+voting);
    }
    // Status
    public void status(String voted){
            TextView statustext = findViewById(R.id.statusvoted);
            statustext.setText("DONE\n"+voted);

    }


    public void redbtn (View view){
            votered = votered + 1;

            redvote(votered);
            status(message);



    }

    public void bluebtn(View view ){
            voteblue = voteblue + 1;
            bluevote(voteblue);
            status(message2);




    }








}

