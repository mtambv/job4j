package ru.job4j.tracker;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.util.Arrays.*;

public class StubInput implements Input {
   private  List<String> answers;
   private int position = 0;
   public StubInput(ArrayList<String> answers) {
       this.answers = answers;

   }
    public String ask(String question) {
       return answers.get(position++);
    }

    @Override
   // public int ask(String question, List<Integer> range) {
        //return 0;
    //}

    public int ask(String question, List<Integer> range) {
        int key = Integer.valueOf(this.ask(question));
        boolean exist = false;
        for (int value : range) {
            if (value == key) {
                exist = true;
                break;
            }
        }
        if (!exist) {
            throw new MenuOutException("Out of menu range");
        }
        return key;
        }
    }


