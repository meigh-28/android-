package com.example.mytictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button b1;
    Button b2;
    Button b3;
    Button b4;
    Button b5;
    Button b6;
    Button b7;
    Button b8;
    Button b9;
    int turn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 = (Button) findViewById(R.id.b7);
        b2 = (Button) findViewById(R.id.b8);
        b3 = (Button) findViewById(R.id.b9);
        b4 = (Button) findViewById(R.id.b7);
        b5 = (Button) findViewById(R.id.b8);
        b6 = (Button) findViewById(R.id.b9);
        b7 = (Button) findViewById(R.id.b7);
        b8 = (Button) findViewById(R.id.b8);
        b9 = (Button) findViewById(R.id.b9);
        turn = 1;


//        b1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                if (b1.getText().toString().equals("")) {
//                    if (turn == 1) {
//                        turn = 2;
//                        b1.setText("x");
//                    } else if (turn == 2) {
//                        turn = 1;
//                        b1.setText("0");
//                    }
//
//                }
//                endGame();
//            }
//        });
//
//        b2.setOnClickListener(new View.OnClickListener() {
//            @Override
//
//            public void onClick(View view) {
//                if (b2.getText().toString().equals("")) {
//                    if (turn == 1) {
//                        turn = 2;
//                        b2.setText("x");
//                    } else if (turn == 2) {
//                        turn = 1;
//                        b2.setText("0");
//                    }
//
//                }
//                endGame();
//            }
//
//
//        });
//        b3.setOnClickListener(new View.OnClickListener() {
//            @Override
//
//            public void onClick(View view) {
//                if (b3.getText().toString().equals("")) {
//                    if (turn == 1) {
//                        turn = 2;
//                        b3.setText("x");
//                    } else if (turn == 2) {
//                        turn = 1;
//                        b3.setText("0");
//                    }
//
//                }
//                endGame();
//            }
//
//
//        });
//        b4.setOnClickListener(new View.OnClickListener() {
//            @Override
//
//            public void onClick(View view) {
//                if (b4.getText().toString().equals("")) {
//                    if (turn == 1) {
//                        turn = 2;
//                        b4.setText("x");
//                    } else if (turn == 2) {
//                        turn = 1;
//                        b4.setText("0");
//                    }
//
//                }
//                endGame();
//            }
//
//        });
//        b5.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                if (b5.getText().toString().equals("")) {
//                    if (turn == 1) {
//                        turn = 2;
//                        b5.setText("x");
//                    } else if (turn == 2) {
//                        turn = 1;
//                        b5.setText("0");
//                    }
//
//                }
//                endGame();
//            }
//        });
//        b6.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                if (b6.getText().toString().equals("")) {
//                    if (turn == 1) {
//                        turn = 2;
//                        b6.setText("x");
//                    } else if (turn == 2) {
//                        turn = 1;
//                        b6.setText("0");
//                    }
//
//                }
//                endGame();
//            }
//        });
//
//        b7.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                if (b7.getText().toString().equals("")) {
//                    if (turn == 1) {
//                        turn = 2;
//                        b7.setText("x");
//                    } else if (turn == 2) {
//                        turn = 1;
//                        b7.setText("0");
//                    }
//
//                }
//                endGame();
//            }
//
//
//        });
//        b8.setOnClickListener(new View.OnClickListener() {
//                                  @Override
//                                  public void onClick(View view) {
//                                      if (b8.getText().toString().equals("")) {
//                                          if (turn == 1) {
//                                              turn = 2;
//                                              b8.setText("x");
//                                          } else if (turn == 2) {
//                                              turn = 1;
//                                              b8.setText("0");
//                                          }
//
//                                      }
//                                      endGame();
//                                  }
//
//
//                              }
//        );
//        b9.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                if (b9.getText().toString().equals("")) {
//                    if (turn == 1) {
//                        turn = 2;
//                        b9.setText("x");
//                    } else if (turn == 2) {
//                        turn = 1;
//                        b9.setText("0");
//                    }
//
//                }
//
//                endGame();
//            }
//        });

    }

}

