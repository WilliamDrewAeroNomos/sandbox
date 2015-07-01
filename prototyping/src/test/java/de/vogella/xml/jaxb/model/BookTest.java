package de.vogella.xml.jaxb.model;

import java.io.ByteArrayInputStream;
import java.io.StringWriter;
import java.util.Calendar;
import java.util.Date;
import java.util.UUID;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;

import junit.framework.TestCase;

import org.aeronomos.model.Address;
import org.aeronomos.model.CreateUserRequest;
import org.aeronomos.model.Customer;
import org.aeronomos.model.MessageControlBlock;
import org.aeronomos.model.MessageType;
import org.aeronomos.model.MyNamespacePrefixMapper;
import org.aeronomos.model.NameType;
import org.aeronomos.model.ObjectFactory;
import org.aeronomos.model.UserType;

public class BookTest extends TestCase {

	/**
	 * <?xml version="1.0" encoding="UTF-8"?>
	 * 
	 * <event xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	 * type="Request">
	 * 
	 * <controlBlock>
	 * 
	 * <createEventTimeMSecs>1349278952799</createEventTimeMSecs>
	 * <success>true</success> <eventSource>FederateTestName</eventSource>
	 * <eventName>FederateRegistrationRequest</eventName>
	 * <timeToLiveSecs>0</timeToLiveSecs>
	 * <eventUUID>d9e6dd7f-f94b-42e8-b002-cb5ef6e43dfe</eventUUID>
	 * </controlBlock>
	 * 
	 * <dataBlock> <federateName>FederateTestName</federateName>
	 * <federateEventQueueName>federate-queue-name-01</federateEventQueueName>
	 * <federateHeartBeatIntervalSecs>2</federateHeartBeatIntervalSecs>
	 * </dataBlock>
	 * 
	 * </event>
	 */
	private static final String BOOKSTORE_XML = "./bookstore-jaxb.xml";

