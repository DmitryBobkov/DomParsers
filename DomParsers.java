package by.academy.myDomProject.domParsers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

import org.apache.xerces.parsers.DOMParser;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 * Class DomParsers
 *
 */

public class DomParsers {

	public Set<String> useDomParsers() throws SAXException, IOException {
		String filePath = null;

		try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));) {
			filePath = reader.readLine();
		} catch (IOException e) {
			System.out.println("no file found");
			e.printStackTrace();
		}

		System.out.println(filePath);

		Set<String> personSet = new HashSet<String>();

		DOMParser parser = new DOMParser();
		parser.parse(filePath);
		Document document = parser.getDocument();
		Element element = document.getDocumentElement();
		NodeList personNodes = element.getChildNodes();

		for (int i = 0; i < personNodes.getLength(); i++) {
			if (personNodes.item(i) instanceof Element) {
				if (((Element) personNodes.item(i)).hasAttribute("fio")) {
					personSet.add(((Element) personNodes.item(i)).getAttribute("fio"));
				}
			}
		}
		return personSet;
	}

}
