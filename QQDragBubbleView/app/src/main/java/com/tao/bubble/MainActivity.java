package com.tao.bubble;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.tao.dragbubble.DragBubbleView;

public class MainActivity extends AppCompatActivity {

    private DragBubbleView mDragBubbleView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button reCreateBtn = (Button) findViewById(R.id.reCreateBtn);
        reCreateBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mDragBubbleView.reCreate();
            }
        });
        mDragBubbleView = (DragBubbleView) findViewById(R.id.dragBubbleView);
        mDragBubbleView.setText("99+");
        mDragBubbleView.setOnBubbleStateListener(new DragBubbleView.OnBubbleStateListener() {
            @Override
            public void onDrag() {

            }

            @Override
            public void onMove() {

            }

            @Override
            public void onRestore() {

            }

            @Override
            public void onDismiss() {

            }
        });
    }
}
