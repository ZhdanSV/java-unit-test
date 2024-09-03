@Test
public void checkIsAdultWhenAgeIsMoreThan18True() {
    Program program = new Program();
    boolean isAdult = program.checkIsAdult(19);
	assertEquals("при входном значениии 19 должно быть TRUE, Фактически: ",true, isAdult);// Напиши код здесь
}
