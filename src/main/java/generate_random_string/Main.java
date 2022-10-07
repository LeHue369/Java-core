package generate_random_string;

import org.apache.commons.lang3.RandomStringUtils;

public class Main {
    public static void main(String[] args) {
        for(int i=0; i<10; i++) {
            String generatedString = RandomStringUtils.randomAlphabetic(3);
            String generateString2 = RandomStringUtils.randomNumeric(3);
            System.out.println(generatedString+generateString2);
        }
    }
}
