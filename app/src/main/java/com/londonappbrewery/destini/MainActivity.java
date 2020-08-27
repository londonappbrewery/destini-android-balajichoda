package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    private TextView mStorytextview;
    private Button TopButton;
    private Button BottomButton;
    private int mStoryIndex = 1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        mStorytextview = findViewById(R.id.storyTextView);
        TopButton = findViewById(R.id.buttonTop);
        BottomButton = findViewById(R.id.buttonBottom);



        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        TopButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mStoryIndex==1) {
                    mStorytextview.setText(R.string.T3_Story);
                    TopButton.setText(R.string.T3_Ans1);
                    BottomButton.setText(R.string.T3_Ans2);
                    mStoryIndex = 2;
                }else if (mStoryIndex==2){
                    mStorytextview.setText(R.string.T6_End);
                    TopButton.setVisibility(View.GONE);
                    BottomButton.setVisibility(View.GONE);

                }else if (mStoryIndex==3){
                    mStorytextview.setText(R.string.T3_Story);
                    TopButton.setText(R.string.T3_Ans1);
                    BottomButton.setText(R.string.T3_Ans2);
                    mStoryIndex=4;

                }else if (mStoryIndex==4){
                    mStorytextview.setText(R.string.T6_End);
                    TopButton.setVisibility(View.GONE);
                    BottomButton.setVisibility(View.GONE);
                }
            }
        });




        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        BottomButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mStoryIndex==1) {
                    mStorytextview.setText(R.string.T2_Story);
                    TopButton.setText(R.string.T2_Ans1);
                    BottomButton.setText(R.string.T2_Ans2);
                    mStoryIndex = 3;


                }else if (mStoryIndex==3){
                    mStorytextview.setText(R.string.T4_End);
                    TopButton.setVisibility(View.GONE);
                    BottomButton.setVisibility(View.GONE);

                }else if (mStoryIndex==2){
                    mStorytextview.setText(R.string.T5_End);
                    TopButton.setVisibility(View.GONE);
                    BottomButton.setVisibility(View.GONE);
                }else if (mStoryIndex==4){
                    mStorytextview.setText(R.string.T5_End);
                    TopButton.setVisibility(View.GONE);
                    BottomButton.setVisibility(View.GONE);
                }




                }
                
            });



}
}
