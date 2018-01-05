package com.lucascampos.jokewizard;

import com.lucascampos.joke.JokeSmith;

public class JokeWizard {

    public static String getJokeWizard() {
        return "wizz_" + JokeSmith.getJoke() + "_wizz";
    }

}
