package workshop.java.regex.exercises;

import java.util.regex.Pattern;

import static workshop.java.regex.exercises.RegexUtil.REPLACE_ME;

public class AnyCharacterAndPeriod {

    //ANY CHARACTER AND PERIOD

    /*
        Write a pattern that matches:
        D4V!D
        Paula
        pro11
        And does not match:
        player
        John
        P12
        (. can be used as any character)
     */
    public static Pattern PLAYER_PATTERN = Pattern.compile("^.{5}$");

    /*
        Write a pattern that matches:
        cat.
        Yes.
        9yo.
        And does not match:
        dog
        .you
        cat5
        should find 3 matches for "Yes.%nI have a cat.%nHe is 9yo.
        should find 0 matches for "I don't like cat5, I have a dog!You too?
     */
    public static Pattern THREE_CHARS_AND_DOT_PATTERN = Pattern.compile("\\S{3}[.]");


    /*
        Write a pattern that matches:
        LOT123
        LH3456
        AA890T
        And does not match:
        A12345
        1C345C
        AAAAAA
     */
    public static Pattern FLIGHT_PATTERN = Pattern.compile("[A-Z]{2}.\\d+.");


    /*
        should find 3 matches for "0... No. 10... Maybe... I don't know..."
        should return false for ...
     */
    public static Pattern TWO_CHARS_THREE_DOTS_PATTERN = Pattern.compile("\\S{2}[.]{3}");


    /*
        Write a pattern that matches:
        1.A.3
        1.2.3
        2...5
        6.V.3
        1.8.3
        1...9
        And does not match:
        11111
        1.2.A
        A.2.3
        55522
        2.3.D
        C.2.3
     */
    public static Pattern DIGIT_DOT_CHAR_DOT_DIGIT_PATTERN = Pattern.compile("\\d[.]\\S[.]\\d");


}
