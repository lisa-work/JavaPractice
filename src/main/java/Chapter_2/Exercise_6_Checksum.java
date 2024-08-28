package Chapter_2;

/* Performs the following position-based calculation for the checksum of a number of any length given
as a string.
 */

public class Exercise_6_Checksum {
    public static int calcChecksum(String input) {
        int crc = 0;
        for (int i = 0; i < input.length(); i++) {
            char CurrentChar = input.charAt(i);
            if (Character.isDigit(CurrentChar)) {
                final int pos = i + 1;
                int value = (CurrentChar - '0') * pos;
                crc += value;
            }
            else {
                throw new IllegalArgumentException("Illegal char: " + CurrentChar);
            }
        }
        return crc % 10;
    }
}
