public class ValidPalindrome_125{
     public boolean isPalindrome(String s) {

        String forward = "";
        String backward = "";

        for (int i = 0 ; i < s.length(); i++) {
            char f = s.charAt(i);
            char b = s.charAt(s.length()-1-i);

           if (Character.isLetterOrDigit(f)){
                forward = forward + f;
            }

            if (Character.isLetterOrDigit(b)){
                backward = backward + b;
            }
        }

        return forward.toLowerCase().equals(backward.toLowerCase());

        }
        
    }
