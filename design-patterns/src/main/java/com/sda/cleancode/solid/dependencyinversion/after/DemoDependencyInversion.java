package com.sda.cleancode.solid.dependencyinversion.after;

import com.sda.cleancode.solid.dependencyinversion.after.highlevel.Document;
import com.sda.cleancode.solid.dependencyinversion.after.highlevel.IContent;
import com.sda.cleancode.solid.dependencyinversion.after.highlevel.IHeader;
import com.sda.cleancode.solid.dependencyinversion.after.lowlevel.Content;
import com.sda.cleancode.solid.dependencyinversion.after.lowlevel.XmlHeader;
import com.sda.cleancode.solid.dependencyinversion.before.OldDocument;

/*
High level modules should not depend on low-level modules.
Both should depend on abstractions.
Abstractions should not depend on details.
Details should depend on abstractions.
 */
public class DemoDependencyInversion {

	public static void main(String[] args) {
		OldDocument oldDocument = new OldDocument();
		oldDocument.display();

		IHeader header = new XmlHeader();
		IContent content = new Content();
		Document document = new Document(header, content);
		document.display();
	}
}
