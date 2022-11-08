package com.sda.advanced.sorinoptional.AvoidNull;

import java.util.Objects;

public class RequireNonNull {
    public static void main(String[] args) {
        checkVowels(null);
    }

    private static boolean checkVowels(String word){
        Objects.requireNonNull(word, "word should not be null");
        Objects.requireNonNull(word, RequireNonNull::createMessage);

        String[] vowels = {"a", "e", "i"};

        for(int i = 0; i < 5; i++){
            if(word.contains(vowels[i])){
                return true;
            }
        }
        return false;
    }

    private static String createMessage(){
        return "complex message";
    }
}
