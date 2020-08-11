package com.aitenders.parser.service;

import java.security.SecureRandom;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import org.springframework.stereotype.Service;

/**
*
* @author Dhayananth
* @version 1.0
* @since 22 juin 2020
*
*/
@Service
public class PasswordGeneratorService {
//	generate random password
	public Stream<Character> getRandomSpecialChars(int count){

		 Random random = new SecureRandom();
		    IntStream specialChars = random.ints(count, 33, 45);
		    return specialChars.mapToObj(data -> (char) data);
	}
	public String generateSecureRandomPassword(int count) {
		Random random = new SecureRandom();
		//generating random numbers
		IntStream numbers = random.ints(count, 48, 57);
		Stream<Character> randNumbers=numbers.mapToObj(data -> (char) data);
		//generating random alphatics
		
		//generate random special chars
		IntStream specialChars = random.ints(count, 33, 45);
		Stream<Character> randSpecialChars=specialChars.mapToObj(data -> (char) data);
	    
	    
	    Stream<Character> pwdStream = Stream.concat(randNumbers, 
	      Stream.concat(randSpecialChars, 
	      Stream.concat(getRandomAlphabets(count, true), getRandomAlphabets(4, false))));
	    List<Character> charList = pwdStream.collect(Collectors.toList());
	    Collections.shuffle(charList);
	    String password = charList.stream()
	        .collect(StringBuilder::new, StringBuilder::append, StringBuilder::append)
	        .toString();
	    return password;
	}
	public Stream<Character> getRandomAlphabets(int count, boolean upperCase) {
        IntStream characters = null;
        Random random = new SecureRandom();
        if (upperCase) {
            characters = random.ints(count, 65, 90);
        } else {
            characters = random.ints(count, 97, 122);
        }
        return characters.mapToObj(data -> (char) data);
    }
	public Stream<Character> getRandomNumbers(int count) {
	 	Random random = new SecureRandom();
        IntStream numbers = random.ints(count, 48, 57);
        return numbers.mapToObj(data -> (char) data);
    }
}
