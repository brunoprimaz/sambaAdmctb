package io.avalia.samba;

import org.junit.Assert;
import org.junit.Test;

/**
 * *** IMPORTANT WARNING : DO NOT EDIT THIS FILE ***
 * 
 * This file is used to specify what you have to implement. To check your work,
 * we will run our own copy of the automated tests. If you change this file,
 * then you will introduce a change of specification!!!
 * 
 * @author Olivier Liechti
 */
public class FluteTest {

	@Test
	public void aFluteShouldMakeFlu() {
		IInstrument flute = new Flute();
		String sound = flute.play();
		Assert.assertEquals("flu", sound);
	}

	@Test
	public void aFluteShouldBeWhite() {
		IInstrument flute = new Flute();
		String color = flute.getColor();
		Assert.assertEquals("white", color);
	}

}
