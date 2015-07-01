package com.aeronomos.model;

import com.sun.xml.bind.marshaller.NamespacePrefixMapper;

public class MessagingModelNamespacePrefixMapper extends NamespacePrefixMapper {

	@Override
	public String getPreferredPrefix(String namespaceUri, String suggestion,
			boolean requirePrefix) {
		if (namespaceUri
				.equalsIgnoreCase("http://model.aeronomos.org/common-types")) {
			return "cmn";
		} else if (namespaceUri
				.equalsIgnoreCase("http://model.aeronomos.org/user")) {
			return "usr";
		} else if (namespaceUri
				.equalsIgnoreCase("http://model.aeronomos.org/message")) {
			return "msg";
		} else if (namespaceUri
				.equalsIgnoreCase("http://model.aeronomos.org/configuration")) {
			return "cfg";
		} else if (namespaceUri
				.equalsIgnoreCase("http://www.w3.org/2001/XMLSchema-instance")) {
			return "xmls";
		}
		return null;
	}

}
