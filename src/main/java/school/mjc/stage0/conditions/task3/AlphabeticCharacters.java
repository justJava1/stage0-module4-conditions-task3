package school.mjc.stage0.conditions.task3;

public class AlphabeticCharacters {
    public void vowelDeterminer(char character) {
        character = Character.toLowerCase(character);
        if (character == 'e' || character == 'a' || character == 'u'
                || character == 'o'
                || character == 'i' || character == 'y')
        {
            System.out.println("Vowel");
        } else if(character >= 'a' && character <= 'z') {
            System.out.println("Consonant");
        } else {
            System.out.println("wrong alphabet!");
        }
    }
}
