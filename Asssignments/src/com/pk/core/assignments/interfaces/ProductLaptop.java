package com.pk.core.assignments.interfaces;

public class ProductLaptop {
	public static void main(String[] args) {
		HpNoteBook hpNote = new HpNoteBook();
		hpNote.click();
		hpNote.scroll();
		
		DellNoteBook dellNote = new DellNoteBook();
		dellNote.click();
		dellNote.scroll();
	}
}
