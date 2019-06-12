package by.academy.myDomProject.main;

import java.io.IOException;
import java.util.Set;

import org.xml.sax.SAXException;

import by.academy.myDomProject.domParsers.DomParsers;
import by.academy.myDomProject.utils.Utils;

/**
 * @author Dmitry Bobkov
 *
 */

public class Main {

	public static void main(String[] args) {

		//for example filePath = src/person.xml

		DomParsers dp = new DomParsers();
		Set<String> set;
		try {
			set = dp.useDomParsers();
			Utils u = new Utils();
			u.findMaxMin(set);
		} catch (SAXException | IOException e) {
			System.out.println("no file found");
			e.printStackTrace();
		}
	}

}
