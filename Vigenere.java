package zadanie.Substitucie;

public class Vigenere {
    
    private static String abc = CreateABC();
    
    private static String CreateABC()
    {
        char abc[] = new char[26];
    
        for (int i = 0; i < 26; i++) {
            abc[i] = (char)(i + 'a');
            
        }
        return String.valueOf(abc);
    }

    private static char encode(char open, char shift) {
        
        if (Character.isLetter(open)) { 
            return abc.charAt((abc.indexOf(open) + abc.indexOf(shift)) % abc.length());
        } 
        else {
            return open;
        }
    }

    public static String encodeString(String Text, String cipherKey) {
        
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < Text.length(); ++i) {
            stringBuilder.append(Character.toString(encode(Text.charAt(i), cipherKey.charAt(i % cipherKey.length())))); 
        }

        return stringBuilder.toString();
    }
}