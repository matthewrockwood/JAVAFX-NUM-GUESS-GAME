package com.example.demo;

public class RandomGame {
     private static int answer = -1;


     public static void GenerateAnswer() {
         answer = (int) (Math.random() * 10) + 1;
     }
     public static int getAnswer(){
         return answer;
     }



}
