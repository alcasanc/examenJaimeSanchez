package com.company;

import static org.junit.Assert.*;

import org.junit.Test;

public class MainTest {

	@Test
	public void testNova_lletra() {	
		int count = 0;
		
		char[] llistaChar = {'a','0','o','e',' '};
		
		for(int i=0; i<llistaChar.length; i++){
			char nova = llistaChar[i];
			
			if(!Main.nova_lletra(nova)){
				fail("Not yet implemented");
			}
			else{
				count++;
				System.out.println(count);
			}
		}
	}
}
