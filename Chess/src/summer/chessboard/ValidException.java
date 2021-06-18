package summer.chessboard;

class ValidationException extends Exception{
    
    /**
     *
     * @param attribute - What the attribute represents
     * ---------------------------
     *  This will check if an empty string has been entered
     */
    public static void validateInput(String attribute){
        
        attribute = attribute.trim();
        boolean stringIsMinLength = attribute != null || attribute.length() != 2;
        boolean isValidLetter   = attribute.charAt(0) <= 'h' && attribute.charAt(0) >= 'a';
        boolean isValidNumber   = attribute.charAt(1) <= '8' && attribute.charAt(1) >= '1';
        if(stringIsMinLength)
            System.out.println("You must enter at least two characters");
        else if(!isValidLetter)
            System.out.println("You must enter a letter a - h");
        else if(!isValidNumber)
            System.out.println("You must enter a number 1 - 8");
    }
    
    /**
     *
     * @param number - number that will be error checked
     * @param MIN - minimum value that number can be
     * @param MAX - maximum value that number can be
     */
    public static void checkNumberLimits(String attribute, int number, final int MIN, final int MAX){
        if(number < MIN || number > MAX)
            System.out.println(attribute + " must be between " + MIN + " and " + MAX);
    }

}
