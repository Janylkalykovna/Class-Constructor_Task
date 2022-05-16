package com.company;

import java.util.Arrays;

public class Classs {
        private int number;
        private String word;
        private int[] array;


    public Classs(int number, String word, int[] array) {
        this.number = number;
        this.word = word;
        this.array = array;
    }

    void setNumber(int number){
            this.number=number;
        }
        void setWord(String word){
            this.word=word;
        }
        void setArray(int[] array){
            this.array=array;
        }
        int getNumber(){
            return number;
        }
        String getWord(){
            return word;
        }
        int[] getArray(){
            return array;
        }


    }