	protected void setUp() throws Exception {
		super.setUp();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	// public void testGetName() {
	//
	// ArrayList<Book> bookList = new ArrayList<Book>();
	//
	// // create books
	// Book book1 = new Book();
	// book1.setIsbn("978-0060554736");
	// book1.setName("The Game");
	// book1.setAuthor("Neil Strauss");
	// book1.setPublisher("Harpercollins");
	// bookList.add(book1);
	//
	// Book book2 = new Book();
	// book2.setIsbn("978-3832180577");
	// book2.setName("Feuchtgebiete");
	// book2.setAuthor("Charlotte Roche");
	// book2.setPublisher("Dumont Buchverlag");
	// bookList.add(book2);
	//
	// // create bookstore, assigning book
	// Bookstore bookstore = new Bookstore();
	// bookstore.setName("Fraport Bookstore");
	// bookstore.setLocation("Frankfurt Airport");
	// bookstore.setBookList(bookList);
	//
	// // create JAXB context and instantiate marshaller
	//
	// Marshaller m = null;
	//
	// JAXBContext context = null;
	// try {
	// context = JAXBContext.newInstance(Bookstore.class);
	// m = context.createMarshaller();
	// m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
	// m.marshal(bookstore, System.out);
	// } catch (JAXBException e1) {
	// fail(e1.getLocalizedMessage());
	// }
	//
	// Writer w = null;
	// try {
	// try {
	// w = new FileWriter(BOOKSTORE_XML);
	// m.marshal(bookstore, w);
	// } catch (IOException e) {
	// fail(e.getLocalizedMessage());
	// } catch (JAXBException e) {
	// fail(e.getLocalizedMessage());
	// }
	// } finally {
	// try {
	// w.close();
	// } catch (Exception e) {
	// }
	// }
	//
	// // get variables from our xml file, created before
	// System.out.println();
	// System.out.println("Output from our XML File: ");
	// Unmarshaller um;
	// Bookstore bookstore2 = null;
	// try {
	// um = context.createUnmarshaller();
	// bookstore2 = (Bookstore) um
	// .unmarshal(new FileReader(BOOKSTORE_XML));
	// } catch (JAXBException e) {
	// fail(e.getLocalizedMessage());
	// } catch (FileNotFoundException e) {
	// fail(e.getLocalizedMessage());
	// }
	//
	// for (int i = 0; i < bookstore2.getBooksList().toArray().length; i++) {
	// System.out.println("Book " + (i + 1) + ": "
	// + bookstore2.getBooksList().get(i).getName() + " from "
	// + bookstore2.getBooksList().get(i).getAuthor());
	// }
	//
	// }

	// public void testMessageControlBlock() {
	//
	// Marshaller m = null;
	//
	// MessageControlBlock mcb = new MessageControlBlock();
	//
	// mcb.setName("CreateUserRequest");
	// mcb.setType("Request");
	// mcb.setUuid(UUID.randomUUID().toString());
	// mcb.setCreateTimestamp(new Date(System.currentTimeMillis()));
	//
	// UserLoginRequest ulr = new UserLoginRequest();
	// ulr.setComponentEventQueueName("test-event-queue-name");
	// ulr.setCreateTimestamp(new Date(System.currentTimeMillis()));
	// ulr.setOriginator("Bill Drew");
	// ulr.setType("CreateUserRequest");
	// ulr.setHeartbeatIntervalSecs(10);
	// ulr.setUserName("Bill Drew");
	//
	// String payload = null;
	//
	// try {
	// JAXBContext contextUserLogin = null;
	// contextUserLogin = JAXBContext.newInstance(UserLoginRequest.class);
	// Marshaller m2 = contextUserLogin.createMarshaller();
	// m2.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
	// StringWriter writer = new StringWriter();
	// m2.marshal(ulr, writer);
	// payload = writer.getBuffer().toString();
	// } catch (JAXBException e1) {
	// fail(e1.getLocalizedMessage());
	// }
	//
	// mcb.setPayload(payload);
	//
	// System.out.println("\n");
	// StringWriter marshalledOutput = new StringWriter();
	//
	// JAXBContext context = null;
	// try {
	// context = JAXBContext.newInstance(MessageControlBlock.class);
	// m = context.createMarshaller();
	// m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
	// m.marshal(mcb, marshalledOutput);
	// m.marshal(mcb, System.out);
	// } catch (JAXBException e1) {
	// fail(e1.getLocalizedMessage());
	// }
	//
	// Unmarshaller um;
	// mcb = null;
	// try {
	// um = context.createUnmarshaller();
	// mcb = (MessageControlBlock) um.unmarshal(new StringReader(
	// marshalledOutput.toString()));
	// } catch (JAXBException e) {
	// fail(e.getLocalizedMessage());
	// }
	//
	// String type = mcb.getType();
	// assertNotNull(type);
	//
	// String payLoad = mcb.getPayload();
	// assertNotNull(payLoad);
	//
	// um = null;
	// mcb = null;
	//
	// UserLoginRequest unmarshalledUserLoginRequest = null;
	//
	// try {
	// context = JAXBContext.newInstance(UserLoginRequest.class);
	// um = context.createUnmarshaller();
	// unmarshalledUserLoginRequest = (UserLoginRequest) um
	// .unmarshal(new StringReader(payLoad));
	// } catch (JAXBException e) {
	// fail(e.getLocalizedMessage());
	// }
	//
	// assertNotNull(unmarshalledUserLoginRequest.getUserName());
	//
	// context = null;
	// try {
	// context = JAXBContext.newInstance(UserLoginRequest.class);
	// m = context.createMarshaller();
	// m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
	// System.out.println("\n");
	// m.marshal(unmarshalledUserLoginRequest, System.out);
	// } catch (JAXBException e1) {
	// fail(e1.getLocalizedMessage());
	// }
	//
	// FederateRegistrationRequest frr = new FederateRegistrationRequest();
	// frr.setComponentEventQueueName("queue-name");
	// frr.setCreateTimestamp(new Date(System.currentTimeMillis()));
	// frr.setHeartbeatIntervalSecs(100);
	// frr.setOriginator("me");
	// frr.setTimeToLive(1000);
	// frr.setType(frr.getClass().getName());
	// frr.setUuid(UUID.randomUUID().toString());
	// frr.setUserName("Bill Drew");
	//
	// context = null;
	// try {
	// context = JAXBContext
	// .newInstance(FederateRegistrationRequest.class);
	// m = context.createMarshaller();
	// m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
	// System.out.println("\n");
	// m.marshal(frr, System.out);
	// } catch (JAXBException e1) {
	// fail(e1.getLocalizedMessage());
	// }
	//
	// /**
	// *
	// */
	//
	// Employee employee = new Employee();
	// employee.setId(1);
	// employee.setName("Ralph");
	//
	// try {
	// context = JAXBContext.newInstance(Employee.class);
	// Marshaller marshaller = context.createMarshaller();
	// marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
	// marshaller.marshal(employee, System.out);
	// } catch (JAXBException e) {
	// // TODO Auto-generated catch block
	// e.printStackTrace();
	// }
	//
	// }

	// public void testMessageControlBlock2() {
	//
	// Marshaller m = null;
	//
	// CreateUserRequest cur = new CreateUserRequest();
	// cur.setCreateTimeMSecs(System.currentTimeMillis());
	// cur.setSource("Bill Drew");
	// cur.setTimeToLiveMSecs(BigInteger.valueOf(30));
	// cur.setName("CreateUserRequest");
	//
	// String payload = null;
	// JAXBContext context = null;
	// StringWriter writer = new StringWriter();
	//
	// try {
	// context = JAXBContext.newInstance("org.aeronomos.model");
	// Marshaller m2 = context.createMarshaller();
	// m2.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
	// m2.marshal(cur, writer);
	// payload = writer.getBuffer().toString();
	// } catch (JAXBException e1) {
	// fail(e1.getLocalizedMessage());
	// }
	//
	// Unmarshaller um;
	// cur = null;
	//
	// StringWriter marshalledOutput = new StringWriter();
	// StringReader sr = new StringReader(payload);
	//
	// try {
	// um = context.createUnmarshaller();
	// cur = (CreateUserRequest) um.unmarshal(sr);
	// } catch (JAXBException e) {
	// fail(e.getLocalizedMessage());
	// }
	//
	// assertNotNull(cur);
	//
	// System.out.println("Type : " + cur.getType());
	// System.out.println("Name : " + cur.getName());
	//
	// }
	//
	/**
	 *
	 */
	public void testMessageControlBlock3() {

		Marshaller m = null;

		Calendar c = Calendar.getInstance();
		Date d = c.getTime();
		CreateUserRequest cur = new CreateUserRequest();
		// cur.setCreateTimeMSecs(System.currentTimeMillis());
		// cur.setSource("Bill Drew");
		// cur.setTimeToLiveMSecs(BigInteger.valueOf(30));
		cur.setName("CreateUserRequest");
		UserType u = new UserType();
		NameType n = new NameType();
		n.setFirst("Bill");
		n.setLast("Drew");
		u.setName(n);
		u.setUuid(UUID.randomUUID().toString());
		u.setActive(true);
		d.setTime(System.currentTimeMillis());
		c.setTime(d);
		u.setDateActivated(c);
		u.setDateCreated(c);
		cur.setUser(u);

		MessageControlBlock mcb = new MessageControlBlock();
		// mcb.setCreateTimeMSecs(System.currentTimeMillis());
		// mcb.setName(CreateUserRequest.class.getName());
		mcb.setUuid(UUID.randomUUID().toString());
		mcb.setMessage(cur);

		String payload = null;
		JAXBContext context = null;
		StringWriter writer = new StringWriter();
		Marshaller m2 = null;

		ObjectFactory of = new ObjectFactory();

		try {
			context = JAXBContext.newInstance("org.aeronomos.model");
			m2 = context.createMarshaller();
			m2.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
			m2.setProperty("com.sun.xml.bind.namespacePrefixMapper",
					new MyNamespacePrefixMapper());
			m2.marshal(of.createMessageControlBlock(mcb), writer);
			payload = writer.getBuffer().toString();
			m2.marshal(of.createMessageControlBlock(mcb), System.out);

		} catch (JAXBException e1) {
			fail(e1.getLocalizedMessage());
		}

		MessageControlBlock mcb2 = null;
		try {
			Source source = new StreamSource(new ByteArrayInputStream(payload
					.getBytes()));
			Unmarshaller um = context.createUnmarshaller();
			JAXBElement<MessageControlBlock> root = um.unmarshal(source,
					MessageControlBlock.class);
			mcb2 = root.getValue();
			m2.marshal(of.createMessageControlBlock(mcb), System.out);
		} catch (JAXBException e) {
			fail(e.getLocalizedMessage());
		}

		MessageType type = mcb2.getMessage();
		System.out.println("Type : " + type.getName());
		System.out.println("Class : " + type.getClass().getName());
	}

	/**
	 * 
	 */
	public void testCustomerSchema() {
		Customer customer = new Customer();
		Address address = new Address();
		address.setStreet("1 A Street");
		customer.setContactInfo(address);
		JAXBContext jc;
		try {
			jc = JAXBContext.newInstance("org.aeronomos.model");

			Marshaller marshaller = jc.createMarshaller();
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			ObjectFactory of = new ObjectFactory();
			marshaller.marshal(of.createCustomer(customer), System.out);
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
